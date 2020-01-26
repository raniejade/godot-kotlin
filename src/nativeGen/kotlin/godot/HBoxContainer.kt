// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
      requireNotNull(fnPtr) { "No instance found for singleton HBoxContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HBoxContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HBoxContainer = HBoxContainer(ptr)
    /**
     * Container for method_bind pointers for HBoxContainer
     */
    private object __method_bind
  }
}
