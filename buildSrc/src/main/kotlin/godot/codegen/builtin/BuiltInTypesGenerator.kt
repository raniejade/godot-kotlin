package godot.codegen.builtin

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.squareup.kotlinpoet.*
import godot.codegen.builtin.model.BuiltInType
import java.io.File

class BuiltInTypesGenerator {
  private val mapper = jacksonObjectMapper()

  fun generate(source: File, outputDir: File) {
    val types = parseJson(source)
    val contextTypeBuilder = generateGDContextType()
    types.map { ts -> generateType(ts, contextTypeBuilder)}
      .forEach { fs ->
        fs.writeTo(outputDir)
      }

    generatedFileSpec(BASE_PACKAGE, GDCONTEXT_CLASS_NAME.simpleName)
      .addImport("kotlinx.cinterop", "alloc", "ptr", "invoke")
      .addType(contextTypeBuilder.build())
      .build()
      .writeTo(outputDir)
  }

  private fun generateType(type: BuiltInType, contextTypeBuilder: TypeSpec.Builder): FileSpec {
    val builtInClassName = ClassName(GDNATIVE_PACKAGE, type.builtinType)
    generateContextConstructors(contextTypeBuilder, type)
    return generatedFileSpec(BASE_PACKAGE, type.name)
      .addType(
        TypeSpec.classBuilder(type.name)
          .primaryConstructor(
            FunSpec.constructorBuilder()
              .addParameter("context", GDCONTEXT_CLASS_NAME, KModifier.PRIVATE)
              .addParameter("handle", builtInClassName, KModifier.INTERNAL)
              .build()
          ).addProperty(
            PropertySpec.builder("context", GDCONTEXT_CLASS_NAME)
              .initializer("context")
              .build()
          ).addProperty(
            PropertySpec.builder("handle", builtInClassName)
              .initializer("handle")
              .build()
          ).addType(
            TypeSpec.companionObjectBuilder()
              .build()
          )
          .build()
      ).build()
  }

  private fun generateGDContextType(): TypeSpec.Builder {
    return TypeSpec.classBuilder(GDCONTEXT_CLASS_NAME)
      .addProperty(
        PropertySpec.builder("arena", ClassName("kotlinx.cinterop", "Arena"))
          .addModifiers(KModifier.PRIVATE)
          .initializer("Arena()")
          .build()
      ).addFunction(
        FunSpec.builder("clear")
          .addCode(CodeBlock.of("arena.clear()"))
          .build()
      )
  }

  private fun generateContextConstructors(contextTypeBuilder: TypeSpec.Builder, type: BuiltInType) {
    type.constructors.forEach { constructor ->
      val builder = FunSpec.builder("new")
        .receiver(ClassName(BASE_PACKAGE, type.name, "Companion"))
      var parameterStr = ""
      constructor.params.forEach { param ->
        builder.addParameter(param.name, ClassName(param.type.pkg, param.type.name))
        parameterStr += ", ${param.name}"
        if (param.isPointer) {
          parameterStr += ".handle.ptr"
        }
      }
      val fqBuiltinType = "${GDNATIVE_PACKAGE}.${type.builtinType}"
      val code = CodeBlock.builder()
      code.addStatement("val dest = arena.alloc<$fqBuiltinType>()")
      code.addStatement("checkNotNull(Godot.gdnative.${type.builtinType}_${constructor.internalConstructor})(dest.ptr$parameterStr)")
      code.addStatement("return ${type.name}(this@${GDCONTEXT_CLASS_NAME.simpleName}, dest)")
      builder.addCode(code.build())
      builder.returns(ClassName(BASE_PACKAGE, type.name))
      contextTypeBuilder.addFunction(
        builder.build()
      )
    }
  }

  private fun generatedFileSpec(pkg: String, fileName: String) = FileSpec.builder(pkg, fileName)
    .addComment("GENERATED FILE DO NOT EDIT")

  private fun parseJson(source: File): List<BuiltInType> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
    const val GDNATIVE_PACKAGE = "gdnative"
    val GDCONTEXT_CLASS_NAME = ClassName(BASE_PACKAGE, "GDContext")
  }
}