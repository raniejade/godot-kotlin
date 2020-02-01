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

open class AnimationNodeStateMachineTransition(
  _handle: COpaquePointer
) : Resource(_handle) {
  var advanceCondition: String
    get() {
       return getAdvanceCondition() 
    }
    set(value) {
      setAdvanceCondition(value)
    }

  var autoAdvance: Boolean
    get() {
       return hasAutoAdvance() 
    }
    set(value) {
      setAutoAdvance(value)
    }

  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var priority: Int
    get() {
       return getPriority() 
    }
    set(value) {
      setPriority(value)
    }

  var switchMode: SwitchMode
    get() {
       return getSwitchMode() 
    }
    set(value) {
      setSwitchMode(value.value)
    }

  var xfadeTime: Float
    get() {
       return getXfadeTime() 
    }
    set(value) {
      setXfadeTime(value)
    }

  fun getAdvanceCondition(): String {
    val _ret = __method_bind.getAdvanceCondition.call(this._handle)
    return _ret.asString()
  }

  fun getPriority(): Int {
    val _ret = __method_bind.getPriority.call(this._handle)
    return _ret.asInt()
  }

  fun getSwitchMode(): SwitchMode {
    val _ret = __method_bind.getSwitchMode.call(this._handle)
    return AnimationNodeStateMachineTransition.SwitchMode.from(_ret.asInt())
  }

  fun getXfadeTime(): Float {
    val _ret = __method_bind.getXfadeTime.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAutoAdvance(): Boolean {
    val _ret = __method_bind.hasAutoAdvance.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.isDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAdvanceCondition(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAdvanceCondition.call(this._handle, listOf(_arg))
  }

  fun setAutoAdvance(autoAdvance: Boolean) {
    val _arg = Variant.new(autoAdvance)
    __method_bind.setAutoAdvance.call(this._handle, listOf(_arg))
  }

  fun setDisabled(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisabled.call(this._handle, listOf(_arg))
  }

  fun setPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.setPriority.call(this._handle, listOf(_arg))
  }

  fun setSwitchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSwitchMode.call(this._handle, listOf(_arg))
  }

  fun setXfadeTime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setXfadeTime.call(this._handle, listOf(_arg))
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
      requireNotNull(fnPtr) { "No instance found for AnimationNodeStateMachineTransition" }
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
      val getAdvanceCondition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "get_advance_condition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_advance_condition" }
        }
      val getPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "get_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_priority" }
        }
      val getSwitchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "get_switch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_switch_mode" }
        }
      val getXfadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "get_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_xfade_time" }
        }
      val hasAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "has_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_auto_advance" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val setAdvanceCondition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_advance_condition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_advance_condition" }
        }
      val setAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_advance" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_priority" }
        }
      val setSwitchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_switch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_switch_mode" }
        }
      val setXfadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
            "set_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_xfade_time" }
        }}
  }
}
