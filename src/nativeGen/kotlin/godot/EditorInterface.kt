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
    __method_bind.editResource.call(this._handle, _arg, 1)
  }

  fun getBaseControl(): Control {
    val _ret = __method_bind.getBaseControl.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getEditedSceneRoot(): Node {
    val _ret = __method_bind.getEditedSceneRoot.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getEditorSettings(): EditorSettings {
    val _ret = __method_bind.getEditorSettings.call(this._handle)
    return _ret.asObject(::EditorSettings)!!
  }

  fun getEditorViewport(): Control {
    val _ret = __method_bind.getEditorViewport.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getInspector(): EditorInspector {
    val _ret = __method_bind.getInspector.call(this._handle)
    return _ret.asObject(::EditorInspector)!!
  }

  fun getOpenScenes(): VariantArray {
    val _ret = __method_bind.getOpenScenes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getResourceFilesystem(): EditorFileSystem {
    val _ret = __method_bind.getResourceFilesystem.call(this._handle)
    return _ret.asObject(::EditorFileSystem)!!
  }

  fun getResourcePreviewer(): EditorResourcePreview {
    val _ret = __method_bind.getResourcePreviewer.call(this._handle)
    return _ret.asObject(::EditorResourcePreview)!!
  }

  fun getScriptEditor(): ScriptEditor {
    val _ret = __method_bind.getScriptEditor.call(this._handle)
    return _ret.asObject(::ScriptEditor)!!
  }

  fun getSelectedPath(): String {
    val _ret = __method_bind.getSelectedPath.call(this._handle)
    return _ret.asString()
  }

  fun getSelection(): EditorSelection {
    val _ret = __method_bind.getSelection.call(this._handle)
    return _ret.asObject(::EditorSelection)!!
  }

  fun inspectObject(`object`: Object, forProperty: String) {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(forProperty)
    __method_bind.inspectObject.call(this._handle, _args.toVariant(), 2)
  }

  fun isPluginEnabled(plugin: String): Boolean {
    val _arg = Variant.new(plugin)
    val _ret = __method_bind.isPluginEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun makeMeshPreviews(meshes: VariantArray, previewSize: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(meshes)
    _args.append(previewSize)
    val _ret = __method_bind.makeMeshPreviews.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun openSceneFromPath(sceneFilepath: String) {
    val _arg = Variant.new(sceneFilepath)
    __method_bind.openSceneFromPath.call(this._handle, _arg, 1)
  }

  fun reloadSceneFromPath(sceneFilepath: String) {
    val _arg = Variant.new(sceneFilepath)
    __method_bind.reloadSceneFromPath.call(this._handle, _arg, 1)
  }

  fun saveScene(): GDError {
    val _ret = __method_bind.saveScene.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun saveSceneAs(path: String, withPreview: Boolean) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(withPreview)
    __method_bind.saveSceneAs.call(this._handle, _args.toVariant(), 2)
  }

  fun selectFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.selectFile.call(this._handle, _arg, 1)
  }

  fun setPluginEnabled(plugin: String, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(plugin)
    _args.append(enabled)
    __method_bind.setPluginEnabled.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInterface
     */
    private object __method_bind {
      val editResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "editResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method editResource" }
        }
      val getBaseControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getBaseControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseControl" }
        }
      val getEditedSceneRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getEditedSceneRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditedSceneRoot" }
        }
      val getEditorSettings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getEditorSettings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditorSettings" }
        }
      val getEditorViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getEditorViewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditorViewport" }
        }
      val getInspector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getInspector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInspector" }
        }
      val getOpenScenes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getOpenScenes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOpenScenes" }
        }
      val getResourceFilesystem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getResourceFilesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResourceFilesystem" }
        }
      val getResourcePreviewer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getResourcePreviewer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResourcePreviewer" }
        }
      val getScriptEditor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getScriptEditor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScriptEditor" }
        }
      val getSelectedPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getSelectedPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedPath" }
        }
      val getSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "getSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelection" }
        }
      val inspectObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "inspectObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method inspectObject" }
        }
      val isPluginEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "isPluginEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPluginEnabled" }
        }
      val makeMeshPreviews: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "makeMeshPreviews".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeMeshPreviews" }
        }
      val openSceneFromPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "openSceneFromPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method openSceneFromPath" }
        }
      val reloadSceneFromPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "reloadSceneFromPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reloadSceneFromPath" }
        }
      val saveScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "saveScene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method saveScene" }
        }
      val saveSceneAs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "saveSceneAs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method saveSceneAs" }
        }
      val selectFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "selectFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method selectFile" }
        }
      val setPluginEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
            "setPluginEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPluginEnabled" }
        }}
  }
}
