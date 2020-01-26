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

open class Tween internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  enum class TransitionType(
    val value: Int
  ) {
    TRANS_LINEAR(0),

    TRANS_SINE(1),

    TRANS_QUINT(2),

    TRANS_QUART(3),

    TRANS_QUAD(4),

    TRANS_EXPO(5),

    TRANS_ELASTIC(6),

    TRANS_CUBIC(7),

    TRANS_CIRC(8),

    TRANS_BOUNCE(9),

    TRANS_BACK(10);
  }

  enum class TweenProcessMode(
    val value: Int
  ) {
    TWEEN_PROCESS_PHYSICS(0),

    TWEEN_PROCESS_IDLE(1);
  }

  enum class EaseType(
    val value: Int
  ) {
    EASE_IN(0),

    EASE_OUT(1),

    EASE_IN_OUT(2),

    EASE_OUT_IN(3);
  }

  companion object {
    val EASE_IN: Int = 0

    val EASE_IN_OUT: Int = 2

    val EASE_OUT: Int = 1

    val EASE_OUT_IN: Int = 3

    val TRANS_BACK: Int = 10

    val TRANS_BOUNCE: Int = 9

    val TRANS_CIRC: Int = 8

    val TRANS_CUBIC: Int = 7

    val TRANS_ELASTIC: Int = 6

    val TRANS_EXPO: Int = 5

    val TRANS_LINEAR: Int = 0

    val TRANS_QUAD: Int = 4

    val TRANS_QUART: Int = 3

    val TRANS_QUINT: Int = 2

    val TRANS_SINE: Int = 1

    val TWEEN_PROCESS_IDLE: Int = 1

    val TWEEN_PROCESS_PHYSICS: Int = 0

    fun new(): Tween = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tween".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Tween" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tween(
        fn()
      )
    }}
}
