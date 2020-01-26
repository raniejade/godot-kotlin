// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptCreateDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  companion object {
    fun new(): ScriptCreateDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScriptCreateDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ScriptCreateDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ScriptCreateDialog(
        fn()
      )
    }}
}
