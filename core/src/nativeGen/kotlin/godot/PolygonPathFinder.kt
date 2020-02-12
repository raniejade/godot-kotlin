// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class PolygonPathFinder(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun findPath(from: Vector2, to: Vector2): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.findPath.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBounds(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getBounds.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPoint(point: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getClosestPoint.call(self._handle, listOf(point), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIntersections(from: Vector2, to: Vector2): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.getIntersections.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointPenalty(idx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointPenalty.call(self._handle, listOf(idx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isPointInside(point: Vector2): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPointInside.call(self._handle, listOf(point), _retPtr)
      _ret.value
    }
  }

  fun setPointPenalty(idx: Int, penalty: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(penalty)
      __method_bind.setPointPenalty.call(self._handle, _args, null)
    }
  }

  fun setup(points: PoolVector2Array, connections: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(connections)
      __method_bind.setup.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PolygonPathFinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PolygonPathFinder" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PolygonPathFinder
     */
    private object __method_bind {
      val findPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "find_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_path" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounds" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getIntersections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_intersections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_intersections" }
        }
      val getPointPenalty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_point_penalty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_penalty" }
        }
      val isPointInside: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "is_point_inside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_inside" }
        }
      val setPointPenalty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "set_point_penalty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_penalty" }
        }
      val setup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "setup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setup" }
        }}
  }
}
