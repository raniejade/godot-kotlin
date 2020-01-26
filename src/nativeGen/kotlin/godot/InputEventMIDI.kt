// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMIDI internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  companion object {
    fun new(): InputEventMIDI = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMIDI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventMIDI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMIDI(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for InputEventMIDI
     */
    private object __method_bind {
      val get_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_channel" }
            }
          }

      val get_controller_number: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_controller_number".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_number" }
            }
          }

      val get_controller_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_controller_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_value" }
            }
          }

      val get_instrument: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_instrument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instrument" }
            }
          }

      val get_message: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_message" }
            }
          }

      val get_pitch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch" }
            }
          }

      val get_pressure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressure" }
            }
          }

      val get_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_velocity" }
            }
          }

      val set_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_channel" }
            }
          }

      val set_controller_number: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_controller_number".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_number" }
            }
          }

      val set_controller_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_controller_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_value" }
            }
          }

      val set_instrument: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_instrument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instrument" }
            }
          }

      val set_message: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_message" }
            }
          }

      val set_pitch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch" }
            }
          }

      val set_pressure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressure" }
            }
          }

      val set_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_velocity" }
            }
          }
    }
  }
}
