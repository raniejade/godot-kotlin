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

open class GraphEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    fun new(): GraphEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GraphEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GraphEdit(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for GraphEdit
     */
    private object __method_bind {
      val _connections_layer_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_connections_layer_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _connections_layer_draw" }
            }
          }

      val _graph_node_moved: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_graph_node_moved".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _graph_node_moved" }
            }
          }

      val _graph_node_raised: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_graph_node_raised".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _graph_node_raised" }
            }
          }

      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val _scroll_moved: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_scroll_moved".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _scroll_moved" }
            }
          }

      val _snap_toggled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_snap_toggled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _snap_toggled" }
            }
          }

      val _snap_value_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_snap_value_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _snap_value_changed" }
            }
          }

      val _top_layer_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_top_layer_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _top_layer_draw" }
            }
          }

      val _top_layer_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_top_layer_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _top_layer_input" }
            }
          }

      val _update_scroll_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_update_scroll_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_scroll_offset" }
            }
          }

      val _zoom_minus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_zoom_minus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _zoom_minus" }
            }
          }

      val _zoom_plus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_zoom_plus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _zoom_plus" }
            }
          }

      val _zoom_reset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "_zoom_reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _zoom_reset" }
            }
          }

      val add_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_valid_connection_type" }
            }
          }

      val add_valid_left_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_left_disconnect_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_valid_left_disconnect_type"
              }
            }
          }

      val add_valid_right_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_right_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method add_valid_right_disconnect_type" }
            }
          }

      val clear_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "clear_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_connections" }
            }
          }

      val connect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "connect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_node" }
            }
          }

      val disconnect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "disconnect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
            }
          }

      val get_connection_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_connection_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_list" }
            }
          }

      val get_scroll_ofs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_scroll_ofs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll_ofs" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zoom" }
            }
          }

      val get_zoom_hbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_zoom_hbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zoom_hbox" }
            }
          }

      val is_node_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_node_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_connected" }
            }
          }

      val is_right_disconnects_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_right_disconnects_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_right_disconnects_enabled" }
            }
          }

      val is_using_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_using_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_snap" }
            }
          }

      val is_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid_connection_type" }
            }
          }

      val remove_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_valid_connection_type" }
            }
          }

      val remove_valid_left_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_left_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_valid_left_disconnect_type" }
            }
          }

      val remove_valid_right_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_right_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_valid_right_disconnect_type" }
            }
          }

      val set_connection_activity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_connection_activity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_connection_activity" }
            }
          }

      val set_right_disconnects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_right_disconnects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_right_disconnects" }
            }
          }

      val set_scroll_ofs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_scroll_ofs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_ofs" }
            }
          }

      val set_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selected" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_use_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_use_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_snap" }
            }
          }

      val set_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_zoom" }
            }
          }
    }
  }
}
