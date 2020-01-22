package godot

import gdnative.godot_string
import kotlinx.cinterop.*

class GDString(private val context: GDContext, internal val handle: godot_string) {
    fun beginsWith(str: GDString): Boolean {
        return with(context) {
            checkNotNull(Godot.gdnative.godot_string_begins_with)(handle.ptr, str.handle.ptr)
        }
    }

    fun beginsWith(str: String): Boolean {
        return with(context) {
            beginsWith(GDString.new(str))
        }
    }

    fun cEscape(): GDString {
        return with(context) {
            new(
                checkNotNull(Godot.gdnative.godot_string_c_escape)(handle.ptr)
            )
        }
    }

    fun cEscapeMultiline(): GDString {
        return with(context) {
            new(
                checkNotNull(Godot.gdnative.godot_string_c_escape_multiline)(handle.ptr)
            )
        }
    }

    companion object
}