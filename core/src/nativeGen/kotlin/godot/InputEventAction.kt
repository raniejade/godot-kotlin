// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventAction(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  var action: String
    get() {
       return getAction() 
    }
    set(value) {
      setAction(value)
    }

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  var strength: Float
    get() {
       return getStrength() 
    }
    set(value) {
      setStrength(value)
    }

  fun getAction(): String {
    val _ret = __method_bind.getAction.call(this._handle)
    return _ret.asString()
  }

  fun getStrength(): Float {
    val _ret = __method_bind.getStrength.call(this._handle)
    return _ret.asFloat()
  }

  fun setAction(action: String) {
    val _arg = Variant.new(action)
    __method_bind.setAction.call(this._handle, listOf(_arg))
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, listOf(_arg))
  }

  fun setStrength(strength: Float) {
    val _arg = Variant.new(strength)
    __method_bind.setStrength.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): InputEventAction = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventAction".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventAction(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventAction = InputEventAction(ptr)
    /**
     * Container for method_bind pointers for InputEventAction
     */
    private object __method_bind {
      val getAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
            "get_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action" }
        }
      val getStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
            "get_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_strength" }
        }
      val setAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
            "set_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }
      val setStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
            "set_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_strength" }
        }}
  }
}
