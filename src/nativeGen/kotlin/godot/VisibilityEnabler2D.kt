// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityEnabler2D internal constructor(
  _handle: COpaquePointer
) : VisibilityNotifier2D(_handle) {
  fun isEnablerEnabled(enabler: Int): Boolean {
    TODO()
  }

  fun setEnabler(enabler: Int, enabled: Boolean) {
    TODO()
  }

  enum class Enabler(
    val value: Int
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_PAUSE_PARTICLES(2),

    ENABLER_PARENT_PROCESS(3),

    ENABLER_PARENT_PHYSICS_PROCESS(4),

    ENABLER_PAUSE_ANIMATED_SPRITES(5),

    ENABLER_MAX(6);
  }

  companion object {
    val ENABLER_FREEZE_BODIES: Int = 1

    val ENABLER_MAX: Int = 6

    val ENABLER_PARENT_PHYSICS_PROCESS: Int = 4

    val ENABLER_PARENT_PROCESS: Int = 3

    val ENABLER_PAUSE_ANIMATED_SPRITES: Int = 5

    val ENABLER_PAUSE_ANIMATIONS: Int = 0

    val ENABLER_PAUSE_PARTICLES: Int = 2

    fun new(): VisibilityEnabler2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisibilityEnabler2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityEnabler2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisibilityEnabler2D
     */
    private object __method_bind {
      val is_enabler_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
              "is_enabler_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
            }
          }

      val set_enabler: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
              "set_enabler".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabler" }
            }
          }
    }
  }
}
