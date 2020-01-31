package godot.codegen

import com.squareup.kotlinpoet.*
import java.io.File

class SignalNGenerator {
  fun generate(filename: String, n: Int, outputDir: File) {
    FileSpec.builder("godot", filename)
      .addComment("DO NOT EDIT, THIS CLASS IS GENERATED!")
      .generateBase()
      .generateSignals(n)
      .build()
      .writeTo(outputDir)
  }

  fun FileSpec.Builder.generateBase(): FileSpec.Builder {
    addType(
      TypeSpec.classBuilder("Signal")
        .addKdoc("Base class for all signals")
        .primaryConstructor(
          FunSpec.constructorBuilder()
            .addParameter("name", String::class)
            .addParameter("emitter", ClassName("godot", "Object"))
            .build()
        )
        .addProperty(
          PropertySpec.builder("name", String::class)
            .initializer("name")
            .build()
        )
        .addProperty(
          PropertySpec.builder("emitter", ClassName("godot", "Object"))
            .initializer("emitter")
            .build()
        )
        .addModifiers(KModifier.ABSTRACT)
        .addFunction(
          FunSpec.builder("emitSignal")
            .addParameter("args", ClassName("kotlin", "Any").copy(nullable = true), KModifier.VARARG)
            .addCode("""
              emitter.emitSignal(name, *args)
            """.trimIndent())
            .build()
        )
        .build()
    )
    return this
  }

  fun FileSpec.Builder.generateSignals(n: Int): FileSpec.Builder {
    for (argCount in 0..n) {
      val typeSpec = TypeSpec.classBuilder("Signal$argCount")
        .addKdoc("Represents a signal with $argCount params")
        .generateSignal(argCount)
        .build()

      addType(typeSpec)
    }
    return this
  }

  fun TypeSpec.Builder.generateSignal(argCount: Int): TypeSpec.Builder {
    primaryConstructor(
      FunSpec.constructorBuilder()
        .addParameter("name", String::class)
        .addParameter("emitter", ClassName("godot", "Object"))
        .build()
    )

    superclass(ClassName("godot", "Signal"))
    addSuperclassConstructorParameter("name")
    addSuperclassConstructorParameter("emitter")

    val templateArgs = mutableListOf<TypeVariableName>()
    for (arg in 0 until argCount) {
      templateArgs.add(TypeVariableName("A$arg"))
    }

    addTypeVariables(templateArgs)

    val invokeBuilder = FunSpec.builder("invoke")
      .addModifiers(KModifier.OPERATOR)
      .addParameters(templateArgs.mapIndexed { index, type -> ParameterSpec.builder("a$index", type).build() })

    invokeBuilder.addCode("emitSignal(\n")
    invokeBuilder.addCode("⇥name")

    for (arg in 0 until argCount) {
      invokeBuilder.addCode(",\na$arg")
    }
    invokeBuilder.addCode("⇤\n")
    invokeBuilder.addCode(")\n")
    addFunction(invokeBuilder.build())
    return this
  }
}