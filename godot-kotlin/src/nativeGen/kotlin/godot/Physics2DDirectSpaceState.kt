// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Physics2DDirectSpaceState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.castMotion.call(self._handle, listOf(shape), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Int = 32): VariantArray {
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

  fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getRestInfo.call(self._handle, listOf(shape), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectPoint(
    point: Vector2,
    maxResults: Int = 32,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(maxResults)
      _args.add(exclude)
      _args.add(collisionLayer)
      _args.add(collideWithBodies)
      _args.add(collideWithAreas)
      __method_bind.intersectPoint.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Int,
    maxResults: Int = 32,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(canvasInstanceId)
      _args.add(maxResults)
      _args.add(exclude)
      _args.add(collisionLayer)
      _args.add(collideWithBodies)
      _args.add(collideWithAreas)
      __method_bind.intersectPointOnCanvas.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray,
    collisionLayer: Int = 2147483647,
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
      _args.add(collisionLayer)
      _args.add(collideWithBodies)
      _args.add(collideWithAreas)
      __method_bind.intersectRay.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Int = 32): VariantArray {
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
     * Container for method_bind pointers for Physics2DDirectSpaceState
     */
    private object __method_bind {
      val castMotion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "cast_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cast_motion" }
            }
          }

      val collideShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "collide_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_shape" }
            }
          }

      val getRestInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "get_rest_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
            }
          }

      val intersectPoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point" }
            }
          }

      val intersectPointOnCanvas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point_on_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point_on_canvas" }
            }
          }

      val intersectRay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_ray".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
            }
          }

      val intersectShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
            }
          }
    }
  }
}
