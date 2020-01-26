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

open class OccluderPolygon2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class CullMode(
    val value: Int
  ) {
    CULL_DISABLED(0),

    CULL_CLOCKWISE(1),

    CULL_COUNTER_CLOCKWISE(2);
  }

  companion object {
    val CULL_CLOCKWISE: Int = 1

    val CULL_COUNTER_CLOCKWISE: Int = 2

    val CULL_DISABLED: Int = 0

    fun new(): OccluderPolygon2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OccluderPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for OccluderPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OccluderPolygon2D(
        fn()
      )
    }}
}
