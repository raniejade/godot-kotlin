package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.property

open class GodotExtension(objects: ObjectFactory) {
  val version = objects.property<String>()
  val libraries = objects.domainObjectContainer(GDNativeLibrary::class.java)
}