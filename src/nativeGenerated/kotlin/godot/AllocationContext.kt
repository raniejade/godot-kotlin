// GENERATED FILE DO NOT EDIT
package godot

import kotlin.Float
import kotlinx.cinterop.Arena
import kotlinx.cinterop.alloc
import kotlinx.cinterop.invoke
import kotlinx.cinterop.ptr

interface AllocationContext {
  val arena: Arena

  fun PoolRealArray.Companion.new(): PoolRealArray {
    val dest = arena.alloc<gdnative.godot_pool_real_array>()
    checkNotNull(Godot.gdnative.godot_pool_real_array_new)(dest.ptr)
    return PoolRealArray(this@AllocationContext, dest)
  }

  fun PoolRealArray.Companion.new(from: GDArray): PoolRealArray {
    val dest = arena.alloc<gdnative.godot_pool_real_array>()
    checkNotNull(Godot.gdnative.godot_pool_real_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolRealArray(this@AllocationContext, dest)
  }

  fun PoolByteArray.Companion.new(): PoolByteArray {
    val dest = arena.alloc<gdnative.godot_pool_byte_array>()
    checkNotNull(Godot.gdnative.godot_pool_byte_array_new)(dest.ptr)
    return PoolByteArray(this@AllocationContext, dest)
  }

  fun PoolByteArray.Companion.new(from: GDArray): PoolByteArray {
    val dest = arena.alloc<gdnative.godot_pool_byte_array>()
    checkNotNull(Godot.gdnative.godot_pool_byte_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolByteArray(this@AllocationContext, dest)
  }

  fun PoolIntArray.Companion.new(): PoolIntArray {
    val dest = arena.alloc<gdnative.godot_pool_int_array>()
    checkNotNull(Godot.gdnative.godot_pool_int_array_new)(dest.ptr)
    return PoolIntArray(this@AllocationContext, dest)
  }

  fun PoolIntArray.Companion.new(from: GDArray): PoolIntArray {
    val dest = arena.alloc<gdnative.godot_pool_int_array>()
    checkNotNull(Godot.gdnative.godot_pool_int_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolIntArray(this@AllocationContext, dest)
  }

  fun PoolStringArray.Companion.new(): PoolStringArray {
    val dest = arena.alloc<gdnative.godot_pool_string_array>()
    checkNotNull(Godot.gdnative.godot_pool_string_array_new)(dest.ptr)
    return PoolStringArray(this@AllocationContext, dest)
  }

  fun PoolStringArray.Companion.new(from: GDArray): PoolStringArray {
    val dest = arena.alloc<gdnative.godot_pool_string_array>()
    checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolStringArray(this@AllocationContext, dest)
  }

  fun PoolVector2Array.Companion.new(): PoolVector2Array {
    val dest = arena.alloc<gdnative.godot_pool_vector2_array>()
    checkNotNull(Godot.gdnative.godot_pool_vector2_array_new)(dest.ptr)
    return PoolVector2Array(this@AllocationContext, dest)
  }

  fun PoolVector2Array.Companion.new(from: GDArray): PoolVector2Array {
    val dest = arena.alloc<gdnative.godot_pool_vector2_array>()
    checkNotNull(Godot.gdnative.godot_pool_vector2_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolVector2Array(this@AllocationContext, dest)
  }

  fun PoolVector3Array.Companion.new(): PoolVector3Array {
    val dest = arena.alloc<gdnative.godot_pool_vector3_array>()
    checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(dest.ptr)
    return PoolVector3Array(this@AllocationContext, dest)
  }

  fun PoolVector3Array.Companion.new(from: GDArray): PoolVector3Array {
    val dest = arena.alloc<gdnative.godot_pool_vector3_array>()
    checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolVector3Array(this@AllocationContext, dest)
  }

  fun PoolColorArray.Companion.new(): PoolColorArray {
    val dest = arena.alloc<gdnative.godot_pool_color_array>()
    checkNotNull(Godot.gdnative.godot_pool_color_array_new)(dest.ptr)
    return PoolColorArray(this@AllocationContext, dest)
  }

  fun PoolColorArray.Companion.new(from: GDArray): PoolColorArray {
    val dest = arena.alloc<gdnative.godot_pool_color_array>()
    checkNotNull(Godot.gdnative.godot_pool_color_array_new_with_array)(dest.ptr, from.handle.ptr)
    return PoolColorArray(this@AllocationContext, dest)
  }

  fun Rid.Companion.new(): Rid {
    val dest = arena.alloc<gdnative.godot_rid>()
    checkNotNull(Godot.gdnative.godot_rid_new)(dest.ptr)
    return Rid(this@AllocationContext, dest)
  }

  fun GDString.Companion.new(): GDString {
    val dest = arena.alloc<gdnative.godot_string>()
    checkNotNull(Godot.gdnative.godot_string_new)(dest.ptr)
    return GDString(this@AllocationContext, dest)
  }

  fun Vector2.Companion.new(x: Float, y: Float): Vector2 {
    val dest = arena.alloc<gdnative.godot_vector2>()
    checkNotNull(Godot.gdnative.godot_vector2_new)(dest.ptr, x, y)
    return Vector2(this@AllocationContext, dest)
  }

  fun Vector3.Companion.new(
    x: Float,
    y: Float,
    z: Float
  ): Vector3 {
    val dest = arena.alloc<gdnative.godot_vector3>()
    checkNotNull(Godot.gdnative.godot_vector3_new)(dest.ptr, x, y, z)
    return Vector3(this@AllocationContext, dest)
  }

  fun StringName.Companion.new(str: GDString): StringName {
    val dest = arena.alloc<gdnative.godot_string_name>()
    checkNotNull(Godot.gdnative.godot_string_name_new)(dest.ptr, str.handle.ptr)
    return StringName(this@AllocationContext, dest)
  }
}
