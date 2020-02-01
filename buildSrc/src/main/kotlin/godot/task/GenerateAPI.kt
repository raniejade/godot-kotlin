package godot.task

import godot.codegen.APIGenerator
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property

open class GenerateAPI: DefaultTask() {
    @InputFile
    var source: RegularFileProperty = project.objects.fileProperty()

    @Input
    var maxSignalParams = project.objects.property<Int>()

    @OutputDirectory
    var outputDir: DirectoryProperty = project.objects.directoryProperty()

    @TaskAction
    fun generate() {
        val generator = APIGenerator()
        // clear output directly first
        outputDir.get().asFile.deleteRecursively()
        generator.generate(source.asFile.get(), maxSignalParams.get(), outputDir.asFile.get())
    }
}