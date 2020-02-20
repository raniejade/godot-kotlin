package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.provideDelegate

class GodotBasePlugin: Plugin<Project> {
  private val currentOS by lazy {
    val current = OperatingSystem.current()
    when {
      current.isLinux -> "linux"
      current.isMacOsX -> "macos"
      current.isWindows -> "windows"
      else -> throw AssertionError("Unsupported os: ${current.name}")
    }
  }

  fun configureDefaults(extension: GodotBaseExtension) {
    extension.isCompositeBuild.set(false)
    extension.godotKotlinVersion.set(godotKotlinVersion)
  }

  override fun apply(project: Project) {
    project.plugins.apply("org.jetbrains.kotlin.multiplatform")
    configurePluginAttributes(project)
  }

  private fun configurePluginAttributes(project: Project) {
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
          attribute(PluginAttributes.os, objects.named(currentOS))
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
  }
}