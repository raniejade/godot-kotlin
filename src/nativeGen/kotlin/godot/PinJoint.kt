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
  companion object {
    val ParamBias: Int = 0

    val ParamDamping: Int = 1

    val ParamImpulseClamp: Int = 2

    fun new(): PinJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PinJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      PinJoint(
        fn()
      )
    }}
}
