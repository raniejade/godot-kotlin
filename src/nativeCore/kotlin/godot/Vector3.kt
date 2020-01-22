package godot

import gdnative.godot_vector3
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Vector3(
  internal val handle: CValue<godot_vector3>
) {
  companion object {
    fun new(
      x: Float,
      y: Float,
      z: Float
    ): Vector3 {
      val dest = cValue<godot_vector3>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_vector3_new)(dest.ptr, x, y, z)
      }
      return Vector3(dest)
    }
  }
}
