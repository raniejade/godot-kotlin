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

open class AnimationPlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val AnimationProcessIdle: Int = 1

    val AnimationProcessManual: Int = 2

    val AnimationProcessPhysics: Int = 0

    fun new(): AnimationPlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AnimationPlayer(
        fn()
      )
    }}
}
