// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VBoxContainer internal constructor(
  _handle: COpaquePointer
) : BoxContainer(_handle) {
  companion object {
    fun new(): VBoxContainer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VBoxContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VBoxContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VBoxContainer(
        fn()
      )
    }}
}
