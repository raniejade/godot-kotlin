// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInterface(
  _handle: COpaquePointer
) : Node(_handle) {
  fun editResource(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.edit_resource.call(this._handle, _arg, 1)
  }

  fun getBaseControl(): Control {
    val _ret = __method_bind.get_base_control.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getEditedSceneRoot(): Node {
    val _ret = __method_bind.get_edited_scene_root.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getEditorSettings(): EditorSettings {
    val _ret = __method_bind.get_editor_settings.call(this._handle)
    return _ret.asObject(::EditorSettings)!!
  }

  fun getEditorViewport(): Control {
    val _ret = __method_bind.get_editor_viewport.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getInspector(): EditorInspector {
    val _ret = __method_bind.get_inspector.call(this._handle)
    return _ret.asObject(::EditorInspector)!!
  }

  fun getOpenScenes(): VariantArray {
    val _ret = __method_bind.get_open_scenes.call(this._handle)
    return _ret.asArray()
  }

  fun getResourceFilesystem(): EditorFileSystem {
    val _ret = __method_bind.get_resource_filesystem.call(this._handle)
    return _ret.asObject(::EditorFileSystem)!!
  }

  fun getResourcePreviewer(): EditorResourcePreview {
    val _ret = __method_bind.get_resource_previewer.call(this._handle)
    return _ret.asObject(::EditorResourcePreview)!!
  }

  fun getScriptEditor(): ScriptEditor {
    val _ret = __method_bind.get_script_editor.call(this._handle)
    return _ret.asObject(::ScriptEditor)!!
  }

  fun getSelectedPath(): String {
    val _ret = __method_bind.get_selected_path.call(this._handle)
    return _ret.asString()
  }

  fun getSelection(): EditorSelection {
    val _ret = __method_bind.get_selection.call(this._handle)
    return _ret.asObject(::EditorSelection)!!
  }

  fun inspectObject(`object`: Object, forProperty: String) {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(forProperty)
    __method_bind.inspect_object.call(this._handle, _args.toVariant(), 2)
  }

  fun isPluginEnabled(plugin: String): Boolean {
    val _arg = Variant.new(plugin)
    val _ret = __method_bind.is_plugin_enabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun makeMeshPreviews(meshes: VariantArray, previewSize: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(meshes)
    _args.append(previewSize)
    val _ret = __method_bind.make_mesh_previews.call(this._handle, _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun openSceneFromPath(sceneFilepath: String) {
    val _arg = Variant.new(sceneFilepath)
    __method_bind.open_scene_from_path.call(this._handle, _arg, 1)
  }

  fun reloadSceneFromPath(sceneFilepath: String) {
    val _arg = Variant.new(sceneFilepath)
    __method_bind.reload_scene_from_path.call(this._handle, _arg, 1)
  }

  fun saveScene(): GDError {
    val _ret = __method_bind.save_scene.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun saveSceneAs(path: String, withPreview: Boolean) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(withPreview)
    __method_bind.save_scene_as.call(this._handle, _args.toVariant(), 2)
  }

  fun selectFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.select_file.call(this._handle, _arg, 1)
  }

  fun setPluginEnabled(plugin: String, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(plugin)
    _args.append(enabled)
    __method_bind.set_plugin_enabled.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInterface
     */
    private object __method_bind {
      val edit_resource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "edit_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method edit_resource" }
        }
      val get_base_control: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_base_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_control" }
        }
      val get_edited_scene_root: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_edited_scene_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
        }
      val get_editor_settings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_editor_settings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_settings" }
        }
      val get_editor_viewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_editor_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_viewport" }
        }
      val get_inspector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_inspector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inspector" }
        }
      val get_open_scenes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_open_scenes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_open_scenes" }
        }
      val get_resource_filesystem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_resource_filesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_filesystem" }
        }
      val get_resource_previewer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_resource_previewer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_previewer" }
        }
      val get_script_editor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_script_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_editor" }
        }
      val get_selected_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_selected_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_path" }
        }
      val get_selection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "get_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection" }
        }
      val inspect_object: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "inspect_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method inspect_object" }
        }
      val is_plugin_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "is_plugin_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_plugin_enabled" }
        }
      val make_mesh_previews: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "make_mesh_previews".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_mesh_previews" }
        }
      val open_scene_from_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "open_scene_from_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_scene_from_path" }
        }
      val reload_scene_from_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "reload_scene_from_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reload_scene_from_path" }
        }
      val save_scene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "save_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_scene" }
        }
      val save_scene_as: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "save_scene_as".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_scene_as" }
        }
      val select_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "select_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_file" }
        }
      val set_plugin_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "set_plugin_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_plugin_enabled" }
        }}
  }
}
