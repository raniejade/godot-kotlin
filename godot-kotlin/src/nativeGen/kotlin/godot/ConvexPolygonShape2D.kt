// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class ConvexPolygonShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var points: PoolVector2Array
    get() {
       return getPoints() 
    }
    set(value) {
      setPoints(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for points
   */
  fun points(cb: PoolVector2Array.() -> Unit) {
    val _p = points
    cb(_p)
    points = _p
  }

  fun getPoints(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getPoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setPointCloud(pointCloud: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPointCloud.call(self._handle, listOf(pointCloud), null)
    }
  }

  fun setPoints(points: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPoints.call(self._handle, listOf(points), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConvexPolygonShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConvexPolygonShape2D
     */
    private object __method_bind {
      val getPoints: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val setPointCloud: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "set_point_cloud".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_cloud" }
            }
          }

      val setPoints: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "set_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_points" }
            }
          }
    }
  }
}
