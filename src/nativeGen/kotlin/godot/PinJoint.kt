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

open class PinJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  enum class Param(
    val value: Int
  ) {
    PARAM_BIAS(0),

    PARAM_DAMPING(1),

    PARAM_IMPULSE_CLAMP(2);
  }

  companion object {
    val PARAM_BIAS: Int = 0

    val PARAM_DAMPING: Int = 1

    val PARAM_IMPULSE_CLAMP: Int = 2

    fun new(): PinJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PinJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PinJoint(
        fn()
      )
    }}
}
