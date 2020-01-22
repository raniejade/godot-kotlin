package godot

import gdnative.godot_pool_vector3_array
import kotlinx.cinterop.*

class PoolVector3Array(
  value: CValue<godot_pool_vector3_array>
): Primitive<godot_pool_vector3_array>(value) {
  companion object {
    fun new(): PoolVector3Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(value)
    }

    fun new(from: GDArray): PoolVector3Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(value)
    }
  }
}
