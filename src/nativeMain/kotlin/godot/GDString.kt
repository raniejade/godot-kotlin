package godot

import gdnative.godot_string
import kotlinx.cinterop.*

internal inline class GDString(val _handle: godot_string) {
    companion object {
        fun new(str: String): GDString {
            val dest = nativeHeap.alloc<godot_string>()
            safeCall(Godot.gdnative.godot_string_new)(dest.ptr)
            memScoped {
                safeCall(Godot.gdnative.godot_string_parse_utf8)(dest.ptr, str.cstr.ptr)
            }
            return GDString(dest)
        }
    }
}