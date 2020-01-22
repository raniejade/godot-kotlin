package godot

import gdnative.godot_pool_color_array
import kotlinx.cinterop.*

class PoolColorArray(
  value: CValue<godot_pool_color_array>
): Primitive<godot_pool_color_array>(value) {
  companion object {
    fun new(): PoolColorArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolColorArray(value)
    }

    fun new(from: GDArray): PoolColorArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolColorArray(value)
    }
  }
}
