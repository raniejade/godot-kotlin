// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  companion object {
    fun new(): RayShape2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for RayShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      RayShape2D(
        fn()
      )
    }}
}
