package godot.gradle

import org.gradle.api.model.ObjectFactory

open class GodotExtension(objects: ObjectFactory) {
  val libraries = objects.domainObjectContainer(GDNativeLibrary::class.java)
}