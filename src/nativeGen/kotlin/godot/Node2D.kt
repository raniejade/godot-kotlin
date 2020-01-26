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

open class Node2D internal constructor(
  _handle: COpaquePointer
) : CanvasItem(_handle) {
  companion object {
    fun new(): Node2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Node2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Node2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Node2D
     */
    private object __method_bind {
      val apply_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "apply_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_scale" }
            }
          }

      val get_angle_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_angle_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angle_to" }
            }
          }

      val get_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_position" }
            }
          }

      val get_global_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_global_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_rotation" }
            }
          }

      val get_global_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_global_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_rotation_degrees" }
            }
          }

      val get_global_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_global_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_scale" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_relative_transform_to_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_relative_transform_to_parent".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_relative_transform_to_parent" }
            }
          }

      val get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation" }
            }
          }

      val get_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
            }
          }

      val get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scale" }
            }
          }

      val get_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "get_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_z_index" }
            }
          }

      val global_translate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "global_translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method global_translate" }
            }
          }

      val is_z_relative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "is_z_relative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_z_relative" }
            }
          }

      val look_at: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "look_at".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method look_at" }
            }
          }

      val move_local_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "move_local_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_local_x" }
            }
          }

      val move_local_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "move_local_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_local_y" }
            }
          }

      val rotate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "rotate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate" }
            }
          }

      val set_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_position" }
            }
          }

      val set_global_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_global_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_rotation" }
            }
          }

      val set_global_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_global_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_rotation_degrees" }
            }
          }

      val set_global_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_global_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_scale" }
            }
          }

      val set_global_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_global_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }

      val set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation" }
            }
          }

      val set_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
            }
          }

      val set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scale" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }

      val set_z_as_relative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_z_as_relative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_as_relative" }
            }
          }

      val set_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "set_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_index" }
            }
          }

      val to_global: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "to_global".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method to_global" }
            }
          }

      val to_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "to_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method to_local" }
            }
          }

      val translate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
              "translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method translate" }
            }
          }
    }
  }
}
