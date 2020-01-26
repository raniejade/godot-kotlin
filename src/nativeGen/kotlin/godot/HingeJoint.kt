// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

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

    fun new(): HingeJoint {
      TODO()
    }
  }
}
