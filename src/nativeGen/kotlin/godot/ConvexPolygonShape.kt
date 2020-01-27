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

open class ConvexPolygonShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getPoints(): PoolVector3Array {
    val _ret = __method_bind.get_points.call(this.toVariant())
    return _ret.asPoolVector3Array()
  }

  fun setPoints(points: PoolVector3Array) {
    val _args = VariantArray.new()
    _args.append(points)
    __method_bind.set_points.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): ConvexPolygonShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ConvexPolygonShape" }
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
      val get_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val set_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape".cstr.ptr,
              "set_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_points" }
            }
          }
    }
  }
}
