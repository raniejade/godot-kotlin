package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.listProperty

open class GodotExec : DefaultTask() {
  @InputFile
  val binary = project.objects.fileProperty()

  @Input
  @Optional
  val args = project.objects.listProperty<String>()

  @TaskAction
  fun exec() {
    val actualArgs = mutableListOf<String>()
    actualArgs.add(binary.get().asFile.absolutePath)
    actualArgs.addAll(args.getOrElse(emptyList()))
    ProcessBuilder(actualArgs)
      .start()
  }
}