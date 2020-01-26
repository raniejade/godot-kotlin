// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class InputEventMouseButton internal constructor(
  _handle: COpaquePointer
) : InputEventMouse(_handle) {
  fun getButtonIndex(): Int {
    TODO()
  }

  fun getFactor(): Float {
    TODO()
  }

  fun isDoubleclick(): Boolean {
    TODO()
  }

  fun setButtonIndex(button_index: Int) {
    TODO()
  }

  fun setDoubleclick(doubleclick: Boolean) {
    TODO()
  }

  fun setFactor(factor: Float) {
    TODO()
  }

  fun setPressed(pressed: Boolean) {
    TODO()
  }

  companion object {
    fun new(): InputEventMouseButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventMouseButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMouseButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for InputEventMouseButton
     */
    private object __method_bind {
      val get_button_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "get_button_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_index" }
            }
          }

      val get_factor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "get_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_factor" }
            }
          }

      val is_doubleclick: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "is_doubleclick".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_doubleclick" }
            }
          }

      val set_button_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "set_button_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_index" }
            }
          }

      val set_doubleclick: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "set_doubleclick".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_doubleclick" }
            }
          }

      val set_factor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "set_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_factor" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseButton".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }
    }
  }
}
