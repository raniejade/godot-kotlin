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

open class VisibilityEnabler2D internal constructor(
  _handle: COpaquePointer
) : VisibilityNotifier2D(_handle) {
  companion object {
    val EnablerFreezeBodies: Int = 1

    val EnablerMax: Int = 6

    val EnablerParentPhysicsProcess: Int = 4

    val EnablerParentProcess: Int = 3

    val EnablerPauseAnimatedSprites: Int = 5

    val EnablerPauseAnimations: Int = 0

    val EnablerPauseParticles: Int = 2

    fun new(): VisibilityEnabler2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisibilityEnabler2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisibilityEnabler2D(
        fn()
      )
    }}
}
