package godot.core

import godot.Godot
import kotlinx.cinterop.*

fun print(msg: String) {
    checkNotNull(Godot.gdnative.godot_print)(GodotString.new(msg)._handle.ptr)
}