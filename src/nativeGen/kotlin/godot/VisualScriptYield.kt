// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptYield(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
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

  fun getWaitTime(): Float {
    val _ret = __method_bind.getWaitTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getYieldMode(): YieldMode {
    val _ret = __method_bind.getYieldMode.call(this._handle)
    return VisualScriptYield.YieldMode.from(_ret.asInt())
  }

  fun setWaitTime(sec: Float) {
    val _arg = Variant.new(sec)
    __method_bind.setWaitTime.call(this._handle, listOf(_arg))
  }

  fun setYieldMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setYieldMode.call(this._handle, listOf(_arg))
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
    fun new(): VisualScriptYield = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYield".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptYield" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptYield(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptYield = VisualScriptYield(ptr)
    /**
     * Container for method_bind pointers for VisualScriptYield
     */
    private object __method_bind {
      val getWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "get_wait_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
        }
      val getYieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "get_yield_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_yield_mode" }
        }
      val setWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "set_wait_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
        }
      val setYieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "set_yield_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_yield_mode" }
        }}
  }
}
