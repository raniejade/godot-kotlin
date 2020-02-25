package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property

open class GeneratePluginDescriptor: DefaultTask() {
  @Input
  val name = project.objects.property<String>()

  @Input
  val description = project.objects.property<String>()

  @Input
  val author = project.objects.property<String>()

  @Input
  val mainClass = project.objects.property<String>()

  @Input
  val version = project.objects.property<String>()

  @OutputFile
  val output = project.objects.fileProperty()

  @TaskAction
  fun generate() {
    val file = output.get().asFile
    file.delete()
    file.bufferedWriter().use { writer ->
      writer.appendln("[plugin]")
      writer.appendln("name=\"${name.get()}\"")
      writer.appendln("description=\"${description.get()}\"")
      writer.appendln("author=\"${author.get()}\"")
      writer.appendln("version=\"${version.get()}\"")
      writer.appendln("script=\"src/godot/gdns/${GDClassNameUtils.normalizeClassName(mainClass.get())}.gdns\"")
    }
  }
}