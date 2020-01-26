// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ReferenceRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getBorderColor(): Color {
    TODO()
  }

  fun setBorderColor(color: Color) {
    TODO()
  }

  companion object {
    fun new(): ReferenceRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReferenceRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ReferenceRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ReferenceRect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ReferenceRect = ReferenceRect(ptr)
    /**
     * Container for method_bind pointers for ReferenceRect
     */
    private object __method_bind {
      val get_border_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
              "get_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_color" }
            }
          }

      val set_border_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
              "set_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_color" }
            }
          }
    }
  }
}
