// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Skeleton internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    val NOTIFICATION_UPDATE_SKELETON: Int = 50

    fun new(): Skeleton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Skeleton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Skeleton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Skeleton
     */
    private object __method_bind {
      val add_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "add_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bone" }
            }
          }

      val bind_child_node_to_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "bind_child_node_to_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bind_child_node_to_bone" }
            }
          }

      val clear_bones: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "clear_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_bones" }
            }
          }

      val find_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "find_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_bone" }
            }
          }

      val get_bone_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
            }
          }

      val get_bone_custom_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_custom_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_custom_pose" }
            }
          }

      val get_bone_global_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_global_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_global_pose" }
            }
          }

      val get_bone_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
            }
          }

      val get_bone_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_parent" }
            }
          }

      val get_bone_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_pose" }
            }
          }

      val get_bone_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_rest" }
            }
          }

      val get_bone_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_transform" }
            }
          }

      val get_bound_child_nodes_to_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bound_child_nodes_to_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bound_child_nodes_to_bone"
              }
            }
          }

      val is_bone_rest_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "is_bone_rest_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bone_rest_disabled" }
            }
          }

      val is_using_bones_in_world_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "is_using_bones_in_world_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_using_bones_in_world_transform" }
            }
          }

      val localize_rests: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "localize_rests".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method localize_rests" }
            }
          }

      val physical_bones_add_collision_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_add_collision_exception".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_add_collision_exception" }
            }
          }

      val physical_bones_remove_collision_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_remove_collision_exception".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_remove_collision_exception" }
            }
          }

      val physical_bones_start_simulation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_start_simulation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_start_simulation" }
            }
          }

      val physical_bones_stop_simulation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_stop_simulation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method physical_bones_stop_simulation"
              }
            }
          }

      val set_bone_custom_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_custom_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_custom_pose" }
            }
          }

      val set_bone_disable_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_disable_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_disable_rest" }
            }
          }

      val set_bone_global_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_global_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_global_pose" }
            }
          }

      val set_bone_ignore_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_ignore_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_ignore_animation" }
            }
          }

      val set_bone_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_parent" }
            }
          }

      val set_bone_pose: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_pose" }
            }
          }

      val set_bone_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_rest" }
            }
          }

      val set_use_bones_in_world_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_use_bones_in_world_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_use_bones_in_world_transform" }
            }
          }

      val unbind_child_node_from_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "unbind_child_node_from_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unbind_child_node_from_bone" }
            }
          }

      val unparent_bone_and_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "unparent_bone_and_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unparent_bone_and_rest" }
            }
          }
    }
  }
}
