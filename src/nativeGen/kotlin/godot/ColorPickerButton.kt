// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ColorPickerButton(
  _handle: COpaquePointer
) : Button(_handle) {
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
    __method_bind.setEditAlpha.call(this._handle, _arg, 1)
  }

  fun setPickColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setPickColor.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ColorPickerButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPickerButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorPickerButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorPickerButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ColorPickerButton = ColorPickerButton(ptr)
    /**
     * Container for method_bind pointers for ColorPickerButton
     */
    private object __method_bind {
      val getPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "getPickColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPickColor" }
        }
      val getPicker: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "getPicker".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPicker" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "getPopup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPopup" }
        }
      val isEditingAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "isEditingAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditingAlpha" }
        }
      val setEditAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "setEditAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditAlpha" }
        }
      val setPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
            "setPickColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPickColor" }
        }}
  }
}
