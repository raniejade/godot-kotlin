// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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

open class EditorInterface(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun editResource(resource: Resource) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.editResource.call(self._handle, listOf(resource), null)
    }
  }

  fun getBaseControl(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getBaseControl.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
    }
  }

  fun getCurrentPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getEditedSceneRoot(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditedSceneRoot.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getEditorSettings(): EditorSettings {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorSettings
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditorSettings.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorSettings>(_tmp.value!!)
      _ret
    }
  }

  fun getEditorViewport(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditorViewport.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
    }
  }

  fun getInspector(): EditorInspector {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorInspector
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getInspector.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorInspector>(_tmp.value!!)
      _ret
    }
  }

  fun getOpenScenes(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOpenScenes.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getResourceFilesystem(): EditorFileSystem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorFileSystem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getResourceFilesystem.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorFileSystem>(_tmp.value!!)
      _ret
    }
  }

  fun getResourcePreviewer(): EditorResourcePreview {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorResourcePreview
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getResourcePreviewer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorResourcePreview>(_tmp.value!!)
      _ret
    }
  }

  fun getScriptEditor(): ScriptEditor {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ScriptEditor
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getScriptEditor.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ScriptEditor>(_tmp.value!!)
      _ret
    }
  }

  fun getSelectedPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSelectedPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSelection(): EditorSelection {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorSelection
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSelection.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorSelection>(_tmp.value!!)
      _ret
    }
  }

  fun inspectObject(`object`: Object, forProperty: String = "") {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(forProperty)
      __method_bind.inspectObject.call(self._handle, _args, null)
    }
  }

  fun isPluginEnabled(plugin: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPluginEnabled.call(self._handle, listOf(plugin), _retPtr)
      _ret.value
    }
  }

  fun makeMeshPreviews(meshes: VariantArray, previewSize: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(meshes)
      _args.add(previewSize)
      __method_bind.makeMeshPreviews.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun openSceneFromPath(sceneFilepath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.openSceneFromPath.call(self._handle, listOf(sceneFilepath), null)
    }
  }

  fun reloadSceneFromPath(sceneFilepath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.reloadSceneFromPath.call(self._handle, listOf(sceneFilepath), null)
    }
  }

  fun saveScene(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.saveScene.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun saveSceneAs(path: String, withPreview: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(withPreview)
      __method_bind.saveSceneAs.call(self._handle, _args, null)
    }
  }

  fun selectFile(file: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.selectFile.call(self._handle, listOf(file), null)
    }
  }

  fun setDistractionFreeMode(enter: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDistractionFreeMode.call(self._handle, listOf(enter), null)
    }
  }

  fun setMainScreenEditor(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMainScreenEditor.call(self._handle, listOf(name), null)
    }
  }

  fun setPluginEnabled(plugin: String, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(plugin)
      _args.add(enabled)
      __method_bind.setPluginEnabled.call(self._handle, _args, null)
    }
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
