package godot.codegen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.*
import godot.codegen.domain.GDClass
import java.io.File

class APIGenerator {
  private val mapper = jacksonObjectMapper()

  fun generate(source: File, outputDir: File) {
    val types = parseJson(source)
    types.map(this::generateFile)
      .forEach { fs ->
        fs.writeTo(outputDir)
      }
  }

  private fun generateFile(cls: GDClass): FileSpec {
    return FileSpec.builder(BASE_PACKAGE, cls.name)
      .addComment("""
        DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
      """.trimIndent())
      .addCommonImports(cls)
      .addType(generateType(cls))
      .build()
  }

  private fun generateType(cls: GDClass): TypeSpec {
    return generateInstanceType(cls)
  }

  private fun generateInstanceType(cls: GDClass): TypeSpec {
    val classBuilder = TypeSpec.classBuilder(cls.name)
      .addModifiers(KModifier.OPEN)
      .generatePrimaryConstructor(cls)
      .maybeGenerateInheritance(cls)
      .generateCompanionObject(cls)

    return classBuilder
      .build()
  }

  private fun TypeSpec.Builder.generatePrimaryConstructor(cls: GDClass): TypeSpec.Builder {
    val handleName = "_handle"
    val cOpaquePointerType = ClassName("kotlinx.cinterop", "COpaquePointer")

    if (cls.base_class.isEmpty()) {
      addProperty(
        PropertySpec.builder(handleName, cOpaquePointerType, KModifier.INTERNAL)
          .initializer(handleName)
          .build()
      )
    }

    primaryConstructor(
      FunSpec.constructorBuilder()
        .addModifiers(KModifier.INTERNAL)
        .addParameter(handleName, cOpaquePointerType)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.maybeGenerateInheritance(cls: GDClass): TypeSpec.Builder {
    if (cls.base_class.isNotBlank()) {
      superclass(
        ClassName(BASE_PACKAGE, cls.base_class)
      ).addSuperclassConstructorParameter("_handle")
    }
    return this
  }

  private fun TypeSpec.Builder.generateCompanionObject(cls: GDClass): TypeSpec.Builder {
    val companionObjectBuilder = TypeSpec.companionObjectBuilder()
    val className = ClassName(BASE_PACKAGE, cls.name)

    // constructor
    if (cls.instanciable) {
      companionObjectBuilder.addFunction(
        FunSpec.builder("new")
          .addCode("""
            return memScoped {
              val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("${cls.name}".cstr.ptr)
              requireNotNull(fnPtr) { "No constructor found for ${cls.name}" }
              val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
              ${cls.name}(
                fn()
              )
            }
          """.trimIndent())
          .returns(className)
          .build()
      )
    }

    // singleton
    if (cls.singleton) {
      companionObjectBuilder.addProperty(
        PropertySpec.builder("Instance", className)
          .initializer("""
            memScoped {
              val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("${cls.name}".cstr.ptr)
              requireNotNull(handle) { "No instance found for singleton ${cls.name}" }
              ${cls.name}(
                handle
              )
            }
          """.trimIndent())
          .build()
      )
    }

    // constants
    if (cls.constants.isNotEmpty()) {
      companionObjectBuilder.addProperties(
        cls.constants.map { (k, v) ->
          PropertySpec.builder(formatConstantName(k), v::class)
            .initializer(formatValue(v))
            .build()
        }
      )
    }

    addType(
      companionObjectBuilder
        .build()
    )
    return this
  }

  private fun FileSpec.Builder.addCommonImports(cls: GDClass): FileSpec.Builder {
    addImport("godot.core", "Godot")
    addImport(
      "kotlinx.cinterop",
      "COpaquePointer",
      "invoke",
      "cstr",
      "memScoped",
      "CFunction",
      "reinterpret"
    )
    return this
  }

  private fun formatValue(v: Any): String {
    if (v is String) {
      return "\"$v\""
    }
    return "$v"
  }

  private fun formatConstantName(name: String): String {
    return name.split("_").joinToString("") { it.toLowerCase().capitalize() }
  }

  private fun parseJson(source: File): List<GDClass> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
  }
}