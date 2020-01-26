// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun getTimerProcessMode(): TimerProcessMode {
    TODO()
  }

  fun getWaitTime(): Float {
    TODO()
  }

  fun hasAutostart(): Boolean {
    TODO()
  }

  fun isOneShot(): Boolean {
    TODO()
  }

  fun isPaused(): Boolean {
    TODO()
  }

  fun isStopped(): Boolean {
    TODO()
  }

  fun setAutostart(enable: Boolean) {
    TODO()
  }

  fun setOneShot(enable: Boolean) {
    TODO()
  }

  fun setPaused(paused: Boolean) {
    TODO()
  }

  fun setTimerProcessMode(mode: Int) {
    TODO()
  }

  fun setWaitTime(time_sec: Float) {
    TODO()
  }

  fun start(time_sec: Float) {
    TODO()
  }

  fun stop() {
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton Timer" }
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
      val get_time_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_time_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_left" }
            }
          }

      val get_timer_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_timer_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_timer_process_mode" }
            }
          }

      val get_wait_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "get_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wait_time" }
            }
          }

      val has_autostart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "has_autostart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autostart" }
            }
          }

      val is_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_one_shot" }
            }
          }

      val is_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val is_stopped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "is_stopped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stopped" }
            }
          }

      val set_autostart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_autostart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autostart" }
            }
          }

      val set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val set_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_paused" }
            }
          }

      val set_timer_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_timer_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_timer_process_mode" }
            }
          }

      val set_wait_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "set_wait_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wait_time" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Timer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
