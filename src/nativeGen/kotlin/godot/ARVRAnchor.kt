// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRAnchor internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): ARVRAnchor = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRAnchor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ARVRAnchor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRAnchor(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ARVRAnchor
     */
    private object __method_bind {
      val get_anchor_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_anchor_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor_id" }
            }
          }

      val get_anchor_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_anchor_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor_name" }
            }
          }

      val get_is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_is_active" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_plane: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_plane".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plane" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val set_anchor_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "set_anchor_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchor_id" }
            }
          }
    }
  }
}
