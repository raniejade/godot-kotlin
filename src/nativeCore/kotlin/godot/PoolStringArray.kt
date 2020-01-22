package godot

import gdnative.godot_pool_string_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolStringArray(
  internal val handle: CValue<godot_pool_string_array>
) {
  companion object {
    fun new(): PoolStringArray {
      val dest = cValue<godot_pool_string_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_string_array_new)(dest.ptr)
      }
      return PoolStringArray(dest)
    }

    fun new(from: GDArray): PoolStringArray {
      val dest = cValue<godot_pool_string_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(dest.ptr,
          from.handle.ptr)
      }
      return PoolStringArray(dest)
    }
  }
}
