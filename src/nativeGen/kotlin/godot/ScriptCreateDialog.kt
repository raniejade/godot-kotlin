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

open class ScriptCreateDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  fun config() {
    TODO()
  }

  companion object {
    fun new(): ScriptCreateDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScriptCreateDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ScriptCreateDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ScriptCreateDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ScriptCreateDialog
     */
    private object __method_bind {
      val config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
              "config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method config" }
            }
          }
    }
  }
}
