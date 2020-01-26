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

open class Curve internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class TangentMode(
    val value: Int
  ) {
    TANGENT_FREE(0),

    TANGENT_LINEAR(1),

    TANGENT_MODE_COUNT(2);
  }

  companion object {
    val TANGENT_FREE: Int = 0

    val TANGENT_LINEAR: Int = 1

    val TANGENT_MODE_COUNT: Int = 2

    fun new(): Curve = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Curve" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve(
        fn()
      )
    }}
}
