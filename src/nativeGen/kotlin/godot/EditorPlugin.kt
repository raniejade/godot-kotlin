// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
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
  fun addAutoloadSingleton(name: String, path: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(path)
    __method_bind.add_autoload_singleton.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addControlToBottomPanel(control: Control, title: String): ToolButton {
    val _args = VariantArray.new()
    _args.append(control)
    _args.append(title)
    val _ret = __method_bind.add_control_to_bottom_panel.call(this.toVariant(), _args.toVariant(),
        2)
    return _ret.asObject(::ToolButton)!!
  }

  fun addControlToContainer(container: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(container)
    _args.append(control)
    __method_bind.add_control_to_container.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addControlToDock(slot: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(slot)
    _args.append(control)
    __method_bind.add_control_to_dock.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(base)
    _args.append(script)
    _args.append(icon)
    __method_bind.add_custom_type.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun addExportPlugin(plugin: EditorExportPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.add_export_plugin.call(this.toVariant(), _arg, 1)
  }

  fun addImportPlugin(importer: EditorImportPlugin) {
    val _arg = Variant.new(importer)
    __method_bind.add_import_plugin.call(this.toVariant(), _arg, 1)
  }

  fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.add_inspector_plugin.call(this.toVariant(), _arg, 1)
  }

  fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val _arg = Variant.new(sceneImporter)
    __method_bind.add_scene_import_plugin.call(this.toVariant(), _arg, 1)
  }

  fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.add_spatial_gizmo_plugin.call(this.toVariant(), _arg, 1)
  }

  fun addToolMenuItem(
    name: String,
    handler: Object,
    callback: String,
    ud: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(handler)
    _args.append(callback)
    _args.append(ud)
    __method_bind.add_tool_menu_item.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun addToolSubmenuItem(name: String, submenu: Object) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(submenu)
    __method_bind.add_tool_submenu_item.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun getEditorInterface(): EditorInterface {
    val _ret = __method_bind.get_editor_interface.call(this.toVariant())
    return _ret.asObject(::EditorInterface)!!
  }

  fun getScriptCreateDialog(): ScriptCreateDialog {
    val _ret = __method_bind.get_script_create_dialog.call(this.toVariant())
    return _ret.asObject(::ScriptCreateDialog)!!
  }

  fun getUndoRedo(): UndoRedo {
    val _ret = __method_bind.get_undo_redo.call(this.toVariant())
    return _ret.asObject(::UndoRedo)!!
  }

  fun hideBottomPanel() {
    __method_bind.hide_bottom_panel.call(this.toVariant())
  }

  fun makeBottomPanelItemVisible(item: Control) {
    val _arg = Variant.new(item)
    __method_bind.make_bottom_panel_item_visible.call(this.toVariant(), _arg, 1)
  }

  fun queueSaveLayout() {
    __method_bind.queue_save_layout.call(this.toVariant())
  }

  fun removeAutoloadSingleton(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_autoload_singleton.call(this.toVariant(), _arg, 1)
  }

  fun removeControlFromBottomPanel(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.remove_control_from_bottom_panel.call(this.toVariant(), _arg, 1)
  }

  fun removeControlFromContainer(container: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(container)
    _args.append(control)
    __method_bind.remove_control_from_container.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun removeControlFromDocks(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.remove_control_from_docks.call(this.toVariant(), _arg, 1)
  }

  fun removeCustomType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.remove_custom_type.call(this.toVariant(), _arg, 1)
  }

  fun removeExportPlugin(plugin: EditorExportPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.remove_export_plugin.call(this.toVariant(), _arg, 1)
  }

  fun removeImportPlugin(importer: EditorImportPlugin) {
    val _arg = Variant.new(importer)
    __method_bind.remove_import_plugin.call(this.toVariant(), _arg, 1)
  }

  fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.remove_inspector_plugin.call(this.toVariant(), _arg, 1)
  }

  fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val _arg = Variant.new(sceneImporter)
    __method_bind.remove_scene_import_plugin.call(this.toVariant(), _arg, 1)
  }

  fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.remove_spatial_gizmo_plugin.call(this.toVariant(), _arg, 1)
  }

  fun removeToolMenuItem(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_tool_menu_item.call(this.toVariant(), _arg, 1)
  }

  fun setForceDrawOverForwardingEnabled() {
    __method_bind.set_force_draw_over_forwarding_enabled.call(this.toVariant())
  }

  fun setInputEventForwardingAlwaysEnabled() {
    __method_bind.set_input_event_forwarding_always_enabled.call(this.toVariant())
  }

  fun updateOverlays(): Int {
    val _ret = __method_bind.update_overlays.call(this.toVariant())
    return _ret.asInt()
  }

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

    companion object {
      fun from(value: Int): DockSlot {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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

    companion object {
      fun from(value: Int): CustomControlContainer {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
      requireNotNull(fnPtr) { "No instance found for EditorPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorPlugin = EditorPlugin(ptr)
    /**
     * Container for method_bind pointers for EditorPlugin
     */
    private object __method_bind {
      val add_autoload_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_autoload_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_autoload_singleton" }
        }
      val add_control_to_bottom_panel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_bottom_panel" }
        }
      val add_control_to_container: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_container".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_container" }
        }
      val add_control_to_dock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_dock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_dock" }
        }
      val add_custom_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_custom_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_type" }
        }
      val add_export_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_export_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_export_plugin" }
        }
      val add_import_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_import_plugin" }
        }
      val add_inspector_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_inspector_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_inspector_plugin" }
        }
      val add_scene_import_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_scene_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_scene_import_plugin" }
        }
      val add_spatial_gizmo_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_spatial_gizmo_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_spatial_gizmo_plugin" }
        }
      val add_tool_menu_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_tool_menu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tool_menu_item" }
        }
      val add_tool_submenu_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_tool_submenu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tool_submenu_item" }
        }
      val get_editor_interface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_editor_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_interface" }
        }
      val get_script_create_dialog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_script_create_dialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_create_dialog" }
        }
      val get_undo_redo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_undo_redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_undo_redo" }
        }
      val hide_bottom_panel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "hide_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide_bottom_panel" }
        }
      val make_bottom_panel_item_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "make_bottom_panel_item_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_bottom_panel_item_visible" }
        }
      val queue_save_layout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "queue_save_layout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_save_layout" }
        }
      val remove_autoload_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_autoload_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_autoload_singleton" }
        }
      val remove_control_from_bottom_panel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_bottom_panel" }
        }
      val remove_control_from_container: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_container".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_container" }
        }
      val remove_control_from_docks: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_docks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_docks" }
        }
      val remove_custom_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_custom_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_type" }
        }
      val remove_export_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_export_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_export_plugin" }
        }
      val remove_import_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_import_plugin" }
        }
      val remove_inspector_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_inspector_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_inspector_plugin" }
        }
      val remove_scene_import_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_scene_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_scene_import_plugin" }
        }
      val remove_spatial_gizmo_plugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_spatial_gizmo_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_spatial_gizmo_plugin" }
        }
      val remove_tool_menu_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_tool_menu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tool_menu_item" }
        }
      val set_force_draw_over_forwarding_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "set_force_draw_over_forwarding_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_force_draw_over_forwarding_enabled" }
        }
      val set_input_event_forwarding_always_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "set_input_event_forwarding_always_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_input_event_forwarding_always_enabled" }
        }
      val update_overlays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "update_overlays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_overlays" }
        }}
  }
}
