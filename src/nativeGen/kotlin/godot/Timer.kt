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

open class Timer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getTimeLeft(): Float {
    val _ret = __method_bind.get_time_left.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTimerProcessMode(): TimerProcessMode {
    val _ret = __method_bind.get_timer_process_mode.call(this.toVariant())
    return Timer.TimerProcessMode.from(_ret.asInt())
  }

  fun getWaitTime(): Float {
    val _ret = __method_bind.get_wait_time.call(this.toVariant())
    return _ret.asFloat()
  }

  fun hasAutostart(): Boolean {
    val _ret = __method_bind.has_autostart.call(this.toVariant())
    return _ret.asBool()
  }

  fun isOneShot(): Boolean {
    val _ret = __method_bind.is_one_shot.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.is_paused.call(this.toVariant())
    return _ret.asBool()
  }

  fun isStopped(): Boolean {
    val _ret = __method_bind.is_stopped.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAutostart(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_autostart.call(this.toVariant(), _arg, 1)
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_one_shot.call(this.toVariant(), _arg, 1)
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant.new(paused)
    __method_bind.set_paused.call(this.toVariant(), _arg, 1)
  }

  fun setTimerProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_timer_process_mode.call(this.toVariant(), _arg, 1)
  }

  fun setWaitTime(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.set_wait_time.call(this.toVariant(), _arg, 1)
  }

  fun start(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.start.call(this.toVariant(), _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this.toVariant())
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
      val get_time_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_left" }
        }
      val get_timer_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_timer_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_timer_process_mode" }
        }
      val get_wait_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "get_wait_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
        }
      val has_autostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "has_autostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autostart" }
        }
      val is_one_shot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_shot" }
        }
      val is_paused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_paused" }
        }
      val is_stopped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "is_stopped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stopped" }
        }
      val set_autostart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_autostart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autostart" }
        }
      val set_one_shot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val set_paused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_paused" }
        }
      val set_timer_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
            "set_timer_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_timer_process_mode" }
        }
      val set_wait_time: CPointer<godot_method_bind>
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
