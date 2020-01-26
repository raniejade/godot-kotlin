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
  enum class Enabler(
    val value: Int
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_MAX(2);
  }

  companion object {
    val ENABLER_FREEZE_BODIES: Int = 1

    val ENABLER_MAX: Int = 2

    val ENABLER_PAUSE_ANIMATIONS: Int = 0

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
