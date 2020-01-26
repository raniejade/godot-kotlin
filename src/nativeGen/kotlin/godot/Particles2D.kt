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

open class Particles2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1);
  }

  companion object {
    val DRAW_ORDER_INDEX: Int = 0

    val DRAW_ORDER_LIFETIME: Int = 1

    fun new(): Particles2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Particles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Particles2D(
        fn()
      )
    }}
}
