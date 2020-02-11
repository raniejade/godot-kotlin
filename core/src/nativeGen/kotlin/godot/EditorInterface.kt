// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInterface(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun editResource(resource: Resource) {
    val _arg = Variant(resource)
    __method_bind.editResource.call(this._handle, listOf(_arg))
  }

  fun getBaseControl(): Control {
    val _ret = __method_bind.getBaseControl.call(this._handle)
    return _ret.toAny() as Control
  }

  fun getCurrentPath(): String {
    val _ret = __method_bind.getCurrentPath.call(this._handle)
    return _ret.asString()
  }

  fun getEditedSceneRoot(): Node {
    val _ret = __method_bind.getEditedSceneRoot.call(this._handle)
    return _ret.toAny() as Node
  }

  fun getEditorSettings(): EditorSettings {
    val _ret = __method_bind.getEditorSettings.call(this._handle)
    return _ret.toAny() as EditorSettings
  }

  fun getEditorViewport(): Control {
    val _ret = __method_bind.getEditorViewport.call(this._handle)
    return _ret.toAny() as Control
  }

  fun getInspector(): EditorInspector {
    val _ret = __method_bind.getInspector.call(this._handle)
    return _ret.toAny() as EditorInspector
  }

  fun getOpenScenes(): VariantArray {
    val _ret = __method_bind.getOpenScenes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getResourceFilesystem(): EditorFileSystem {
    val _ret = __method_bind.getResourceFilesystem.call(this._handle)
    return _ret.toAny() as EditorFileSystem
  }

  fun getResourcePreviewer(): EditorResourcePreview {
    val _ret = __method_bind.getResourcePreviewer.call(this._handle)
    return _ret.toAny() as EditorResourcePreview
  }

  fun getScriptEditor(): ScriptEditor {
    val _ret = __method_bind.getScriptEditor.call(this._handle)
    return _ret.toAny() as ScriptEditor
  }

  fun getSelectedPath(): String {
    val _ret = __method_bind.getSelectedPath.call(this._handle)
    return _ret.asString()
  }

  fun getSelection(): EditorSelection {
    val _ret = __method_bind.getSelection.call(this._handle)
    return _ret.toAny() as EditorSelection
  }

  fun inspectObject(`object`: Object, forProperty: String = "") {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(forProperty))
    __method_bind.inspectObject.call(this._handle, _args)
  }

  fun isPluginEnabled(plugin: String): Boolean {
    val _arg = Variant(plugin)
    val _ret = __method_bind.isPluginEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun makeMeshPreviews(meshes: VariantArray, previewSize: Int): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(meshes))
    _args.add(Variant.fromAny(previewSize))
    val _ret = __method_bind.makeMeshPreviews.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun openSceneFromPath(sceneFilepath: String) {
    val _arg = Variant(sceneFilepath)
    __method_bind.openSceneFromPath.call(this._handle, listOf(_arg))
  }

  fun reloadSceneFromPath(sceneFilepath: String) {
    val _arg = Variant(sceneFilepath)
    __method_bind.reloadSceneFromPath.call(this._handle, listOf(_arg))
  }

  fun saveScene(): GDError {
    val _ret = __method_bind.saveScene.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun saveSceneAs(path: String, withPreview: Boolean = true) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(withPreview))
    __method_bind.saveSceneAs.call(this._handle, _args)
  }

  fun selectFile(file: String) {
    val _arg = Variant(file)
    __method_bind.selectFile.call(this._handle, listOf(_arg))
  }

  fun setDistractionFreeMode(enter: Boolean) {
    val _arg = Variant(enter)
    __method_bind.setDistractionFreeMode.call(this._handle, listOf(_arg))
  }

  fun setMainScreenEditor(name: String) {
    val _arg = Variant(name)
    __method_bind.setMainScreenEditor.call(this._handle, listOf(_arg))
  }

  fun setPluginEnabled(plugin: String, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(plugin))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setPluginEnabled.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInterface
     */
    private object __method_bind {
      val editResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "edit_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method edit_resource" }
        }
      val getBaseControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_base_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_control" }
        }
      val getCurrentPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_path" }
        }
      val getEditedSceneRoot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_edited_scene_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
        }
      val getEditorSettings: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_editor_settings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_settings" }
        }
      val getEditorViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_editor_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_viewport" }
        }
      val getInspector: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_inspector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inspector" }
        }
      val getOpenScenes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_open_scenes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_open_scenes" }
        }
      val getResourceFilesystem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_resource_filesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_filesystem" }
        }
      val getResourcePreviewer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_resource_previewer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_previewer" }
        }
      val getScriptEditor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_script_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_editor" }
        }
      val getSelectedPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_selected_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_path" }
        }
      val getSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection" }
        }
      val inspectObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "inspect_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method inspect_object" }
        }
      val isPluginEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "is_plugin_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_plugin_enabled" }
        }
      val makeMeshPreviews: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "make_mesh_previews".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_mesh_previews" }
        }
      val openSceneFromPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "open_scene_from_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_scene_from_path" }
        }
      val reloadSceneFromPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "reload_scene_from_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reload_scene_from_path" }
        }
      val saveScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "save_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_scene" }
        }
      val saveSceneAs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "save_scene_as".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_scene_as" }
        }
      val selectFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "select_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_file" }
        }
      val setDistractionFreeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "set_distraction_free_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distraction_free_mode" }
        }
      val setMainScreenEditor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "set_main_screen_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_main_screen_editor" }
        }
      val setPluginEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "set_plugin_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_plugin_enabled" }
        }}
  }
}
