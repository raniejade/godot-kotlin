// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Timer(
  _handle: COpaquePointer
) : Node(_handle) {
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

  fun getTimeLeft(): Float {
    val _ret = __method_bind.getTimeLeft.call(this._handle)
    return _ret.asFloat()
  }

  fun getTimerProcessMode(): TimerProcessMode {
    val _ret = __method_bind.getTimerProcessMode.call(this._handle)
    return Timer.TimerProcessMode.from(_ret.asInt())
  }

  fun getWaitTime(): Float {
    val _ret = __method_bind.getWaitTime.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAutostart(): Boolean {
    val _ret = __method_bind.hasAutostart.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOneShot(): Boolean {
    val _ret = __method_bind.isOneShot.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.isPaused.call(this._handle)
    return _ret.asBoolean()
  }

  fun isStopped(): Boolean {
    val _ret = __method_bind.isStopped.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAutostart(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutostart.call(this._handle, listOf(_arg))
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setOneShot.call(this._handle, listOf(_arg))
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant.new(paused)
    __method_bind.setPaused.call(this._handle, listOf(_arg))
  }

  fun setTimerProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTimerProcessMode.call(this._handle, listOf(_arg))
  }

  fun setWaitTime(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.setWaitTime.call(this._handle, listOf(_arg))
  }

  fun start(timeSec: Float = -1.0f) {
    val _arg = Variant.new(timeSec)
    __method_bind.start.call(this._handle, listOf(_arg))
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
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
    val TIMER_PROCESS_IDLE: Int = 1

    val TIMER_PROCESS_PHYSICS: Int = 0

    fun new(): Timer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Timer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Timer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Timer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Timer = Timer(ptr)
    /**
     * Container for method_bind pointers for Timer
     */
    private object __method_bind {
      val getTimeLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_left" }
        }
      val getTimerProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_timer_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_timer_process_mode" }
        }
      val getWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_wait_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
        }
      val hasAutostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "has_autostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autostart" }
        }
      val isOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_shot" }
        }
      val isPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_paused" }
        }
      val isStopped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_stopped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stopped" }
        }
      val setAutostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_autostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autostart" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val setPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_paused" }
        }
      val setTimerProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_timer_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_timer_process_mode" }
        }
      val setWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_wait_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
        }
      val start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
