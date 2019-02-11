package godot

import kotlinx.cinterop.invoke
import kotlinx.cinterop.ptr

fun print(msg: String) {
    checkNotNull(Godot.gdnative.godot_print)(GDString.new(msg)._handle.ptr)
}