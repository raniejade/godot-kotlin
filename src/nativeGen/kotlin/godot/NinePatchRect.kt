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

open class NinePatchRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class AxisStretchMode(
    val value: Int
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);
  }

  companion object {
    val AXIS_STRETCH_MODE_STRETCH: Int = 0

    val AXIS_STRETCH_MODE_TILE: Int = 1

    val AXIS_STRETCH_MODE_TILE_FIT: Int = 2

    fun new(): NinePatchRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NinePatchRect".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for NinePatchRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NinePatchRect(
        fn()
      )
    }}
}
