package godot

import gdnative.godot_vector2
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Vector2(
  internal val handle: CValue<godot_vector2>
) {
  companion object {
    fun new(x: Float, y: Float): Vector2 {
      val dest = cValue<godot_vector2>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_vector2_new)(dest.ptr, x, y)
      }
      return Vector2(dest)
    }
  }
}