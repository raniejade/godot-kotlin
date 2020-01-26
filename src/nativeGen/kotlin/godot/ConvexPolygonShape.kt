// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
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
    TODO()
  }

  fun setPoints(points: PoolVector3Array) {
    TODO()
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
