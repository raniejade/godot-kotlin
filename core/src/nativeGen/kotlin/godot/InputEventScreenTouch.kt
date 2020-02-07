// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class InputEventScreenTouch(
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

  var pressed: Boolean
    get() {
       return isPressed() 
    }
    set(value) {
      setPressed(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for position
   */
  fun position(cb: Vector2.() -> Unit) {
    val _p = position
    cb(_p)
    position = _p
  }

  fun getIndex(): Int {
    val _ret = __method_bind.getIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun setIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.setIndex.call(this._handle, listOf(_arg))
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setPosition.call(this._handle, listOf(_arg))
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenTouch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventScreenTouch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventScreenTouch
     */
    private object __method_bind {
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "get_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val setIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "set_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_index" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "set_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed" }
        }}
  }
}
