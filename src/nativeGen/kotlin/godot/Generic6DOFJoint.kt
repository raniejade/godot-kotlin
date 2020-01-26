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

open class Generic6DOFJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  companion object {
    val FlagEnableAngularLimit: Int = 1

    val FlagEnableAngularSpring: Int = 2

    val FlagEnableLinearLimit: Int = 0

    val FlagEnableLinearMotor: Int = 5

    val FlagEnableLinearSpring: Int = 3

    val FlagEnableMotor: Int = 4

    val FlagMax: Int = 6

    val ParamAngularDamping: Int = 13

    val ParamAngularErp: Int = 16

    val ParamAngularForceLimit: Int = 15

    val ParamAngularLimitSoftness: Int = 12

    val ParamAngularLowerLimit: Int = 10

    val ParamAngularMotorForceLimit: Int = 18

    val ParamAngularMotorTargetVelocity: Int = 17

    val ParamAngularRestitution: Int = 14

    val ParamAngularUpperLimit: Int = 11

    val ParamLinearDamping: Int = 4

    val ParamLinearLimitSoftness: Int = 2

    val ParamLinearLowerLimit: Int = 0

    val ParamLinearMotorForceLimit: Int = 6

    val ParamLinearMotorTargetVelocity: Int = 5

    val ParamLinearRestitution: Int = 3

    val ParamLinearUpperLimit: Int = 1

    val ParamMax: Int = 22

    fun new(): Generic6DOFJoint = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Generic6DOFJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Generic6DOFJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Generic6DOFJoint(
        fn()
      )
    }}
}
