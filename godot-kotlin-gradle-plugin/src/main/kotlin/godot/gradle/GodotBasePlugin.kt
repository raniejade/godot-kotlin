package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.dependencies
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
  }

  override fun apply(project: Project) {
    project.plugins.apply("org.jetbrains.kotlin.multiplatform")
    configureConfigurations(project)
    configureComponents(project)
    configureBaseTasks(project)
  }

  private fun configureBaseTasks(project: Project) {
    project.tasks.register(INIT_PLUGINS_TASK_NAME, InitPlugins::class.java) {
      plugins.from(project.configurations.getByName(PLUGIN_INCOMING_CONFIGURATION_NAME))
      outputDir.set(project.file("addons"))
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
    const val PLUGIN_LINUX_OUTGOING_CONFIGURATION_NAME = "godotPluginLinuxApiElements"
    const val PLUGIN_WINDOWS_OUTGOING_CONFIGURATION_NAME = "godotPluginWindowsApiElements"
    const val PLUGIN_MACOS_OUTGOING_CONFIGURATION_NAME = "godotPluginMacosApiElements"
    const val PLUGIN_INCOMING_CONFIGURATION_NAME = "godotPlugin"
    const val INIT_PLUGINS_TASK_NAME = "initPlugins"
  }
}