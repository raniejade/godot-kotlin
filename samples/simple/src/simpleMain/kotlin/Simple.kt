import godot.*
import kotlinx.cinterop.COpaquePointer

class Simple(value: COpaquePointer): Spatial(value) {
  fun _ready() {
    gprint("Hello Godot from Kotlin!")
  }

  override fun _onInit() {
    gprint("Hello in _onInit")
  }

  override fun _onDestroy() {
    // In this example, this won't show in the output tab. In order to see it
    // try running godot from a terminal.
    gprint("Hello in _onDestroy")
  }

  companion object: GodotClass<Spatial, Simple>(::Simple) {
    override fun init(registry: ClassMemberRegistry<Simple>) {
      with(registry) {
        registerMethod(Simple::_ready)
      }
    }

    override fun createBaseClass() = Spatial.new()
  }
}