package godot.codegen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeSpec
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
    return FileSpec.builder("godot", cls.name)
      .addComment("""
        DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
      """.trimIndent())
      .addType(generateType(cls))
      .build()
  }

  private fun generateType(cls: GDClass): TypeSpec {
    return if (cls.singleton) {
      generateSingletonType(cls)
    } else {
      generateInstanceType(cls)
    }
  }

  private fun generateSingletonType(cls: GDClass): TypeSpec {
    return TypeSpec.objectBuilder(cls.name)
      .build()
  }

  private fun generateInstanceType(cls: GDClass): TypeSpec {
    return TypeSpec.classBuilder(cls.name)
      .build()
  }


  private fun parseJson(source: File): List<GDClass> {
    return mapper.readValue(source)
  }
}