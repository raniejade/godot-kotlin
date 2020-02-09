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

open class ProxyTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var base: Texture
    get() {
       return getBase() 
    }
    set(value) {
      setBase(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getBase(): Texture {
    val _ret = __method_bind.getBase.call(this._handle)
    return _ret.toAny() as Texture
  }

  fun setBase(base: Texture) {
    val _arg = Variant(base)
    __method_bind.setBase.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProxyTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProxyTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ProxyTexture
     */
    private object __method_bind {
      val getBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProxyTexture".cstr.ptr,
            "get_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base" }
        }
      val setBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProxyTexture".cstr.ptr,
            "set_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base" }
        }}
  }
}
