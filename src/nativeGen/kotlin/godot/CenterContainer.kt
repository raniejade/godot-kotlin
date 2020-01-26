// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CenterContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  companion object {
    fun new(): CenterContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CenterContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CenterContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      CenterContainer(
        fn()
      )
    }}
}
