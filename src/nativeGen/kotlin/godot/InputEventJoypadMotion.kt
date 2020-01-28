// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventJoypadMotion(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  var axis: Int
    get() {
       return getAxis() 
    }
    set(value) {
      setAxis(value)
    }

  var axisValue: Float
    get() {
       return getAxisValue() 
    }
    set(value) {
      setAxisValue(value)
    }

  fun getAxis(): Int {
    val _ret = __method_bind.getAxis.call(this._handle)
    return _ret.asInt()
  }

  fun getAxisValue(): Float {
    val _ret = __method_bind.getAxisValue.call(this._handle)
    return _ret.asFloat()
  }

  fun setAxis(axis: Int) {
    val _arg = Variant.new(axis)
    __method_bind.setAxis.call(this._handle, _arg, 1)
  }

  fun setAxisValue(axisValue: Float) {
    val _arg = Variant.new(axisValue)
    __method_bind.setAxisValue.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventJoypadMotion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventJoypadMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventJoypadMotion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventJoypadMotion(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventJoypadMotion = InputEventJoypadMotion(ptr)
    /**
     * Container for method_bind pointers for InputEventJoypadMotion
     */
    private object __method_bind {
      val getAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
            "get_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis" }
        }
      val getAxisValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
            "get_axis_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis_value" }
        }
      val setAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
            "set_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis" }
        }
      val setAxisValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
            "set_axis_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_value" }
        }}
  }
}
