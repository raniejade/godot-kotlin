// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class EditorFileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  fun actionPressed() {
    TODO()
  }

  fun cancelPressed() {
    TODO()
  }

  fun dirEntered() {
    TODO()
  }

  fun favoriteMoveDown() {
    TODO()
  }

  fun favoriteMoveUp() {
    TODO()
  }

  fun favoritePressed() {
    TODO()
  }

  fun favoriteSelected() {
    TODO()
  }

  fun fileEntered() {
    TODO()
  }

  fun filterSelected() {
    TODO()
  }

  fun goBack() {
    TODO()
  }

  fun goForward() {
    TODO()
  }

  fun goUp() {
    TODO()
  }

  fun itemDbSelected() {
    TODO()
  }

  fun itemListItemRmbSelected() {
    TODO()
  }

  fun itemListRmbClicked() {
    TODO()
  }

  fun itemMenuIdPressed() {
    TODO()
  }

  fun itemSelected() {
    TODO()
  }

  fun itemsClearSelection() {
    TODO()
  }

  fun makeDir() {
    TODO()
  }

  fun makeDirConfirm() {
    TODO()
  }

  fun multiSelected() {
    TODO()
  }

  fun recentSelected() {
    TODO()
  }

  fun saveConfirmPressed() {
    TODO()
  }

  fun selectDrive() {
    TODO()
  }

  fun thumbnailDone() {
    TODO()
  }

  fun thumbnailResult() {
    TODO()
  }

  fun unhandledInput() {
    TODO()
  }

  fun updateDir() {
    TODO()
  }

  fun updateFileList() {
    TODO()
  }

  fun addFilter() {
    TODO()
  }

  fun clearFilters() {
    TODO()
  }

  fun getAccess(): EditorFileDialog.Access {
    TODO()
  }

  fun getCurrentDir(): String {
    TODO()
  }

  fun getCurrentFile(): String {
    TODO()
  }

  fun getCurrentPath(): String {
    TODO()
  }

  fun getDisplayMode(): EditorFileDialog.DisplayMode {
    TODO()
  }

  fun getMode(): EditorFileDialog.Mode {
    TODO()
  }

  fun getVbox(): VBoxContainer {
    TODO()
  }

  fun invalidate() {
    TODO()
  }

  fun isOverwriteWarningDisabled(): Boolean {
    TODO()
  }

  fun isShowingHiddenFiles(): Boolean {
    TODO()
  }

  fun setAccess() {
    TODO()
  }

  fun setCurrentDir() {
    TODO()
  }

  fun setCurrentFile() {
    TODO()
  }

  fun setCurrentPath() {
    TODO()
  }

  fun setDisableOverwriteWarning() {
    TODO()
  }

  fun setDisplayMode() {
    TODO()
  }

  fun setMode() {
    TODO()
  }

  fun setShowHiddenFiles() {
    TODO()
  }

  enum class DisplayMode(
    val value: Int
  ) {
    DISPLAY_THUMBNAILS(0),

    DISPLAY_LIST(1);
  }

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

    val DISPLAY_LIST: Int = 1

    val DISPLAY_THUMBNAILS: Int = 0

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    fun new(): EditorFileDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorFileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFileDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorFileDialog
     */
    private object __method_bind {
      val _action_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_action_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _action_pressed" }
            }
          }

      val _cancel_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_cancel_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _cancel_pressed" }
            }
          }

      val _dir_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_dir_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _dir_entered" }
            }
          }

      val _favorite_move_down: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_favorite_move_down".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _favorite_move_down" }
            }
          }

      val _favorite_move_up: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_favorite_move_up".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _favorite_move_up" }
            }
          }

      val _favorite_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_favorite_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _favorite_pressed" }
            }
          }

      val _favorite_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_favorite_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _favorite_selected" }
            }
          }

      val _file_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_file_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _file_entered" }
            }
          }

      val _filter_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_filter_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _filter_selected" }
            }
          }

      val _go_back: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_go_back".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _go_back" }
            }
          }

      val _go_forward: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_go_forward".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _go_forward" }
            }
          }

      val _go_up: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_go_up".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _go_up" }
            }
          }

      val _item_db_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_item_db_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _item_db_selected" }
            }
          }

      val _item_list_item_rmb_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_item_list_item_rmb_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _item_list_item_rmb_selected" }
            }
          }

      val _item_list_rmb_clicked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_item_list_rmb_clicked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _item_list_rmb_clicked" }
            }
          }

      val _item_menu_id_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_item_menu_id_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _item_menu_id_pressed" }
            }
          }

      val _item_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_item_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _item_selected" }
            }
          }

      val _items_clear_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_items_clear_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _items_clear_selection" }
            }
          }

      val _make_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_make_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _make_dir" }
            }
          }

      val _make_dir_confirm: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_make_dir_confirm".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _make_dir_confirm" }
            }
          }

      val _multi_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_multi_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _multi_selected" }
            }
          }

      val _recent_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_recent_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _recent_selected" }
            }
          }

      val _save_confirm_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_save_confirm_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _save_confirm_pressed" }
            }
          }

      val _select_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_select_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _select_drive" }
            }
          }

      val _thumbnail_done: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_thumbnail_done".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _thumbnail_done" }
            }
          }

      val _thumbnail_result: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_thumbnail_result".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _thumbnail_result" }
            }
          }

      val _unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _unhandled_input" }
            }
          }

      val _update_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_update_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_dir" }
            }
          }

      val _update_file_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "_update_file_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_file_list" }
            }
          }

      val add_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "add_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_filter" }
            }
          }

      val clear_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "clear_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_filters" }
            }
          }

      val get_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_access" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_file" }
            }
          }

      val get_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_path" }
            }
          }

      val get_display_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_display_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_display_mode" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_vbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "get_vbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vbox" }
            }
          }

      val invalidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "invalidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method invalidate" }
            }
          }

      val is_overwrite_warning_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "is_overwrite_warning_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_overwrite_warning_disabled"
              }
            }
          }

      val is_showing_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "is_showing_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
            }
          }

      val set_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_access" }
            }
          }

      val set_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
            }
          }

      val set_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_file" }
            }
          }

      val set_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_path" }
            }
          }

      val set_disable_overwrite_warning: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_disable_overwrite_warning".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_overwrite_warning"
              }
            }
          }

      val set_display_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_display_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_display_mode" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_show_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
              "set_show_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
            }
          }
    }
  }
}
