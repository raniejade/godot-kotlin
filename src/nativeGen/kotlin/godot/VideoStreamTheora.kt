// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VideoStreamTheora internal constructor(
  _handle: COpaquePointer
) : VideoStream(_handle) {
  fun getFile(): String {
    TODO()
  }

  fun setFile(file: String) {
    TODO()
  }

  companion object {
    fun new(): VideoStreamTheora = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoStreamTheora".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VideoStreamTheora" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VideoStreamTheora(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VideoStreamTheora = VideoStreamTheora(ptr)
    /**
     * Container for method_bind pointers for VideoStreamTheora
     */
    private object __method_bind {
      val get_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamTheora".cstr.ptr,
              "get_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file" }
            }
          }

      val set_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamTheora".cstr.ptr,
              "set_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_file" }
            }
          }
    }
  }
}
