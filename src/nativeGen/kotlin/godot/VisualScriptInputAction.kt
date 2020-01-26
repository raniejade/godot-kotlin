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

open class VisualScriptInputAction internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val ModeJustPressed: Int = 2

    val ModeJustReleased: Int = 3

    val ModePressed: Int = 0

    val ModeReleased: Int = 1

    fun new(): VisualScriptInputAction = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptInputAction".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptInputAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualScriptInputAction(
        fn()
      )
    }}
}
