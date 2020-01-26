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

open class ConcavePolygonShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getFaces(): PoolVector3Array {
    TODO()
  }

  fun setFaces(faces: PoolVector3Array) {
    TODO()
  }

  companion object {
    fun new(): ConcavePolygonShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConcavePolygonShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ConcavePolygonShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConcavePolygonShape(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ConcavePolygonShape
     */
    private object __method_bind {
      val get_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape".cstr.ptr,
              "get_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_faces" }
            }
          }

      val set_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape".cstr.ptr,
              "set_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_faces" }
            }
          }
    }
  }
}
