// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CylinderShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  companion object {
    fun new(): CylinderShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CylinderShape".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CylinderShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      CylinderShape(
        fn()
      )
    }}
}
