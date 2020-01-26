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
  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1);
  }

  enum class NodeType(
    val value: Int
  ) {
    NODE_OUTPUT(0),

    NODE_ANIMATION(1),

    NODE_ONESHOT(2),

    NODE_MIX(3),

    NODE_BLEND2(4),

    NODE_BLEND3(5),

    NODE_BLEND4(6),

    NODE_TIMESCALE(7),

    NODE_TIMESEEK(8),

    NODE_TRANSITION(9);
  }

  companion object {
    val ANIMATION_PROCESS_IDLE: Int = 1

    val ANIMATION_PROCESS_PHYSICS: Int = 0

    val NODE_ANIMATION: Int = 1

    val NODE_BLEND2: Int = 4

    val NODE_BLEND3: Int = 5

    val NODE_BLEND4: Int = 6

    val NODE_MIX: Int = 3

    val NODE_ONESHOT: Int = 2

    val NODE_OUTPUT: Int = 0

    val NODE_TIMESCALE: Int = 7

    val NODE_TIMESEEK: Int = 8

    val NODE_TRANSITION: Int = 9

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
