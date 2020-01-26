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

open class Light2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    val ModeAdd: Int = 0

    val ModeMask: Int = 3

    val ModeMix: Int = 2

    val ModeSub: Int = 1

    val ShadowFilterNone: Int = 0

    val ShadowFilterPcf13: Int = 5

    val ShadowFilterPcf3: Int = 1

    val ShadowFilterPcf5: Int = 2

    val ShadowFilterPcf7: Int = 3

    val ShadowFilterPcf9: Int = 4

    fun new(): Light2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Light2D(
        fn()
      )
    }}
}
