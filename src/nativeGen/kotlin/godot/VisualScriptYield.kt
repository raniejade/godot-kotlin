// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
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
  var mode: Int
    get() {
       return VisualScriptYield.YieldMode.from(getYieldMode()) 
    }
    set(value) {
      setYieldMode(VisualScriptYield.YieldMode.from(value))
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
    __method_bind.setWaitTime.call(this._handle, _arg, 1)
  }

  fun setYieldMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setYieldMode.call(this._handle, _arg, 1)
  }

  enum class YieldMode(
    val value: Int
  ) {
    YIELD_FRAME(1),

    YIELD_PHYSICS_FRAME(2),

    YIELD_WAIT(3);

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
    val YIELD_FRAME: Int = 1

    val YIELD_PHYSICS_FRAME: Int = 2

    val YIELD_WAIT: Int = 3

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
            "getWaitTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWaitTime" }
        }
      val getYieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "getYieldMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getYieldMode" }
        }
      val setWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "setWaitTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWaitTime" }
        }
      val setYieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
            "setYieldMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setYieldMode" }
        }}
  }
}
