package godot

import gdnative.godot_rid
import kotlinx.cinterop.*

class Rid(
  internal var handle: CValue<godot_rid>
) {
  companion object {
    fun new(): Rid {
      val handle = memScoped {
        val tmp = alloc<godot_rid>()
        checkNotNull(Godot.gdnative.godot_rid_new)(tmp.ptr)
        tmp.readValue()
      }
      return Rid(handle)
    }
  }
}
