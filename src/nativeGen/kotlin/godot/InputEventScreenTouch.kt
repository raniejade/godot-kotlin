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

open class InputEventScreenTouch internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  companion object {
    fun new(): InputEventScreenTouch = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenTouch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventScreenTouch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventScreenTouch(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for InputEventScreenTouch
     */
    private object __method_bind {
      val get_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
              "get_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val set_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
              "set_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_index" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenTouch".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }
    }
  }
}
