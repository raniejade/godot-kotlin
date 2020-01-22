package godot

import gdnative.godot_pool_vector3_array
import kotlinx.cinterop.*

class PoolVector3Array(
  internal val handle: CValue<godot_pool_vector3_array>
) {
  companion object {
    fun new(): PoolVector3Array {
      val handle = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(handle)
    }

    fun new(from: GDArray): PoolVector3Array {
      val handle = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(handle)
    }
  }
}
