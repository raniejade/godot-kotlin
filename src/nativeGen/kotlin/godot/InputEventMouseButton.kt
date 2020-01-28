// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouseButton(
  _handle: COpaquePointer
) : InputEventMouse(_handle) {
  fun getButtonIndex(): Int {
    val _ret = __method_bind.get_button_index.call(this._handle)
    return _ret.asInt()
  }

  fun getFactor(): Float {
    val _ret = __method_bind.get_factor.call(this._handle)
    return _ret.asFloat()
  }

  fun isDoubleclick(): Boolean {
    val _ret = __method_bind.is_doubleclick.call(this._handle)
    return _ret.asBoolean()
  }

  fun setButtonIndex(buttonIndex: Int) {
    val _arg = Variant.new(buttonIndex)
    __method_bind.set_button_index.call(this._handle, _arg, 1)
  }

  fun setDoubleclick(doubleclick: Boolean) {
    val _arg = Variant.new(doubleclick)
    __method_bind.set_doubleclick.call(this._handle, _arg, 1)
  }

  fun setFactor(factor: Float) {
    val _arg = Variant.new(factor)
    __method_bind.set_factor.call(this._handle, _arg, 1)
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.set_pressed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventMouseButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMouseButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMouseButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventMouseButton = InputEventMouseButton(ptr)
    /**
     * Container for method_bind pointers for InputEventMouseButton
     */
    private object __method_bind {
      val get_button_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "get_button_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_index" }
        }
      val get_factor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "get_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_factor" }
        }
      val is_doubleclick: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "is_doubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_doubleclick" }
        }
      val set_button_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_button_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_index" }
        }
      val set_doubleclick: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_doubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doubleclick" }
        }
      val set_factor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_factor" }
        }
      val set_pressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }}
  }
}
