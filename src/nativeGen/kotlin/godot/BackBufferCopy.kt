// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BackBufferCopy internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    val CopyModeDisabled: Int = 0

    val CopyModeRect: Int = 1

    val CopyModeViewport: Int = 2

    fun new(): BackBufferCopy = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BackBufferCopy".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for BackBufferCopy" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      BackBufferCopy(
        fn()
      )
    }}
}
