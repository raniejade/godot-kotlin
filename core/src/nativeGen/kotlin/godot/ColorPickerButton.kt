// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class ColorPickerButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Button(null) {
  var color: Color
    get() {
       return getPickColor() 
    }
    set(value) {
      setPickColor(value)
    }

  var editAlpha: Boolean
    get() {
       return isEditingAlpha() 
    }
    set(value) {
      setEditAlpha(value)
    }

  /**
   * ColorPickerButton::color_changed signal
   */
  val signalColorChanged: Signal1<Color> = Signal1("color_changed")

  /**
   * ColorPickerButton::picker_created signal
   */
  val signalPickerCreated: Signal0 = Signal0("picker_created")

  /**
   * ColorPickerButton::popup_closed signal
   */
  val signalPopupClosed: Signal0 = Signal0("popup_closed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  fun getPickColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getPickColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPicker(): ColorPicker {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ColorPicker
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPicker.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ColorPicker>(_tmp.value!!)
      _ret
    }
  }

  fun getPopup(): PopupPanel {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PopupPanel
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPopup.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PopupPanel>(_tmp.value!!)
      _ret
    }
  }

  fun isEditingAlpha(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditingAlpha.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEditAlpha(show: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditAlpha.call(self._handle, listOf(show), null)
    }
  }

  fun setPickColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPickColor.call(self._handle, listOf(color), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPickerButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorPickerButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ColorPickerButton
     */
    private object __method_bind {
      val getPickColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
        }
      val getPicker: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_picker".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_picker" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val isEditingAlpha: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "is_editing_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
        }
      val setEditAlpha: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "set_edit_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
        }
      val setPickColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "set_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
        }}
  }
}
