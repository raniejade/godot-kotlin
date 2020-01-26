// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptFunctionState internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): VisualScriptFunctionState = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionState".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptFunctionState" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptFunctionState(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptFunctionState
     */
    private object __method_bind {
      val _signal_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
              "_signal_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _signal_callback" }
            }
          }

      val connect_to_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
              "connect_to_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_signal" }
            }
          }

      val is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
              "is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid" }
            }
          }

      val resume: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
              "resume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resume" }
            }
          }
    }
  }
}
