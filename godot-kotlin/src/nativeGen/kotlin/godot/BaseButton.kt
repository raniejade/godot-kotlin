// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class BaseButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _pressed() {
    TODO()
  }

  open fun _toggled(buttonPressed: Boolean) {
    TODO()
  }

  fun getActionMode(): ActionMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getActionMode.call(self._handle, emptyList(), _retPtr)
      BaseButton.ActionMode.from(_ret.value)
    }
  }

  fun getButtonGroup(): ButtonGroup {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ButtonGroup
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getButtonGroup.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ButtonGroup>(_tmp.value!!)
      _ret
    }
  }

  fun getButtonMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getButtonMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDrawMode(): DrawMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrawMode.call(self._handle, emptyList(), _retPtr)
      BaseButton.DrawMode.from(_ret.value)
    }
  }

  fun getEnabledFocusMode(): Control.FocusMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnabledFocusMode.call(self._handle, emptyList(), _retPtr)
      Control.FocusMode.from(_ret.value)
    }
  }

  fun getShortcut(): ShortCut {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ShortCut
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShortcut.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ShortCut>(_tmp.value!!)
      _ret
    }
  }

  fun isDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHovered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHovered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isKeepPressedOutside(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isKeepPressedOutside.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPressed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPressed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShortcutInTooltipEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShortcutInTooltipEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isToggleMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isToggleMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setActionMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActionMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setButtonGroup(buttonGroup: ButtonGroup) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setButtonGroup.call(self._handle, listOf(buttonGroup), null)
    }
  }

  fun setButtonMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setButtonMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setDisabled(disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisabled.call(self._handle, listOf(disabled), null)
    }
  }

  fun setEnabledFocusMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnabledFocusMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setKeepPressedOutside(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeepPressedOutside.call(self._handle, listOf(enabled), null)
    }
  }

  fun setPressed(pressed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressed.call(self._handle, listOf(pressed), null)
    }
  }

  fun setShortcut(shortcut: ShortCut) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShortcut.call(self._handle, listOf(shortcut), null)
    }
  }

  fun setShortcutInTooltip(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShortcutInTooltip.call(self._handle, listOf(enabled), null)
    }
  }

  fun setToggleMode(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setToggleMode.call(self._handle, listOf(enabled), null)
    }
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
        }
      val getButtonGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_button_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_group" }
        }
      val getButtonMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
        }
      val getDrawMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_draw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_mode" }
        }
      val getEnabledFocusMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_enabled_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_enabled_focus_mode" }
        }
      val getShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "get_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isHovered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_hovered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hovered" }
        }
      val isKeepPressedOutside: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_keep_pressed_outside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keep_pressed_outside" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val isShortcutInTooltipEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_shortcut_in_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut_in_tooltip_enabled" }
        }
      val isToggleMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "is_toggle_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_toggle_mode" }
        }
      val setActionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
        }
      val setButtonGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_button_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_group" }
        }
      val setButtonMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setEnabledFocusMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_enabled_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled_focus_mode" }
        }
      val setKeepPressedOutside: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_keep_pressed_outside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_pressed_outside" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }
      val setShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
        }
      val setShortcutInTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_shortcut_in_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut_in_tooltip" }
        }
      val setToggleMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
            "set_toggle_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_toggle_mode" }
        }}
  }
}
