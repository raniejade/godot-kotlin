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
  enum class CopyMode(
    val value: Int
  ) {
    COPY_MODE_DISABLED(0),

    COPY_MODE_RECT(1),

    COPY_MODE_VIEWPORT(2);
  }

  companion object {
    val COPY_MODE_DISABLED: Int = 0

    val COPY_MODE_RECT: Int = 1

    val COPY_MODE_VIEWPORT: Int = 2

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
