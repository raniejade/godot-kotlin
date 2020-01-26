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

open class TextureProgress internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  enum class FillMode(
    val value: Int
  ) {
    FILL_LEFT_TO_RIGHT(0),

    FILL_RIGHT_TO_LEFT(1),

    FILL_TOP_TO_BOTTOM(2),

    FILL_BOTTOM_TO_TOP(3),

    FILL_CLOCKWISE(4),

    FILL_COUNTER_CLOCKWISE(5),

    FILL_BILINEAR_LEFT_AND_RIGHT(6),

    FILL_BILINEAR_TOP_AND_BOTTOM(7),

    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8);
  }

  companion object {
    val FILL_BILINEAR_LEFT_AND_RIGHT: Int = 6

    val FILL_BILINEAR_TOP_AND_BOTTOM: Int = 7

    val FILL_BOTTOM_TO_TOP: Int = 3

    val FILL_CLOCKWISE: Int = 4

    val FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE: Int = 8

    val FILL_COUNTER_CLOCKWISE: Int = 5

    val FILL_LEFT_TO_RIGHT: Int = 0

    val FILL_RIGHT_TO_LEFT: Int = 1

    val FILL_TOP_TO_BOTTOM: Int = 2

    fun new(): TextureProgress = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureProgress".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureProgress" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureProgress(
        fn()
      )
    }}
}
