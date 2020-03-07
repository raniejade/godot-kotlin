// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class InputEventMagnifyGesture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventGesture(null) {
  var factor: Float
    get() {
       return getFactor() 
    }
    set(value) {
      setFactor(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFactor(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFactor.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setFactor(factor: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFactor.call(self._handle, listOf(factor), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMagnifyGesture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMagnifyGesture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventMagnifyGesture
     */
    private object __method_bind {
      val getFactor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
              "get_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_factor" }
            }
          }

      val setFactor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
              "set_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_factor" }
            }
          }
    }
  }
}
