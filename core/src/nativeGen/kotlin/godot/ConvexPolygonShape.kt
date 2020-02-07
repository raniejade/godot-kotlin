// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConvexPolygonShape(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape(null) {
  var points: PoolVector3Array
    get() {
       return getPoints() 
    }
    set(value) {
      setPoints(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for points
   */
  fun points(cb: PoolVector3Array.() -> Unit) {
    val _p = points
    cb(_p)
    points = _p
  }

  fun getPoints(): PoolVector3Array {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun setPoints(points: PoolVector3Array) {
    val _arg = Variant(points)
    __method_bind.setPoints.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConvexPolygonShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConvexPolygonShape
     */
    private object __method_bind {
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape".cstr.ptr,
            "get_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_points" }
        }
      val setPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape".cstr.ptr,
            "set_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_points" }
        }}
  }
}
