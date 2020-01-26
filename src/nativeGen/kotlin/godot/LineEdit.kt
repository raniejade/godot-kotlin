// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LineEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun editorSettingsChanged() {
    TODO()
  }

  fun guiInput() {
    TODO()
  }

  fun textChanged() {
    TODO()
  }

  fun toggleDrawCaret() {
    TODO()
  }

  fun appendAtCursor() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun cursorGetBlinkEnabled(): Boolean {
    TODO()
  }

  fun cursorGetBlinkSpeed(): Float {
    TODO()
  }

  fun cursorSetBlinkEnabled() {
    TODO()
  }

  fun cursorSetBlinkSpeed() {
    TODO()
  }

  fun deselect() {
    TODO()
  }

  fun getAlign(): LineEdit.Align {
    TODO()
  }

  fun getCursorPosition(): Int {
    TODO()
  }

  fun getExpandToTextLength(): Boolean {
    TODO()
  }

  fun getMaxLength(): Int {
    TODO()
  }

  fun getMenu(): PopupMenu {
    TODO()
  }

  fun getPlaceholder(): String {
    TODO()
  }

  fun getPlaceholderAlpha(): Float {
    TODO()
  }

  fun getSecretCharacter(): String {
    TODO()
  }

  fun getText(): String {
    TODO()
  }

  fun isClearButtonEnabled(): Boolean {
    TODO()
  }

  fun isContextMenuEnabled(): Boolean {
    TODO()
  }

  fun isEditable(): Boolean {
    TODO()
  }

  fun isSecret(): Boolean {
    TODO()
  }

  fun menuOption() {
    TODO()
  }

  fun select() {
    TODO()
  }

  fun selectAll() {
    TODO()
  }

  fun setAlign() {
    TODO()
  }

  fun setClearButtonEnabled() {
    TODO()
  }

  fun setContextMenuEnabled() {
    TODO()
  }

  fun setCursorPosition() {
    TODO()
  }

  fun setEditable() {
    TODO()
  }

  fun setExpandToTextLength() {
    TODO()
  }

  fun setMaxLength() {
    TODO()
  }

  fun setPlaceholder() {
    TODO()
  }

  fun setPlaceholderAlpha() {
    TODO()
  }

  fun setSecret() {
    TODO()
  }

  fun setSecretCharacter() {
    TODO()
  }

  fun setText() {
    TODO()
  }

  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);
  }

  enum class MenuItems(
    val value: Int
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_FILL: Int = 3

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val MENU_CLEAR: Int = 3

    val MENU_COPY: Int = 1

    val MENU_CUT: Int = 0

    val MENU_MAX: Int = 7

    val MENU_PASTE: Int = 2

    val MENU_REDO: Int = 6

    val MENU_SELECT_ALL: Int = 4

    val MENU_UNDO: Int = 5

    fun new(): LineEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton LineEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LineEdit(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for LineEdit
     */
    private object __method_bind {
      val _editor_settings_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "_editor_settings_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _editor_settings_changed" }
            }
          }

      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val _text_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "_text_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _text_changed" }
            }
          }

      val _toggle_draw_caret: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "_toggle_draw_caret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _toggle_draw_caret" }
            }
          }

      val append_at_cursor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "append_at_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method append_at_cursor" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val cursor_get_blink_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_get_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
            }
          }

      val cursor_get_blink_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_get_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
            }
          }

      val cursor_set_blink_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_set_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
            }
          }

      val cursor_set_blink_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_set_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
            }
          }

      val deselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "deselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect" }
            }
          }

      val get_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_align" }
            }
          }

      val get_cursor_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_cursor_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cursor_position" }
            }
          }

      val get_expand_to_text_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_expand_to_text_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_to_text_length" }
            }
          }

      val get_max_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_length" }
            }
          }

      val get_menu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_menu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_menu" }
            }
          }

      val get_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_placeholder" }
            }
          }

      val get_placeholder_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_placeholder_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_placeholder_alpha" }
            }
          }

      val get_secret_character: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_secret_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_secret_character" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val is_clear_button_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_clear_button_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clear_button_enabled" }
            }
          }

      val is_context_menu_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
            }
          }

      val is_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val is_secret: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_secret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_secret" }
            }
          }

      val menu_option: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "menu_option".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method menu_option" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val select_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "select_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select_all" }
            }
          }

      val set_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_align" }
            }
          }

      val set_clear_button_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_clear_button_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clear_button_enabled" }
            }
          }

      val set_context_menu_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
            }
          }

      val set_cursor_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_cursor_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cursor_position" }
            }
          }

      val set_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val set_expand_to_text_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_expand_to_text_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_to_text_length" }
            }
          }

      val set_max_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_length" }
            }
          }

      val set_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_placeholder" }
            }
          }

      val set_placeholder_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_placeholder_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_placeholder_alpha" }
            }
          }

      val set_secret: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_secret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_secret" }
            }
          }

      val set_secret_character: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_secret_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_secret_character" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }
    }
  }
}
