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

open class SceneState internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class GenEditState(
    val value: Int
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);
  }

  companion object {
    val GEN_EDIT_STATE_DISABLED: Int = 0

    val GEN_EDIT_STATE_INSTANCE: Int = 1

    val GEN_EDIT_STATE_MAIN: Int = 2

    /**
     * Container for method_bind pointers for SceneState
     */
    private object __method_bind {
      val get_connection_binds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_binds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_binds" }
            }
          }

      val get_connection_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_count" }
            }
          }

      val get_connection_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_flags" }
            }
          }

      val get_connection_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_method" }
            }
          }

      val get_connection_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_signal" }
            }
          }

      val get_connection_source: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_source" }
            }
          }

      val get_connection_target: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_target" }
            }
          }

      val get_node_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val get_node_groups: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_groups".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_groups" }
            }
          }

      val get_node_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_index" }
            }
          }

      val get_node_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance" }
            }
          }

      val get_node_instance_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance_placeholder"
              }
            }
          }

      val get_node_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val get_node_owner_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_owner_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_owner_path" }
            }
          }

      val get_node_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_path" }
            }
          }

      val get_node_property_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_count" }
            }
          }

      val get_node_property_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_name" }
            }
          }

      val get_node_property_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_value" }
            }
          }

      val get_node_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_type" }
            }
          }

      val is_node_instance_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "is_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_instance_placeholder" }
            }
          }
    }
  }
}
