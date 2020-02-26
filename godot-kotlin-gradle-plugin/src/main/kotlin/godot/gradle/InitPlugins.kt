package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipException
import java.util.zip.ZipFile

open class InitPlugins : DefaultTask() {
  @InputFiles
  val plugins = project.objects.fileCollection()

  @OutputDirectory
  val outputDir = project.objects.directoryProperty()

  @TaskAction
  fun run() {
    for (plugin in plugins) {
      if (!plugin.exists()) {
        logger.warn("${plugin.name} does not exist!")
        break
      }

      if (!plugin.endsWith(".zip")) {
        logger.warn("${plugin.name} must be a zip file!")
      }

      ZipFile(plugin).use {
        unzip(it, outputDir.get().asFile)
      }
    }
  }
}