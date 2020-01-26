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
  companion object {
    val HalfOffsetDisabled: Int = 2

    val HalfOffsetNegativeX: Int = 3

    val HalfOffsetNegativeY: Int = 4

    val HalfOffsetX: Int = 0

    val HalfOffsetY: Int = 1

    val InvalidCell: Int = -1

    val ModeCustom: Int = 2

    val ModeIsometric: Int = 1

    val ModeSquare: Int = 0

    val TileOriginBottomLeft: Int = 2

    val TileOriginCenter: Int = 1

    val TileOriginTopLeft: Int = 0

    fun new(): TileMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileMap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TileMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      TileMap(
        fn()
      )
    }}
}
