package godot

import gdnative.godot_rid
import kotlinx.cinterop.alloc
import kotlinx.cinterop.invoke
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr

inline class RID(val _handle: godot_rid): GDObject {
    override fun free() {
        nativeHeap.free(_handle.rawPtr)
    }

    companion object {
        fun new(): RID {
            val handle = nativeHeap.alloc<godot_rid>()
            safeCall(Godot.gdnative.godot_rid_new)(handle.ptr)
            return RID(handle).track()
        }
    }
}