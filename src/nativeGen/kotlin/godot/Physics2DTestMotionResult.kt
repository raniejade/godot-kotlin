// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DTestMotionResult internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): Physics2DTestMotionResult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Physics2DTestMotionResult".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Physics2DTestMotionResult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Physics2DTestMotionResult(
        fn()
      )
    }}
}
