// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_advance_condition.call(this.toVariant())
    TODO()
  }

  fun getPriority(): Int {
    val _ret = __method_bind.get_priority.call(this.toVariant())
    TODO()
  }

  fun getSwitchMode(): SwitchMode {
    val _ret = __method_bind.get_switch_mode.call(this.toVariant())
    TODO()
  }

  fun getXfadeTime(): Float {
    val _ret = __method_bind.get_xfade_time.call(this.toVariant())
    TODO()
  }

  fun hasAutoAdvance(): Boolean {
    val _ret = __method_bind.has_auto_advance.call(this.toVariant())
    TODO()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.is_disabled.call(this.toVariant())
    TODO()
  }

  fun setAdvanceCondition(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.set_advance_condition.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAutoAdvance(autoAdvance: Boolean) {
    val _args = VariantArray.new()
    _args.append(autoAdvance)
    val _ret = __method_bind.set_auto_advance.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDisabled(disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(disabled)
    val _ret = __method_bind.set_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPriority(priority: Int) {
    val _args = VariantArray.new()
    _args.append(priority)
    val _ret = __method_bind.set_priority.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSwitchMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_switch_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setXfadeTime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    val _ret = __method_bind.set_xfade_time.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class SwitchMode(
    val value: Int
  ) {
    SWITCH_MODE_IMMEDIATE(0),

    SWITCH_MODE_SYNC(1),

    SWITCH_MODE_AT_END(2);

    companion object {
      fun from(value: Int): SwitchMode {
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
    fun from(ptr: COpaquePointer): AnimationNodeStateMachineTransition =
        AnimationNodeStateMachineTransition(ptr)
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
