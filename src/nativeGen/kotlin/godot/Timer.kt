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

open class Timer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val TimerProcessIdle: Int = 1

    val TimerProcessPhysics: Int = 0

    fun new(): Timer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Timer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Timer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Timer(
        fn()
      )
    }}
}
