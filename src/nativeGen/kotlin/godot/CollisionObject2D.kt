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

open class CollisionObject2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for CollisionObject2D
     */
    private object __method_bind {
      val _input_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "_input_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _input_event" }
            }
          }

      val create_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "create_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
            }
          }

      val get_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rid" }
            }
          }

      val get_shape_owner_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_shape_owner_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_shape_owner_one_way_collision_margin" }
            }
          }

      val get_shape_owners: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_shape_owners".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
            }
          }

      val is_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pickable" }
            }
          }

      val is_shape_owner_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_shape_owner_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
            }
          }

      val is_shape_owner_one_way_collision_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_shape_owner_one_way_collision_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_shape_owner_one_way_collision_enabled" }
            }
          }

      val remove_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "remove_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
            }
          }

      val set_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "set_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pickable" }
            }
          }

      val shape_find_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_find_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
            }
          }

      val shape_owner_add_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_add_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
            }
          }

      val shape_owner_clear_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_clear_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
            }
          }

      val shape_owner_get_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
            }
          }

      val shape_owner_get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
            }
          }

      val shape_owner_get_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
            }
          }

      val shape_owner_get_shape_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
            }
          }

      val shape_owner_get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
            }
          }

      val shape_owner_remove_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_remove_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
            }
          }

      val shape_owner_set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
            }
          }

      val shape_owner_set_one_way_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_one_way_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shape_owner_set_one_way_collision" }
            }
          }

      val shape_owner_set_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shape_owner_set_one_way_collision_margin" }
            }
          }

      val shape_owner_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
            }
          }
    }
  }
}
