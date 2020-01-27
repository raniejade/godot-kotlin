// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun appendAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.append_at_cursor.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val _ret = __method_bind.cursor_get_blink_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun cursorGetBlinkSpeed(): Float {
    val _ret = __method_bind.cursor_get_blink_speed.call(this._handle)
    return _ret.asFloat()
  }

  fun cursorSetBlinkEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.cursor_set_blink_enabled.call(this._handle, _arg, 1)
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursor_set_blink_speed.call(this._handle, _arg, 1)
  }

  fun deselect() {
    __method_bind.deselect.call(this._handle)
  }

  fun getAlign(): Align {
    val _ret = __method_bind.get_align.call(this._handle)
    return LineEdit.Align.from(_ret.asInt())
  }

  fun getCursorPosition(): Int {
    val _ret = __method_bind.get_cursor_position.call(this._handle)
    return _ret.asInt()
  }

  fun getExpandToTextLength(): Boolean {
    val _ret = __method_bind.get_expand_to_text_length.call(this._handle)
    return _ret.asBool()
  }

  fun getMaxLength(): Int {
    val _ret = __method_bind.get_max_length.call(this._handle)
    return _ret.asInt()
  }

  fun getMenu(): PopupMenu {
    val _ret = __method_bind.get_menu.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun getPlaceholder(): String {
    val _ret = __method_bind.get_placeholder.call(this._handle)
    return _ret.asString()
  }

  fun getPlaceholderAlpha(): Float {
    val _ret = __method_bind.get_placeholder_alpha.call(this._handle)
    return _ret.asFloat()
  }

  fun getSecretCharacter(): String {
    val _ret = __method_bind.get_secret_character.call(this._handle)
    return _ret.asString()
  }

  fun getText(): String {
    val _ret = __method_bind.get_text.call(this._handle)
    return _ret.asString()
  }

  fun isClearButtonEnabled(): Boolean {
    val _ret = __method_bind.is_clear_button_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isContextMenuEnabled(): Boolean {
    val _ret = __method_bind.is_context_menu_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isEditable(): Boolean {
    val _ret = __method_bind.is_editable.call(this._handle)
    return _ret.asBool()
  }

  fun isSecret(): Boolean {
    val _ret = __method_bind.is_secret.call(this._handle)
    return _ret.asBool()
  }

  fun menuOption(option: Int) {
    val _arg = Variant.new(option)
    __method_bind.menu_option.call(this._handle, _arg, 1)
  }

  fun select(from: Int, to: Int) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    __method_bind.select.call(this._handle, _args.toVariant(), 2)
  }

  fun selectAll() {
    __method_bind.select_all.call(this._handle)
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.set_align.call(this._handle, _arg, 1)
  }

  fun setClearButtonEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_clear_button_enabled.call(this._handle, _arg, 1)
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_context_menu_enabled.call(this._handle, _arg, 1)
  }

  fun setCursorPosition(position: Int) {
    val _arg = Variant.new(position)
    __method_bind.set_cursor_position.call(this._handle, _arg, 1)
  }

  fun setEditable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_editable.call(this._handle, _arg, 1)
  }

  fun setExpandToTextLength(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_expand_to_text_length.call(this._handle, _arg, 1)
  }

  fun setMaxLength(chars: Int) {
    val _arg = Variant.new(chars)
    __method_bind.set_max_length.call(this._handle, _arg, 1)
  }

  fun setPlaceholder(text: String) {
    val _arg = Variant.new(text)
    __method_bind.set_placeholder.call(this._handle, _arg, 1)
  }

  fun setPlaceholderAlpha(alpha: Float) {
    val _arg = Variant.new(alpha)
    __method_bind.set_placeholder_alpha.call(this._handle, _arg, 1)
  }

  fun setSecret(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_secret.call(this._handle, _arg, 1)
  }

  fun setSecretCharacter(character: String) {
    val _arg = Variant.new(character)
    __method_bind.set_secret_character.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.set_text.call(this._handle, _arg, 1)
  }

  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    companion object {
      fun from(value: Int): Align {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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

    companion object {
      fun from(value: Int): MenuItems {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
      requireNotNull(fnPtr) { "No instance found for LineEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LineEdit(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): LineEdit = LineEdit(ptr)
    /**
     * Container for method_bind pointers for LineEdit
     */
    private object __method_bind {
      val append_at_cursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "append_at_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method append_at_cursor" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val cursor_get_blink_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_get_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
        }
      val cursor_get_blink_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_get_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
        }
      val cursor_set_blink_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_set_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
        }
      val cursor_set_blink_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_set_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
        }
      val deselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "deselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect" }
        }
      val get_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val get_cursor_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_cursor_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cursor_position" }
        }
      val get_expand_to_text_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_expand_to_text_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expand_to_text_length" }
        }
      val get_max_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_length" }
        }
      val get_menu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_menu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_menu" }
        }
      val get_placeholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_placeholder" }
        }
      val get_placeholder_alpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_placeholder_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_placeholder_alpha" }
        }
      val get_secret_character: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_secret_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_secret_character" }
        }
      val get_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val is_clear_button_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_clear_button_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clear_button_enabled" }
        }
      val is_context_menu_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
        }
      val is_editable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val is_secret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_secret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_secret" }
        }
      val menu_option: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "menu_option".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method menu_option" }
        }
      val select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val select_all: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "select_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_all" }
        }
      val set_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val set_clear_button_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_clear_button_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clear_button_enabled" }
        }
      val set_context_menu_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
        }
      val set_cursor_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_cursor_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cursor_position" }
        }
      val set_editable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val set_expand_to_text_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_expand_to_text_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_to_text_length" }
        }
      val set_max_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_length" }
        }
      val set_placeholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_placeholder" }
        }
      val set_placeholder_alpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_placeholder_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_placeholder_alpha" }
        }
      val set_secret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_secret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_secret" }
        }
      val set_secret_character: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_secret_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_secret_character" }
        }
      val set_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }}
  }
}
