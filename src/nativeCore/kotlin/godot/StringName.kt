package godot

import gdnative.godot_string_name
import kotlinx.cinterop.*

class StringName(
  value: CValue<godot_string_name>
): Primitive<godot_string_name>(value) {
  companion object {
    fun new(str: GDString): StringName {
      val value = memScoped {
        val tmp = alloc<godot_string_name>()
        checkNotNull(Godot.gdnative.godot_string_name_new)(tmp.ptr, str._value.ptr)
        tmp.readValue()
      }
      return StringName(value)
    }
  }
}
