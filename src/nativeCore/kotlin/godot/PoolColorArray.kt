package godot

import gdnative.godot_pool_color_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolColorArray(
  internal val handle: CValue<godot_pool_color_array>
) {
  companion object {
    fun new(): PoolColorArray {
      val dest = cValue<gdnative.godot_pool_color_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_color_array_new)(dest.ptr)
      }
      return PoolColorArray(dest)
    }

    fun new(from: GDArray): PoolColorArray {
      val dest = cValue<gdnative.godot_pool_color_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_color_array_new_with_array)(dest.ptr,
          from.handle.ptr)
      }
      return PoolColorArray(dest)
    }
  }
}
