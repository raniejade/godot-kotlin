package godot

import gdnative.godot_vector2
import kotlinx.cinterop.*

class Vector2(
  internal var handle: CValue<godot_vector2>
) {
  companion object {
    fun new(x: Float, y: Float): Vector2 {
      val handle = memScoped {
        val tmp = alloc<godot_vector2>()
        checkNotNull(Godot.gdnative.godot_vector2_new)(tmp.ptr, x, y)
        tmp.readValue()
      }
      return Vector2(handle)
    }
  }
}
