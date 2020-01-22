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
    types.map(this::generateType)
      .forEach { fs ->
        fs.writeTo(outputDir)
      }
  }

  private fun generateType(type: BuiltInType): FileSpec {
    val builtInClassName = with(ParameterizedTypeName) {
      CVALUE_CLASS_NAME.parameterizedBy(ClassName(GDNATIVE_PACKAGE, type.builtinType))
    }
    // generateContextConstructors(contextTypeBuilder, type)
    val companionObjectBuilder = TypeSpec.companionObjectBuilder()
    type.constructors.forEach { constructor ->
      val builder = FunSpec.builder("new")
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
      code.add("""
        val dest = cValue<$fqBuiltinType>()
        memScoped {
          checkNotNull(Godot.gdnative.${type.builtinType}_${constructor.internalConstructor})(dest.ptr$parameterStr)
        }
        return ${type.name}(dest)
      """.trimIndent())
      builder.addCode(code.build())
      builder.returns(ClassName(BASE_PACKAGE, type.name))
      companionObjectBuilder.addFunction(
        builder.build()
      )
    }

    val typeBuilder = generatedFileSpec(BASE_PACKAGE, type.name)
      .addImport("kotlinx.cinterop", "memScoped", "invoke", "cValue")
      .addType(
        TypeSpec.classBuilder(type.name)
          .primaryConstructor(
            FunSpec.constructorBuilder()
              .addParameter("handle", builtInClassName, KModifier.INTERNAL)
              .build()
          ).addProperty(
            PropertySpec.builder("handle", builtInClassName)
              .initializer("handle")
              .build()
          ).addType(
            companionObjectBuilder
              .build()
          )
          .build()
      )
    return typeBuilder.build()
  }

  private fun generatedFileSpec(pkg: String, fileName: String) = FileSpec.builder(pkg, fileName)

  private fun parseJson(source: File): List<BuiltInType> {
    return mapper.readValue(source)
  }

  companion object {
    const val BASE_PACKAGE = "godot"
    const val GDNATIVE_PACKAGE = "gdnative"
    val CVALUE_CLASS_NAME = ClassName("kotlinx.cinterop", "CValue")
  }
}