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

open class PanoramaSky(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Sky(null) {
  var panorama: Texture
    get() {
       return getPanorama() 
    }
    set(value) {
      setPanorama(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getPanorama(): Texture {
    val _ret = __method_bind.getPanorama.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun setPanorama(texture: Texture) {
    val _arg = Variant(texture)
    __method_bind.setPanorama.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PanoramaSky".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PanoramaSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
