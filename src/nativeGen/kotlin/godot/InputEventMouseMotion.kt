// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouseMotion(
  _handle: COpaquePointer
) : InputEventMouse(_handle) {
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

  fun getRelative(): Vector2 {
    val _ret = __method_bind.getRelative.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpeed(): Vector2 {
    val _ret = __method_bind.getSpeed.call(this._handle)
    return _ret.asVector2()
  }

  fun setRelative(relative: Vector2) {
    val _arg = Variant.new(relative)
    __method_bind.setRelative.call(this._handle, _arg, 1)
  }

  fun setSpeed(speed: Vector2) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventMouseMotion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMouseMotion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMouseMotion(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventMouseMotion = InputEventMouseMotion(ptr)
    /**
     * Container for method_bind pointers for InputEventMouseMotion
     */
    private object __method_bind {
      val getRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative" }
        }
      val getSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val setRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_relative" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }}
  }
}
