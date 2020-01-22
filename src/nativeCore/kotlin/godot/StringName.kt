package godot

import gdnative.godot_string_name
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class StringName(
  internal val handle: CValue<godot_string_name>
) {
  companion object {
    fun new(str: GDString): StringName {
      val dest = cValue<godot_string_name>()
      memScoped {
        checkNotNull(Godot.gdnative.godot_string_name_new)(dest.ptr, str.handle.ptr)
      }
      return StringName(dest)
    }
  }
}
