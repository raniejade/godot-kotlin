package godot

import gdnative.godot_string
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class GDString(
  internal val handle: CValue<godot_string>
) {
  companion object {
    fun new(): GDString {
      val dest = cValue<godot_string>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_string_new)(dest.ptr)
      }
      return GDString(dest)
    }
  }
}
