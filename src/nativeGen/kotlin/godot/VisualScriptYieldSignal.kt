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

open class VisualScriptYieldSignal internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val CallModeInstance: Int = 2

    val CallModeNodePath: Int = 1

    val CallModeSelf: Int = 0

    fun new(): VisualScriptYieldSignal = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYieldSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptYieldSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptYieldSignal(
        fn()
      )
    }}
}
