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

open class TileMap internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class Mode(
    val value: Int
  ) {
    MODE_SQUARE(0),

    MODE_ISOMETRIC(1),

    MODE_CUSTOM(2);
  }

  enum class TileOrigin(
    val value: Int
  ) {
    TILE_ORIGIN_TOP_LEFT(0),

    TILE_ORIGIN_CENTER(1),

    TILE_ORIGIN_BOTTOM_LEFT(2);
  }

  enum class HalfOffset(
    val value: Int
  ) {
    HALF_OFFSET_X(0),

    HALF_OFFSET_Y(1),

    HALF_OFFSET_DISABLED(2),

    HALF_OFFSET_NEGATIVE_X(3),

    HALF_OFFSET_NEGATIVE_Y(4);
  }

  companion object {
    val HALF_OFFSET_DISABLED: Int = 2

    val HALF_OFFSET_NEGATIVE_X: Int = 3

    val HALF_OFFSET_NEGATIVE_Y: Int = 4

    val HALF_OFFSET_X: Int = 0

    val HALF_OFFSET_Y: Int = 1

    val INVALID_CELL: Int = -1

    val MODE_CUSTOM: Int = 2

    val MODE_ISOMETRIC: Int = 1

    val MODE_SQUARE: Int = 0

    val TILE_ORIGIN_BOTTOM_LEFT: Int = 2

    val TILE_ORIGIN_CENTER: Int = 1

    val TILE_ORIGIN_TOP_LEFT: Int = 0

    fun new(): TileMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileMap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TileMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileMap(
        fn()
      )
    }}
}
