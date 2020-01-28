// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

  var processMode: Int
    get() {
       return Timer.TimerProcessMode.from(getTimerProcessMode()) 
    }
    set(value) {
      setTimerProcessMode(Timer.TimerProcessMode.from(value))
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
    __method_bind.setAutostart.call(this._handle, _arg, 1)
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setOneShot.call(this._handle, _arg, 1)
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant.new(paused)
    __method_bind.setPaused.call(this._handle, _arg, 1)
  }

  fun setTimerProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTimerProcessMode.call(this._handle, _arg, 1)
  }

  fun setWaitTime(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.setWaitTime.call(this._handle, _arg, 1)
  }

  fun start(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.start.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  enum class TimerProcessMode(
    val value: Int
  ) {
    TIMER_PROCESS_PHYSICS(0),

    TIMER_PROCESS_IDLE(1);

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
            "getTimeLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimeLeft" }
        }
      val getTimerProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "getTimerProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimerProcessMode" }
        }
      val getWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "getWaitTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWaitTime" }
        }
      val hasAutostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "hasAutostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAutostart" }
        }
      val isOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "isOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOneShot" }
        }
      val isPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "isPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPaused" }
        }
      val isStopped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "isStopped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isStopped" }
        }
      val setAutostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "setAutostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutostart" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "setOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOneShot" }
        }
      val setPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "setPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPaused" }
        }
      val setTimerProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "setTimerProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTimerProcessMode" }
        }
      val setWaitTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "setWaitTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWaitTime" }
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
