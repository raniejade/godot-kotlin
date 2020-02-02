// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.reflect.KCallable
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
  var actionMode: ActionMode
    get() {
       return getActionMode() 
    }
    set(value) {
      setActionMode(value.value)
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

  var enabledFocusMode: Control.FocusMode
    get() {
       return getEnabledFocusMode() 
    }
    set(value) {
      setEnabledFocusMode(value.value)
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

  /**
   * BaseButton::button_down signal
   */
  val signalButtonDown: Signal0 = Signal0("button_down")

  /**
   * BaseButton::button_up signal
   */
  val signalButtonUp: Signal0 = Signal0("button_up")

  /**
   * BaseButton::pressed signal
   */
  val signalPressed: Signal0 = Signal0("pressed")

  /**
   * BaseButton::toggled signal
   */
  val signalToggled: Signal1<Boolean> = Signal1("toggled")

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
    __method_bind.setActionMode.call(this._handle, listOf(_arg))
  }

  fun setButtonGroup(buttonGroup: ButtonGroup) {
    val _arg = Variant.new(buttonGroup)
    __method_bind.setButtonGroup.call(this._handle, listOf(_arg))
  }

  fun setButtonMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setButtonMask.call(this._handle, listOf(_arg))
  }

  fun setDisabled(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisabled.call(this._handle, listOf(_arg))
  }

  fun setEnabledFocusMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setEnabledFocusMode.call(this._handle, listOf(_arg))
  }

  fun setKeepPressedOutside(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setKeepPressedOutside.call(this._handle, listOf(_arg))
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, listOf(_arg))
  }

  fun setShortcut(shortcut: ShortCut) {
    val _arg = Variant.new(shortcut)
    __method_bind.setShortcut.call(this._handle, listOf(_arg))
  }

  fun setShortcutInTooltip(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setShortcutInTooltip.call(this._handle, listOf(_arg))
  }

  fun setToggleMode(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setToggleMode.call(this._handle, listOf(_arg))
  }

  enum class ActionMode(
    val value: Int
  ) {
    BUTTON_PRESS(0),

    BUTTON_RELEASE(1);

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
    NORMAL(0),

    PRESSED(1),

    HOVER(2),

    DISABLED(3),

    HOVER_PRESSED(4);

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
    /**
     * Container for method_bind pointers for BaseButton
     */
    private object __method_bind {
      val getActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
        }
      val getButtonGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_button_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_group" }
        }
      val getButtonMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
        }
      val getDrawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_draw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_mode" }
        }
      val getEnabledFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_enabled_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_enabled_focus_mode" }
        }
      val getShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isHovered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_hovered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hovered" }
        }
      val isKeepPressedOutside: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_keep_pressed_outside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keep_pressed_outside" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val isShortcutInTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_shortcut_in_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut_in_tooltip_enabled" }
        }
      val isToggleMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_toggle_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_toggle_mode" }
        }
      val setActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
        }
      val setButtonGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_button_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_group" }
        }
      val setButtonMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setEnabledFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_enabled_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled_focus_mode" }
        }
      val setKeepPressedOutside: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_keep_pressed_outside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_pressed_outside" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }
      val setShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
        }
      val setShortcutInTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_shortcut_in_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut_in_tooltip" }
        }
      val setToggleMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_toggle_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_toggle_mode" }
        }}
  }
}
