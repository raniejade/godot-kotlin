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

open class Tree internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_ROW(1),

    SELECT_MULTI(2);
  }

  enum class DropModeFlags(
    val value: Int
  ) {
    DROP_MODE_DISABLED(0),

    DROP_MODE_ON_ITEM(1),

    DROP_MODE_INBETWEEN(2);
  }

  companion object {
    val DROP_MODE_DISABLED: Int = 0

    val DROP_MODE_INBETWEEN: Int = 2

    val DROP_MODE_ON_ITEM: Int = 1

    val SELECT_MULTI: Int = 2

    val SELECT_ROW: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): Tree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Tree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tree(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Tree
     */
    private object __method_bind {
      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val _popup_select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_popup_select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _popup_select" }
            }
          }

      val _range_click_timeout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_range_click_timeout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _range_click_timeout" }
            }
          }

      val _scroll_moved: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_scroll_moved".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _scroll_moved" }
            }
          }

      val _text_editor_enter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_text_editor_enter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _text_editor_enter" }
            }
          }

      val _text_editor_modal_close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_text_editor_modal_close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _text_editor_modal_close" }
            }
          }

      val _value_editor_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "_value_editor_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _value_editor_changed" }
            }
          }

      val are_column_titles_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "are_column_titles_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_column_titles_visible" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val create_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "create_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_item" }
            }
          }

      val ensure_cursor_is_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "ensure_cursor_is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ensure_cursor_is_visible" }
            }
          }

      val get_allow_reselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_allow_reselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
            }
          }

      val get_allow_rmb_select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_allow_rmb_select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
            }
          }

      val get_column_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_column_at_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_column_at_position" }
            }
          }

      val get_column_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_column_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_column_title" }
            }
          }

      val get_column_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_column_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_column_width" }
            }
          }

      val get_columns: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_columns".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_columns" }
            }
          }

      val get_custom_popup_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_custom_popup_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_popup_rect" }
            }
          }

      val get_drop_mode_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_drop_mode_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drop_mode_flags" }
            }
          }

      val get_drop_section_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_drop_section_at_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drop_section_at_position" }
            }
          }

      val get_edited: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_edited".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited" }
            }
          }

      val get_edited_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_edited_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_column" }
            }
          }

      val get_item_area_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_item_area_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_area_rect" }
            }
          }

      val get_item_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_item_at_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
            }
          }

      val get_next_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_next_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next_selected" }
            }
          }

      val get_pressed_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_pressed_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
            }
          }

      val get_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val get_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll" }
            }
          }

      val get_select_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_select_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
            }
          }

      val get_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected" }
            }
          }

      val get_selected_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "get_selected_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_column" }
            }
          }

      val is_folding_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "is_folding_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_folding_hidden" }
            }
          }

      val is_root_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "is_root_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_root_hidden" }
            }
          }

      val set_allow_reselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_allow_reselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
            }
          }

      val set_allow_rmb_select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_allow_rmb_select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
            }
          }

      val set_column_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_column_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_column_expand" }
            }
          }

      val set_column_min_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_column_min_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_column_min_width" }
            }
          }

      val set_column_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_column_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_column_title" }
            }
          }

      val set_column_titles_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_column_titles_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_column_titles_visible" }
            }
          }

      val set_columns: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_columns".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_columns" }
            }
          }

      val set_drop_mode_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_drop_mode_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drop_mode_flags" }
            }
          }

      val set_hide_folding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_hide_folding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_folding" }
            }
          }

      val set_hide_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_hide_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_root" }
            }
          }

      val set_select_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
              "set_select_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
            }
          }
    }
  }
}
