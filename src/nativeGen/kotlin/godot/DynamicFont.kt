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

open class DynamicFont internal constructor(
  _handle: COpaquePointer
) : Font(_handle) {
  companion object {
    val SpacingBottom: Int = 1

    val SpacingChar: Int = 2

    val SpacingSpace: Int = 3

    val SpacingTop: Int = 0

    fun new(): DynamicFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFont".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for DynamicFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      DynamicFont(
        fn()
      )
    }}
}
