// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConfirmationDialog internal constructor(
  _handle: COpaquePointer
) : AcceptDialog(_handle) {
  companion object {
    fun new(): ConfirmationDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfirmationDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ConfirmationDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConfirmationDialog(
        fn()
      )
    }}
}
