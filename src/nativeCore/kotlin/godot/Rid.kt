package godot

import gdnative.godot_rid
import kotlinx.cinterop.*

class Rid(
  value: CValue<godot_rid>
): Primitive<godot_rid>(value) {
  companion object {
    fun new(): Rid {
      val value = memScoped {
        val tmp = alloc<godot_rid>()
        checkNotNull(Godot.gdnative.godot_rid_new)(tmp.ptr)
        tmp.readValue()
      }
      return Rid(value)
    }
  }
}
