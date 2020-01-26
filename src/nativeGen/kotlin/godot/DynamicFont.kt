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
  enum class SpacingType(
    val value: Int
  ) {
    SPACING_TOP(0),

    SPACING_BOTTOM(1),

    SPACING_CHAR(2),

    SPACING_SPACE(3);
  }

  companion object {
    val SPACING_BOTTOM: Int = 1

    val SPACING_CHAR: Int = 2

    val SPACING_SPACE: Int = 3

    val SPACING_TOP: Int = 0

    fun new(): DynamicFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFont".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for DynamicFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DynamicFont(
        fn()
      )
    }}
}
