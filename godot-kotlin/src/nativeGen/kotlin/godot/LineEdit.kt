// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class LineEdit(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _editor_settings_changed() {
    TODO()
  }

  open fun _text_changed() {
    TODO()
  }

  open fun _toggle_draw_caret() {
    TODO()
  }

  fun appendAtCursor(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.appendAtCursor.call(self._handle, listOf(text), null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetBlinkEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun cursorGetBlinkSpeed(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetBlinkSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun cursorSetBlinkEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cursorSetBlinkEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cursorSetBlinkSpeed.call(self._handle, listOf(blinkSpeed), null)
    }
  }

  fun deselect() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.deselect.call(self._handle, emptyList(), null)
    }
  }

  fun getAlign(): Align {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlign.call(self._handle, emptyList(), _retPtr)
      LineEdit.Align.from(_ret.value)
    }
  }

  fun getCursorPosition(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCursorPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getExpandToTextLength(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExpandToTextLength.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxLength(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxLength.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMenu(): PopupMenu {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PopupMenu
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMenu.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PopupMenu>(_tmp.value!!)
      _ret
    }
  }

  fun getPlaceholder(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPlaceholder.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPlaceholderAlpha(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPlaceholderAlpha.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRightIcon(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getRightIcon.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getSecretCharacter(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSecretCharacter.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isClearButtonEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClearButtonEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isContextMenuEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isContextMenuEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEditable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSecret(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSecret.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelectingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelectingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShortcutKeysEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShortcutKeysEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun menuOption(option: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.menuOption.call(self._handle, listOf(option), null)
    }
  }

  fun select(from: Int = 0, to: Int = -1) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.select.call(self._handle, _args, null)
    }
  }

  fun selectAll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.selectAll.call(self._handle, emptyList(), null)
    }
  }

  fun setAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlign.call(self._handle, listOf(align), null)
    }
  }

  fun setClearButtonEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClearButtonEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setContextMenuEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setCursorPosition(position: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCursorPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setEditable(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditable.call(self._handle, listOf(enabled), null)
    }
  }

  fun setExpandToTextLength(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpandToTextLength.call(self._handle, listOf(enabled), null)
    }
  }

  fun setMaxLength(chars: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxLength.call(self._handle, listOf(chars), null)
    }
  }

  fun setPlaceholder(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPlaceholder.call(self._handle, listOf(text), null)
    }
  }

  fun setPlaceholderAlpha(alpha: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPlaceholderAlpha.call(self._handle, listOf(alpha), null)
    }
  }

  fun setRightIcon(icon: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRightIcon.call(self._handle, listOf(icon), null)
    }
  }

  fun setSecret(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSecret.call(self._handle, listOf(enabled), null)
    }
  }

  fun setSecretCharacter(character: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSecretCharacter.call(self._handle, listOf(character), null)
    }
  }

  fun setSelectingEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectingEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setShortcutKeysEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShortcutKeysEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LineEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LineEdit
     */
    private object __method_bind {
      val appendAtCursor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "append_at_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method append_at_cursor" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val cursorGetBlinkEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_get_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
            }
          }

      val cursorGetBlinkSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_get_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
            }
          }

      val cursorSetBlinkEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_set_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
            }
          }

      val cursorSetBlinkSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "cursor_set_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
            }
          }

      val deselect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "deselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect" }
            }
          }

      val getAlign: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_align" }
            }
          }

      val getCursorPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_cursor_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cursor_position" }
            }
          }

      val getExpandToTextLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_expand_to_text_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_to_text_length" }
            }
          }

      val getMaxLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_length" }
            }
          }

      val getMenu: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_menu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_menu" }
            }
          }

      val getPlaceholder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_placeholder" }
            }
          }

      val getPlaceholderAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_placeholder_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_placeholder_alpha" }
            }
          }

      val getRightIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_right_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_right_icon" }
            }
          }

      val getSecretCharacter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_secret_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_secret_character" }
            }
          }

      val getText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val isClearButtonEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_clear_button_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clear_button_enabled" }
            }
          }

      val isContextMenuEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
            }
          }

      val isEditable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val isSecret: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_secret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_secret" }
            }
          }

      val isSelectingEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_selecting_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selecting_enabled" }
            }
          }

      val isShortcutKeysEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "is_shortcut_keys_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shortcut_keys_enabled" }
            }
          }

      val menuOption: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "menu_option".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method menu_option" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val selectAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "select_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select_all" }
            }
          }

      val setAlign: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_align" }
            }
          }

      val setClearButtonEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_clear_button_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clear_button_enabled" }
            }
          }

      val setContextMenuEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
            }
          }

      val setCursorPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_cursor_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cursor_position" }
            }
          }

      val setEditable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val setExpandToTextLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_expand_to_text_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_to_text_length" }
            }
          }

      val setMaxLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_length" }
            }
          }

      val setPlaceholder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_placeholder" }
            }
          }

      val setPlaceholderAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_placeholder_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_placeholder_alpha" }
            }
          }

      val setRightIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_right_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_right_icon" }
            }
          }

      val setSecret: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_secret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_secret" }
            }
          }

      val setSecretCharacter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_secret_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_secret_character" }
            }
          }

      val setSelectingEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_selecting_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selecting_enabled" }
            }
          }

      val setShortcutKeysEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_shortcut_keys_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut_keys_enabled" }
            }
          }

      val setText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }
    }
  }
}
