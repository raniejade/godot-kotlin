package godot.gradle

import org.gradle.kotlin.dsl.provideDelegate
import java.util.*

internal val buildProperties by lazy {
  val props = Properties()
  props.load(GodotPlugin::class.java.classLoader.getResourceAsStream("build.properties"))
  props
}

internal val godotKotlinVersion by lazy { buildProperties["godot.kotlin.version"] as String }
internal val godotVersion by lazy { buildProperties["godot.version"] as String }