package godot.gradle

import de.undercouch.gradle.tasks.download.Download
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.provideDelegate

open class GodotBasePlugin : Plugin<Project> {
  val currentOS by lazy {
    val current = OperatingSystem.current()
    when {
      current.isLinux -> TargetPlatform.LINUX
      current.isMacOsX -> TargetPlatform.MACOS
      current.isWindows -> TargetPlatform.WINDOWS
      else -> throw AssertionError("Unsupported os: ${current.name}")
    }
  }

  lateinit var godotComponent: GodotSoftwareComponent

  fun configureDefaults(extension: GodotBaseExtension) {
    extension.isCompositeBuild.set(false)
    extension.godotKotlinVersion.set(godotKotlinVersion)
    extension.godotVersion.set(godotVersion)
  }

  override fun apply(project: Project) {
    project.plugins.apply("org.jetbrains.kotlin.multiplatform")
    configureConfigurations(project)
    configureComponents(project)
  }

  fun configureBaseTasks(project: Project, extension: GodotBaseExtension) {
    project.tasks.register(INIT_PLUGINS_TASK_NAME, InitPlugins::class.java) {
      group = GODOT_TASK_GROUP
      description = "Initializes all plugins needed by this project."
      plugins.from(project.configurations.getByName(PLUGIN_INCOMING_CONFIGURATION_NAME))
      outputDir.set(project.file("addons"))
    }

    val rawVersion = extension.godotVersion.get()
    val match = GODOT_VERSION_REGEX.matchEntire(rawVersion)
    requireNotNull(match) { "Invalid godot version string: $rawVersion" }
    // match.groups[0] is always the full match
    val base = requireNotNull(match.groups[1])
    val rc = match.groups[2]
    val url = StringBuilder(GODOT_DOWNLOAD_URL_BASE)
    url.append("/${base.value}")
    if (rc != null) {
      url.append("/rc${rc.value}")
    }
    val filename = StringBuilder("Godot_v${base.value}")
    if (rc == null) {
      filename.append("-stable")
    } else {
      filename.append("-rc${rc.value}")
    }
    when (currentOS) {
      TargetPlatform.WINDOWS -> filename.append("_win64.exe.zip")
      TargetPlatform.LINUX -> filename.append("_x11.64.zip")
      TargetPlatform.MACOS -> filename.append("_osx.64.zip")
      else -> throw AssertionError("Unsupported platform $currentOS")
    }
    url.append("/$filename")

    val downloadedBinaryPath = project.file("${project.buildDir}/$filename")

    project.tasks.register(DOWNLOAD_GODOT_TASK_NAME, Download::class.java) {
      group = GODOT_TASK_GROUP
      description = "Download godot executable for the current operating system."
      src(url.toString())
      dest(downloadedBinaryPath)
      onlyIfNewer(true)
      onlyIfModified(true)
    }

    val binaryOutputDir = "${project.buildDir}/godot/bin"
    project.tasks.register(EXTRACT_GODOT_TASK_NAME, Copy::class.java) {
      dependsOn(project.tasks.named(DOWNLOAD_GODOT_TASK_NAME))
      from(project.zipTree(downloadedBinaryPath))
      into(binaryOutputDir)
    }

    val binaryFilename = filename.toString().removeSuffix(".zip")
    val binaryPath = when(currentOS) {
      TargetPlatform.LINUX, TargetPlatform.WINDOWS -> project.file("$binaryOutputDir/$binaryFilename")
      TargetPlatform.MACOS -> project.file("$binaryOutputDir/$binaryFilename/Contents/MacOS/Godot")
      else -> throw AssertionError("Unsupported platform $currentOS")
    }

    project.tasks.register(RUN_GODOT_TASK_NAME, GodotExec::class.java) {
      dependsOn(project.tasks.named(EXTRACT_GODOT_TASK_NAME))
      group = GODOT_TASK_GROUP
      description = "Runs godot."
      binary.set(binaryPath)
      args.set(listOf("-e", "--path", project.projectDir.absolutePath))
    }
  }

  private fun configureComponents(project: Project) {
    godotComponent = GodotSoftwareComponent("godot")
    project.components.add(godotComponent)
  }

  private fun configureConfigurations(project: Project) {
    with(project) {
      dependencies.attributesSchema {
        attribute(PluginAttributes.usage)
        attribute(PluginAttributes.os)
      }

      configurations.create(PLUGIN_INCOMING_CONFIGURATION_NAME) {
        isCanBeResolved = true
        isCanBeConsumed = false
        attributes {
          attribute(PluginAttributes.usage, objects.named(PluginAttributes.Usage.PLUGIN))
          attribute(PluginAttributes.os, objects.named(currentOS.normalizedName()))
        }
      }

      configurations.create(PLUGIN_LINUX_OUTGOING_CONFIGURATION_NAME) {
        isCanBeResolved = false
        isCanBeConsumed = true
        attributes {
          attribute(PluginAttributes.usage, objects.named(PluginAttributes.Usage.PLUGIN))
          attribute(PluginAttributes.os, objects.named(PluginAttributes.EditorPlatform.LINUX))
        }
      }

      configurations.create(PLUGIN_WINDOWS_OUTGOING_CONFIGURATION_NAME) {
        isCanBeResolved = false
        isCanBeConsumed = true
        attributes {
          attribute(PluginAttributes.usage, objects.named(PluginAttributes.Usage.PLUGIN))
          attribute(PluginAttributes.os, objects.named(PluginAttributes.EditorPlatform.WINDOWS))
        }
      }

      configurations.create(PLUGIN_MACOS_OUTGOING_CONFIGURATION_NAME) {
        isCanBeResolved = false
        isCanBeConsumed = true
        attributes {
          attribute(PluginAttributes.usage, objects.named(PluginAttributes.Usage.PLUGIN))
          attribute(PluginAttributes.os, objects.named(PluginAttributes.EditorPlatform.MACOS))
        }
      }
    }
  }

  companion object {
    val GODOT_VERSION_REGEX = Regex("(?<base>\\d\\.\\d(?>\\.\\d)?)(?>-rc(?<rc>\\d))?")
    const val GODOT_DOWNLOAD_URL_BASE = "https://downloads.tuxfamily.org/godotengine"
    const val DOWNLOAD_GODOT_TASK_NAME = "downloadGodot"
    const val EXTRACT_GODOT_TASK_NAME = "extractGodot"
    const val RUN_GODOT_TASK_NAME = "runGodot"
    const val PLUGIN_LINUX_OUTGOING_CONFIGURATION_NAME = "godotPluginLinuxApiElements"
    const val PLUGIN_WINDOWS_OUTGOING_CONFIGURATION_NAME = "godotPluginWindowsApiElements"
    const val PLUGIN_MACOS_OUTGOING_CONFIGURATION_NAME = "godotPluginMacosApiElements"
    const val PLUGIN_INCOMING_CONFIGURATION_NAME = "godotPlugin"
    const val INIT_PLUGINS_TASK_NAME = "initPlugins"
    const val GODOT_TASK_GROUP = "Godot"
  }
}