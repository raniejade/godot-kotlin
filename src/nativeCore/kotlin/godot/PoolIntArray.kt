package godot

import gdnative.godot_pool_int_array
import kotlinx.cinterop.*

class PoolIntArray(
  value: CValue<godot_pool_int_array>
): Primitive<godot_pool_int_array>(value) {
  companion object {
    fun new(): PoolIntArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_int_array>()
        checkNotNull(Godot.gdnative.godot_pool_int_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolIntArray(value)
    }

    fun new(from: GDArray): PoolIntArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_int_array>()
        checkNotNull(Godot.gdnative.godot_pool_int_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolIntArray(value)
    }
  }
}
