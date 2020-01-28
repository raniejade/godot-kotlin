// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConvexPolygonShape2D(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  var points: PoolVector2Array
    get() {
       return getPoints() 
    }
    set(value) {
      setPoints(value)
    }

  fun getPoints(): PoolVector2Array {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun setPointCloud(pointCloud: PoolVector2Array) {
    val _arg = Variant.new(pointCloud)
    __method_bind.setPointCloud.call(this._handle, _arg, 1)
  }

  fun setPoints(points: PoolVector2Array) {
    val _arg = Variant.new(points)
    __method_bind.setPoints.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ConvexPolygonShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConvexPolygonShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConvexPolygonShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConvexPolygonShape2D = ConvexPolygonShape2D(ptr)
    /**
     * Container for method_bind pointers for ConvexPolygonShape2D
     */
    private object __method_bind {
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
            "getPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPoints" }
        }
      val setPointCloud: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
            "setPointCloud".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointCloud" }
        }
      val setPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
            "setPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPoints" }
        }}
  }
}
