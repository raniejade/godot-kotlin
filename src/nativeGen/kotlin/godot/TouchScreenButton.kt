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

open class TouchScreenButton internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class VisibilityMode(
    val value: Int
  ) {
    VISIBILITY_ALWAYS(0),

    VISIBILITY_TOUCHSCREEN_ONLY(1);
  }

  companion object {
    val VISIBILITY_ALWAYS: Int = 0

    val VISIBILITY_TOUCHSCREEN_ONLY: Int = 1

    fun new(): TouchScreenButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TouchScreenButton".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TouchScreenButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TouchScreenButton(
        fn()
      )
    }}
}
