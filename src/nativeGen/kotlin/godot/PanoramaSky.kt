// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PanoramaSky(
  _handle: COpaquePointer
) : Sky(_handle) {
  var panorama: Texture
    get() {
       return getPanorama() 
    }
    set(value) {
      setPanorama(value)
    }

  fun getPanorama(): Texture {
    val _ret = __method_bind.getPanorama.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun setPanorama(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setPanorama.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PanoramaSky = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PanoramaSky".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PanoramaSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PanoramaSky(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PanoramaSky = PanoramaSky(ptr)
    /**
     * Container for method_bind pointers for PanoramaSky
     */
    private object __method_bind {
      val getPanorama: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PanoramaSky".cstr.ptr,
            "get_panorama".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_panorama" }
        }
      val setPanorama: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PanoramaSky".cstr.ptr,
            "set_panorama".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_panorama" }
        }}
  }
}
