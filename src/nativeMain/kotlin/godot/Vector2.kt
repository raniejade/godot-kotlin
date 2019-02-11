package godot

import gdnative.godot_vector2
import kotlinx.cinterop.*

inline class Vector2(val _handle: godot_vector2) {
    fun normalized(): Vector2 {
        TODO()
//        return copy(
//            safeCall(Godot.gdnative.godot_vector2_normalized)(_handle.ptr)
//        )
    }

    companion object {
        fun new(x: Float = 0f, y: Float = 0f): Vector2 {
            val handle = nativeHeap.alloc<godot_vector2>()
            safeCall(Godot.gdnative.godot_vector2_new)(handle.ptr, x, y)
            return Vector2(handle)
        }

        private fun copy(base: CValue<godot_vector2>): Vector2 {
            val handle = nativeHeap.alloc<godot_vector2>()
            base.write(handle.ptr.rawValue)
            return Vector2(handle)
        }
    }
}