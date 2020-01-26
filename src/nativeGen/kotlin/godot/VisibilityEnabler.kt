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

open class VisibilityEnabler internal constructor(
  _handle: COpaquePointer
) : VisibilityNotifier(_handle) {
  companion object {
    val EnablerFreezeBodies: Int = 1

    val EnablerMax: Int = 2

    val EnablerPauseAnimations: Int = 0

    fun new(): VisibilityEnabler = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisibilityEnabler" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityEnabler(
        fn()
      )
    }}
}
