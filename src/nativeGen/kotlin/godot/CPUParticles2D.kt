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

open class CPUParticles2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    val DrawOrderIndex: Int = 0

    val DrawOrderLifetime: Int = 1

    val EmissionShapeCircle: Int = 1

    val EmissionShapeDirectedPoints: Int = 4

    val EmissionShapePoint: Int = 0

    val EmissionShapePoints: Int = 3

    val EmissionShapeRectangle: Int = 2

    val FlagAlignYToVelocity: Int = 0

    val FlagDisableZ: Int = 2

    val FlagMax: Int = 3

    val FlagRotateY: Int = 1

    val ParamAngle: Int = 7

    val ParamAngularVelocity: Int = 1

    val ParamAnimOffset: Int = 11

    val ParamAnimSpeed: Int = 10

    val ParamDamping: Int = 6

    val ParamHueVariation: Int = 9

    val ParamInitialLinearVelocity: Int = 0

    val ParamLinearAccel: Int = 3

    val ParamMax: Int = 12

    val ParamOrbitVelocity: Int = 2

    val ParamRadialAccel: Int = 4

    val ParamScale: Int = 8

    val ParamTangentialAccel: Int = 5

    fun new(): CPUParticles2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CPUParticles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CPUParticles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CPUParticles2D(
        fn()
      )
    }}
}
