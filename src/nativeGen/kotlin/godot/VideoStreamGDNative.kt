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

open class VideoStreamGDNative internal constructor(
  _handle: COpaquePointer
) : VideoStream(_handle) {
  fun getFile(): String {
    val _ret = __method_bind.get_file.call(this._handle)
    return _ret.asString()
  }

  fun setFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.set_file.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VideoStreamGDNative = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoStreamGDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VideoStreamGDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VideoStreamGDNative(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VideoStreamGDNative = VideoStreamGDNative(ptr)
    /**
     * Container for method_bind pointers for VideoStreamGDNative
     */
    private object __method_bind {
      val get_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamGDNative".cstr.ptr,
            "get_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file" }
        }
      val set_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamGDNative".cstr.ptr,
            "set_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_file" }
        }}
  }
}
