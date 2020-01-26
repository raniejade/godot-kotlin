// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeStateMachineTransition internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAdvanceCondition(): String {
    TODO()
  }

  fun getPriority(): Int {
    TODO()
  }

  fun getSwitchMode(): SwitchMode {
    TODO()
  }

  fun getXfadeTime(): Float {
    TODO()
  }

  fun hasAutoAdvance(): Boolean {
    TODO()
  }

  fun isDisabled(): Boolean {
    TODO()
  }

  fun setAdvanceCondition(name: String) {
    TODO()
  }

  fun setAutoAdvance(auto_advance: Boolean) {
    TODO()
  }

  fun setDisabled(disabled: Boolean) {
    TODO()
  }

  fun setPriority(priority: Int) {
    TODO()
  }

  fun setSwitchMode(mode: Int) {
    TODO()
  }

  fun setXfadeTime(secs: Float) {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeStateMachineTransition"
        }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeStateMachineTransition(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationNodeStateMachineTransition
     */
    private object __method_bind {
      val get_advance_condition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_advance_condition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_advance_condition" }
            }
          }

      val get_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_priority" }
            }
          }

      val get_switch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_switch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_switch_mode" }
            }
          }

      val get_xfade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_xfade_time" }
            }
          }

      val has_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "has_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_auto_advance" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val set_advance_condition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_advance_condition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_advance_condition" }
            }
          }

      val set_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_advance" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_priority" }
            }
          }

      val set_switch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_switch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_switch_mode" }
            }
          }

      val set_xfade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_xfade_time" }
            }
          }
    }
  }
}
