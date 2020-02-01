// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventKey(
  _handle: COpaquePointer
) : InputEventWithModifiers(_handle) {
  var echo: Boolean
    get() {
       return isEcho() 
    }
    set(value) {
      setEcho(value)
    }

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  var scancode: Int
    get() {
       return getScancode() 
    }
    set(value) {
      setScancode(value)
    }

  var unicode: Int
    get() {
       return getUnicode() 
    }
    set(value) {
      setUnicode(value)
    }

  fun getScancode(): Int {
    val _ret = __method_bind.getScancode.call(this._handle)
    return _ret.asInt()
  }

  fun getScancodeWithModifiers(): Int {
    val _ret = __method_bind.getScancodeWithModifiers.call(this._handle)
    return _ret.asInt()
  }

  fun getUnicode(): Int {
    val _ret = __method_bind.getUnicode.call(this._handle)
    return _ret.asInt()
  }

  fun setEcho(echo: Boolean) {
    val _arg = Variant.new(echo)
    __method_bind.setEcho.call(this._handle, listOf(_arg))
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, listOf(_arg))
  }

  fun setScancode(scancode: Int) {
    val _arg = Variant.new(scancode)
    __method_bind.setScancode.call(this._handle, listOf(_arg))
  }

  fun setUnicode(unicode: Int) {
    val _arg = Variant.new(unicode)
    __method_bind.setUnicode.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): InputEventKey = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventKey".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventKey" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventKey(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventKey = InputEventKey(ptr)
    /**
     * Container for method_bind pointers for InputEventKey
     */
    private object __method_bind {
      val getScancode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_scancode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode" }
        }
      val getScancodeWithModifiers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_scancode_with_modifiers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode_with_modifiers" }
        }
      val getUnicode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unicode" }
        }
      val setEcho: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_echo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_echo" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }
      val setScancode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_scancode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scancode" }
        }
      val setUnicode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unicode" }
        }}
  }
}
