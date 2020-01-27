// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventAction internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  fun getAction(): String {
    val _ret = __method_bind.get_action.call(this.toVariant())
    return _ret.asString()
  }

  fun getStrength(): Float {
    val _ret = __method_bind.get_strength.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setAction(action: String) {
    val _args = VariantArray.new()
    _args.append(action)
    __method_bind.set_action.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPressed(pressed: Boolean) {
    val _args = VariantArray.new()
    _args.append(pressed)
    __method_bind.set_pressed.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setStrength(strength: Float) {
    val _args = VariantArray.new()
    _args.append(strength)
    __method_bind.set_strength.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): InputEventAction = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventAction".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventAction(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventAction = InputEventAction(ptr)
    /**
     * Container for method_bind pointers for InputEventAction
     */
    private object __method_bind {
      val get_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "get_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action" }
            }
          }

      val get_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "get_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_strength" }
            }
          }

      val set_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val set_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventAction".cstr.ptr,
              "set_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_strength" }
            }
          }
    }
  }
}
