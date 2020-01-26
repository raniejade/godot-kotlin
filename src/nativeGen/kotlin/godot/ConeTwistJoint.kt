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

open class ConeTwistJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  enum class Param(
    val value: Int
  ) {
    PARAM_SWING_SPAN(0),

    PARAM_TWIST_SPAN(1),

    PARAM_BIAS(2),

    PARAM_SOFTNESS(3),

    PARAM_RELAXATION(4),

    PARAM_MAX(5);
  }

  companion object {
    val PARAM_BIAS: Int = 2

    val PARAM_MAX: Int = 5

    val PARAM_RELAXATION: Int = 4

    val PARAM_SOFTNESS: Int = 3

    val PARAM_SWING_SPAN: Int = 0

    val PARAM_TWIST_SPAN: Int = 1

    fun new(): ConeTwistJoint = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConeTwistJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ConeTwistJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConeTwistJoint(
        fn()
      )
    }}
}
