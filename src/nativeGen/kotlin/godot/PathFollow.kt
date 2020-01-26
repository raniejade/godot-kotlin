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
  companion object {
    val RotationNone: Int = 0

    val RotationOriented: Int = 4

    val RotationXy: Int = 2

    val RotationXyz: Int = 3

    val RotationY: Int = 1

    fun new(): PathFollow = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PathFollow" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      PathFollow(
        fn()
      )
    }}
}
