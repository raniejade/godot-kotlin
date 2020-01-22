package godot

import gdnative.godot_rid
import kotlinx.cinterop.alloc
import kotlinx.cinterop.invoke
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr

class Rid(private val context: GDContext, internal val handle: godot_rid) {
    companion object
}