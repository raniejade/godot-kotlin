package godot.codegen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.domain.*
import java.io.File

class APIGenerator {
  private val mapper = jacksonObjectMapper()

  fun generate(source: File, maxSignalParam: Int, outputDir: File) {
    val types = parseJson(source).map(GDClass.Companion::from)
    val index = GDClassIndex(types.map { it.name to it }.toMap())
    types.map { generateFile(it, maxSignalParam, index) }
      .forEach { fs ->
        fs.writeTo(outputDir)
      }

    MethodNGenerator().generate("methods", maxSignalParam, outputDir)
    SignalNGenerator().generate("signals", maxSignalParam, outputDir)
  }

  private fun generateFile(cls: GDClass, maxSignalParam: Int, index: GDClassIndex): FileSpec {
    return FileSpec.builder(BASE_PACKAGE, cls.name)
      .addComment("""
        DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
      """.trimIndent())
      .addCommonImports(cls)
      .addType(generateType(cls, maxSignalParam, index))
      .build()
  }

  private fun generateType(cls: GDClass, maxSignalParam: Int, index: GDClassIndex): TypeSpec {
    return generateInstanceType(cls, maxSignalParam, index)
  }

  private fun generateInstanceType(cls: GDClass, maxSignalParam: Int, index: GDClassIndex): TypeSpec {
    val classBuilder = TypeSpec.classBuilder(cls.name)
      .addModifiers(KModifier.OPEN)
      .generatePrimaryConstructor(cls)
      .maybeGenerateInheritance(cls)
      .generateEnums(cls)
      .generateProperties(cls, index)
      .generateMethods(cls, index)
      .generateSignalHelpers(cls, maxSignalParam)
      .generateCompanionObject(cls, index)

    return classBuilder
      .build()
  }

  private fun TypeSpec.Builder.generateSignalHelpers(cls: GDClass, maxSignalParam: Int): TypeSpec.Builder {
    if (cls.name == "Object") {
      for (argCount in 0..maxSignalParam) {
        val templateArgs = mutableListOf<TypeVariableName>()
        for (arg in 0 until argCount) {
          templateArgs.add(TypeVariableName("A$arg"))
        }

        val signalClassName = if (argCount > 0) {
          with(ParameterizedTypeName) {
            ClassName("godot", "Signal$argCount").parameterizedBy(templateArgs)
          }
        } else {
          ClassName("godot", "Signal$argCount")
        }
        val emitHelper = FunSpec.builder("emit")
          .addTypeVariables(templateArgs)
          .receiver(signalClassName)

        emitHelper.addCode("emit(\n")
        emitHelper.addCode("⇥this@Object")
        templateArgs.forEachIndexed { index, t ->
          emitHelper.addParameter("a$index", t)
          emitHelper.addCode(",\na$index")
        }
        emitHelper.addCode("⇤)\n")
        addFunction(emitHelper.build())

        val lambdaTypeArgs = mutableListOf<TypeVariableName>()
        lambdaTypeArgs.addAll(templateArgs)
        val lambdaType = LambdaTypeName.get(receiver = null, parameters = *lambdaTypeArgs.toTypedArray(), returnType = ClassName("kotlin", "Unit"))
        val methodType = TypeVariableName("K", lambdaType)

        val connectHelper = FunSpec.builder("connect")
          .addAnnotation(
            AnnotationSpec.builder(Suppress::class)
              .addMember("%S", "UNCHECKED_CAST")
              .build()
          )
          .addModifiers(KModifier.INLINE)
          .addTypeVariables(templateArgs)
          .addTypeVariable(methodType.copy(reified = true))
          .receiver(signalClassName)
          .addParameter("target", ClassName("godot", "Object"))
          .addParameter("method", methodType)
          .addParameter(
            ParameterSpec.builder(
              "binds",
              with(ParameterizedTypeName) {
                ClassName("kotlin.collections", "List").parameterizedBy(ClassName("kotlin", "Any")).copy(nullable = true)
              }
            ).defaultValue("null").build()
          )
          .addParameter(
            ParameterSpec.builder("flags", Int::class)
              .defaultValue("0")
              .build()
          )
          .addStatement("val methodName = (method as KCallable<Unit>).name")
          .addStatement("connect(this@Object, target, methodName, binds, flags)")

        addFunction(connectHelper.build())
      }
    }
    return this
  }

  private fun TypeSpec.Builder.generateProperties(cls: GDClass, index: GDClassIndex): TypeSpec.Builder {
    val specializedSetters = mutableListOf<Pair<GDProperty, GDType>>()
    val propertySpecs = cls.properties.values.toList()
      // skip properties requiring an index and begins with an _
      .filter { property -> !property.isVirtual }
      // getter should exist and not virtual
      .filter { property ->
        val method = index.findMethod(cls, property.getter)
        method != null && !method.isVirtual
      }
      // setter should exist and not virtual
      .filter { property ->
        if (property.isMutable) {
          val method = index.findMethod(cls, property.setter)
          method != null && !method.isVirtual
        } else {
          true
        }
      }
      .filter { property ->
        // oh god already declared
        // godot api weirdness again!
        index.findProperty(index.classes[cls.baseClass], property.name) == null
      }
      .map { property ->
        val getterReturnType = checkNotNull(index.findMethod(cls, property.getter)).returnType
        // property is probably an int, but getter returns an enum
        val propertyType = if (getterReturnType.fqName != property.type.fqName) {
          getterReturnType
        } else {
          property.type
        }
        val propertyName = property.name

        val typeClassName = checkNotNull(propertyType.toClassName())
        val builder = PropertySpec.builder(propertyName, typeClassName)

        val getterIdxStr = if (property.index >= 0) {
          "${property.index}"
        } else {
          ""
        }

        // getter
        val getter = FunSpec.getterBuilder()
        val requireEnumCast = getterReturnType.isEnum && !propertyType.isEnum
        if (!requireEnumCast) {
          getter.addCode("""
            « return %L(%L) »
          """.trimIndent(), property.getter, getterIdxStr)
        } else {
          getter.addCode("""
            « return %L.from(%L(%L)) »
          """.trimIndent(), getterReturnType.fqName, property.getter, getterIdxStr)
        }

        builder.getter(getter.build())

        // setter
        if (property.isMutable) {
          val setterArgType = checkNotNull(index.findMethod(cls, property.setter)).arguments[0].type
          // another godot weirdness
          // property type is an enum but setter argument is an int
          val reverseCast = propertyType.isEnum && !setterArgType.isEnum
          val setter = FunSpec.setterBuilder()
            .addParameter("value", typeClassName)

          val setterIdxStr = if (property.index >= 0) {
            "${property.index}, "
          } else {
            ""
          }

          if (!requireEnumCast) {
            if (!reverseCast) {
              setter.addCode("""
                %L(%Lvalue)
              """.trimIndent(), property.setter, setterIdxStr)
            } else {
              setter.addCode("""
                %L(%Lvalue.value)
              """.trimIndent(), property.setter, setterIdxStr)
            }
          } else {
            setter.addCode("""
              %L(%L%L.from(value))
            """.trimIndent(), property.setter,  setterIdxStr, propertyType.fqName)
          }
          builder.mutable(true)
          builder.setter(setter.build())
          specializedSetters.add(property to propertyType)
        }

        builder.build()
      }

    addProperties(propertySpecs)
    specializedSetters
      .filter { (_, type) -> type.isCoreType && !type.isEnum && !type.isPrimitive && type.coreType != CoreType.VARIANT_ARRAY }
      .forEach { (property, type) ->
        val lambdaType = LambdaTypeName.get(type.toClassName(), emptyList(), ClassName("kotlin", "Unit"))
        val builder = FunSpec.builder(property.name)
          .addKdoc("Specialized setter for %L", property.name)
          .addParameter(
            ParameterSpec.builder("cb", lambdaType)
              .build()
          )
          .addStatement("val _p = %L", property.name)
          .addStatement("cb(_p)")
          .addStatement("%L = _p",  property.name)
        addFunction(builder.build())
      }
    return this
  }

  private fun TypeSpec.Builder.generateEnums(cls: GDClass): TypeSpec.Builder {
    val enumSpecs = cls.enums.values.toList().map { enum ->
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

      // Enum.from method
      builder.addType(
        TypeSpec.companionObjectBuilder()
          .addFunction(
            FunSpec.builder("from")
              .addParameter("value", Int::class)
              .returns(ClassName(BASE_PACKAGE, cls.name, enum.name))
              .addCode("""
                for (enumValue in values()) {
                  if (enumValue.value == value) {
                    return enumValue
                  }
                }
                throw AssertionError(%P)
              """.trimIndent(), "Unsupported enum value: \$value")
              .build()
          )
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

    if (cls.baseClass.isEmpty()) {
      addProperty(
        PropertySpec.builder(handleName, cOpaquePointerType, KModifier.INTERNAL)
          .initializer(handleName)
          .build()
      )
    }

    primaryConstructor(
      FunSpec.constructorBuilder()
        .addParameter(handleName, cOpaquePointerType)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.maybeGenerateInheritance(cls: GDClass): TypeSpec.Builder {
    if (cls.baseClass.isNotBlank()) {
      superclass(
        ClassName(BASE_PACKAGE, cls.baseClass)
      ).addSuperclassConstructorParameter("_handle")
    }
    return this
  }

  private fun TypeSpec.Builder.generateCompanionObject(cls: GDClass, index: GDClassIndex): TypeSpec.Builder {
    val companionObjectBuilder = TypeSpec.companionObjectBuilder()
    val className = ClassName(BASE_PACKAGE, cls.name)

    // constructor
    if (cls.isInstanciable) {
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
          """.trimIndent(), cls.name, "No instance found for ${cls.name}", cls.name)
          .returns(className)
          .build()
      )

      companionObjectBuilder.addFunction(
        FunSpec.builder("from")
          .addParameter("ptr", ClassName("kotlinx.cinterop", "COpaquePointer"))
          .returns(className)
          .addCode("""
            return %L(ptr)
          """.trimIndent(), cls.name)
          .build()
      )
    }

    // singleton
    if (cls.isSingleton) {
      companionObjectBuilder.addProperty(
        PropertySpec.builder("Instance", className)
          .getter(
            FunSpec.getterBuilder()
              .addCode("""
                return memScoped {
                  val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)(%S.cstr.ptr)
                  requireNotNull(handle) { %S }
                  %L(
                    handle
                  )
                }
               """.trimIndent(), cls.name, "No instance found for singleton ${cls.name}", cls.name)
              .build()
          ).build()
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
        .generateMethodBindObject(cls, index)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.generateMethodBindObject(cls: GDClass, index: GDClassIndex): TypeSpec.Builder {
    val builder = TypeSpec.objectBuilder("__method_bind")
      .addKdoc("Container for method_bind pointers for ${cls.name}")
      .addModifiers(KModifier.PRIVATE)

    val methodBindProperties = cls.methods.values.toList()
      // we generate the free method
      .filter { method -> method.name != "free" }
      // generate non-virtual methods
      .filter { method -> !method.isVirtual }
      .map { method ->
        PropertySpec.builder(method.name, METHOD_BIND_TYPE)
          .getter(FunSpec.getterBuilder()
            .addCode("""
                return memScoped {
                  val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)(%S.cstr.ptr, %S.cstr.ptr)
                  requireNotNull(ptr) { %S }
                }
              """.trimIndent(), cls.name, method.rawName, "No method_bind found for method ${method.rawName}")
            .build()
          ).build()
      }
    builder.addProperties(methodBindProperties)

    addType(builder.build())
    return this
  }

  private fun FileSpec.Builder.addCommonImports(cls: GDClass): FileSpec.Builder {
    addImport("godot.core", "Godot", "Variant", "VariantArray")
    addImport("gdnative", "godot_method_bind")
    addImport("kotlin.reflect", "KCallable")
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

  private fun isMethodImplGeneratable(method: GDMethod): Boolean {
    return !method.isVirtual && method.name != "free"
  }

  private fun TypeSpec.Builder.generateMethods(cls: GDClass, index: GDClassIndex): TypeSpec.Builder {
    val methodSpecs = cls.methods.values.toList()
      // we generate the free method
      .filter { method -> method.name != "free" }
      // generate non-virtual methods
      .filter { method -> !method.isVirtual }
      .map { method ->
        val parsedType = method.returnType
        val returnTypeClassName = parsedType.toClassName()

        val methodName = method.name
        val builder = FunSpec.builder(methodName)

        if (isMethodOverrideRequired(methodName)) {
          builder.addModifiers(KModifier.OVERRIDE)
        }

        if (returnTypeClassName != null) {
          builder.returns(returnTypeClassName)
        }

        val parameters = method.arguments.map { argument ->
          val parsedArgType = argument.type
          val argumentName = argument.name
          val argumentType = checkNotNull(parsedArgType.toClassName())
          val parameterBuilder = ParameterSpec.builder(argumentName, argumentType)

          if (argument.hasDefaultValue) {
            DefaultArgHelper.parse(argument.type, argument.defaultValue)?.let {
              parameterBuilder.defaultValue("%L", it)
            }
          }

          parameterBuilder.build()
        }

        builder.addParameters(parameters)

        if (method.hasVarargs) {
          val nullableAny = ClassName("kotlin", "Any").copy(nullable = true)
          builder.addParameter("varargs", nullableAny, KModifier.VARARG)
        }

        val returnVar = if (parsedType.isVoid) {
          ""
        } else {
          "val _ret = "
        }

        if (parameters.isNotEmpty() || method.hasVarargs) {
          if (parameters.size == 1 && !method.hasVarargs) {
            val parameter = parameters[0]
            builder.addStatement("val _arg = Variant.new(%N)", parameter.name)
            builder.addStatement("${returnVar}__method_bind.%L.call(this._handle, listOf(_arg))", method.name)
          } else {
            builder.addStatement("val _args = mutableListOf<Variant>()")

            parameters.forEach { parameter ->
              builder.addStatement("_args.add(Variant.fromAny(%N))", parameter)
            }

            if (method.hasVarargs) {
              builder.addStatement("varargs.forEach { _args.add(Variant.fromAny(it)) }")
            }

            builder.addStatement("${returnVar}__method_bind.%L.call(this._handle, _args)", method.name)
          }
        } else {
          builder.addStatement("${returnVar}__method_bind.%L.call(this._handle)", method.name)
        }

        if (returnVar.isNotEmpty()) {
          if (parsedType.isCoreType) {
            when {
              parsedType.isEnum -> {
                builder.addStatement("return ${parsedType.fqName}.from(_ret.asInt())")
              }
              !parsedType.isVariant -> {
                builder.addStatement("return _ret.as${parsedType.fqName.capitalize()}()")
              }
              else -> {
                builder.addStatement("return _ret")
              }
            }
          } else {
            if (parsedType.isEnum) {
              builder.addStatement("return ${parsedType.fqName}.from(_ret.asInt())")
            } else {
              // TODO: what to do with nullability, at the moment assume nothing can be null
              builder.addStatement("return _ret.asObject(::${parsedType.fqName})!!")
            }

          }
        }

        builder.build()
      }

    addFunctions(methodSpecs)
    maybeGenerateFreeForObject(cls.name)
    maybeGenerateLifeCycleForObject(cls.name)
    return this
  }

  private fun TypeSpec.Builder.maybeGenerateFreeForObject(className: String): TypeSpec.Builder {
    if (className == "Object") {
      addFunction(
        FunSpec.builder("free")
          .addCode("""
            checkNotNull(Godot.gdnative.godot_object_destroy)(_handle)
          """.trimIndent())
          .build()
      )
    }

    return this
  }

  private fun TypeSpec.Builder.maybeGenerateLifeCycleForObject(className: String): TypeSpec.Builder {
    if (className == "Object") {
      addFunction(
        FunSpec.builder("_onInit")
          .addModifiers(KModifier.OPEN)
          .addCode("")
          .build()
      )

      addFunction(
        FunSpec.builder("_onDestroy")
          .addModifiers(KModifier.OPEN)
          .build()
      )
    }

    return this
  }


  private fun isMethodOverrideRequired(name: String): Boolean {
    if (RESERVED_METHOD_NAMES.contains(name)) {
      return true
    }
    return false
  }

  private fun getFormatFromConstantValue(v: Any): String {
    if (v is String) {
      return "%S"
    }
    return "%L"
  }

  private fun parseJson(source: File): List<RawGDClass> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
    val METHOD_BIND_TYPE = ClassName("kotlinx.cinterop", "CPointer")
      .parameterizedBy(ClassName("gdnative", "godot_method_bind"))

    val RESERVED_METHOD_NAMES = listOf(
      "toString"
    )
  }
}