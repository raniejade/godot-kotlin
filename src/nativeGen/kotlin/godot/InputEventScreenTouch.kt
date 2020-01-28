// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventScreenTouch(
  _handle: COpaquePointer
) : InputEvent(_handle) {
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
    __method_bind.setIndex.call(this._handle, _arg, 1)
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setPosition.call(this._handle, _arg, 1)
  }

  fun setPressed(pressed: Boolean) {
    val _arg = Variant.new(pressed)
    __method_bind.setPressed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventScreenTouch = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenTouch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventScreenTouch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventScreenTouch(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventScreenTouch = InputEventScreenTouch(ptr)
    /**
     * Container for method_bind pointers for InputEventScreenTouch
     */
    private object __method_bind {
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "getIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIndex" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "getPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPosition" }
        }
      val setIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "setIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIndex" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "setPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPosition" }
        }
      val setPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
            "setPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressed" }
        }}
  }
}
