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

open class InputEventJoypadButton(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  var buttonIndex: Int
    get() {
       return getButtonIndex() 
    }
    set(value) {
      setButtonIndex(value)
    }

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  var pressure: Float
    get() {
       return getPressure() 
    }
    set(value) {
      setPressure(value)
    }

  fun getButtonIndex(): Int {
    val _ret = __method_bind.getButtonIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getPressure(): Float {
    val _ret = __method_bind.getPressure.call(this._handle)
    return _ret.asFloat()
  }

  fun setButtonIndex(buttonIndex: Int) {
    val _arg = Variant.new(buttonIndex)
    __method_bind.setButtonIndex.call(this._handle, _arg, 1)
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, _arg, 1)
  }

  fun setPressure(pressure: Float) {
    val _arg = Variant.new(pressure)
    __method_bind.setPressure.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventJoypadButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventJoypadButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventJoypadButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventJoypadButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventJoypadButton = InputEventJoypadButton(ptr)
    /**
     * Container for method_bind pointers for InputEventJoypadButton
     */
    private object __method_bind {
      val getButtonIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
            "getButtonIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButtonIndex" }
        }
      val getPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
            "getPressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPressure" }
        }
      val setButtonIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
            "setButtonIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setButtonIndex" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
            "setPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressed" }
        }
      val setPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
            "setPressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressure" }
        }}
  }
}
