package godot

import gdnative.godot_pool_color_array
import kotlinx.cinterop.*

class PoolColorArray(
  internal val handle: CValue<godot_pool_color_array>
) {
  companion object {
    fun new(): PoolColorArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolColorArray(handle)
    }

    fun new(from: GDArray): PoolColorArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_color_array>()
        checkNotNull(Godot.gdnative.godot_pool_color_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolColorArray(handle)
    }
  }
}
