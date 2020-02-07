// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VideoStreamWebm(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VideoStream(null) {
  var file: String
    get() {
       return getFile() 
    }
    set(value) {
      setFile(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getFile(): String {
    val _ret = __method_bind.getFile.call(this._handle)
    return _ret.asString()
  }

  fun setFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.setFile.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoStreamWebm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VideoStreamWebm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VideoStreamWebm
     */
    private object __method_bind {
      val getFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamWebm".cstr.ptr,
            "get_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file" }
        }
      val setFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoStreamWebm".cstr.ptr,
            "set_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_file" }
        }}
  }
}
