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
  enum class ShadowFilter(
    val value: Int
  ) {
    SHADOW_FILTER_NONE(0),

    SHADOW_FILTER_PCF3(1),

    SHADOW_FILTER_PCF5(2),

    SHADOW_FILTER_PCF7(3),

    SHADOW_FILTER_PCF9(4),

    SHADOW_FILTER_PCF13(5);
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_ADD(0),

    MODE_SUB(1),

    MODE_MIX(2),

    MODE_MASK(3);
  }

  companion object {
    val MODE_ADD: Int = 0

    val MODE_MASK: Int = 3

    val MODE_MIX: Int = 2

    val MODE_SUB: Int = 1

    val SHADOW_FILTER_NONE: Int = 0

    val SHADOW_FILTER_PCF13: Int = 5

    val SHADOW_FILTER_PCF3: Int = 1

    val SHADOW_FILTER_PCF5: Int = 2

    val SHADOW_FILTER_PCF7: Int = 3

    val SHADOW_FILTER_PCF9: Int = 4

    fun new(): Light2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Light2D(
        fn()
      )
    }}
}
