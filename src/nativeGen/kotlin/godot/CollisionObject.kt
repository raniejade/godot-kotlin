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

open class CollisionObject internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for CollisionObject
     */
    private object __method_bind {
      val _input_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "_input_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _input_event" }
            }
          }

      val create_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "create_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
            }
          }

      val get_capture_input_on_drag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "get_capture_input_on_drag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_capture_input_on_drag" }
            }
          }

      val get_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "get_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rid" }
            }
          }

      val get_shape_owners: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "get_shape_owners".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
            }
          }

      val is_ray_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "is_ray_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
            }
          }

      val is_shape_owner_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "is_shape_owner_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
            }
          }

      val remove_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "remove_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
            }
          }

      val set_capture_input_on_drag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "set_capture_input_on_drag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_capture_input_on_drag" }
            }
          }

      val set_ray_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "set_ray_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
            }
          }

      val shape_find_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_find_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
            }
          }

      val shape_owner_add_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_add_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
            }
          }

      val shape_owner_clear_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_clear_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
            }
          }

      val shape_owner_get_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_get_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
            }
          }

      val shape_owner_get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
            }
          }

      val shape_owner_get_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_get_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
            }
          }

      val shape_owner_get_shape_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_get_shape_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
            }
          }

      val shape_owner_get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
            }
          }

      val shape_owner_remove_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_remove_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
            }
          }

      val shape_owner_set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
            }
          }

      val shape_owner_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
              "shape_owner_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
            }
          }
    }
  }
}
