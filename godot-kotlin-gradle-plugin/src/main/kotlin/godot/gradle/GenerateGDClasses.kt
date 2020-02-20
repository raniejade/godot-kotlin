package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property
import java.io.File

open class GenerateGDClasses : DefaultTask() {
  @Input
  val classes = project.objects.listProperty<String>()

  @Input
  val libraryFile = project.objects.property<String>()

  @Input
  val pathPrefix = project.objects.property<String>()

  @OutputDirectory
  val outputDir = project.objects.directoryProperty()

  @TaskAction
  fun generateTask() {
    classes.get().forEach { cls ->
      val className = normalizeClassName(cls)
      val file = File(outputDir.get().asFile, "$className.gdns")
      file.delete()
      val prefix = pathPrefix.getOrElse("res://")
      file.bufferedWriter().use { writer ->
        writer.appendln("[gd_resource type=\"NativeScript\" load_steps=2 format=2]")
        writer.appendln("[ext_resource path=\"$prefix${libraryFile.get()}\" type=\"GDNativeLibrary\" id=1]")
        writer.appendln("[resource]")
        writer.appendln("resource_name=\"$className\"")
        writer.appendln("class_name=\"$className\"")
        writer.appendln("library=ExtResource(1)")
      }
    }
  }

  private fun normalizeClassName(cls: String): String {
    return CLASS_REGEX.matchEntire(cls)?.let { result ->
      result.groups["simpleName"]!!.value
    } ?: cls
  }

  companion object {
    val CLASS_REGEX = Regex("^(?<package>(?>\\w+\\.)*)(?<simpleName>\\w+)\$")
  }
}