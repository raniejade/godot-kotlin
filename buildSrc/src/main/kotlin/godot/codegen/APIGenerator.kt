package godot.codegen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.domain.GDClass
import godot.codegen.domain.GDClassIndex
import godot.codegen.domain.GDMethod
import godot.codegen.domain.RawGDClass
import java.io.File

class APIGenerator {
  private val mapper = jacksonObjectMapper()

  fun generate(source: File, outputDir: File) {
    val types = parseJson(source).map(GDClass.Companion::from)
    val index = GDClassIndex(types.map { it.name to it }.toMap())
    types.map { generateFile(it, index) }
      .forEach { fs ->
        fs.writeTo(outputDir)
      }
  }

  private fun generateFile(cls: GDClass, index: GDClassIndex): FileSpec {
    return FileSpec.builder(BASE_PACKAGE, cls.name)
      .addComment("""
        DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
      """.trimIndent())
      .addCommonImports(cls)
      .addType(generateType(cls, index))
      .build()
  }

  private fun generateType(cls: GDClass, index: GDClassIndex): TypeSpec {
    return generateInstanceType(cls, index)
  }

  private fun generateInstanceType(cls: GDClass, index: GDClassIndex): TypeSpec {
    val classBuilder = TypeSpec.classBuilder(cls.name)
      .addModifiers(KModifier.OPEN)
      .generatePrimaryConstructor(cls)
      .maybeGenerateInheritance(cls)
      .generateEnums(cls)
      .generateProperties(cls, index)
      .generateMethods(cls)
      .generateCompanionObject(cls)

    return classBuilder
      .build()
  }

  private fun TypeSpec.Builder.generateProperties(cls: GDClass, index: GDClassIndex): TypeSpec.Builder {
    val propertySpecs = cls.properties.values.toList()
      // skip properties requiring an index and begins with an _
      .filter { property -> property.index == -1 && !property.isVirtual }
      // getter should exist
      .filter { property -> index.findMethod(cls, property.getter) != null }
      .map { property ->
        val propertyType = property.type
        val propertyName = property.name

        val typeClassName = checkNotNull(propertyType.toClassName())
        val builder = PropertySpec.builder(propertyName, typeClassName)
        val methodReturnType = checkNotNull(index.findMethod(cls, property.getter)) {
          println(cls.name)
          println(index.classes[cls.name]?.methods)
          ""
        }.returnType

        // getter
        val getter = FunSpec.getterBuilder()
        val requireEnumCast = methodReturnType.isEnum && !propertyType.isEnum
        if (!requireEnumCast) {
          getter.addCode("""
            « return %L() »
          """.trimIndent(), property.getter)
        } else {
          getter.addCode("""
            « return %L.from(%L()) »
          """.trimIndent(), methodReturnType.fqName, property.getter)
        }

        builder.getter(getter.build())

        // setter
        if (property.isMutable) {
          val setter = FunSpec.setterBuilder()
            .addParameter("value", typeClassName)

          if (!requireEnumCast) {
            setter.addCode("""
              %L(value)
            """.trimIndent(), property.setter)
          } else {
            setter.addCode("""
              %L(%L.from(value))
            """.trimIndent(), property.setter,  methodReturnType.fqName)
          }
          builder.mutable(true)
          builder.setter(setter.build())
        }

        builder.build()
      }

    addProperties(propertySpecs)
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

  private fun TypeSpec.Builder.generateCompanionObject(cls: GDClass): TypeSpec.Builder {
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
        .generateMethodBindObject(cls.name, cls.methods.values.toList())
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.generateMethodBindObject(className: String, methods: List<GDMethod>): TypeSpec.Builder {
    val builder = TypeSpec.objectBuilder("__method_bind")
      .addKdoc("Container for method_bind pointers for $className")
      .addModifiers(KModifier.PRIVATE)
    val methodBindProperties = methods.filter { method -> isMethodImplGeneratable(method) }
      .map { method ->
        PropertySpec.builder(method.name, METHOD_BIND_TYPE)
          .getter(FunSpec.getterBuilder()
            .addCode("""
                return memScoped {
                  val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)(%S.cstr.ptr, %S.cstr.ptr)
                  requireNotNull(ptr) { %S }
                }
              """.trimIndent(), className, method.name, "No method_bind found for method ${method.name}")
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

  private fun TypeSpec.Builder.generateMethods(cls: GDClass): TypeSpec.Builder {
    val methodSpecs = cls.methods.values.toList()
      .filter { method -> isMethodImplGeneratable(method) }
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
          ParameterSpec.builder(argumentName, argumentType)
            .build()
        }

        builder.addParameters(parameters)

        val returnVar = if (parsedType.isVoid) {
          ""
        } else {
          "val _ret = "
        }

        if (parameters.isNotEmpty()) {
          if (parameters.size == 1) {
            val parameter = parameters[0]
            builder.addStatement("val _arg = Variant.new(%N)", parameter.name)
            builder.addStatement("${returnVar}__method_bind.%L.call(this._handle, _arg, 1)", method.name)
          } else {
            builder.addStatement("val _args = VariantArray.new()")

            parameters.forEach { parameter ->
              builder.addStatement("_args.append(%N)", parameter)
            }

            builder.addStatement("${returnVar}__method_bind.%L.call(this._handle, _args.toVariant(), %L)", method.name, parameters.size)
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