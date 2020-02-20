// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class PhysicsDirectSpaceState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(shape)
      _args.add(motion)
      __method_bind.castMotion.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(shape)
      _args.add(maxResults)
      __method_bind.collideShape.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getRestInfo.call(self._handle, listOf(shape), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectRay(
    from: Vector3,
    to: Vector3,
    exclude: VariantArray,
    collisionMask: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(exclude)
      _args.add(collisionMask)
      _args.add(collideWithBodies)
      _args.add(collideWithAreas)
      __method_bind.intersectRay.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(shape)
      _args.add(maxResults)
      __method_bind.intersectShape.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsDirectSpaceState
     */
    private object __method_bind {
      val castMotion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "cast_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cast_motion" }
        }
      val collideShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "collide_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide_shape" }
        }
      val getRestInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "get_rest_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
        }
      val intersectRay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "intersect_ray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
        }
      val intersectShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "intersect_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
        }}
  }
}
