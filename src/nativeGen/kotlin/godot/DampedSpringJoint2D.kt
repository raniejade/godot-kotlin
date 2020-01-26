// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DampedSpringJoint2D internal constructor(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  companion object {
    fun new(): DampedSpringJoint2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DampedSpringJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for DampedSpringJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      DampedSpringJoint2D(
        fn()
      )
    }}
}
