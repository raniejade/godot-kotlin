package godot

import gdnative.godot_rid
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Rid(
  internal val handle: CValue<godot_rid>
) {
  companion object {
    fun new(): Rid {
      val dest = cValue<godot_rid>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_rid_new)(dest.ptr)
      }
      return Rid(dest)
    }
  }
}
