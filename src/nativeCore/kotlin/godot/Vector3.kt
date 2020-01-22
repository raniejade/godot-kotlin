package godot

import gdnative.godot_vector3
import kotlinx.cinterop.*

class Vector3(
  value: CValue<godot_vector3>
): Primitive<godot_vector3>(value) {
  companion object {
    fun new(
      x: Float,
      y: Float,
      z: Float
    ): Vector3 {
      val value = memScoped {
        val tmp = alloc<godot_vector3>()
        checkNotNull(Godot.gdnative.godot_vector3_new)(tmp.ptr, x, y, z)
        tmp.readValue()
      }
      return Vector3(value)
    }
  }
}
