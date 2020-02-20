// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class EditorPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  /**
   * EditorPlugin::main_screen_changed signal
   */
  val signalMainScreenChanged: Signal1<String> = Signal1("main_screen_changed")

  /**
   * EditorPlugin::resource_saved signal
   */
  val signalResourceSaved: Signal1<Resource> = Signal1("resource_saved")

  /**
   * EditorPlugin::scene_changed signal
   */
  val signalSceneChanged: Signal1<Node> = Signal1("scene_changed")

  /**
   * EditorPlugin::scene_closed signal
   */
  val signalSceneClosed: Signal1<String> = Signal1("scene_closed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addAutoloadSingleton(name: String, path: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(path)
      __method_bind.addAutoloadSingleton.call(self._handle, _args, null)
    }
  }

  fun addControlToBottomPanel(control: Control, title: String): ToolButton {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ToolButton
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(control)
      _args.add(title)
      __method_bind.addControlToBottomPanel.call(self._handle, _args, _retPtr)
      _ret = objectToType<ToolButton>(_tmp.value!!)
      _ret
    }
  }

  fun addControlToContainer(container: Int, control: Control) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(container)
      _args.add(control)
      __method_bind.addControlToContainer.call(self._handle, _args, null)
    }
  }

  fun addControlToDock(slot: Int, control: Control) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(slot)
      _args.add(control)
      __method_bind.addControlToDock.call(self._handle, _args, null)
    }
  }

  fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(base)
      _args.add(script)
      _args.add(icon)
      __method_bind.addCustomType.call(self._handle, _args, null)
    }
  }

  fun addExportPlugin(plugin: EditorExportPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addExportPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun addImportPlugin(importer: EditorImportPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addImportPlugin.call(self._handle, listOf(importer), null)
    }
  }

  fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addInspectorPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSceneImportPlugin.call(self._handle, listOf(sceneImporter), null)
    }
  }

  fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSpatialGizmoPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun addToolMenuItem(
    name: String,
    handler: Object,
    callback: String,
    ud: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(handler)
      _args.add(callback)
      _args.add(ud)
      __method_bind.addToolMenuItem.call(self._handle, _args, null)
    }
  }

  fun addToolSubmenuItem(name: String, submenu: Object) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(submenu)
      __method_bind.addToolSubmenuItem.call(self._handle, _args, null)
    }
  }

  open fun apply_changes() {
    TODO()
  }

  open fun build(): Boolean {
    TODO()
  }

  open fun clear() {
    TODO()
  }

  open fun disable_plugin() {
    TODO()
  }

  open fun edit(`object`: Object) {
    TODO()
  }

  open fun enable_plugin() {
    TODO()
  }

  open fun forward_canvas_draw_over_viewport(overlay: Control) {
    TODO()
  }

  open fun forward_canvas_force_draw_over_viewport(overlay: Control) {
    TODO()
  }

  open fun forward_canvas_gui_input(event: InputEvent): Boolean {
    TODO()
  }

  open fun forward_spatial_gui_input(camera: Camera, event: InputEvent): Boolean {
    TODO()
  }

  open fun get_breakpoints(): PoolStringArray {
    TODO()
  }

  fun getEditorInterface(): EditorInterface {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorInterface
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditorInterface.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorInterface>(_tmp.value!!)
      _ret
    }
  }

  open fun get_plugin_icon(): Object {
    TODO()
  }

  open fun get_plugin_name(): String {
    TODO()
  }

  fun getScriptCreateDialog(): ScriptCreateDialog {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ScriptCreateDialog
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getScriptCreateDialog.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ScriptCreateDialog>(_tmp.value!!)
      _ret
    }
  }

  open fun get_state(): Dictionary {
    TODO()
  }

  fun getUndoRedo(): UndoRedo {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: UndoRedo
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getUndoRedo.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<UndoRedo>(_tmp.value!!)
      _ret
    }
  }

  open fun get_window_layout(layout: ConfigFile) {
    TODO()
  }

  open fun handles(`object`: Object): Boolean {
    TODO()
  }

  open fun has_main_screen(): Boolean {
    TODO()
  }

  fun hideBottomPanel() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.hideBottomPanel.call(self._handle, emptyList(), null)
    }
  }

  fun makeBottomPanelItemVisible(item: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.makeBottomPanelItemVisible.call(self._handle, listOf(item), null)
    }
  }

  open fun make_visible(visible: Boolean) {
    TODO()
  }

  fun queueSaveLayout() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.queueSaveLayout.call(self._handle, emptyList(), null)
    }
  }

  fun removeAutoloadSingleton(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeAutoloadSingleton.call(self._handle, listOf(name), null)
    }
  }

  fun removeControlFromBottomPanel(control: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeControlFromBottomPanel.call(self._handle, listOf(control), null)
    }
  }

  fun removeControlFromContainer(container: Int, control: Control) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(container)
      _args.add(control)
      __method_bind.removeControlFromContainer.call(self._handle, _args, null)
    }
  }

  fun removeControlFromDocks(control: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeControlFromDocks.call(self._handle, listOf(control), null)
    }
  }

  fun removeCustomType(type: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeCustomType.call(self._handle, listOf(type), null)
    }
  }

  fun removeExportPlugin(plugin: EditorExportPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeExportPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun removeImportPlugin(importer: EditorImportPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeImportPlugin.call(self._handle, listOf(importer), null)
    }
  }

  fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeInspectorPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeSceneImportPlugin.call(self._handle, listOf(sceneImporter), null)
    }
  }

  fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeSpatialGizmoPlugin.call(self._handle, listOf(plugin), null)
    }
  }

  fun removeToolMenuItem(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeToolMenuItem.call(self._handle, listOf(name), null)
    }
  }

  open fun save_external_data() {
    TODO()
  }

  fun setForceDrawOverForwardingEnabled() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setForceDrawOverForwardingEnabled.call(self._handle, emptyList(), null)
    }
  }

  fun setInputEventForwardingAlwaysEnabled() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInputEventForwardingAlwaysEnabled.call(self._handle, emptyList(), null)
    }
  }

  open fun set_state(state: Dictionary) {
    TODO()
  }

  open fun set_window_layout(layout: ConfigFile) {
    TODO()
  }

  fun updateOverlays(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.updateOverlays.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  enum class DockSlot(
    val value: Int
  ) {
    LEFT_UL(0),

    LEFT_BL(1),

    LEFT_UR(2),

    LEFT_BR(3),

    RIGHT_UL(4),

    RIGHT_BL(5),

    RIGHT_UR(6),

    RIGHT_BR(7),

    MAX(8);

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
    /**
     * Container for method_bind pointers for EditorPlugin
     */
    private object __method_bind {
      val addAutoloadSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_autoload_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_autoload_singleton" }
        }
      val addControlToBottomPanel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_bottom_panel" }
        }
      val addControlToContainer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_container".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_container" }
        }
      val addControlToDock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_control_to_dock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_control_to_dock" }
        }
      val addCustomType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_custom_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_type" }
        }
      val addExportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_export_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_export_plugin" }
        }
      val addImportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_import_plugin" }
        }
      val addInspectorPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_inspector_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_inspector_plugin" }
        }
      val addSceneImportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_scene_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_scene_import_plugin" }
        }
      val addSpatialGizmoPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_spatial_gizmo_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_spatial_gizmo_plugin" }
        }
      val addToolMenuItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_tool_menu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tool_menu_item" }
        }
      val addToolSubmenuItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "add_tool_submenu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tool_submenu_item" }
        }
      val getEditorInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_editor_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_interface" }
        }
      val getScriptCreateDialog: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_script_create_dialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_create_dialog" }
        }
      val getUndoRedo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "get_undo_redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_undo_redo" }
        }
      val hideBottomPanel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "hide_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide_bottom_panel" }
        }
      val makeBottomPanelItemVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "make_bottom_panel_item_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_bottom_panel_item_visible" }
        }
      val queueSaveLayout: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "queue_save_layout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_save_layout" }
        }
      val removeAutoloadSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_autoload_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_autoload_singleton" }
        }
      val removeControlFromBottomPanel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_bottom_panel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_bottom_panel" }
        }
      val removeControlFromContainer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_container".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_container" }
        }
      val removeControlFromDocks: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_control_from_docks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_control_from_docks" }
        }
      val removeCustomType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_custom_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_type" }
        }
      val removeExportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_export_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_export_plugin" }
        }
      val removeImportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_import_plugin" }
        }
      val removeInspectorPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_inspector_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_inspector_plugin" }
        }
      val removeSceneImportPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_scene_import_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_scene_import_plugin" }
        }
      val removeSpatialGizmoPlugin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_spatial_gizmo_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_spatial_gizmo_plugin" }
        }
      val removeToolMenuItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "remove_tool_menu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tool_menu_item" }
        }
      val setForceDrawOverForwardingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "set_force_draw_over_forwarding_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_force_draw_over_forwarding_enabled" }
        }
      val setInputEventForwardingAlwaysEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "set_input_event_forwarding_always_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_input_event_forwarding_always_enabled" }
        }
      val updateOverlays: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "update_overlays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_overlays" }
        }}
  }
}
