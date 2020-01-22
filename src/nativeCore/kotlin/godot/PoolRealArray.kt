package godot

import gdnative.godot_pool_real_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolRealArray(
  internal val handle: CValue<godot_pool_real_array>
) {
  companion object {
    fun new(): PoolRealArray {
      val dest = cValue<godot_pool_real_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_real_array_new)(dest.ptr)
      }
      return PoolRealArray(dest)
    }

    fun new(from: GDArray): PoolRealArray {
      val dest = cValue<godot_pool_real_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_real_array_new_with_array)(dest.ptr, from.handle.ptr)
      }
      return PoolRealArray(dest)
    }
  }
}
