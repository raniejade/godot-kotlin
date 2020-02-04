package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setProperty

open class GDNativeLibrary(val name: String, objects: ObjectFactory) {
  val platforms = objects.setProperty<TargetPlatform>()
  val classes = objects.listProperty<String>()
  val debug = objects.property<Boolean>()
  val singleton = objects.property<Boolean>()
  val loadOnce = objects.property<Boolean>()
  val reloadable = objects.property<Boolean>()
  val symbolPrefix = objects.property<String>()

  fun platforms(vararg platforms: TargetPlatform) {
    this.platforms.set(platforms.toList())
  }

  fun classes(vararg classes: String) {
    this.classes.set(classes.toList())
  }

  internal val generateEntryTaskName = "generateEntry${name.capitalize()}"
  internal val generateLibraryTaskName = "generateLibrary${name.capitalize()}"
  internal val generateGDClassesTaskName = "generateGDClass${name.capitalize()}"
  internal val generatedEntryDir = "build/godot/kotlin"
  internal val generatedLibDir = "src/godot/gdnlib"
  internal val generatedGDClassesDir = "src/godot/gdns"
  internal val libraryName = "${name.capitalize()}.gdnlib"
  internal val mainSrcDir = "src/${name}Main/kotlin"
}