package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.mapProperty
import org.gradle.kotlin.dsl.property

open class GenerateLibrary : DefaultTask() {
  @Input
  val libraries = project.objects.mapProperty<TargetPlatform, String>()

  @Input
  val singleton = project.objects.property<Boolean>()

  @Input
  val loadOnce = project.objects.property<Boolean>()

  @Input
  val reloadable = project.objects.property<Boolean>()

  @Input
  val symbolPrefix = project.objects.property<String>()

  @OutputFile
  val output = project.objects.fileProperty()

  @TaskAction
  fun generate() {
    val file = output.get().asFile
    file.delete()
    file.bufferedWriter().use { writer ->
      writer.appendln("[entry]")
      writer.appendln()
      libraries.get().forEach { (platform, path) ->
        writer.appendln("${platformToKey(platform)}=\"$path\"")
      }
      writer.appendln()

      writer.appendln("[dependencies]")
      writer.appendln()
      libraries.get().forEach { (platform, _) ->
        writer.appendln("${platformToKey(platform)}=[  ]")
      }
      writer.appendln()

      writer.appendln("[general]")
      writer.appendln()
      writer.appendln("singleton=${singleton.get()}")
      writer.appendln("load_once=${loadOnce.get()}")
      writer.appendln("symbol_prefix=\"${symbolPrefix.get()}\"")
      writer.appendln("reloadable=${reloadable.get()}")
    }
  }

  private fun platformToKey(platform: TargetPlatform): String {
    return when (platform) {
      TargetPlatform.WINDOWS -> "Windows.64"
      TargetPlatform.LINUX -> "X11.64"
      TargetPlatform.MACOS -> "OSX.64"
    }
  }
}