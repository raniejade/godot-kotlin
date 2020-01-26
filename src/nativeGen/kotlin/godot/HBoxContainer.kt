// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HBoxContainer internal constructor(
  _handle: COpaquePointer
) : BoxContainer(_handle) {
  companion object {
    fun new(): HBoxContainer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HBoxContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for HBoxContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      HBoxContainer(
        fn()
      )
    }}
}
