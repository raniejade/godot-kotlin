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

open class ButtonGroup internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): ButtonGroup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ButtonGroup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ButtonGroup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ButtonGroup(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ButtonGroup
     */
    private object __method_bind {
      val get_buttons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ButtonGroup".cstr.ptr,
              "get_buttons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buttons" }
            }
          }

      val get_pressed_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ButtonGroup".cstr.ptr,
              "get_pressed_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
            }
          }
    }
  }
}
