// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class StreamTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var loadPath: String
    get() {
       return getLoadPath() 
    }
    set(value) {
      load(value)
    }

  fun getLoadPath(): String {
    val _ret = __method_bind.getLoadPath.call(this._handle)
    return _ret.asString()
  }

  fun load(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): StreamTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StreamTexture = StreamTexture(ptr)
    /**
     * Container for method_bind pointers for StreamTexture
     */
    private object __method_bind {
      val getLoadPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamTexture".cstr.ptr,
            "get_load_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_load_path" }
        }
      val load: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamTexture".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }}
  }
}
