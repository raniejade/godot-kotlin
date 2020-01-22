package godot

import gdnative.godot_string_name
import kotlinx.cinterop.*

class StringName(
  internal var handle: CValue<godot_string_name>
) {
  companion object {
    fun new(str: GDString): StringName {
      val handle = memScoped {
        val tmp = alloc<godot_string_name>()
        checkNotNull(Godot.gdnative.godot_string_name_new)(tmp.ptr, str.handle.ptr)
        tmp.readValue()
      }
      return StringName(handle)
    }
  }
}
