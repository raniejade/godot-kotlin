// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class InputEventAction(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEvent(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAction(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAction.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getStrength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStrength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setAction(action: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAction.call(self._handle, listOf(action), null)
    }
  }

  fun setPressed(pressed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressed.call(self._handle, listOf(pressed), null)
    }
  }

  fun setStrength(strength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStrength.call(self._handle, listOf(strength), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventAction".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventAction
     */
    private object __method_bind {
      val getAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "get_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action" }
            }
          }

      val getStrength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "get_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_strength" }
            }
          }

      val setAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action" }
            }
          }

      val setPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val setStrength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_strength" }
            }
          }
    }
  }
}
