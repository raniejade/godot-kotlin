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

open class TextureButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_SCALE(0),

    STRETCH_TILE(1),

    STRETCH_KEEP(2),

    STRETCH_KEEP_CENTERED(3),

    STRETCH_KEEP_ASPECT(4),

    STRETCH_KEEP_ASPECT_CENTERED(5),

    STRETCH_KEEP_ASPECT_COVERED(6);
  }

  companion object {
    val STRETCH_KEEP: Int = 2

    val STRETCH_KEEP_ASPECT: Int = 4

    val STRETCH_KEEP_ASPECT_CENTERED: Int = 5

    val STRETCH_KEEP_ASPECT_COVERED: Int = 6

    val STRETCH_KEEP_CENTERED: Int = 3

    val STRETCH_SCALE: Int = 0

    val STRETCH_TILE: Int = 1

    fun new(): TextureButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureButton".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureButton(
        fn()
      )
    }}
}
