package godot

import gdnative.godot_string
import kotlinx.cinterop.*

class GDString(
  internal val handle: CValue<godot_string>
) {
  fun beginsWith(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_begins_with)(handle.ptr, str.handle.ptr)
    }
  }

  fun beginsWith(str: String): Boolean {
    return beginsWith(new(str))
  }

  fun cEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_escape)(handle.ptr))
    }
  }

  fun cUnEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_unescape)(handle.ptr))
    }
  }

  companion object {
    fun new(): GDString {
      val handle = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_new)(tmp.ptr)
        tmp.readValue()
      }
      return GDString(handle)
    }

    fun new(str: String): GDString{
      val handle = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8)(tmp.ptr, str.cstr.ptr)
        tmp.readValue()
      }
      return GDString(handle)
    }

    fun new(str: String, len: Int): GDString {
      val handle = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8_with_len)(tmp.ptr, str.cstr.ptr, len)
        tmp.readValue()
      }
      return GDString(handle)
    }
  }
}
