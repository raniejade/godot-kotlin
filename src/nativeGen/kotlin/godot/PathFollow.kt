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

open class PathFollow internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  enum class RotationMode(
    val value: Int
  ) {
    ROTATION_NONE(0),

    ROTATION_Y(1),

    ROTATION_XY(2),

    ROTATION_XYZ(3),

    ROTATION_ORIENTED(4);
  }

  companion object {
    val ROTATION_NONE: Int = 0

    val ROTATION_ORIENTED: Int = 4

    val ROTATION_XY: Int = 2

    val ROTATION_XYZ: Int = 3

    val ROTATION_Y: Int = 1

    fun new(): PathFollow = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PathFollow" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PathFollow(
        fn()
      )
    }}
}
