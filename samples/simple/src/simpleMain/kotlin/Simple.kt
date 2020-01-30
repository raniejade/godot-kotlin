import godot.Spatial
import godot.core.ClassMemberRegistry
import godot.core.Godot
import godot.core.GodotClass
import kotlinx.cinterop.COpaquePointer

class Simple(value: COpaquePointer): Spatial(value) {
  fun _ready() {
    Godot.print("Hello Godot from Kotlin!")
  }

  override fun _onInit() {
    Godot.print("Hello in _onInit")
  }

  override fun _onDestroy() {
    // In this example, this won't show in the output tab. In order to see it
    // try running godot from a terminal.
    Godot.print("Hello in _onDestroy")
  }

  companion object: GodotClass<Spatial, Simple>(::Simple) {
    override fun init(registry: ClassMemberRegistry<Simple>) {
      with(registry) {
        registerMethod(Simple::_ready)
      }
    }
  }
}