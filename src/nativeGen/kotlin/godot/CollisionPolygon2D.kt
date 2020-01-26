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

open class CollisionPolygon2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class BuildMode(
    val value: Int
  ) {
    BUILD_SOLIDS(0),

    BUILD_SEGMENTS(1);
  }

  companion object {
    val BUILD_SEGMENTS: Int = 1

    val BUILD_SOLIDS: Int = 0

    fun new(): CollisionPolygon2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CollisionPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionPolygon2D(
        fn()
      )
    }}
}
