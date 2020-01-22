package godot

import gdnative.godot_pool_vector2_array
import kotlinx.cinterop.*

class PoolVector2Array(
  value: CValue<godot_pool_vector2_array>
): Primitive<godot_pool_vector2_array>(value) {
  companion object {
    fun new(): PoolVector2Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(value)
    }

    fun new(from: GDArray): PoolVector2Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(value)
    }
  }
}
