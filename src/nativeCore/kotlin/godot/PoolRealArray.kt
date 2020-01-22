package godot

import gdnative.godot_pool_real_array
import kotlinx.cinterop.*

class PoolRealArray(
  internal var handle: CValue<godot_pool_real_array>
) {
  companion object {
    fun new(): PoolRealArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolRealArray(handle)
    }

    fun new(from: GDArray): PoolRealArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolRealArray(handle)
    }
  }
}
