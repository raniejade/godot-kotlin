package godot.codegen

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import java.io.File

class MethodNGenerator {
  fun generate(filename: String, outputDir: File) {
    FileSpec.builder("godot.core", filename)
      .build()
      .writeTo(outputDir)
  }

  fun FileSpec.Builder.generateBase(): FileSpec.Builder {
    addType(
      TypeSpec.classBuilder("Method")
        .build()
    )
    return this
  }
}