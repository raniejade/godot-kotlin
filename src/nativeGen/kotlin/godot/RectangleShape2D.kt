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

open class RectangleShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  companion object {
    fun new(): RectangleShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RectangleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RectangleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RectangleShape2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RectangleShape2D
     */
    private object __method_bind {
      val get_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }
    }
  }
}
