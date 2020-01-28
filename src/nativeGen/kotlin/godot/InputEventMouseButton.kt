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
  var buttonIndex: Int
    get() {
       return getButtonIndex() 
    }
    set(value) {
      setButtonIndex(value)
    }

  var doubleclick: Boolean
    get() {
       return isDoubleclick() 
    }
    set(value) {
      setDoubleclick(value)
    }

  var factor: Float
    get() {
       return getFactor() 
    }
    set(value) {
      setFactor(value)
    }

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  fun getButtonIndex(): Int {
    val _ret = __method_bind.getButtonIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getFactor(): Float {
    val _ret = __method_bind.getFactor.call(this._handle)
    return _ret.asFloat()
  }

  fun isDoubleclick(): Boolean {
    val _ret = __method_bind.isDoubleclick.call(this._handle)
    return _ret.asBoolean()
  }

  fun setButtonIndex(buttonIndex: Int) {
    val _arg = Variant.new(buttonIndex)
    __method_bind.setButtonIndex.call(this._handle, _arg, 1)
  }

  fun setDoubleclick(doubleclick: Boolean) {
    val _arg = Variant.new(doubleclick)
    __method_bind.setDoubleclick.call(this._handle, _arg, 1)
  }

  fun setFactor(factor: Float) {
    val _arg = Variant.new(factor)
    __method_bind.setFactor.call(this._handle, _arg, 1)
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, _arg, 1)
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
      val getButtonIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "getButtonIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButtonIndex" }
        }
      val getFactor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "getFactor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFactor" }
        }
      val isDoubleclick: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "isDoubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDoubleclick" }
        }
      val setButtonIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "setButtonIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setButtonIndex" }
        }
      val setDoubleclick: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "setDoubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDoubleclick" }
        }
      val setFactor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "setFactor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFactor" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "setPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressed" }
        }}
  }
}
