package godot.task

import godot.codegen.MethodNGenerator
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property

open class GenerateMethodN: DefaultTask() {
  @Input
  var filename = project.objects.property<String>()

  var n = project.objects.property<Int>()

  @OutputDirectory
  var outputDir: DirectoryProperty = project.objects.directoryProperty()

  @TaskAction
  fun generate() {
    val generator = MethodNGenerator()
    generator.generate(filename.get(), n.get(), outputDir.get().asFile)
  }
}