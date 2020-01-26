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

open class EditorPlugin internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  enum class DockSlot(
    val value: Int
  ) {
    DOCK_SLOT_LEFT_UL(0),

    DOCK_SLOT_LEFT_BL(1),

    DOCK_SLOT_LEFT_UR(2),

    DOCK_SLOT_LEFT_BR(3),

    DOCK_SLOT_RIGHT_UL(4),

    DOCK_SLOT_RIGHT_BL(5),

    DOCK_SLOT_RIGHT_UR(6),

    DOCK_SLOT_RIGHT_BR(7),

    DOCK_SLOT_MAX(8);
  }

  enum class CustomControlContainer(
    val value: Int
  ) {
    CONTAINER_TOOLBAR(0),

    CONTAINER_SPATIAL_EDITOR_MENU(1),

    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),

    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),

    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),

    CONTAINER_CANVAS_EDITOR_MENU(5),

    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),

    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),

    CONTAINER_CANVAS_EDITOR_BOTTOM(8),

    CONTAINER_PROPERTY_EDITOR_BOTTOM(9),

    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),

    CONTAINER_PROJECT_SETTING_TAB_RIGHT(11);
  }

  companion object {
    val CONTAINER_CANVAS_EDITOR_BOTTOM: Int = 8

    val CONTAINER_CANVAS_EDITOR_MENU: Int = 5

    val CONTAINER_CANVAS_EDITOR_SIDE_LEFT: Int = 6

    val CONTAINER_CANVAS_EDITOR_SIDE_RIGHT: Int = 7

    val CONTAINER_PROJECT_SETTING_TAB_LEFT: Int = 10

    val CONTAINER_PROJECT_SETTING_TAB_RIGHT: Int = 11

    val CONTAINER_PROPERTY_EDITOR_BOTTOM: Int = 9

    val CONTAINER_SPATIAL_EDITOR_BOTTOM: Int = 4

    val CONTAINER_SPATIAL_EDITOR_MENU: Int = 1

    val CONTAINER_SPATIAL_EDITOR_SIDE_LEFT: Int = 2

    val CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT: Int = 3

    val CONTAINER_TOOLBAR: Int = 0

    val DOCK_SLOT_LEFT_BL: Int = 1

    val DOCK_SLOT_LEFT_BR: Int = 3

    val DOCK_SLOT_LEFT_UL: Int = 0

    val DOCK_SLOT_LEFT_UR: Int = 2

    val DOCK_SLOT_MAX: Int = 8

    val DOCK_SLOT_RIGHT_BL: Int = 5

    val DOCK_SLOT_RIGHT_BR: Int = 7

    val DOCK_SLOT_RIGHT_UL: Int = 4

    val DOCK_SLOT_RIGHT_UR: Int = 6

    fun new(): EditorPlugin = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorPlugin
     */
    private object __method_bind {
      val add_autoload_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_autoload_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_autoload_singleton" }
            }
          }

      val add_control_to_bottom_panel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_control_to_bottom_panel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_control_to_bottom_panel" }
            }
          }

      val add_control_to_container: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_control_to_container".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_control_to_container" }
            }
          }

      val add_control_to_dock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_control_to_dock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_control_to_dock" }
            }
          }

      val add_custom_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_custom_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_type" }
            }
          }

      val add_export_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_export_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_export_plugin" }
            }
          }

      val add_import_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_import_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_import_plugin" }
            }
          }

      val add_inspector_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_inspector_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_inspector_plugin" }
            }
          }

      val add_scene_import_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_scene_import_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_scene_import_plugin" }
            }
          }

      val add_spatial_gizmo_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_spatial_gizmo_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_spatial_gizmo_plugin" }
            }
          }

      val add_tool_menu_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_tool_menu_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_tool_menu_item" }
            }
          }

      val add_tool_submenu_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "add_tool_submenu_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_tool_submenu_item" }
            }
          }

      val apply_changes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "apply_changes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_changes" }
            }
          }

      val build: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "build".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val disable_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "disable_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disable_plugin" }
            }
          }

      val edit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "edit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method edit" }
            }
          }

      val enable_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "enable_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method enable_plugin" }
            }
          }

      val forward_canvas_draw_over_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "forward_canvas_draw_over_viewport".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method forward_canvas_draw_over_viewport" }
            }
          }

      val forward_canvas_force_draw_over_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "forward_canvas_force_draw_over_viewport".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method forward_canvas_force_draw_over_viewport" }
            }
          }

      val forward_canvas_gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "forward_canvas_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method forward_canvas_gui_input" }
            }
          }

      val forward_spatial_gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "forward_spatial_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method forward_spatial_gui_input" }
            }
          }

      val get_breakpoints: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_breakpoints".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_breakpoints" }
            }
          }

      val get_editor_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_editor_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_editor_interface" }
            }
          }

      val get_plugin_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_plugin_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plugin_icon" }
            }
          }

      val get_plugin_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_plugin_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plugin_name" }
            }
          }

      val get_script_create_dialog: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_script_create_dialog".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_create_dialog" }
            }
          }

      val get_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_state" }
            }
          }

      val get_undo_redo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_undo_redo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_undo_redo" }
            }
          }

      val get_window_layout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "get_window_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_window_layout" }
            }
          }

      val handles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "handles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method handles" }
            }
          }

      val has_main_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "has_main_screen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_main_screen" }
            }
          }

      val hide_bottom_panel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "hide_bottom_panel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method hide_bottom_panel" }
            }
          }

      val make_bottom_panel_item_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "make_bottom_panel_item_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_bottom_panel_item_visible"
              }
            }
          }

      val make_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "make_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_visible" }
            }
          }

      val queue_save_layout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "queue_save_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_save_layout" }
            }
          }

      val remove_autoload_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_autoload_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_autoload_singleton" }
            }
          }

      val remove_control_from_bottom_panel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_control_from_bottom_panel".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_control_from_bottom_panel" }
            }
          }

      val remove_control_from_container: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_control_from_container".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_control_from_container"
              }
            }
          }

      val remove_control_from_docks: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_control_from_docks".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_control_from_docks" }
            }
          }

      val remove_custom_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_custom_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_custom_type" }
            }
          }

      val remove_export_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_export_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_export_plugin" }
            }
          }

      val remove_import_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_import_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_import_plugin" }
            }
          }

      val remove_inspector_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_inspector_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_inspector_plugin" }
            }
          }

      val remove_scene_import_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_scene_import_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_scene_import_plugin" }
            }
          }

      val remove_spatial_gizmo_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_spatial_gizmo_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_spatial_gizmo_plugin" }
            }
          }

      val remove_tool_menu_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "remove_tool_menu_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_tool_menu_item" }
            }
          }

      val save_external_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "save_external_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_external_data" }
            }
          }

      val set_force_draw_over_forwarding_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "set_force_draw_over_forwarding_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_force_draw_over_forwarding_enabled" }
            }
          }

      val set_input_event_forwarding_always_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "set_input_event_forwarding_always_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_input_event_forwarding_always_enabled" }
            }
          }

      val set_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "set_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_state" }
            }
          }

      val set_window_layout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "set_window_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_window_layout" }
            }
          }

      val update_overlays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
              "update_overlays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_overlays" }
            }
          }
    }
  }
}
