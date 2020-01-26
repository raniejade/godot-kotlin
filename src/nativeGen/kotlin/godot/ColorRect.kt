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

open class ColorRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getFrameColor(): Color {
    TODO()
  }

  fun setFrameColor() {
    TODO()
  }

  companion object {
    fun new(): ColorRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ColorRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorRect(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ColorRect
     */
    private object __method_bind {
      val get_frame_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorRect".cstr.ptr,
              "get_frame_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_color" }
            }
          }

      val set_frame_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorRect".cstr.ptr,
              "set_frame_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_color" }
            }
          }
    }
  }
}
