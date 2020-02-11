// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouseButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventMouse(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val _arg = Variant(buttonIndex)
    __method_bind.setButtonIndex.call(this._handle, listOf(_arg))
  }

  fun setDoubleclick(doubleclick: Boolean) {
    val _arg = Variant(doubleclick)
    __method_bind.setDoubleclick.call(this._handle, listOf(_arg))
  }

  fun setFactor(factor: Float) {
    val _arg = Variant(factor)
    __method_bind.setFactor.call(this._handle, listOf(_arg))
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant(pressed)
    __method_bind.setPressed.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMouseButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventMouseButton
     */
    private object __method_bind {
      val getButtonIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "get_button_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_index" }
        }
      val getFactor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "get_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_factor" }
        }
      val isDoubleclick: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "is_doubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_doubleclick" }
        }
      val setButtonIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_button_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_index" }
        }
      val setDoubleclick: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_doubleclick".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doubleclick" }
        }
      val setFactor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_factor" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }}
  }
}
