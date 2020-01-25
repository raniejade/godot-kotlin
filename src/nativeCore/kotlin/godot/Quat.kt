package godot

import gdnative.godot_quat
import kotlinx.cinterop.*

class Quat(
  value: CValue<godot_quat>
) : Primitive<godot_quat>(value) {
  companion object {
    fun new(x: Float = 0f, y: Float = 0f, z: Float = 0f, w: Float = 1f): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative.godot_quat_new)(tmp.ptr, x, y, z, w)
        tmp.readValue()
      }
      return Quat(value)
    }

    fun new(axis: Vector3, w: Float = 1f): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative.godot_quat_new_with_axis_angle)(tmp.ptr, axis._value.ptr, w)
        tmp.readValue()
      }
      return Quat(value)
    }
  }
}