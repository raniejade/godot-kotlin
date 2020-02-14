// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class InputEventKey(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventWithModifiers(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getScancode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScancode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getScancodeWithModifiers(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScancodeWithModifiers.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUnicode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnicode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEcho(echo: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEcho.call(self._handle, listOf(echo), null)
    }
  }

  fun setPressed(pressed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressed.call(self._handle, listOf(pressed), null)
    }
  }

  fun setScancode(scancode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScancode.call(self._handle, listOf(scancode), null)
    }
  }

  fun setUnicode(unicode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUnicode.call(self._handle, listOf(unicode), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventKey".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventKey" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventKey
     */
    private object __method_bind {
      val getScancode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_scancode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode" }
        }
      val getScancodeWithModifiers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_scancode_with_modifiers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode_with_modifiers" }
        }
      val getUnicode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "get_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unicode" }
        }
      val setEcho: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_echo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_echo" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }
      val setScancode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_scancode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scancode" }
        }
      val setUnicode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
            "set_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unicode" }
        }}
  }
}
