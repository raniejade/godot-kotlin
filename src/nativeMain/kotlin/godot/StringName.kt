package godot

import gdnative.godot_string_name
import kotlinx.cinterop.alloc
import kotlinx.cinterop.invoke
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr

inline class StringName(val _handle: godot_string_name) {
    companion object {
        fun new(name: String): StringName {
            val handle = nativeHeap.alloc<godot_string_name>()
            safeCall(Godot.gdnative.godot_string_name_new)(
                handle.ptr,
                GDString.new(name)._handle.ptr
            )
cd
            return StringName(handle)
        }
    }
}