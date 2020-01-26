// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptYield internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getWaitTime(): Float {
    TODO()
  }

  fun getYieldMode(): YieldMode {
    TODO()
  }

  fun setWaitTime() {
    TODO()
  }

  fun setYieldMode() {
    TODO()
  }

  enum class YieldMode(
    val value: Int
  ) {
    YIELD_FRAME(1),

    YIELD_PHYSICS_FRAME(2),

    YIELD_WAIT(3);
  }

  companion object {
    val YIELD_FRAME: Int = 1

    val YIELD_PHYSICS_FRAME: Int = 2

    val YIELD_WAIT: Int = 3

    fun new(): VisualScriptYield = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYield".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptYield" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptYield(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptYield
     */
    private object __method_bind {
      val get_wait_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "get_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
            }
          }

      val get_yield_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "get_yield_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_yield_mode" }
            }
          }

      val set_wait_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "set_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
            }
          }

      val set_yield_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYield".cstr.ptr,
              "set_yield_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_yield_mode" }
            }
          }
    }
  }
}
