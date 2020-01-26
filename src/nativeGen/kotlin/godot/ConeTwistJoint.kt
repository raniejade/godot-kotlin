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
  companion object {
    val ParamBias: Int = 2

    val ParamMax: Int = 5

    val ParamRelaxation: Int = 4

    val ParamSoftness: Int = 3

    val ParamSwingSpan: Int = 0

    val ParamTwistSpan: Int = 1

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
