package godot

import gdnative.godot_vector3
import kotlinx.cinterop.*

inline class Vector3(val _handle: godot_vector3) {
    companion object {
        fun new(x: Float = 0f, y: Float = 0f, z: Float = 0f): Vector3 {
            val handle = nativeHeap.alloc<godot_vector3>()
            safeCall(Godot.gdnative.godot_vector3_new)(handle.ptr, x, y, z)
            return Vector3(handle)
        }

        private fun copy(base: CValue<godot_vector3>): Vector3 {
            val handle = nativeHeap.alloc<godot_vector3>()
            base.write(handle.ptr.rawValue)
            return Vector3(handle)
        }
    }
}