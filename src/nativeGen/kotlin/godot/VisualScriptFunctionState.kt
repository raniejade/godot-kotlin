// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
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
  fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray
  ) {
    TODO()
  }

  fun isValid(): Boolean {
    TODO()
  }

  fun resume(args: VariantArray): Variant {
    TODO()
  }

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
    fun from(ptr: COpaquePointer): VisualScriptFunctionState = VisualScriptFunctionState(ptr)
    /**
     * Container for method_bind pointers for VisualScriptFunctionState
     */
    private object __method_bind {
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
