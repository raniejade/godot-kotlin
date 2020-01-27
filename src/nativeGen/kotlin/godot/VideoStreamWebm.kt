// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VideoStreamWebm internal constructor(
  _handle: COpaquePointer
) : VideoStream(_handle) {
  fun getFile(): String {
    val _ret = __method_bind.get_file.call(this.toVariant())
    TODO()
  }

  fun setFile(file: String) {
    val _args = VariantArray.new()
    _args.append(file)
    val _ret = __method_bind.set_file.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): VideoStreamWebm = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoStreamWebm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VideoStreamWebm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VideoStreamWebm(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VideoStreamWebm = VideoStreamWebm(ptr)
    /**
     * Container for method_bind pointers for VideoStreamWebm
     */
    private object __method_bind {
      val get_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamWebm".cstr.ptr,
              "get_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file" }
            }
          }

      val set_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamWebm".cstr.ptr,
              "set_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_file" }
            }
          }
    }
  }
}
