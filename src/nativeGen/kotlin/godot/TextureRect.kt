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

open class TextureRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_SCALE_ON_EXPAND(0),

    STRETCH_SCALE(1),

    STRETCH_TILE(2),

    STRETCH_KEEP(3),

    STRETCH_KEEP_CENTERED(4),

    STRETCH_KEEP_ASPECT(5),

    STRETCH_KEEP_ASPECT_CENTERED(6),

    STRETCH_KEEP_ASPECT_COVERED(7);
  }

  companion object {
    val STRETCH_KEEP: Int = 3

    val STRETCH_KEEP_ASPECT: Int = 5

    val STRETCH_KEEP_ASPECT_CENTERED: Int = 6

    val STRETCH_KEEP_ASPECT_COVERED: Int = 7

    val STRETCH_KEEP_CENTERED: Int = 4

    val STRETCH_SCALE: Int = 1

    val STRETCH_SCALE_ON_EXPAND: Int = 0

    val STRETCH_TILE: Int = 2

    fun new(): TextureRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureRect".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureRect(
        fn()
      )
    }}
}
