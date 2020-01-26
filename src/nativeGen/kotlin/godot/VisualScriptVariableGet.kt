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

open class VisualScriptVariableGet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getVariable(): String {
    TODO()
  }

  fun setVariable() {
    TODO()
  }

  companion object {
    fun new(): VisualScriptVariableGet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptVariableGet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptVariableGet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptVariableGet(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptVariableGet
     */
    private object __method_bind {
      val get_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableGet".cstr.ptr,
              "get_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable" }
            }
          }

      val set_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableGet".cstr.ptr,
              "set_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable" }
            }
          }
    }
  }
}
