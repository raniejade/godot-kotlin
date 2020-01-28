// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BaseButton(
  _handle: COpaquePointer
) : Control(_handle) {
  var actionMode: Int
    get() {
       return BaseButton.ActionMode.from(getActionMode()) 
    }
    set(value) {
      setActionMode(BaseButton.ActionMode.from(value))
    }

  var buttonMask: Int
    get() {
       return getButtonMask() 
    }
    set(value) {
      setButtonMask(value)
    }

  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var enabledFocusMode: Int
    get() {
       return Control.FocusMode.from(getEnabledFocusMode()) 
    }
    set(value) {
      setEnabledFocusMode(Control.FocusMode.from(value))
    }

  var group: ButtonGroup
    get() {
       return getButtonGroup() 
    }
    set(value) {
      setButtonGroup(value)
    }

  var keepPressedOutside: Boolean
    get() {
       return isKeepPressedOutside() 
    }
    set(value) {
      setKeepPressedOutside(value)
    }

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  var shortcut: ShortCut
    get() {
       return getShortcut() 
    }
    set(value) {
      setShortcut(value)
    }

  var shortcutInTooltip: Boolean
    get() {
       return isShortcutInTooltipEnabled() 
    }
    set(value) {
      setShortcutInTooltip(value)
    }

  var toggleMode: Boolean
    get() {
       return isToggleMode() 
    }
    set(value) {
      setToggleMode(value)
    }

  fun getActionMode(): ActionMode {
    val _ret = __method_bind.getActionMode.call(this._handle)
    return BaseButton.ActionMode.from(_ret.asInt())
  }

  fun getButtonGroup(): ButtonGroup {
    val _ret = __method_bind.getButtonGroup.call(this._handle)
    return _ret.asObject(::ButtonGroup)!!
  }

  fun getButtonMask(): Int {
    val _ret = __method_bind.getButtonMask.call(this._handle)
    return _ret.asInt()
  }

  fun getDrawMode(): DrawMode {
    val _ret = __method_bind.getDrawMode.call(this._handle)
    return BaseButton.DrawMode.from(_ret.asInt())
  }

  fun getEnabledFocusMode(): Control.FocusMode {
    val _ret = __method_bind.getEnabledFocusMode.call(this._handle)
    return Control.FocusMode.from(_ret.asInt())
  }

  fun getShortcut(): ShortCut {
    val _ret = __method_bind.getShortcut.call(this._handle)
    return _ret.asObject(::ShortCut)!!
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.isDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHovered(): Boolean {
    val _ret = __method_bind.isHovered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isKeepPressedOutside(): Boolean {
    val _ret = __method_bind.isKeepPressedOutside.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.isPressed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShortcutInTooltipEnabled(): Boolean {
    val _ret = __method_bind.isShortcutInTooltipEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isToggleMode(): Boolean {
    val _ret = __method_bind.isToggleMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun setActionMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setActionMode.call(this._handle, _arg, 1)
  }

  fun setButtonGroup(buttonGroup: ButtonGroup) {
    val _arg = Variant.new(buttonGroup)
    __method_bind.setButtonGroup.call(this._handle, _arg, 1)
  }

  fun setButtonMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setButtonMask.call(this._handle, _arg, 1)
  }

  fun setDisabled(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisabled.call(this._handle, _arg, 1)
  }

  fun setEnabledFocusMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setEnabledFocusMode.call(this._handle, _arg, 1)
  }

  fun setKeepPressedOutside(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setKeepPressedOutside.call(this._handle, _arg, 1)
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, _arg, 1)
  }

  fun setShortcut(shortcut: ShortCut) {
    val _arg = Variant.new(shortcut)
    __method_bind.setShortcut.call(this._handle, _arg, 1)
  }

  fun setShortcutInTooltip(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setShortcutInTooltip.call(this._handle, _arg, 1)
  }

  fun setToggleMode(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setToggleMode.call(this._handle, _arg, 1)
  }

  enum class ActionMode(
    val value: Int
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

    ACTION_MODE_BUTTON_RELEASE(1);

    companion object {
      fun from(value: Int): ActionMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DrawMode(
    val value: Int
  ) {
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

    DRAW_HOVER_PRESSED(4);

    companion object {
      fun from(value: Int): DrawMode {
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
    val ACTION_MODE_BUTTON_PRESS: Int = 0

    val ACTION_MODE_BUTTON_RELEASE: Int = 1

    val DRAW_DISABLED: Int = 3

    val DRAW_HOVER: Int = 2

    val DRAW_HOVER_PRESSED: Int = 4

    val DRAW_NORMAL: Int = 0

    val DRAW_PRESSED: Int = 1

    /**
     * Container for method_bind pointers for BaseButton
     */
    private object __method_bind {
      val getActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getActionMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getActionMode" }
        }
      val getButtonGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getButtonGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButtonGroup" }
        }
      val getButtonMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getButtonMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButtonMask" }
        }
      val getDrawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getDrawMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawMode" }
        }
      val getEnabledFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getEnabledFocusMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnabledFocusMode" }
        }
      val getShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "getShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShortcut" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDisabled" }
        }
      val isHovered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isHovered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHovered" }
        }
      val isKeepPressedOutside: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isKeepPressedOutside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isKeepPressedOutside" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPressed" }
        }
      val isShortcutInTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isShortcutInTooltipEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShortcutInTooltipEnabled" }
        }
      val isToggleMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "isToggleMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isToggleMode" }
        }
      val setActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setActionMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setActionMode" }
        }
      val setButtonGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setButtonGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setButtonGroup" }
        }
      val setButtonMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setButtonMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setButtonMask" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisabled" }
        }
      val setEnabledFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setEnabledFocusMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnabledFocusMode" }
        }
      val setKeepPressedOutside: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setKeepPressedOutside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setKeepPressedOutside" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressed" }
        }
      val setShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShortcut" }
        }
      val setShortcutInTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setShortcutInTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShortcutInTooltip" }
        }
      val setToggleMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "setToggleMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setToggleMode" }
        }}
  }
}
