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

open class FileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  enum class Mode(
    val value: Int
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);
  }

  enum class Access(
    val value: Int
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);
  }

  companion object {
    val ACCESS_FILESYSTEM: Int = 2

    val ACCESS_RESOURCES: Int = 0

    val ACCESS_USERDATA: Int = 1

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    fun new(): FileDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton FileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      FileDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for FileDialog
     */
    private object __method_bind {
      val _action_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_action_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _action_pressed" }
            }
          }

      val _cancel_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_cancel_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _cancel_pressed" }
            }
          }

      val _dir_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_dir_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _dir_entered" }
            }
          }

      val _file_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_file_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _file_entered" }
            }
          }

      val _filter_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_filter_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _filter_selected" }
            }
          }

      val _go_up: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_go_up".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _go_up" }
            }
          }

      val _make_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_make_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _make_dir" }
            }
          }

      val _make_dir_confirm: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_make_dir_confirm".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _make_dir_confirm" }
            }
          }

      val _save_confirm_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_save_confirm_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _save_confirm_pressed" }
            }
          }

      val _select_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_select_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _select_drive" }
            }
          }

      val _tree_item_activated: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_tree_item_activated".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_item_activated" }
            }
          }

      val _tree_multi_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_tree_multi_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_multi_selected" }
            }
          }

      val _tree_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_tree_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_selected" }
            }
          }

      val _unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _unhandled_input" }
            }
          }

      val _update_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_update_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_dir" }
            }
          }

      val _update_file_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "_update_file_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_file_list" }
            }
          }

      val add_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "add_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_filter" }
            }
          }

      val clear_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "clear_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_filters" }
            }
          }

      val deselect_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "deselect_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect_items" }
            }
          }

      val get_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_access" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_file" }
            }
          }

      val get_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_path" }
            }
          }

      val get_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filters" }
            }
          }

      val get_line_edit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_line_edit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_vbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_vbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vbox" }
            }
          }

      val invalidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "invalidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method invalidate" }
            }
          }

      val is_mode_overriding_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_mode_overriding_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_mode_overriding_title" }
            }
          }

      val is_showing_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_showing_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
            }
          }

      val set_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_access" }
            }
          }

      val set_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
            }
          }

      val set_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_file" }
            }
          }

      val set_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_path" }
            }
          }

      val set_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filters" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_mode_overrides_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode_overrides_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode_overrides_title" }
            }
          }

      val set_show_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_show_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
            }
          }
    }
  }
}
