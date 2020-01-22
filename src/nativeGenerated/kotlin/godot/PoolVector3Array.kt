// GENERATED FILE DO NOT EDIT
package godot

import gdnative.godot_pool_vector3_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolVector3Array(
  internal val handle: CValue<godot_pool_vector3_array>
) {
  companion object {
    fun new(): PoolVector3Array {
      val dest = cValue<gdnative.godot_pool_vector3_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(dest.ptr)
      }
      return PoolVector3Array(dest)
    }

    fun new(from: GDArray): PoolVector3Array {
      val dest = cValue<gdnative.godot_pool_vector3_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(dest.ptr,
          from.handle.ptr)
      }
      return PoolVector3Array(dest)
    }
  }
}
