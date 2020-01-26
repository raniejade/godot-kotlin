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

open class VisualScriptYield internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val YieldFrame: Int = 1

    val YieldPhysicsFrame: Int = 2

    val YieldWait: Int = 3

    fun new(): VisualScriptYield = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYield".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptYield" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualScriptYield(
        fn()
      )
    }}
}
