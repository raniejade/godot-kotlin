// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSubCall internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun subcall(): Variant {
    TODO()
  }

  companion object {
    fun new(): VisualScriptSubCall = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSubCall".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptSubCall" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSubCall(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptSubCall
     */
    private object __method_bind {
      val _subcall: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSubCall".cstr.ptr,
              "_subcall".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _subcall" }
            }
          }
    }
  }
}
