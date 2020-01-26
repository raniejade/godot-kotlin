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

open class ViewportTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  companion object {
    fun new(): ViewportTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ViewportTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ViewportTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ViewportTexture
     */
    private object __method_bind {
      val get_viewport_path_in_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
              "get_viewport_path_in_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_path_in_scene" }
            }
          }

      val set_viewport_path_in_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
              "set_viewport_path_in_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_viewport_path_in_scene" }
            }
          }
    }
  }
}
