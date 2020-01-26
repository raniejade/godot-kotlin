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

open class SliderJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  companion object {
    val ParamAngularLimitDamping: Int = 15

    val ParamAngularLimitLower: Int = 12

    val ParamAngularLimitRestitution: Int = 14

    val ParamAngularLimitSoftness: Int = 13

    val ParamAngularLimitUpper: Int = 11

    val ParamAngularMotionDamping: Int = 18

    val ParamAngularMotionRestitution: Int = 17

    val ParamAngularMotionSoftness: Int = 16

    val ParamAngularOrthogonalDamping: Int = 21

    val ParamAngularOrthogonalRestitution: Int = 20

    val ParamAngularOrthogonalSoftness: Int = 19

    val ParamLinearLimitDamping: Int = 4

    val ParamLinearLimitLower: Int = 1

    val ParamLinearLimitRestitution: Int = 3

    val ParamLinearLimitSoftness: Int = 2

    val ParamLinearLimitUpper: Int = 0

    val ParamLinearMotionDamping: Int = 7

    val ParamLinearMotionRestitution: Int = 6

    val ParamLinearMotionSoftness: Int = 5

    val ParamLinearOrthogonalDamping: Int = 10

    val ParamLinearOrthogonalRestitution: Int = 9

    val ParamLinearOrthogonalSoftness: Int = 8

    val ParamMax: Int = 22

    fun new(): SliderJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SliderJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for SliderJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      SliderJoint(
        fn()
      )
    }}
}
