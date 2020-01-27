import godot.Spatial
import godot.core.GodotClass
import godot.core.ClassRegistry
import godot.core.Godot
import kotlinx.cinterop.COpaquePointer

class Simple(value: COpaquePointer): Spatial(value) {
  fun _ready() {
    Godot.print("Hello Godot from Kotlin!")
  }

  companion object: GodotClass<Simple>(::Simple) {
    override fun ClassRegistry<Simple>.init() {
      registerMethod(Simple::_ready)
    }
  }
}