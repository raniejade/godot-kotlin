// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class InputEventJoypadMotion(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEvent(null) {
  var axis: Int
    get() {
       return getAxis() 
    }
    set(value) {
      setAxis(value)
    }

  var axisValue: Float
    get() {
       return getAxisValue() 
    }
    set(value) {
      setAxisValue(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAxis(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAxis.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAxisValue(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAxisValue.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setAxis(axis: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAxis.call(self._handle, listOf(axis), null)
    }
  }

  fun setAxisValue(axisValue: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAxisValue.call(self._handle, listOf(axisValue), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventJoypadMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventJoypadMotion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventJoypadMotion
     */
    private object __method_bind {
      val getAxis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "get_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis" }
            }
          }

      val getAxisValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "get_axis_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis_value" }
            }
          }

      val setAxis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "set_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis" }
            }
          }

      val setAxisValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "set_axis_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_value" }
            }
          }
    }
  }
}
