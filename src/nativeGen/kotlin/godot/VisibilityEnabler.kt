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

open class VisibilityEnabler internal constructor(
  _handle: COpaquePointer
) : VisibilityNotifier(_handle) {
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

    ENABLER_MAX(2);

    companion object {
      fun from(value: Int): Enabler {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val ENABLER_FREEZE_BODIES: Int = 1

    val ENABLER_MAX: Int = 2

    val ENABLER_PAUSE_ANIMATIONS: Int = 0

    fun new(): VisibilityEnabler = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisibilityEnabler" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityEnabler(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityEnabler = VisibilityEnabler(ptr)
    /**
     * Container for method_bind pointers for VisibilityEnabler
     */
    private object __method_bind {
      val is_enabler_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
              "is_enabler_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
            }
          }

      val set_enabler: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
              "set_enabler".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabler" }
            }
          }
    }
  }
}
