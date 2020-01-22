package godot

import gdnative.godot_string_name
import kotlinx.cinterop.alloc
import kotlinx.cinterop.invoke
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr

class StringName(private val context: GDContext, internal val handle: godot_string_name) {
  companion object
}