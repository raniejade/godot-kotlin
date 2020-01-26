// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Plane
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PlaneShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getPlane(): Plane {
    TODO()
  }

  fun setPlane(plane: Plane) {
    TODO()
  }

  companion object {
    fun new(): PlaneShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PlaneShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PlaneShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PlaneShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PlaneShape = PlaneShape(ptr)
    /**
     * Container for method_bind pointers for PlaneShape
     */
    private object __method_bind {
      val get_plane: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
              "get_plane".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plane" }
            }
          }

      val set_plane: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
              "set_plane".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_plane" }
            }
          }
    }
  }
}
