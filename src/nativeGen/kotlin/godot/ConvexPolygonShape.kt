// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConvexPolygonShape(
  _handle: COpaquePointer
) : Shape(_handle) {
  var points: PoolVector3Array
    get() {
       return getPoints() 
    }
    set(value) {
      setPoints(value)
    }

  fun getPoints(): PoolVector3Array {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun setPoints(points: PoolVector3Array) {
    val _arg = Variant.new(points)
    __method_bind.setPoints.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ConvexPolygonShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConvexPolygonShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConvexPolygonShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConvexPolygonShape = ConvexPolygonShape(ptr)
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
