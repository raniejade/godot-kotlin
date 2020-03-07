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

open class VisualScriptYield(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var mode: YieldMode
    get() {
       return getYieldMode() 
    }
    set(value) {
      setYieldMode(value.value)
    }

  var waitTime: Float
    get() {
       return getWaitTime() 
    }
    set(value) {
      setWaitTime(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getWaitTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWaitTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getYieldMode(): YieldMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getYieldMode.call(self._handle, emptyList(), _retPtr)
      VisualScriptYield.YieldMode.from(_ret.value)
    }
  }

  fun setWaitTime(sec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWaitTime.call(self._handle, listOf(sec), null)
    }
  }

  fun setYieldMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setYieldMode.call(self._handle, listOf(mode), null)
    }
  }

  enum class YieldMode(
    val value: Int
  ) {
    FRAME(1),

    PHYSICS_FRAME(2),

    WAIT(3);

    companion object {
      fun from(value: Int): YieldMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYield".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptYield" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptYield
     */
    private object __method_bind {
      val getWaitTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "get_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
            }
          }

      val getYieldMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "get_yield_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_yield_mode" }
            }
          }

      val setWaitTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "set_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
            }
          }

      val setYieldMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "set_yield_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_yield_mode" }
            }
          }
    }
  }
}
