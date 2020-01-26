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

open class AnimationNodeStateMachineTransition internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val SwitchModeAtEnd: Int = 2

    val SwitchModeImmediate: Int = 0

    val SwitchModeSync: Int = 1

    fun new(): AnimationNodeStateMachineTransition = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachineTransition".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationNodeStateMachineTransition" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AnimationNodeStateMachineTransition(
        fn()
      )
    }}
}
