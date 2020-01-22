package godot

import gdnative.godot_pool_int_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolIntArray(
  internal val handle: CValue<godot_pool_int_array>
) {
  companion object {
    fun new(): PoolIntArray {
      val dest = cValue<gdnative.godot_pool_int_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_int_array_new)(dest.ptr)
      }
      return PoolIntArray(dest)
    }

    fun new(from: GDArray): PoolIntArray {
      val dest = cValue<gdnative.godot_pool_int_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_int_array_new_with_array)(dest.ptr, from.handle.ptr)
      }
      return PoolIntArray(dest)
    }
  }
}
