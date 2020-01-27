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

open class ColorPickerButton internal constructor(
  _handle: COpaquePointer
) : Button(_handle) {
  fun getPickColor(): Color {
    val _ret = __method_bind.get_pick_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getPicker(): ColorPicker {
    val _ret = __method_bind.get_picker.call(this.toVariant())
    return _ret.asObject(::ColorPicker)!!
  }

  fun getPopup(): PopupPanel {
    val _ret = __method_bind.get_popup.call(this.toVariant())
    return _ret.asObject(::PopupPanel)!!
  }

  fun isEditingAlpha(): Boolean {
    val _ret = __method_bind.is_editing_alpha.call(this.toVariant())
    return _ret.asBool()
  }

  fun setEditAlpha(show: Boolean) {
    val _args = VariantArray.new()
    _args.append(show)
    __method_bind.set_edit_alpha.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPickColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    __method_bind.set_pick_color.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): ColorPickerButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPickerButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ColorPickerButton" }
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
      val get_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
            }
          }

      val get_picker: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_picker".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_picker" }
            }
          }

      val get_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val is_editing_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "is_editing_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
            }
          }

      val set_edit_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "set_edit_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
            }
          }

      val set_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "set_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
            }
          }
    }
  }
}
