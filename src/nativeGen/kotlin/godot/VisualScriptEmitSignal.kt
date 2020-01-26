// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptEmitSignal internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getSignal(): String {
    TODO()
  }

  fun setSignal() {
    TODO()
  }

  companion object {
    fun new(): VisualScriptEmitSignal = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptEmitSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptEmitSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptEmitSignal(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptEmitSignal
     */
    private object __method_bind {
      val get_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEmitSignal".cstr.ptr,
              "get_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal" }
            }
          }

      val set_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEmitSignal".cstr.ptr,
              "set_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_signal" }
            }
          }
    }
  }
}
