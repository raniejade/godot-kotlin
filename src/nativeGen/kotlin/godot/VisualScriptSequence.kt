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

open class VisualScriptSequence internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptSequence = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSequence".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptSequence" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSequence(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptSequence
     */
    private object __method_bind {
      val get_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
              "get_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_steps" }
            }
          }

      val set_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
              "set_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_steps" }
            }
          }
    }
  }
}
