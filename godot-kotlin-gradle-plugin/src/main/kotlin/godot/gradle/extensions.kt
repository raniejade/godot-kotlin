package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property

abstract class GodotBaseExtension(objects: ObjectFactory) {
  @Deprecated("Hack don't use")
  val isCompositeBuild = objects.property<Boolean>()
  val godotKotlinVersion = objects.property<String>()
}

open class GodotExtension(objects: ObjectFactory): GodotBaseExtension(objects) {
  val libraries = objects.domainObjectContainer(GDNativeLibrary::class.java)
}

open class GodotPluginExtension(objects: ObjectFactory): GodotBaseExtension(objects) {
  val name = objects.property<String>()
  val description = objects.property<String>()
  val author = objects.property<String>()
  val mainClass = objects.property<String>()
  val version = objects.property<String>()
  val additionalClasses = objects.listProperty<String>()
  val debug = objects.property<Boolean>()

  fun additionalClasses(vararg classes: String) {
    additionalClasses.addAll(*classes)
  }
}