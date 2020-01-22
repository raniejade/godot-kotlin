package godot

import gdnative.godot_pool_string_array
import kotlinx.cinterop.*

class PoolStringArray(
  value: CValue<godot_pool_string_array>
): Primitive<godot_pool_string_array>(value) {
  companion object {
    fun new(): PoolStringArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolStringArray(value)
    }

    fun new(from: GDArray): PoolStringArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolStringArray(value)
    }
  }
}
