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

open class PhysicsServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: PhysicsServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("PhysicsServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton PhysicsServer" }
          PhysicsServer(
            handle
          )
        }

    val AreaBodyAdded: Int = 0

    val AreaBodyRemoved: Int = 1

    val AreaParamAngularDamp: Int = 6

    val AreaParamGravity: Int = 0

    val AreaParamGravityDistanceScale: Int = 3

    val AreaParamGravityIsPoint: Int = 2

    val AreaParamGravityPointAttenuation: Int = 4

    val AreaParamGravityVector: Int = 1

    val AreaParamLinearDamp: Int = 5

    val AreaParamPriority: Int = 7

    val AreaSpaceOverrideCombine: Int = 1

    val AreaSpaceOverrideCombineReplace: Int = 2

    val AreaSpaceOverrideDisabled: Int = 0

    val AreaSpaceOverrideReplace: Int = 3

    val AreaSpaceOverrideReplaceCombine: Int = 4

    val BodyAxisAngularX: Int = 8

    val BodyAxisAngularY: Int = 16

    val BodyAxisAngularZ: Int = 32

    val BodyAxisLinearX: Int = 1

    val BodyAxisLinearY: Int = 2

    val BodyAxisLinearZ: Int = 4

    val BodyModeCharacter: Int = 3

    val BodyModeKinematic: Int = 1

    val BodyModeRigid: Int = 2

    val BodyModeStatic: Int = 0

    val BodyParamAngularDamp: Int = 5

    val BodyParamBounce: Int = 0

    val BodyParamFriction: Int = 1

    val BodyParamGravityScale: Int = 3

    val BodyParamLinearDamp: Int = 4

    val BodyParamMass: Int = 2

    val BodyParamMax: Int = 6

    val BodyStateAngularVelocity: Int = 2

    val BodyStateCanSleep: Int = 4

    val BodyStateLinearVelocity: Int = 1

    val BodyStateSleeping: Int = 3

    val BodyStateTransform: Int = 0

    val ConeTwistJointBias: Int = 2

    val ConeTwistJointRelaxation: Int = 4

    val ConeTwistJointSoftness: Int = 3

    val ConeTwistJointSwingSpan: Int = 0

    val ConeTwistJointTwistSpan: Int = 1

    val G6dofJointAngularDamping: Int = 13

    val G6dofJointAngularErp: Int = 16

    val G6dofJointAngularForceLimit: Int = 15

    val G6dofJointAngularLimitSoftness: Int = 12

    val G6dofJointAngularLowerLimit: Int = 10

    val G6dofJointAngularMotorForceLimit: Int = 18

    val G6dofJointAngularMotorTargetVelocity: Int = 17

    val G6dofJointAngularRestitution: Int = 14

    val G6dofJointAngularUpperLimit: Int = 11

    val G6dofJointFlagEnableAngularLimit: Int = 1

    val G6dofJointFlagEnableLinearLimit: Int = 0

    val G6dofJointFlagEnableLinearMotor: Int = 5

    val G6dofJointFlagEnableMotor: Int = 4

    val G6dofJointLinearDamping: Int = 4

    val G6dofJointLinearLimitSoftness: Int = 2

    val G6dofJointLinearLowerLimit: Int = 0

    val G6dofJointLinearMotorForceLimit: Int = 6

    val G6dofJointLinearMotorTargetVelocity: Int = 5

    val G6dofJointLinearRestitution: Int = 3

    val G6dofJointLinearUpperLimit: Int = 1

    val HingeJointBias: Int = 0

    val HingeJointFlagEnableMotor: Int = 1

    val HingeJointFlagUseLimit: Int = 0

    val HingeJointLimitBias: Int = 3

    val HingeJointLimitLower: Int = 2

    val HingeJointLimitRelaxation: Int = 5

    val HingeJointLimitSoftness: Int = 4

    val HingeJointLimitUpper: Int = 1

    val HingeJointMotorMaxImpulse: Int = 7

    val HingeJointMotorTargetVelocity: Int = 6

    val InfoActiveObjects: Int = 0

    val InfoCollisionPairs: Int = 1

    val InfoIslandCount: Int = 2

    val Joint6dof: Int = 4

    val JointConeTwist: Int = 3

    val JointHinge: Int = 1

    val JointPin: Int = 0

    val JointSlider: Int = 2

    val PinJointBias: Int = 0

    val PinJointDamping: Int = 1

    val PinJointImpulseClamp: Int = 2

    val ShapeBox: Int = 3

    val ShapeCapsule: Int = 4

    val ShapeConcavePolygon: Int = 7

    val ShapeConvexPolygon: Int = 6

    val ShapeCustom: Int = 9

    val ShapeCylinder: Int = 5

    val ShapeHeightmap: Int = 8

    val ShapePlane: Int = 0

    val ShapeRay: Int = 1

    val ShapeSphere: Int = 2

    val SliderJointAngularLimitDamping: Int = 15

    val SliderJointAngularLimitLower: Int = 12

    val SliderJointAngularLimitRestitution: Int = 14

    val SliderJointAngularLimitSoftness: Int = 13

    val SliderJointAngularLimitUpper: Int = 11

    val SliderJointAngularMotionDamping: Int = 18

    val SliderJointAngularMotionRestitution: Int = 17

    val SliderJointAngularMotionSoftness: Int = 16

    val SliderJointAngularOrthogonalDamping: Int = 21

    val SliderJointAngularOrthogonalRestitution: Int = 20

    val SliderJointAngularOrthogonalSoftness: Int = 19

    val SliderJointLinearLimitDamping: Int = 4

    val SliderJointLinearLimitLower: Int = 1

    val SliderJointLinearLimitRestitution: Int = 3

    val SliderJointLinearLimitSoftness: Int = 2

    val SliderJointLinearLimitUpper: Int = 0

    val SliderJointLinearMotionDamping: Int = 7

    val SliderJointLinearMotionRestitution: Int = 6

    val SliderJointLinearMotionSoftness: Int = 5

    val SliderJointLinearOrthogonalDamping: Int = 10

    val SliderJointLinearOrthogonalRestitution: Int = 9

    val SliderJointLinearOrthogonalSoftness: Int = 8

    val SliderJointMax: Int = 22

    val SpaceParamBodyAngularVelocityDampRatio: Int = 6

    val SpaceParamBodyAngularVelocitySleepThreshold: Int = 4

    val SpaceParamBodyLinearVelocitySleepThreshold: Int = 3

    val SpaceParamBodyMaxAllowedPenetration: Int = 2

    val SpaceParamBodyTimeToSleep: Int = 5

    val SpaceParamConstraintDefaultBias: Int = 7

    val SpaceParamContactMaxSeparation: Int = 1

    val SpaceParamContactRecycleRadius: Int = 0

    val SpaceParamTestMotionMinContactDepth: Int = 8
  }
}
