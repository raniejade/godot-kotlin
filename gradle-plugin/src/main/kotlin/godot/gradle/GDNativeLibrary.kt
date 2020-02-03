package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.listProperty

open class GDNativeLibrary(val name: String, objects: ObjectFactory) {
  val targets = objects.listProperty<String>()
  val classes = objects.listProperty<String>()
}