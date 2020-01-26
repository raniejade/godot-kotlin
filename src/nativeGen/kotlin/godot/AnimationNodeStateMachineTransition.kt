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
  enum class SwitchMode(
    val value: Int
  ) {
    SWITCH_MODE_IMMEDIATE(0),

    SWITCH_MODE_SYNC(1),

    SWITCH_MODE_AT_END(2);
  }

  companion object {
    val SWITCH_MODE_AT_END: Int = 2

    val SWITCH_MODE_IMMEDIATE: Int = 0

    val SWITCH_MODE_SYNC: Int = 1

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
