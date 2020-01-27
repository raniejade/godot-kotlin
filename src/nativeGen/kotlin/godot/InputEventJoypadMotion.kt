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

open class InputEventJoypadMotion internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  fun getAxis(): Int {
    val _ret = __method_bind.get_axis.call(this.toVariant())
    TODO()
  }

  fun getAxisValue(): Float {
    val _ret = __method_bind.get_axis_value.call(this.toVariant())
    TODO()
  }

  fun setAxis(axis: Int) {
    val _args = VariantArray.new()
    _args.append(axis)
    val _ret = __method_bind.set_axis.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAxisValue(axisValue: Float) {
    val _args = VariantArray.new()
    _args.append(axisValue)
    val _ret = __method_bind.set_axis_value.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): InputEventJoypadMotion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventJoypadMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventJoypadMotion" }
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
      val get_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "get_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis" }
            }
          }

      val get_axis_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "get_axis_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis_value" }
            }
          }

      val set_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "set_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis" }
            }
          }

      val set_axis_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadMotion".cstr.ptr,
              "set_axis_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_value" }
            }
          }
    }
  }
}
