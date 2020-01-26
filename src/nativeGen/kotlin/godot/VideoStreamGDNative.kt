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

open class VideoStreamGDNative internal constructor(
  _handle: COpaquePointer
) : VideoStream(_handle) {
  companion object {
    fun new(): VideoStreamGDNative = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoStreamGDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VideoStreamGDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VideoStreamGDNative(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VideoStreamGDNative
     */
    private object __method_bind {
      val get_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamGDNative".cstr.ptr,
              "get_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file" }
            }
          }

      val set_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamGDNative".cstr.ptr,
              "set_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_file" }
            }
          }
    }
  }
}
