// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class InputEventScreenDrag(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEvent(null) {
  var index: Int
    get() {
       return getIndex() 
    }
    set(value) {
      setIndex(value)
    }

  var position: Vector2
    get() {
       return getPosition() 
    }
    set(value) {
      setPosition(value)
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for position
   */
  fun position(cb: Vector2.() -> Unit) {
    val _p = position
    cb(_p)
    position = _p
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

  fun getIndex(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIndex.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRelative(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRelative.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSpeed(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSpeed.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setIndex(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIndex.call(self._handle, listOf(index), null)
    }
  }

  fun setPosition(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setRelative(relative: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRelative.call(self._handle, listOf(relative), null)
    }
  }

  fun setSpeed(speed: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeed.call(self._handle, listOf(speed), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenDrag".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventScreenDrag" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventScreenDrag
     */
    private object __method_bind {
      val getIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "get_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "get_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative" }
        }
      val getSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val setIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "set_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_index" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "set_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_relative" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }}
  }
}
