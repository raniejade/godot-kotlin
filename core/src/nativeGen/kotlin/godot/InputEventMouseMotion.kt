// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouseMotion(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventMouse(null) {
  var pressure: Float
    get() {
       return getPressure() 
    }
    set(value) {
      setPressure(value)
    }

  var relative: Vector2
    get() {
       return getRelative() 
    }
    set(value) {
      setRelative(value)
    }

  var speed: Vector2
    get() {
       return getSpeed() 
    }
    set(value) {
      setSpeed(value)
    }

  var tilt: Vector2
    get() {
       return getTilt() 
    }
    set(value) {
      setTilt(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for relative
   */
  fun relative(cb: Vector2.() -> Unit) {
    val _p = relative
    cb(_p)
    relative = _p
  }

  /**
   * Specialized setter for speed
   */
  fun speed(cb: Vector2.() -> Unit) {
    val _p = speed
    cb(_p)
    speed = _p
  }

  /**
   * Specialized setter for tilt
   */
  fun tilt(cb: Vector2.() -> Unit) {
    val _p = tilt
    cb(_p)
    tilt = _p
  }

  fun getPressure(): Float {
    val _ret = __method_bind.getPressure.call(this._handle)
    return _ret.asFloat()
  }

  fun getRelative(): Vector2 {
    val _ret = __method_bind.getRelative.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpeed(): Vector2 {
    val _ret = __method_bind.getSpeed.call(this._handle)
    return _ret.asVector2()
  }

  fun getTilt(): Vector2 {
    val _ret = __method_bind.getTilt.call(this._handle)
    return _ret.asVector2()
  }

  fun setPressure(pressure: Float) {
    val _arg = Variant(pressure)
    __method_bind.setPressure.call(this._handle, listOf(_arg))
  }

  fun setRelative(relative: Vector2) {
    val _arg = Variant(relative)
    __method_bind.setRelative.call(this._handle, listOf(_arg))
  }

  fun setSpeed(speed: Vector2) {
    val _arg = Variant(speed)
    __method_bind.setSpeed.call(this._handle, listOf(_arg))
  }

  fun setTilt(tilt: Vector2) {
    val _arg = Variant(tilt)
    __method_bind.setTilt.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMouseMotion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventMouseMotion
     */
    private object __method_bind {
      val getPressure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure" }
        }
      val getRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative" }
        }
      val getSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val getTilt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_tilt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tilt" }
        }
      val setPressure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure" }
        }
      val setRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_relative" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }
      val setTilt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_tilt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tilt" }
        }}
  }
}
