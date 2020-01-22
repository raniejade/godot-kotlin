package godot

import gdnative.godot_pool_string_array
import kotlinx.cinterop.*

class PoolStringArray(
  internal var handle: CValue<godot_pool_string_array>
) {
  companion object {
    fun new(): PoolStringArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolStringArray(handle)
    }

    fun new(from: GDArray): PoolStringArray {
      val handle = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(tmp.ptr, from.handle.ptr)
        tmp.readValue()
      }
      return PoolStringArray(handle)
    }
  }
}
