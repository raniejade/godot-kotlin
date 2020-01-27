import godot.Spatial
import godot.core.GodotClass
import kotlinx.cinterop.COpaquePointer

class Simple(value: COpaquePointer): Spatial(value) {
  fun _ready() {

  }

  companion object: GodotClass<Simple>(::Simple) {

  }
}