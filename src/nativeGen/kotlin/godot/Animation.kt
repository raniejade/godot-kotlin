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

open class Animation internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val InterpolationCubic: Int = 2

    val InterpolationLinear: Int = 1

    val InterpolationNearest: Int = 0

    val TypeAnimation: Int = 5

    val TypeAudio: Int = 4

    val TypeBezier: Int = 3

    val TypeMethod: Int = 2

    val TypeTransform: Int = 1

    val TypeValue: Int = 0

    val UpdateCapture: Int = 3

    val UpdateContinuous: Int = 0

    val UpdateDiscrete: Int = 1

    val UpdateTrigger: Int = 2

    fun new(): Animation = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Animation".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Animation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Animation(
        fn()
      )
    }}
}
