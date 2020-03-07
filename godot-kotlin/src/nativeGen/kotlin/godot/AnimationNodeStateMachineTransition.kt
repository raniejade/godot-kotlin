// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AnimationNodeStateMachineTransition(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
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

  /**
   * AnimationNodeStateMachineTransition::advance_condition_changed signal
   */
  val signalAdvanceConditionChanged: Signal0 = Signal0("advance_condition_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAdvanceCondition(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAdvanceCondition.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPriority(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPriority.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSwitchMode(): SwitchMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSwitchMode.call(self._handle, emptyList(), _retPtr)
      AnimationNodeStateMachineTransition.SwitchMode.from(_ret.value)
    }
  }

  fun getXfadeTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getXfadeTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun hasAutoAdvance(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutoAdvance.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAdvanceCondition(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdvanceCondition.call(self._handle, listOf(name), null)
    }
  }

  fun setAutoAdvance(autoAdvance: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoAdvance.call(self._handle, listOf(autoAdvance), null)
    }
  }

  fun setDisabled(disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisabled.call(self._handle, listOf(disabled), null)
    }
  }

  fun setPriority(priority: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPriority.call(self._handle, listOf(priority), null)
    }
  }

  fun setSwitchMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSwitchMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setXfadeTime(secs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setXfadeTime.call(self._handle, listOf(secs), null)
    }
  }

  enum class SwitchMode(
    val value: Int
  ) {
    IMMEDIATE(0),

    SYNC(1),

    AT_END(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachineTransition".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeStateMachineTransition" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeStateMachineTransition
     */
    private object __method_bind {
      val getAdvanceCondition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_advance_condition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_advance_condition" }
            }
          }

      val getPriority: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_priority" }
            }
          }

      val getSwitchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_switch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_switch_mode" }
            }
          }

      val getXfadeTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "get_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_xfade_time" }
            }
          }

      val hasAutoAdvance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "has_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_auto_advance" }
            }
          }

      val isDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val setAdvanceCondition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_advance_condition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_advance_condition" }
            }
          }

      val setAutoAdvance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_advance" }
            }
          }

      val setDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val setPriority: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_priority" }
            }
          }

      val setSwitchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_switch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_switch_mode" }
            }
          }

      val setXfadeTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachineTransition".cstr.ptr,
              "set_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_xfade_time" }
            }
          }
    }
  }
}
