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
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LineEdit(
  _handle: COpaquePointer
) : Control(_handle) {
  var align: Align
    get() {
       return getAlign() 
    }
    set(value) {
      setAlign(value.value)
    }

  var caretBlink: Boolean
    get() {
       return cursorGetBlinkEnabled() 
    }
    set(value) {
      cursorSetBlinkEnabled(value)
    }

  var caretBlinkSpeed: Float
    get() {
       return cursorGetBlinkSpeed() 
    }
    set(value) {
      cursorSetBlinkSpeed(value)
    }

  var caretPosition: Int
    get() {
       return getCursorPosition() 
    }
    set(value) {
      setCursorPosition(value)
    }

  var clearButtonEnabled: Boolean
    get() {
       return isClearButtonEnabled() 
    }
    set(value) {
      setClearButtonEnabled(value)
    }

  var contextMenuEnabled: Boolean
    get() {
       return isContextMenuEnabled() 
    }
    set(value) {
      setContextMenuEnabled(value)
    }

  var editable: Boolean
    get() {
       return isEditable() 
    }
    set(value) {
      setEditable(value)
    }

  var expandToTextLength: Boolean
    get() {
       return getExpandToTextLength() 
    }
    set(value) {
      setExpandToTextLength(value)
    }

  var maxLength: Int
    get() {
       return getMaxLength() 
    }
    set(value) {
      setMaxLength(value)
    }

  var placeholderAlpha: Float
    get() {
       return getPlaceholderAlpha() 
    }
    set(value) {
      setPlaceholderAlpha(value)
    }

  var placeholderText: String
    get() {
       return getPlaceholder() 
    }
    set(value) {
      setPlaceholder(value)
    }

  var rightIcon: Texture
    get() {
       return getRightIcon() 
    }
    set(value) {
      setRightIcon(value)
    }

  var secret: Boolean
    get() {
       return isSecret() 
    }
    set(value) {
      setSecret(value)
    }

  var secretCharacter: String
    get() {
       return getSecretCharacter() 
    }
    set(value) {
      setSecretCharacter(value)
    }

  var selectingEnabled: Boolean
    get() {
       return isSelectingEnabled() 
    }
    set(value) {
      setSelectingEnabled(value)
    }

  var shortcutKeysEnabled: Boolean
    get() {
       return isShortcutKeysEnabled() 
    }
    set(value) {
      setShortcutKeysEnabled(value)
    }

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  /**
   * LineEdit::text_change_rejected signal
   */
  val signalTextChangeRejected: Signal0 = Signal0("text_change_rejected")

  /**
   * LineEdit::text_changed signal
   */
  val signalTextChanged: Signal1<String> = Signal1("text_changed")

  /**
   * LineEdit::text_entered signal
   */
  val signalTextEntered: Signal1<String> = Signal1("text_entered")

  fun appendAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.appendAtCursor.call(this._handle, listOf(_arg))
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val _ret = __method_bind.cursorGetBlinkEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun cursorGetBlinkSpeed(): Float {
    val _ret = __method_bind.cursorGetBlinkSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun cursorSetBlinkEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.cursorSetBlinkEnabled.call(this._handle, listOf(_arg))
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursorSetBlinkSpeed.call(this._handle, listOf(_arg))
  }

  fun deselect() {
    __method_bind.deselect.call(this._handle)
  }

  fun getAlign(): Align {
    val _ret = __method_bind.getAlign.call(this._handle)
    return LineEdit.Align.from(_ret.asInt())
  }

  fun getCursorPosition(): Int {
    val _ret = __method_bind.getCursorPosition.call(this._handle)
    return _ret.asInt()
  }

  fun getExpandToTextLength(): Boolean {
    val _ret = __method_bind.getExpandToTextLength.call(this._handle)
    return _ret.asBoolean()
  }

  fun getMaxLength(): Int {
    val _ret = __method_bind.getMaxLength.call(this._handle)
    return _ret.asInt()
  }

  fun getMenu(): PopupMenu {
    val _ret = __method_bind.getMenu.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun getPlaceholder(): String {
    val _ret = __method_bind.getPlaceholder.call(this._handle)
    return _ret.asString()
  }

  fun getPlaceholderAlpha(): Float {
    val _ret = __method_bind.getPlaceholderAlpha.call(this._handle)
    return _ret.asFloat()
  }

  fun getRightIcon(): Texture {
    val _ret = __method_bind.getRightIcon.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getSecretCharacter(): String {
    val _ret = __method_bind.getSecretCharacter.call(this._handle)
    return _ret.asString()
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun isClearButtonEnabled(): Boolean {
    val _ret = __method_bind.isClearButtonEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isContextMenuEnabled(): Boolean {
    val _ret = __method_bind.isContextMenuEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEditable(): Boolean {
    val _ret = __method_bind.isEditable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSecret(): Boolean {
    val _ret = __method_bind.isSecret.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectingEnabled(): Boolean {
    val _ret = __method_bind.isSelectingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShortcutKeysEnabled(): Boolean {
    val _ret = __method_bind.isShortcutKeysEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun menuOption(option: Int) {
    val _arg = Variant.new(option)
    __method_bind.menuOption.call(this._handle, listOf(_arg))
  }

  fun select(from: Int = 0, to: Int = -1) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    __method_bind.select.call(this._handle, _args)
  }

  fun selectAll() {
    __method_bind.selectAll.call(this._handle)
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setAlign.call(this._handle, listOf(_arg))
  }

  fun setClearButtonEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClearButtonEnabled.call(this._handle, listOf(_arg))
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setContextMenuEnabled.call(this._handle, listOf(_arg))
  }

  fun setCursorPosition(position: Int) {
    val _arg = Variant.new(position)
    __method_bind.setCursorPosition.call(this._handle, listOf(_arg))
  }

  fun setEditable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEditable.call(this._handle, listOf(_arg))
  }

  fun setExpandToTextLength(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setExpandToTextLength.call(this._handle, listOf(_arg))
  }

  fun setMaxLength(chars: Int) {
    val _arg = Variant.new(chars)
    __method_bind.setMaxLength.call(this._handle, listOf(_arg))
  }

  fun setPlaceholder(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setPlaceholder.call(this._handle, listOf(_arg))
  }

  fun setPlaceholderAlpha(alpha: Float) {
    val _arg = Variant.new(alpha)
    __method_bind.setPlaceholderAlpha.call(this._handle, listOf(_arg))
  }

  fun setRightIcon(icon: Texture) {
    val _arg = Variant.new(icon)
    __method_bind.setRightIcon.call(this._handle, listOf(_arg))
  }

  fun setSecret(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSecret.call(this._handle, listOf(_arg))
  }

  fun setSecretCharacter(character: String) {
    val _arg = Variant.new(character)
    __method_bind.setSecretCharacter.call(this._handle, listOf(_arg))
  }

  fun setSelectingEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSelectingEnabled.call(this._handle, listOf(_arg))
  }

  fun setShortcutKeysEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShortcutKeysEnabled.call(this._handle, listOf(_arg))
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  enum class Align(
    val value: Int
  ) {
    LEFT(0),

    CENTER(1),

    RIGHT(2),

    FILL(3);

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
    CUT(0),

    COPY(1),

    PASTE(2),

    CLEAR(3),

    SELECT_ALL(4),

    UNDO(5),

    REDO(6),

    MAX(7);

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
      val appendAtCursor: CPointer<godot_method_bind>
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
      val cursorGetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_get_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
        }
      val cursorGetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_get_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
        }
      val cursorSetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursor_set_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
        }
      val cursorSetBlinkSpeed: CPointer<godot_method_bind>
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
      val getAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val getCursorPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_cursor_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cursor_position" }
        }
      val getExpandToTextLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_expand_to_text_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expand_to_text_length" }
        }
      val getMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_length" }
        }
      val getMenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_menu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_menu" }
        }
      val getPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_placeholder" }
        }
      val getPlaceholderAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_placeholder_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_placeholder_alpha" }
        }
      val getRightIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_right_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_right_icon" }
        }
      val getSecretCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_secret_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_secret_character" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val isClearButtonEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_clear_button_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clear_button_enabled" }
        }
      val isContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val isSecret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_secret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_secret" }
        }
      val isSelectingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selecting_enabled" }
        }
      val isShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "is_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut_keys_enabled" }
        }
      val menuOption: CPointer<godot_method_bind>
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
      val selectAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "select_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_all" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val setClearButtonEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_clear_button_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clear_button_enabled" }
        }
      val setContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
        }
      val setCursorPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_cursor_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cursor_position" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setExpandToTextLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_expand_to_text_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_to_text_length" }
        }
      val setMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_max_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_length" }
        }
      val setPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_placeholder" }
        }
      val setPlaceholderAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_placeholder_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_placeholder_alpha" }
        }
      val setRightIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_right_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_icon" }
        }
      val setSecret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_secret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_secret" }
        }
      val setSecretCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_secret_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_secret_character" }
        }
      val setSelectingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selecting_enabled" }
        }
      val setShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut_keys_enabled" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }}
  }
}
