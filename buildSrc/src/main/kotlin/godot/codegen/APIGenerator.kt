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
    primaryConstructor(
      FunSpec.constructorBuilder()
        .addModifiers(KModifier.INTERNAL)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.maybeGenerateInheritance(cls: GDClass): TypeSpec.Builder {
    if (cls.base_class.isNotBlank()) {
      this.superclass(
        ClassName(BASE_PACKAGE, cls.base_class)
      )
    }
    return this
  }

  private fun TypeSpec.Builder.generateCompanionObject(cls: GDClass): TypeSpec.Builder {
    val companionObjectBuilder = TypeSpec.companionObjectBuilder()

    // constructor
    if (cls.instanciable) {
      companionObjectBuilder.addFunction(
        FunSpec.builder("new")
          .addCode("TODO()")
          .returns(ClassName(BASE_PACKAGE, cls.name))
          .build()
      )
    }

    // constants
    if (cls.constants.isNotEmpty()) {
      companionObjectBuilder.addProperties(
        cls.constants.map { (k, v) ->
          PropertySpec.builder(k, v::class)
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

  private fun formatValue(v: Any): String {
    if (v is String) {
      return "\"$v\""
    }
    return "$v"
  }

  private fun parseJson(source: File): List<GDClass> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
  }
}