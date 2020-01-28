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

open class EditorPlugin(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addAutoloadSingleton(name: String, path: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(path)
    __method_bind.addAutoloadSingleton.call(this._handle, _args.toVariant(), 2)
  }

  fun addControlToBottomPanel(control: Control, title: String): ToolButton {
    val _args = VariantArray.new()
    _args.append(control)
    _args.append(title)
    val _ret = __method_bind.addControlToBottomPanel.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::ToolButton)!!
  }

  fun addControlToContainer(container: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(container)
    _args.append(control)
    __method_bind.addControlToContainer.call(this._handle, _args.toVariant(), 2)
  }

  fun addControlToDock(slot: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(slot)
    _args.append(control)
    __method_bind.addControlToDock.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.addCustomType.call(this._handle, _args.toVariant(), 4)
  }

  fun addExportPlugin(plugin: EditorExportPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.addExportPlugin.call(this._handle, _arg, 1)
  }

  fun addImportPlugin(importer: EditorImportPlugin) {
    val _arg = Variant.new(importer)
    __method_bind.addImportPlugin.call(this._handle, _arg, 1)
  }

  fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.addInspectorPlugin.call(this._handle, _arg, 1)
  }

  fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val _arg = Variant.new(sceneImporter)
    __method_bind.addSceneImportPlugin.call(this._handle, _arg, 1)
  }

  fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.addSpatialGizmoPlugin.call(this._handle, _arg, 1)
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
    __method_bind.addToolMenuItem.call(this._handle, _args.toVariant(), 4)
  }

  fun addToolSubmenuItem(name: String, submenu: Object) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(submenu)
    __method_bind.addToolSubmenuItem.call(this._handle, _args.toVariant(), 2)
  }

  fun getEditorInterface(): EditorInterface {
    val _ret = __method_bind.getEditorInterface.call(this._handle)
    return _ret.asObject(::EditorInterface)!!
  }

  fun getScriptCreateDialog(): ScriptCreateDialog {
    val _ret = __method_bind.getScriptCreateDialog.call(this._handle)
    return _ret.asObject(::ScriptCreateDialog)!!
  }

  fun getUndoRedo(): UndoRedo {
    val _ret = __method_bind.getUndoRedo.call(this._handle)
    return _ret.asObject(::UndoRedo)!!
  }

  fun hideBottomPanel() {
    __method_bind.hideBottomPanel.call(this._handle)
  }

  fun makeBottomPanelItemVisible(item: Control) {
    val _arg = Variant.new(item)
    __method_bind.makeBottomPanelItemVisible.call(this._handle, _arg, 1)
  }

  fun queueSaveLayout() {
    __method_bind.queueSaveLayout.call(this._handle)
  }

  fun removeAutoloadSingleton(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeAutoloadSingleton.call(this._handle, _arg, 1)
  }

  fun removeControlFromBottomPanel(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.removeControlFromBottomPanel.call(this._handle, _arg, 1)
  }

  fun removeControlFromContainer(container: Int, control: Control) {
    val _args = VariantArray.new()
    _args.append(container)
    _args.append(control)
    __method_bind.removeControlFromContainer.call(this._handle, _args.toVariant(), 2)
  }

  fun removeControlFromDocks(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.removeControlFromDocks.call(this._handle, _arg, 1)
  }

  fun removeCustomType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.removeCustomType.call(this._handle, _arg, 1)
  }

  fun removeExportPlugin(plugin: EditorExportPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.removeExportPlugin.call(this._handle, _arg, 1)
  }

  fun removeImportPlugin(importer: EditorImportPlugin) {
    val _arg = Variant.new(importer)
    __method_bind.removeImportPlugin.call(this._handle, _arg, 1)
  }

  fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.removeInspectorPlugin.call(this._handle, _arg, 1)
  }

  fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val _arg = Variant.new(sceneImporter)
    __method_bind.removeSceneImportPlugin.call(this._handle, _arg, 1)
  }

  fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val _arg = Variant.new(plugin)
    __method_bind.removeSpatialGizmoPlugin.call(this._handle, _arg, 1)
  }

  fun removeToolMenuItem(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeToolMenuItem.call(this._handle, _arg, 1)
  }

  fun setForceDrawOverForwardingEnabled() {
    __method_bind.setForceDrawOverForwardingEnabled.call(this._handle)
  }

  fun setInputEventForwardingAlwaysEnabled() {
    __method_bind.setInputEventForwardingAlwaysEnabled.call(this._handle)
  }

  fun updateOverlays(): Int {
    val _ret = __method_bind.updateOverlays.call(this._handle)
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
      val addAutoloadSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addAutoloadSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addAutoloadSingleton" }
        }
      val addControlToBottomPanel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addControlToBottomPanel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addControlToBottomPanel" }
        }
      val addControlToContainer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addControlToContainer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addControlToContainer" }
        }
      val addControlToDock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addControlToDock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addControlToDock" }
        }
      val addCustomType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addCustomType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCustomType" }
        }
      val addExportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addExportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addExportPlugin" }
        }
      val addImportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addImportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addImportPlugin" }
        }
      val addInspectorPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addInspectorPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addInspectorPlugin" }
        }
      val addSceneImportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addSceneImportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSceneImportPlugin" }
        }
      val addSpatialGizmoPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addSpatialGizmoPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSpatialGizmoPlugin" }
        }
      val addToolMenuItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addToolMenuItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addToolMenuItem" }
        }
      val addToolSubmenuItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "addToolSubmenuItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addToolSubmenuItem" }
        }
      val getEditorInterface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "getEditorInterface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditorInterface" }
        }
      val getScriptCreateDialog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "getScriptCreateDialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScriptCreateDialog" }
        }
      val getUndoRedo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "getUndoRedo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUndoRedo" }
        }
      val hideBottomPanel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "hideBottomPanel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hideBottomPanel" }
        }
      val makeBottomPanelItemVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "makeBottomPanelItemVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeBottomPanelItemVisible" }
        }
      val queueSaveLayout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "queueSaveLayout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queueSaveLayout" }
        }
      val removeAutoloadSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeAutoloadSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeAutoloadSingleton" }
        }
      val removeControlFromBottomPanel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeControlFromBottomPanel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeControlFromBottomPanel" }
        }
      val removeControlFromContainer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeControlFromContainer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeControlFromContainer" }
        }
      val removeControlFromDocks: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeControlFromDocks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeControlFromDocks" }
        }
      val removeCustomType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeCustomType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeCustomType" }
        }
      val removeExportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeExportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeExportPlugin" }
        }
      val removeImportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeImportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeImportPlugin" }
        }
      val removeInspectorPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeInspectorPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeInspectorPlugin" }
        }
      val removeSceneImportPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeSceneImportPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeSceneImportPlugin" }
        }
      val removeSpatialGizmoPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeSpatialGizmoPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeSpatialGizmoPlugin" }
        }
      val removeToolMenuItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "removeToolMenuItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeToolMenuItem" }
        }
      val setForceDrawOverForwardingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "setForceDrawOverForwardingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setForceDrawOverForwardingEnabled"
            }
        }
      val setInputEventForwardingAlwaysEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "setInputEventForwardingAlwaysEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method setInputEventForwardingAlwaysEnabled" }
        }
      val updateOverlays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorPlugin".cstr.ptr,
            "updateOverlays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateOverlays" }
        }}
  }
}
