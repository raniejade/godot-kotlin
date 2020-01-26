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

open class HingeJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  companion object {
    val FlagEnableMotor: Int = 1

    val FlagMax: Int = 2

    val FlagUseLimit: Int = 0

    val ParamBias: Int = 0

    val ParamLimitBias: Int = 3

    val ParamLimitLower: Int = 2

    val ParamLimitRelaxation: Int = 5

    val ParamLimitSoftness: Int = 4

    val ParamLimitUpper: Int = 1

    val ParamMax: Int = 8

    val ParamMotorMaxImpulse: Int = 7

    val ParamMotorTargetVelocity: Int = 6

    fun new(): HingeJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HingeJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for HingeJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      HingeJoint(
        fn()
      )
    }}
}
