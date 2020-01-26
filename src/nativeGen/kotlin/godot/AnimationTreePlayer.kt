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

open class AnimationTreePlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val AnimationProcessIdle: Int = 1

    val AnimationProcessPhysics: Int = 0

    val NodeAnimation: Int = 1

    val NodeBlend2: Int = 4

    val NodeBlend3: Int = 5

    val NodeBlend4: Int = 6

    val NodeMix: Int = 3

    val NodeOneshot: Int = 2

    val NodeOutput: Int = 0

    val NodeTimescale: Int = 7

    val NodeTimeseek: Int = 8

    val NodeTransition: Int = 9

    fun new(): AnimationTreePlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTreePlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationTreePlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationTreePlayer(
        fn()
      )
    }}
}
