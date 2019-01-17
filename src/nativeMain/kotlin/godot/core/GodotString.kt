package godot.core

import gdnative.godot_string
import godot.Godot
import kotlinx.cinterop.*
import kotlin.String as KString

internal inline class GodotString(val _handle: godot_string) {
    companion object {
        fun new(str: KString): GodotString {
            val dest = nativeHeap.alloc<godot_string>()
            safe(Godot.gdnative.godot_string_new)(dest.ptr)
            memScoped {
                safe(Godot.gdnative.godot_string_parse_utf8)(dest.ptr, str.cstr.getPointer(this))
            }
            return GodotString(dest)
        }
    }
}