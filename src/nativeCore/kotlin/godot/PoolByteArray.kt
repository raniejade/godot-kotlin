package godot

import gdnative.godot_pool_byte_array
import kotlinx.cinterop.*

class PoolByteArray(
  value: CValue<godot_pool_byte_array>
): Primitive<godot_pool_byte_array>(value) {
  companion object {
    fun new(): PoolByteArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_byte_array>()
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolByteArray(value)
    }

    fun new(from: GDArray): PoolByteArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_byte_array>()
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolByteArray(value)
    }
  }
}
