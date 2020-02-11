// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouse(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventWithModifiers(null) {
  var buttonMask: Int
    get() {
       return getButtonMask() 
    }
    set(value) {
      setButtonMask(value)
    }

  var globalPosition: Vector2
    get() {
       return getGlobalPosition() 
    }
    set(value) {
      setGlobalPosition(value)
    }

  var position: Vector2
    get() {
       return getPosition() 
    }
    set(value) {
      setPosition(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for globalPosition
   */
  fun globalPosition(cb: Vector2.() -> Unit) {
    val _p = globalPosition
    cb(_p)
    globalPosition = _p
  }

  /**
   * Specialized setter for position
   */
  fun position(cb: Vector2.() -> Unit) {
    val _p = position
    cb(_p)
    position = _p
  }

  fun getButtonMask(): Int {
    val _ret = __method_bind.getButtonMask.call(this._handle)
    return _ret.asInt()
  }

  fun getGlobalPosition(): Vector2 {
    val _ret = __method_bind.getGlobalPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun setButtonMask(buttonMask: Int) {
    val _arg = Variant(buttonMask)
    __method_bind.setButtonMask.call(this._handle, listOf(_arg))
  }

  fun setGlobalPosition(globalPosition: Vector2) {
    val _arg = Variant(globalPosition)
    __method_bind.setGlobalPosition.call(this._handle, listOf(_arg))
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant(position)
    __method_bind.setPosition.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventMouse
     */
    private object __method_bind {
      val getButtonMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "get_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val setButtonMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "set_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
        }
      val setGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }}
  }
}
