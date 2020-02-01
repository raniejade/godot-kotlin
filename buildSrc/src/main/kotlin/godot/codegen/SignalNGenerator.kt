package godot.codegen

import com.squareup.kotlinpoet.*
import java.io.File

class SignalNGenerator {
  fun generate(filename: String, n: Int, outputDir: File) {
    FileSpec.builder("godot", filename)
      .addComment("DO NOT EDIT, THIS CLASS IS GENERATED!")
      .generateBase()
      .generateSignals(n)
      .addImport("godot.core", "Variant", "VariantArray")
      .build()
      .writeTo(outputDir)
  }

  fun FileSpec.Builder.generateBase(): FileSpec.Builder {
    val objectClassName = ClassName("godot", "Object")
    val anyClassName = ClassName("kotlin", "Any")
    addType(
      TypeSpec.classBuilder("Signal")
        .addKdoc("Base class for all signals")
        .primaryConstructor(
          FunSpec.constructorBuilder()
            .addParameter("name", String::class)
            .build()
        )
        .addProperty(
          PropertySpec.builder("name", String::class)
            .initializer("name")
            .build()
        )
        .addModifiers(KModifier.ABSTRACT)
        .addFunction(
          FunSpec.builder("emitSignal")
            .addModifiers(KModifier.PROTECTED)
            .addParameter("instance", objectClassName)
            .addParameter("args", anyClassName.copy(nullable = true), KModifier.VARARG)
            .addCode("""
              instance.emitSignal(name, *args)
            """.trimIndent())
            .build()
        )
        .addFunction(
          FunSpec.builder("connect")
            .addAnnotation(PublishedApi::class)
            .addModifiers(KModifier.INTERNAL)
            .addParameter("instance", objectClassName)
            .addParameter("target", objectClassName)
            .addParameter("method", String::class)
            .addParameter(
              "binds",
              with(ParameterizedTypeName) {
                ClassName("kotlin.collections", "List").parameterizedBy(anyClassName).copy(nullable = true)
              }
            )
            .addParameter("flags", Int::class)
            .addStatement("val extraArgs = VariantArray.new()")
            .addStatement("binds?.forEach { extraArgs.append(Variant.fromAny(it)) }")
            .addStatement("instance.connect(name, target, method, extraArgs, flags)")
            .build()
        )
        .build()
    )
    return this
  }

  fun FileSpec.Builder.generateSignals(n: Int): FileSpec.Builder {
    for (argCount in 0..n) {
      val templateArgs = mutableListOf<TypeVariableName>()
      for (arg in 0 until argCount) {
        templateArgs.add(TypeVariableName("A$arg"))
      }

      val typeSpec = TypeSpec.classBuilder("Signal$argCount")
        .addKdoc("Represents a signal with $argCount params")
        .generateSignal(argCount, templateArgs)
        .build()

      addType(typeSpec)
      generateProvider(argCount, templateArgs)
      generateDelegate(argCount, templateArgs)
      generateRegisterSignal(argCount, templateArgs)
    }
    return this
  }

  fun TypeSpec.Builder.generateSignal(argCount: Int, templateArgs: List<TypeVariableName>): TypeSpec.Builder {
    val constructorBuilder = FunSpec.constructorBuilder()
      .addParameter("name", String::class)
    primaryConstructor(
      constructorBuilder.build()
    )

    superclass(ClassName("godot", "Signal"))
    addSuperclassConstructorParameter("name")

    addTypeVariables(templateArgs)

    val invokeBuilder = FunSpec.builder("emit")
      .addModifiers(KModifier.INTERNAL)
      .addParameter("instance", ClassName("godot", "Object"))
      .addParameters(templateArgs.mapIndexed { index, type -> ParameterSpec.builder("a$index", type).build() })

    invokeBuilder.addCode("emitSignal(\n")
    invokeBuilder.addCode("⇥instance")

    for (arg in 0 until argCount) {
      invokeBuilder.addCode(",\na$arg")
    }
    invokeBuilder.addCode("⇤\n")
    invokeBuilder.addCode(")\n")
    addFunction(invokeBuilder.build())
    return this
  }

  fun FileSpec.Builder.generateProvider(argCount: Int, templateArgs: List<TypeVariableName>): FileSpec.Builder {
    val signalClassName = if (argCount > 0) {
      with(ParameterizedTypeName) {
        ClassName("godot", "Signal${argCount}").parameterizedBy(templateArgs)
      }
    } else {
      ClassName("godot", "Signal${argCount}")
    }

    val providerBuilder = TypeSpec.classBuilder("Signal${argCount}Provider")
    providerBuilder.addTypeVariables(templateArgs)

    val objectClassName = ClassName("godot", "Object")

    val signalsClassName = with(ParameterizedTypeName) {
      ClassName("kotlin.collections", "Map").parameterizedBy(ClassName("kotlin", "String"), ClassName("godot", "Signal"))
    }
    providerBuilder.primaryConstructor(
      FunSpec.constructorBuilder()
        .addParameter(
          "signals",
          signalsClassName
        )
        .build()
    )

    providerBuilder.addProperty(
      PropertySpec.builder("signals", signalsClassName)
        .initializer("signals")
        .build()
    )

    providerBuilder.addSuperinterface(
      with(ParameterizedTypeName) {
        ClassName("kotlin.properties", "ReadOnlyProperty").parameterizedBy(objectClassName, signalClassName)
      }
    )

    val suppressUncheckedCast = AnnotationSpec.builder(Suppress::class)
      .addMember("%S", "UNCHECKED_CAST")
      .build()

    providerBuilder.addFunction(
      FunSpec.builder("getValue")
        .addAnnotation(suppressUncheckedCast)
        .addModifiers(KModifier.OVERRIDE)
        .addParameter("thisRef", objectClassName)
        .addParameter(
          "property",
          with(ParameterizedTypeName) {
            ClassName("kotlin.reflect", "KProperty")
              .parameterizedBy(WildcardTypeName.producerOf(ClassName("kotlin", "Any").copy(nullable = true)))
          }
        )
        .returns(signalClassName)
        .addStatement(
          "return signals[property.name] as %T", signalClassName
        )
        .build()
    )

    addType(providerBuilder.build())
    return this
  }

  fun FileSpec.Builder.generateDelegate(argCount: Int, templateArgs: List<TypeVariableName>): FileSpec.Builder {
    val signalProviderClassName = if (argCount > 0) {
      with(ParameterizedTypeName) {
        ClassName("godot", "Signal${argCount}Provider").parameterizedBy(templateArgs)
      }
    } else {
      ClassName("godot", "Signal${argCount}Provider")
    }

    val delegateBuilder = FunSpec.builder("signal$argCount")
      .addKdoc("Creates a signal of $argCount params")
      .receiver(
        with(ParameterizedTypeName) {
          val outType = WildcardTypeName.producerOf(ClassName("kotlin", "Any").copy(nullable = true))
          ClassName("godot", "GodotClass")
            .parameterizedBy(
              outType,
              outType
            )
        }
      )
      .addTypeVariables(templateArgs)
      .returns(signalProviderClassName)
      .addStatement("return %N(signals())\n","Signal${argCount}Provider")

    addFunction(delegateBuilder.build())
    return this
  }

  fun FileSpec.Builder.generateRegisterSignal(argCount: Int, templateArgs: List<TypeVariableName>): FileSpec.Builder {
    val signalClassName = if (argCount > 0) {
      with(ParameterizedTypeName) {
        ClassName("godot", "Signal${argCount}").parameterizedBy(templateArgs)
      }
    } else {
      ClassName("godot", "Signal${argCount}")
    }

    val objectClassName = TypeVariableName("T", ClassName("godot", "Object"))

    val propertyClassName = TypeVariableName(
      "K",
      with(ParameterizedTypeName) {
        ClassName("kotlin.reflect", "KProperty1")
          .parameterizedBy(
            objectClassName,
            signalClassName
          )
      }
    )
    val registerSignalBuilder = FunSpec.builder("registerSignal")
      .addKdoc("Registers a signal of $argCount params")
      .addModifiers(KModifier.INLINE)
      .receiver(
        with(ParameterizedTypeName) {
          ClassName("godot", "ClassMemberRegistry")
            .parameterizedBy(
              objectClassName
            )
        }
      )
      .addTypeVariable(objectClassName)
      .addTypeVariables(templateArgs.map { it.copy(reified = true) })
      .addTypeVariable(
        propertyClassName
      )
      .addParameter("property", propertyClassName)

    if (argCount > 0) {
      registerSignalBuilder.addStatement("val parameterTypes = mutableMapOf<String, Variant.Type>()")
    } else {
      registerSignalBuilder.addStatement("val parameterTypes = emptyMap<String, Variant.Type>()")
    }

    templateArgs.forEachIndexed { index, _ ->
      registerSignalBuilder.addStatement("parameterTypes[a$index] = Variant.typeForT<A$index>()")
      registerSignalBuilder.addParameter("a$index", String::class)
    }

    registerSignalBuilder.addStatement("val signal = %T(property.name)", signalClassName)

    registerSignalBuilder.addStatement("doRegisterSignal(className, property.name, signal, parameterTypes)")

    addFunction(registerSignalBuilder.build())
    return this
  }
}