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

open class Timer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var autostart: Boolean
    get() {
       return hasAutostart() 
    }
    set(value) {
      setAutostart(value)
    }

  var oneShot: Boolean
    get() {
       return isOneShot() 
    }
    set(value) {
      setOneShot(value)
    }

  var paused: Boolean
    get() {
       return isPaused() 
    }
    set(value) {
      setPaused(value)
    }

  var processMode: TimerProcessMode
    get() {
       return getTimerProcessMode() 
    }
    set(value) {
      setTimerProcessMode(value.value)
    }

  val timeLeft: Float
    get() {
       return getTimeLeft() 
    }

  var waitTime: Float
    get() {
       return getWaitTime() 
    }
    set(value) {
      setWaitTime(value)
    }

  /**
   * Timer::timeout signal
   */
  val signalTimeout: Signal0 = Signal0("timeout")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getTimeLeft(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeLeft.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTimerProcessMode(): TimerProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimerProcessMode.call(self._handle, emptyList(), _retPtr)
      Timer.TimerProcessMode.from(_ret.value)
    }
  }

  fun getWaitTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWaitTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun hasAutostart(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutostart.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOneShot(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOneShot.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPaused(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPaused.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isStopped(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStopped.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAutostart(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutostart.call(self._handle, listOf(enable), null)
    }
  }

  fun setOneShot(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneShot.call(self._handle, listOf(enable), null)
    }
  }

  fun setPaused(paused: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPaused.call(self._handle, listOf(paused), null)
    }
  }

  fun setTimerProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTimerProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setWaitTime(timeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWaitTime.call(self._handle, listOf(timeSec), null)
    }
  }

  fun start(timeSec: Float = -1.0f) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.start.call(self._handle, listOf(timeSec), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  enum class TimerProcessMode(
    val value: Int
  ) {
    PHYSICS(0),

    IDLE(1);

    companion object {
      fun from(value: Int): TimerProcessMode {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Timer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Timer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Timer
     */
    private object __method_bind {
      val getTimeLeft: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_time_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_left" }
            }
          }

      val getTimerProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_timer_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_timer_process_mode" }
            }
          }

      val getWaitTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
            }
          }

      val hasAutostart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "has_autostart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autostart" }
            }
          }

      val isOneShot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_one_shot" }
            }
          }

      val isPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val isStopped: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_stopped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stopped" }
            }
          }

      val setAutostart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_autostart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autostart" }
            }
          }

      val setOneShot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val setPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_paused" }
            }
          }

      val setTimerProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_timer_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_timer_process_mode" }
            }
          }

      val setWaitTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
