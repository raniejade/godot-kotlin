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

open class InputEventJoypadButton internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  fun getButtonIndex(): Int {
    val _ret = __method_bind.get_button_index.call(this.toVariant())
    TODO()
  }

  fun getPressure(): Float {
    val _ret = __method_bind.get_pressure.call(this.toVariant())
    TODO()
  }

  fun setButtonIndex(buttonIndex: Int) {
    val _args = VariantArray.new()
    _args.append(buttonIndex)
    val _ret = __method_bind.set_button_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPressed(pressed: Boolean) {
    val _args = VariantArray.new()
    _args.append(pressed)
    val _ret = __method_bind.set_pressed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPressure(pressure: Float) {
    val _args = VariantArray.new()
    _args.append(pressure)
    val _ret = __method_bind.set_pressure.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): InputEventJoypadButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventJoypadButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventJoypadButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventJoypadButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventJoypadButton = InputEventJoypadButton(ptr)
    /**
     * Container for method_bind pointers for InputEventJoypadButton
     */
    private object __method_bind {
      val get_button_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
              "get_button_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_index" }
            }
          }

      val get_pressure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
              "get_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressure" }
            }
          }

      val set_button_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
              "set_button_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_index" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val set_pressure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventJoypadButton".cstr.ptr,
              "set_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressure" }
            }
          }
    }
  }
}
