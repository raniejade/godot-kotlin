package godot

import gdnative.godot_pool_vector2_array
import kotlinx.cinterop.*

class PoolVector2Array(
  internal var handle: CValue<godot_pool_vector2_array>
) {
  companion object {
    fun new(): PoolVector2Array {
      val handle = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(handle)
    }

    fun new(from: GDArray): PoolVector2Array {
      val handle = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(handle)
    }
  }
}
