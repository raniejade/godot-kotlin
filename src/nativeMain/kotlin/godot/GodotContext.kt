package godot

import gdnative.godot_vector2
import kotlinx.cinterop.*

class GodotContext {
    private val arena = Arena()

    fun Vector2.Companion.new(x: Float = 0f, y: Float = 0f): Vector2 {
        val handle = arena.alloc<godot_vector2>()
        safeCall(Godot.gdnative.godot_vector2_new)(handle.ptr, x, y)
        return Vector2(this@GodotContext, handle)
    }

    fun Vector2.Companion.new(base: CValue<godot_vector2>): Vector2 {
        val handle = arena.alloc<godot_vector2>()
        base.write(handle.ptr.rawValue)
        return Vector2(this@GodotContext, handle)
    }
}