package godot

import gdnative.godot_string
import kotlinx.cinterop.*

class GDString(
  value: CValue<godot_string>
): Primitive<godot_string>(value) {
  fun beginsWith(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_begins_with)(_value.ptr, str._value.ptr)
    }
  }

  fun beginsWith(str: String): Boolean {
    return beginsWith(new(str))
  }

  fun cEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_escape)(_value.ptr))
    }
  }

  fun cUnEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_unescape)(_value.ptr))
    }
  }

  fun erase(start: Int, count: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_string_erase)(ptr, start, count)
      ptr.pointed.readValue()
    }
  }

  companion object {
    fun new(): GDString {
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_new)(tmp.ptr)
        tmp.readValue()
      }
      return GDString(value)
    }

    fun new(str: String): GDString{
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8)(tmp.ptr, str.cstr.ptr)
        tmp.readValue()
      }
      return GDString(value)
    }

    fun new(str: String, len: Int): GDString {
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8_with_len)(tmp.ptr, str.cstr.ptr, len)
        tmp.readValue()
      }
      return GDString(value)
    }
  }
}
