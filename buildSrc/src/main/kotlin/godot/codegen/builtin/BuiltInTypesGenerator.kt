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
        val builtInClassName = ClassName(GDNATIVE_PACKAGE, type.builtinType)
        return FileSpec.builder(BASE_PACKAGE, type.name)
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
            ).addComment("GENERATED FILE DO NOT EDIT")
            .build()
    }

    private fun parseJson(source: File): List<BuiltInType> {
        return mapper.readValue(source)
    }

    companion object {
        const val BASE_PACKAGE = "godot"
        const val GDNATIVE_PACKAGE = "gdnative"
        val GDCONTEXT_CLASS_NAME = ClassName(BASE_PACKAGE, "GDContext")
    }
}