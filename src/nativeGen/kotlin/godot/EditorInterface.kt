// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInterface internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun editResource() {
    TODO()
  }

  fun getBaseControl(): Control {
    TODO()
  }

  fun getEditedSceneRoot(): Node {
    TODO()
  }

  fun getEditorSettings(): EditorSettings {
    TODO()
  }

  fun getEditorViewport(): Control {
    TODO()
  }

  fun getInspector(): EditorInspector {
    TODO()
  }

  fun getOpenScenes(): VariantArray {
    TODO()
  }

  fun getResourceFilesystem(): EditorFileSystem {
    TODO()
  }

  fun getResourcePreviewer(): EditorResourcePreview {
    TODO()
  }

  fun getScriptEditor(): ScriptEditor {
    TODO()
  }

  fun getSelectedPath(): String {
    TODO()
  }

  fun getSelection(): EditorSelection {
    TODO()
  }

  fun inspectObject() {
    TODO()
  }

  fun isPluginEnabled(): Boolean {
    TODO()
  }

  fun makeMeshPreviews(): VariantArray {
    TODO()
  }

  fun openSceneFromPath() {
    TODO()
  }

  fun reloadSceneFromPath() {
    TODO()
  }

  fun saveScene(): Error {
    TODO()
  }

  fun saveSceneAs() {
    TODO()
  }

  fun selectFile() {
    TODO()
  }

  fun setPluginEnabled() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInterface
     */
    private object __method_bind {
      val edit_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "edit_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method edit_resource" }
            }
          }

      val get_base_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_base_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_control" }
            }
          }

      val get_edited_scene_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
            }
          }

      val get_editor_settings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_editor_settings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_editor_settings" }
            }
          }

      val get_editor_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_editor_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_editor_viewport" }
            }
          }

      val get_inspector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_inspector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inspector" }
            }
          }

      val get_open_scenes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_open_scenes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_open_scenes" }
            }
          }

      val get_resource_filesystem: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_resource_filesystem".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_filesystem" }
            }
          }

      val get_resource_previewer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_resource_previewer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_previewer" }
            }
          }

      val get_script_editor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_script_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_editor" }
            }
          }

      val get_selected_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_selected_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_path" }
            }
          }

      val get_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "get_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection" }
            }
          }

      val inspect_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "inspect_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method inspect_object" }
            }
          }

      val is_plugin_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "is_plugin_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_plugin_enabled" }
            }
          }

      val make_mesh_previews: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "make_mesh_previews".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_mesh_previews" }
            }
          }

      val open_scene_from_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "open_scene_from_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_scene_from_path" }
            }
          }

      val reload_scene_from_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "reload_scene_from_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reload_scene_from_path" }
            }
          }

      val save_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "save_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_scene" }
            }
          }

      val save_scene_as: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "save_scene_as".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_scene_as" }
            }
          }

      val select_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "select_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select_file" }
            }
          }

      val set_plugin_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInterface".cstr.ptr,
              "set_plugin_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_plugin_enabled" }
            }
          }
    }
  }
}
