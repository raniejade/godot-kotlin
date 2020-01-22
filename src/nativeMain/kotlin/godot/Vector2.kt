package godot

import gdnative.godot_vector2
import kotlinx.cinterop.invoke
import kotlinx.cinterop.ptr

class Vector2(private val context: GDContext, private val _handle: godot_vector2) {
    fun normalized(): Vector2 {
        return with(context) {
            new(
                checkNotNull(Godot.gdnative.godot_vector2_normalized)(_handle.ptr)
            )
        }
    }

    companion object
}