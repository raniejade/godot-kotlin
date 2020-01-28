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

open class LineEdit(
  _handle: COpaquePointer
) : Control(_handle) {
  var align: Int
    get() {
       return LineEdit.Align.from(getAlign()) 
    }
    set(value) {
      setAlign(LineEdit.Align.from(value))
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

  var focusMode: Int
    get() {
       return Control.FocusMode.from(getFocusMode()) 
    }
    set(value) {
      setFocusMode(Control.FocusMode.from(value))
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

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  fun appendAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.appendAtCursor.call(this._handle, _arg, 1)
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
    __method_bind.cursorSetBlinkEnabled.call(this._handle, _arg, 1)
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursorSetBlinkSpeed.call(this._handle, _arg, 1)
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

  fun menuOption(option: Int) {
    val _arg = Variant.new(option)
    __method_bind.menuOption.call(this._handle, _arg, 1)
  }

  fun select(from: Int, to: Int) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    __method_bind.select.call(this._handle, _args.toVariant(), 2)
  }

  fun selectAll() {
    __method_bind.selectAll.call(this._handle)
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setAlign.call(this._handle, _arg, 1)
  }

  fun setClearButtonEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClearButtonEnabled.call(this._handle, _arg, 1)
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setContextMenuEnabled.call(this._handle, _arg, 1)
  }

  fun setCursorPosition(position: Int) {
    val _arg = Variant.new(position)
    __method_bind.setCursorPosition.call(this._handle, _arg, 1)
  }

  fun setEditable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEditable.call(this._handle, _arg, 1)
  }

  fun setExpandToTextLength(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setExpandToTextLength.call(this._handle, _arg, 1)
  }

  fun setMaxLength(chars: Int) {
    val _arg = Variant.new(chars)
    __method_bind.setMaxLength.call(this._handle, _arg, 1)
  }

  fun setPlaceholder(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setPlaceholder.call(this._handle, _arg, 1)
  }

  fun setPlaceholderAlpha(alpha: Float) {
    val _arg = Variant.new(alpha)
    __method_bind.setPlaceholderAlpha.call(this._handle, _arg, 1)
  }

  fun setSecret(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSecret.call(this._handle, _arg, 1)
  }

  fun setSecretCharacter(character: String) {
    val _arg = Variant.new(character)
    __method_bind.setSecretCharacter.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, _arg, 1)
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
      val appendAtCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "appendAtCursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method appendAtCursor" }
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
            "cursorGetBlinkEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetBlinkEnabled" }
        }
      val cursorGetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursorGetBlinkSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetBlinkSpeed" }
        }
      val cursorSetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursorSetBlinkEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetBlinkEnabled" }
        }
      val cursorSetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "cursorSetBlinkSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetBlinkSpeed" }
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
            "getAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlign" }
        }
      val getCursorPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getCursorPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCursorPosition" }
        }
      val getExpandToTextLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getExpandToTextLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExpandToTextLength" }
        }
      val getMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getMaxLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxLength" }
        }
      val getMenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getMenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMenu" }
        }
      val getPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getPlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlaceholder" }
        }
      val getPlaceholderAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getPlaceholderAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlaceholderAlpha" }
        }
      val getSecretCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getSecretCharacter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSecretCharacter" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val isClearButtonEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "isClearButtonEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClearButtonEnabled" }
        }
      val isContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "isContextMenuEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isContextMenuEnabled" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "isEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditable" }
        }
      val isSecret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "isSecret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSecret" }
        }
      val menuOption: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "menuOption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method menuOption" }
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
            "selectAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method selectAll" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlign" }
        }
      val setClearButtonEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setClearButtonEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClearButtonEnabled" }
        }
      val setContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setContextMenuEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setContextMenuEnabled" }
        }
      val setCursorPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setCursorPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCursorPosition" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditable" }
        }
      val setExpandToTextLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setExpandToTextLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandToTextLength" }
        }
      val setMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setMaxLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxLength" }
        }
      val setPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setPlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPlaceholder" }
        }
      val setPlaceholderAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setPlaceholderAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPlaceholderAlpha" }
        }
      val setSecret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setSecret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSecret" }
        }
      val setSecretCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setSecretCharacter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSecretCharacter" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineEdit".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }}
  }
}
