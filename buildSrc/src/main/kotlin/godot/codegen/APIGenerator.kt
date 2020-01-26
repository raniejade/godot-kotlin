package godot.codegen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.domain.*
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
      .generateEnums(cls.enums)
      .generateMethods(cls.methods)
      .generateCompanionObject(cls)

    return classBuilder
      .build()
  }

  private fun TypeSpec.Builder.generateEnums(enums: List<GDEnum>): TypeSpec.Builder {
    val enumSpecs = enums.map { enum ->
      val paramName = "value"
      val builder = TypeSpec.enumBuilder(enum.name)
        .primaryConstructor(
          FunSpec.constructorBuilder()
            .addParameter(paramName, Int::class)
            .build()
        ).addProperty(
          PropertySpec.builder(paramName, Int::class)
            .initializer(paramName)
            .build()
        )

      enum.values.forEach { (k, v) ->
        builder.addEnumConstant(
          k,
          TypeSpec.anonymousClassBuilder()
            .addSuperclassConstructorParameter("$v")
            .build()
        )
      }

      builder.build()
    }

    addTypes(enumSpecs)
    return this
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
              val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)(%S.cstr.ptr)
              requireNotNull(fnPtr) { %S }
              val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
              %L(
                fn()
              )
            }
          """.trimIndent(), cls.name, "No instance found for singleton ${cls.name}", cls.name)
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
              val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)(%S.cstr.ptr)
              requireNotNull(handle) { %S }
              %L(
                handle
              )
            }
          """.trimIndent(), cls.name, "No instance found for singleton ${cls.name}", cls.name)
          .build()
      )
    }

    // constants
    if (cls.constants.isNotEmpty()) {
      companionObjectBuilder.addProperties(
        cls.constants.map { (k, v) ->
          PropertySpec.builder(k, v::class)
            .initializer(getFormatFromConstantValue(v), v)
            .build()
        }
      )
    }

    addType(
      companionObjectBuilder
        .generateMethodBindObject(cls.name, cls.methods)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.generateMethodBindObject(className: String, methods: List<GDMethod>): TypeSpec.Builder {
    val builder = TypeSpec.objectBuilder("__method_bind")
      .addKdoc("Container for method_bind pointers for $className")
      .addModifiers(KModifier.PRIVATE)
    val methodBindProperties = methods.map { method ->
      PropertySpec.builder(method.name, METHOD_BIND_TYPE)
        .delegate("""
          lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)(%S.cstr.ptr, %S.cstr.ptr)
              requireNotNull(ptr) { %S }
            }
          }
        """.trimIndent(), className, method.name, "No method_bind found for method ${method.name}")
        .build()
    }
    builder.addProperties(methodBindProperties)

    addType(builder.build())
    return this
  }

  private fun FileSpec.Builder.addCommonImports(cls: GDClass): FileSpec.Builder {
    addImport("godot.core", "Godot")
    addImport("gdnative", "godot_method_bind")
    addImport(
      "kotlinx.cinterop",
      "CFunction",
      "COpaquePointer",
      "cstr",
      "invoke",
      "memScoped",
      "reinterpret"
    )
    return this
  }

  private fun TypeSpec.Builder.generateMethods(methods: List<GDMethod>): TypeSpec.Builder {
    val methodSpecs = methods.map { method ->
      val type = TypeRegistry.get(method.return_type)
      val returnType = when (type) {
        GDType.VOID -> null
        null -> ClassName("godot", normalizeTypeName(method.return_type))
        else -> {
          val packageName = if (type.primitive) {
            "kotlin"
          } else {
            "godot.core"
          }
          val className = type.mappedName ?: type.gdName
          ClassName(packageName, className)
        }
      }

      // TODO: generate parameters

      val builder = FunSpec.builder(normalizeMethodName(method.name))

      if (returnType != null) {
        builder.returns(returnType)
      }

      builder.addCode("""
        TODO()
      """.trimIndent())

      builder.build()
    }

    addFunctions(methodSpecs)
    return this
  }

  private fun normalizeTypeName(name: String): String {
    if (name.startsWith("enum")) {
      return name.replace("enum.", "")
        .replace("::", ".")
    }

    return name
  }

  private fun normalizeMethodName(name: String): String {
    return name.split("_")
      .joinToString("") { it.capitalize() }
      .decapitalize()

  }

  private fun getFormatFromConstantValue(v: Any): String {
    if (v is String) {
      return "%S"
    }
    return "%L"
  }

  private fun parseJson(source: File): List<GDClass> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
    val METHOD_BIND_TYPE = ClassName("kotlinx.cinterop", "CPointer")
      .parameterizedBy(ClassName("gdnative", "godot_method_bind"))
  }
}