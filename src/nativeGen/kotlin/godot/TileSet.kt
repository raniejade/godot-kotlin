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

open class TileSet internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class TileMode(
    val value: Int
  ) {
    SINGLE_TILE(0),

    AUTO_TILE(1),

    ATLAS_TILE(2);
  }

  enum class AutotileBindings(
    val value: Int
  ) {
    BIND_TOPLEFT(1),

    BIND_TOP(2),

    BIND_TOPRIGHT(4),

    BIND_LEFT(8),

    BIND_RIGHT(32),

    BIND_BOTTOMLEFT(64),

    BIND_BOTTOM(128),

    BIND_BOTTOMRIGHT(256);
  }

  enum class BitmaskMode(
    val value: Int
  ) {
    BITMASK_2X2(0),

    BITMASK_3X3_MINIMAL(1),

    BITMASK_3X3(2);
  }

  companion object {
    val ATLAS_TILE: Int = 2

    val AUTO_TILE: Int = 1

    val BIND_BOTTOM: Int = 128

    val BIND_BOTTOMLEFT: Int = 64

    val BIND_BOTTOMRIGHT: Int = 256

    val BIND_LEFT: Int = 8

    val BIND_RIGHT: Int = 32

    val BIND_TOP: Int = 2

    val BIND_TOPLEFT: Int = 1

    val BIND_TOPRIGHT: Int = 4

    val BITMASK_2X2: Int = 0

    val BITMASK_3X3: Int = 2

    val BITMASK_3X3_MINIMAL: Int = 1

    val SINGLE_TILE: Int = 0

    fun new(): TileSet = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileSet".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TileSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileSet(
        fn()
      )
    }}
}
