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
      .generateEnums(cls.name, cls.enums)
      .generateMethods(cls.methods)
      .generateCompanionObject(cls)

    return classBuilder
      .build()
  }

  private fun TypeSpec.Builder.generateEnums(className: String, enums: List<GDEnum>): TypeSpec.Builder {
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

      // Enum.from method
      builder.addType(
        TypeSpec.companionObjectBuilder()
          .addFunction(
            FunSpec.builder("from")
              .addParameter("value", Int::class)
              .returns(ClassName(BASE_PACKAGE, className, enum.name))
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
    if (cls.singleton) {
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
        .generateMethodBindObject(cls.name, cls.methods)
        .build()
    )
    return this
  }

  private fun TypeSpec.Builder.generateMethodBindObject(className: String, methods: List<GDMethod>): TypeSpec.Builder {
    val builder = TypeSpec.objectBuilder("__method_bind")
      .addKdoc("Container for method_bind pointers for $className")
      .addModifiers(KModifier.PRIVATE)
    val methodBindProperties = methods.filter { method -> !method.is_virtual }
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

  private fun TypeSpec.Builder.generateMethods(methods: List<GDMethod>): TypeSpec.Builder {
    val methodSpecs = methods.filter { method -> !method.is_virtual }
      .map { method ->
        val returnTypeName = parseTypeName(method.return_type)
        val returnGDType = TypeRegistry.get(returnTypeName.fullName)
        val returnType = toClassName(returnTypeName.fqName, returnGDType)

        val methodName = normalizeMethodName(method.name)
        val builder = FunSpec.builder(methodName)

        if (isMethodOverrideRequired(methodName)) {
          builder.addModifiers(KModifier.OVERRIDE)
        }

        if (returnType != null) {
          builder.returns(returnType)
        }

        val parameters = method.arguments.map { argument ->
          val argumentName = normalizeArgName(argument.name)
          val argumentTypeName = parseTypeName(argument.type)
          val argumentType = checkNotNull(toClassName(argumentTypeName.fqName, TypeRegistry.get(argumentTypeName.fqName[0])))
          ParameterSpec.builder(argumentName, argumentType)
            .build()
        }

        builder.addParameters(parameters)

        val returnVar = if (method.return_type == "void") {
          ""
        } else {
          "val _ret = "
        }

        if (parameters.isNotEmpty()) {
          if (parameters.size == 1) {
            val parameter = parameters[0]
            builder.addStatement("val _arg = Variant.new(%N)", parameter.name)
            builder.addStatement("${returnVar}__method_bind.%L.call(this.toVariant(), _arg, 1)", method.name)
          } else {
            builder.addStatement("val _args = VariantArray.new()")

            parameters.forEach { parameter ->
              builder.addStatement("_args.append(%N)", parameter)
            }

            builder.addStatement("${returnVar}__method_bind.%L.call(this.toVariant(), _args.toVariant(), %L)", method.name, parameters.size)
          }
        } else {
          builder.addStatement("${returnVar}__method_bind.%L.call(this.toVariant())", method.name)
        }

        if (returnVar.isNotEmpty()) {
          if (returnGDType !=  null) {
            when {
              returnGDType.isEnum -> {
                builder.addStatement("return ${returnGDType.kotlinName}.from(_ret.asInt())")
              }
              returnGDType != GDType.VARIANT -> {
                builder.addStatement("return _ret.as${returnGDType.gdName.capitalize()}()")
              }
              else -> {
                builder.addStatement("return _ret")
              }
            }
          } else {
            if (returnTypeName.isEnum) {
              builder.addStatement("return ${returnTypeName.fqName.joinToString(".")}.from(_ret.asInt())")
            } else {
              // TODO: what to do with nullability, at the moment assume nothing can be null
              builder.addStatement("return _ret.asObject(::${returnTypeName.fqName.first()})!!")
            }

          }
        }

        builder.build()
      }

    addFunctions(methodSpecs)
    return this
  }

  private fun isMethodOverrideRequired(name: String): Boolean {
    if (RESERVED_METHOD_NAMES.contains(name)) {
      return true
    }
    return false
  }

  private data class TypeInfo(
    val fqName: List<String>,
    val isEnum: Boolean
  ) {
    val fullName = fqName.joinToString(".")
  }

  private fun parseTypeName(name: String): TypeInfo {
    if (name.startsWith("enum")) {
      return TypeInfo(
        name.replace("enum.", "")
          .split("::"),
        true
      )
    }

    return TypeInfo(listOf(name), false)
  }

  private fun normalizeMethodName(name: String): String {
    val ret = name.split("_")
      .joinToString("") { it.capitalize() }
      .decapitalize()

    // some godot methods begin with '_', we need to preserve it.
    if (name.startsWith("_")) {
      return "_$ret"
    }

    return ret
  }

  private fun normalizeArgName(name: String): String {
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

  private fun toClassName(fqName: List<String>, type: GDType?): ClassName? {
    return when (type) {
      GDType.VOID -> null
      null -> ClassName("godot", fqName)
      else -> {
        val packageName = if (type.primitive) {
          "kotlin"
        } else {
          "godot.core"
        }
        val classNames = mutableListOf<String>()

        if (type.isEnum) {
          classNames.addAll(type.kotlinName.split("."))
        } else {
          classNames.add(type.kotlinName)
        }
        ClassName(packageName, classNames)
      }
    }
  }

  private fun parseJson(source: File): List<GDClass> {
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