package godot

import gdnative.godot_pool_byte_array
import kotlinx.cinterop.*

class PoolByteArray(
  internal var handle: CValue<godot_pool_byte_array>
) {
  companion object {
    fun new(): PoolByteArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_byte_array>()
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolByteArray(handle)
    }

    fun new(from: GDArray): PoolByteArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_byte_array>()
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolByteArray(handle)
    }
  }
}
