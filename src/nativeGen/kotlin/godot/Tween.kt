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
  companion object {
    val EaseIn: Int = 0

    val EaseInOut: Int = 2

    val EaseOut: Int = 1

    val EaseOutIn: Int = 3

    val TransBack: Int = 10

    val TransBounce: Int = 9

    val TransCirc: Int = 8

    val TransCubic: Int = 7

    val TransElastic: Int = 6

    val TransExpo: Int = 5

    val TransLinear: Int = 0

    val TransQuad: Int = 4

    val TransQuart: Int = 3

    val TransQuint: Int = 2

    val TransSine: Int = 1

    val TweenProcessIdle: Int = 1

    val TweenProcessPhysics: Int = 0

    fun new(): Tween = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tween".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Tween" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tween(
        fn()
      )
    }}
}
