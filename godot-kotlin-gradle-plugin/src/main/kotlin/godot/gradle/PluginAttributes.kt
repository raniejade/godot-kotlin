package godot.gradle

import org.gradle.api.Named
import org.gradle.api.attributes.Attribute

object PluginAttributes {
  interface EditorPlatform: Named {
    companion object {
      val LINUX = "linux"
      val WINDOWS = "windows"
      val MACOS = "macos"
    }
  }

  interface Usage: Named {
    companion object {
      val PLUGIN = "plugin"
    }
  }

  val usage = Attribute.of("godot.kotlin.usage", Usage::class.java)
  val os = Attribute.of("godot.kotlin.plugin.os", EditorPlatform::class.java)
}