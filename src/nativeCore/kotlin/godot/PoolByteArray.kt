package godot

import gdnative.godot_pool_byte_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class PoolByteArray(
  internal val handle: CValue<godot_pool_byte_array>
) {
  companion object {
    fun new(): PoolByteArray {
      val dest = cValue<godot_pool_byte_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new)(dest.ptr)
      }
      return PoolByteArray(dest)
    }

    fun new(from: GDArray): PoolByteArray {
      val dest = cValue<godot_pool_byte_array>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_pool_byte_array_new_with_array)(dest.ptr, from.handle.ptr)
      }
      return PoolByteArray(dest)
    }
  }
}
