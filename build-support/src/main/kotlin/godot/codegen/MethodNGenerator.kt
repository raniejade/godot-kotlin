package godot.codegen

import com.squareup.kotlinpoet.*
import java.io.File

class MethodNGenerator {
  fun generate(filename: String, n: Int, outputDir: File) {
    FileSpec.builder("godot", filename)
      .addComment("DO NOT EDIT, THIS CLASS IS GENERATED!")
      .generateBase()
      .generateMethods(n)
      .addImport("kotlin.reflect", "KCallable")
      .build()
      .writeTo(outputDir)
  }

  fun FileSpec.Builder.generateBase(): FileSpec.Builder {
    val instanceParam = TypeVariableName("T", ClassName("godot", "Object"))
    val variantType = ClassName("godot.core", "Variant")
    val argsParam = with (ParameterizedTypeName) {
      ClassName("kotlin.collections", "List").parameterizedBy(variantType)
    }
    addType(
      TypeSpec.classBuilder("Method")
        .addKdoc("Base class for all methods")
        .addTypeVariable(instanceParam)
        .addTypeVariable(TypeVariableName("R"))
        .primaryConstructor(
          FunSpec.constructorBuilder()
            .addParameter("parameterCount", Int::class)
            .build()
        )
        .addProperty(
          PropertySpec.builder("parameterCount", Int::class)
            .initializer("parameterCount")
            .build()
        )
        .addModifiers(KModifier.ABSTRACT)
        .addFunction(
          FunSpec.builder("invoke")
            .addModifiers(KModifier.ABSTRACT, KModifier.OPERATOR)
            .addParameter("instance", instanceParam)
            .addParameter("args", argsParam)
            .returns(variantType)
            .build()
        )
        .build()
    )
    return this
  }

  fun FileSpec.Builder.generateMethods(n: Int): FileSpec.Builder {
    val instanceParam = TypeVariableName("T", ClassName("godot", "Object"))
    val superClassTypeName = with(ParameterizedTypeName) {
      ClassName("godot", "Method").parameterizedBy(instanceParam, TypeVariableName("R"))
    }

    for (argCount in 0..n) {
      val suppressUncheckedCast = AnnotationSpec.builder(Suppress::class)
        .addMember("%S", "UNCHECKED_CAST")
        .build()
      val typeSpec = TypeSpec.classBuilder("Method$argCount")
        .generateMethod(argCount, instanceParam, superClassTypeName)
        .addAnnotation(suppressUncheckedCast)
        .build()
      addType(typeSpec)

      val funSpec = FunSpec.builder("registerMethod")
        .generateRegisterMethod(argCount, instanceParam)
        .addAnnotation(suppressUncheckedCast)
        .build()

      addFunction(funSpec)
    }
    return this
  }

  fun TypeSpec.Builder.generateMethod(argCount: Int, instanceParam: TypeVariableName, superClassTypeName: ParameterizedTypeName): TypeSpec.Builder {
    addKdoc("Represents a method with $argCount params")
    // instance
    addTypeVariable(instanceParam)
    // args type
    val templateArgs = mutableListOf<TypeVariableName>()
    for (arg in 0 until argCount) {
      templateArgs.add(TypeVariableName("A$arg"))
    }

    addTypeVariables(templateArgs)

    // return type
    val returnType = TypeVariableName("R")
    addTypeVariable(returnType)

    val lambdaArgs = mutableListOf<TypeVariableName>()
    lambdaArgs.add(instanceParam)
    lambdaArgs.addAll(templateArgs)

    val methodType = LambdaTypeName.get(receiver = null, parameters = *lambdaArgs.toTypedArray(), returnType = returnType)

    // constructor
    primaryConstructor(
      FunSpec.constructorBuilder()
        .addParameter("method", methodType)
        .build()
    )
    .addProperty(
      PropertySpec.builder("method", methodType)
        .initializer("method")
        .build()
    )
    .superclass(superClassTypeName)
    .addSuperclassConstructorParameter("$argCount")

    // body
    val variantType = ClassName("godot.core", "Variant")
    val invokeArgType = with(ParameterizedTypeName) {
      ClassName("kotlin.collections", "List").parameterizedBy(variantType)
    }
    val invokeBuilder = FunSpec.builder("invoke")
      .addParameter("instance", instanceParam)
      .addParameter("args", invokeArgType)
      .returns(variantType)
      .addModifiers(KModifier.OPERATOR, KModifier.OVERRIDE)

    invokeBuilder.addCode("return Variant.fromAny(\n")
    invokeBuilder.addCode("⇥method(\n")
    invokeBuilder.addCode("⇥instance")

    for (arg in 0 until argCount) {
      invokeBuilder.addCode(",\nargs[$arg].toAny() as A$arg")
    }
    invokeBuilder.addCode("⇤\n")
    invokeBuilder.addCode(") as Any\n")
    invokeBuilder.addCode("⇤)\n")
    addFunction(
      invokeBuilder.build()
    )
    return this
  }

  fun FunSpec.Builder.generateRegisterMethod(argCount: Int, instanceParam: TypeVariableName): FunSpec.Builder {
    addKdoc("Registers a method with $argCount params and returns a value of type R")
    addModifiers(KModifier.INLINE)
    // instance
    addTypeVariable(instanceParam)

    // return type
    val returnType = TypeVariableName("R")
    addTypeVariable(returnType)

    // args type
    val templateArgs = mutableListOf<TypeVariableName>()
    for (arg in 0 until argCount) {
      templateArgs.add(TypeVariableName("A$arg"))
    }
    addTypeVariables(templateArgs)

    // lambda
    val lambdaArgs = mutableListOf<TypeVariableName>()
    lambdaArgs.add(instanceParam)
    lambdaArgs.addAll(templateArgs)

    val lambdaType = LambdaTypeName.get(receiver = null, parameters = *lambdaArgs.toTypedArray(), returnType = returnType)
    val methodType = TypeVariableName("K", lambdaType).copy(reified = true)
    addTypeVariable(
      methodType
    )
    with(ParameterizedTypeName) {
      receiver(
        ClassName("godot", "ClassMemberRegistry").parameterizedBy(instanceParam)
      )
    }

    addParameter("method", methodType)
    addCode("""
      val methodName = (method as KCallable<Unit>).name
      val methodHandle = Method$argCount(method)
      val methodHandleRef = track(methodHandle)
      doRegisterMethod(className, methodName, methodHandleRef)
    """.trimIndent())
    return this
  }
}