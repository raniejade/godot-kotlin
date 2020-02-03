package godot.gradle

import com.squareup.kotlinpoet.*
import org.gradle.api.DefaultTask
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.listProperty
import javax.inject.Inject

open class GenerateEntry @Inject constructor(objects: ObjectFactory) : DefaultTask() {
  @Input
  val classes = objects.listProperty<String>()

  @OutputFile
  internal val output = objects.fileProperty()

  @TaskAction
  fun generate() {
    val output = output.get().asFile
    val fs = FileSpec.builder("", output.name)
      .addComment("GENERATED FILE, DO NOT EDIT!")

    val cnameAnnotation = ClassName("kotlin.native", "CName")

    val initName = "godot_gdnative_init"
    val godotInitFun = FunSpec.builder(initName)
      .addAnnotation(AnnotationSpec.builder(cnameAnnotation).addMember("%S", initName).build())
      .addParameter(
        ParameterSpec.builder("options", ClassName("gdnative", "godot_gdnative_init_options"))
          .build()
      )
      .addCode("godot.init(options)")
      .build()

    val terminateName = "godot_gdnative_terminate"
    val godotTerminateFun = FunSpec.builder(terminateName)
      .addAnnotation(AnnotationSpec.builder(cnameAnnotation).addMember("%S", terminateName).build())
      .addParameter(
        ParameterSpec.builder("options", ClassName("gdnative", "godot_gdnative_terminate_options"))
          .build()
      )
      .addCode("godot.terminate(options)")
      .build()

    val nativeScriptInitName = "godot_nativescript_init"
    val nativeScriptInitFun = FunSpec.builder(nativeScriptInitName)
      .addAnnotation(AnnotationSpec.builder(cnameAnnotation).addMember("%S", nativeScriptInitName).build())
      .addParameter(
        ParameterSpec.builder("handle", ClassName("kotlinx.cinterop", "COpaquePointer"))
          .build()
      )

    nativeScriptInitFun.addCode("godot.nativescriptInit(handle) {\n⇥")

    classes.get().forEach { cls ->
      nativeScriptInitFun.addCode("registerClass(%L)\n", cls)
    }

    nativeScriptInitFun.addCode("⇤}")

    fs.addFunction(godotInitFun)
    fs.addFunction(godotTerminateFun)
    fs.addFunction(nativeScriptInitFun.build())

    fs.build().writeTo(output.parentFile)
  }
}