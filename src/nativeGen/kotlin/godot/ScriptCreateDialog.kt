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

open class ScriptCreateDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  companion object {
    fun new(): ScriptCreateDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScriptCreateDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ScriptCreateDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ScriptCreateDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ScriptCreateDialog
     */
    private object __method_bind {
      val _browse_class_in_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_browse_class_in_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _browse_class_in_tree" }
            }
          }

      val _browse_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_browse_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _browse_path" }
            }
          }

      val _built_in_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_built_in_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _built_in_pressed" }
            }
          }

      val _class_name_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_class_name_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _class_name_changed" }
            }
          }

      val _create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _create" }
            }
          }

      val _file_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_file_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _file_selected" }
            }
          }

      val _lang_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_lang_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _lang_changed" }
            }
          }

      val _parent_name_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_parent_name_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _parent_name_changed" }
            }
          }

      val _path_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_path_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _path_changed" }
            }
          }

      val _path_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_path_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _path_entered" }
            }
          }

      val _path_hbox_sorted: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_path_hbox_sorted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _path_hbox_sorted" }
            }
          }

      val _template_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "_template_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _template_changed" }
            }
          }

      val config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method config" }
            }
          }
    }
  }
}
