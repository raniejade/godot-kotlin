// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
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
    val _ret = __method_bind.getPickColor.call(this._handle)
    return _ret.asColor()
  }

  fun getPicker(): ColorPicker {
    val _ret = __method_bind.getPicker.call(this._handle)
    return _ret.asObject(::ColorPicker)!!
  }

  fun getPopup(): PopupPanel {
    val _ret = __method_bind.getPopup.call(this._handle)
    return _ret.asObject(::PopupPanel)!!
  }

  fun isEditingAlpha(): Boolean {
    val _ret = __method_bind.isEditingAlpha.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEditAlpha(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setEditAlpha.call(this._handle, listOf(_arg))
  }

  fun setPickColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setPickColor.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
        }
      val getPicker: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_picker".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_picker" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val isEditingAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "is_editing_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
        }
      val setEditAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "set_edit_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
        }
      val setPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "set_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
        }}
  }
}
