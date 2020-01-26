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

open class Label internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);
  }

  enum class VAlign(
    val value: Int
  ) {
    VALIGN_TOP(0),

    VALIGN_CENTER(1),

    VALIGN_BOTTOM(2),

    VALIGN_FILL(3);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_FILL: Int = 3

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val VALIGN_BOTTOM: Int = 2

    val VALIGN_CENTER: Int = 1

    val VALIGN_FILL: Int = 3

    val VALIGN_TOP: Int = 0

    fun new(): Label = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Label".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Label" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Label(
        fn()
      )
    }}
}
