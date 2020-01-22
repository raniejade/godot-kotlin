package godot

import gdnative.godot_pool_int_array
import kotlinx.cinterop.*

class PoolIntArray(
  internal var handle: CValue<godot_pool_int_array>
) {
  companion object {
    fun new(): PoolIntArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_int_array>()
        checkNotNull(Godot.gdnative.godot_pool_int_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolIntArray(handle)
    }

    fun new(from: GDArray): PoolIntArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_int_array>()
        checkNotNull(Godot.gdnative.godot_pool_int_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolIntArray(handle)
    }
  }
}
