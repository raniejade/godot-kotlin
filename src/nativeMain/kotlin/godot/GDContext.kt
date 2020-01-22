package godot

import gdnative.*
import kotlinx.cinterop.*

class GDContext {
    private val arena = Arena()

    fun destroy() {
        arena.clear()
    }

    fun GDString.Companion.new(str: String): GDString {
        val dest = arena.alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_new)(dest.ptr)
        memScoped {
            checkNotNull(Godot.gdnative.godot_string_parse_utf8)(dest.ptr, str.cstr.ptr)
        }
        return GDString(this@GDContext, dest)
    }
    fun GDString.Companion.new(base: CValue<godot_string>): GDString {
        val dest = arena.alloc<godot_string>()
        base.write(dest.rawPtr)
        return GDString(this@GDContext, dest)
    }

    fun StringName.Companion.new(name: String): StringName {
        val dest = arena.alloc<godot_string_name>()
        checkNotNull(Godot.gdnative.godot_string_name_new)(
            dest.ptr,
            GDString.new(name).handle.ptr
        )
        return StringName(this@GDContext, dest)
    }
    fun StringName.Companion.new(base: CValue<godot_string_name>): StringName {
        val dest = arena.alloc<godot_string_name>()
        base.write(dest.rawPtr)
        return StringName(this@GDContext, dest)
    }

    fun Rid.Companion.new(): Rid {
        val handle = nativeHeap.alloc<godot_rid>()
        checkNotNull(Godot.gdnative.godot_rid_new)(handle.ptr)
        return Rid(this@GDContext, handle)
    }
    fun Rid.Companion.new(base: CValue<godot_rid>): Rid {
        val dest = nativeHeap.alloc<godot_rid>()
        base.write(dest.rawPtr)
        return Rid(this@GDContext, dest)
    }

    fun Vector2.Companion.new(x: Float = 0f, y: Float = 0f): Vector2 {
        val dest = arena.alloc<godot_vector2>()
        checkNotNull(Godot.gdnative.godot_vector2_new)(dest.ptr, x, y)
        return Vector2(this@GDContext, dest)
    }
    fun Vector2.Companion.new(base: CValue<godot_vector2>): Vector2 {
        val dest = arena.alloc<godot_vector2>()
        base.write(dest.rawPtr)
        return Vector2(this@GDContext, dest)
    }

    fun Vector3.Companion.new(x: Float = 0f, y: Float = 0f, z: Float = 0f): Vector3 {
        val dest = arena.alloc<godot_vector3>()
        checkNotNull(Godot.gdnative.godot_vector3_new)(dest.ptr, x, y, z)
        return Vector3(this@GDContext, dest)
    }
    fun Vector3.Companion.new(base: CValue<godot_vector3>): Vector3 {
        val dest = arena.alloc<godot_vector3>()
        base.write(dest.rawPtr)
        return Vector3(this@GDContext, dest)
    }
}