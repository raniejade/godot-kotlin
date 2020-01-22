package godot

import gdnative.godot_pool_real_array
import kotlinx.cinterop.*

class PoolRealArray(
  value: CValue<godot_pool_real_array>
): Primitive<godot_pool_real_array>(value) {
  companion object {
    fun new(): PoolRealArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolRealArray(value)
    }

    fun new(from: GDArray): PoolRealArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolRealArray(value)
    }
  }
}
