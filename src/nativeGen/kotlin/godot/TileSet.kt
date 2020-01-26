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
  companion object {
    val AtlasTile: Int = 2

    val AutoTile: Int = 1

    val BindBottom: Int = 128

    val BindBottomleft: Int = 64

    val BindBottomright: Int = 256

    val BindLeft: Int = 8

    val BindRight: Int = 32

    val BindTop: Int = 2

    val BindTopleft: Int = 1

    val BindTopright: Int = 4

    val Bitmask2x2: Int = 0

    val Bitmask3x3: Int = 2

    val Bitmask3x3Minimal: Int = 1

    val SingleTile: Int = 0

    fun new(): TileSet = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileSet".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TileSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileSet(
        fn()
      )
    }}
}
