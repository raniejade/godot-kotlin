// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GDNative(
  _handle: COpaquePointer
) : Reference(_handle) {
  var library: GDNativeLibrary
    get() {
       return getLibrary() 
    }
    set(value) {
      setLibrary(value)
    }

  fun callNative(
    callingType: String,
    procedureName: String,
    arguments: VariantArray
  ): Variant {
    val _args = VariantArray.new()
    _args.append(callingType)
    _args.append(procedureName)
    _args.append(arguments)
    val _ret = __method_bind.callNative.call(this._handle, _args.toVariant(), 3)
    return _ret
  }

  fun getLibrary(): GDNativeLibrary {
    val _ret = __method_bind.getLibrary.call(this._handle)
    return _ret.asObject(::GDNativeLibrary)!!
  }

  fun initialize(): Boolean {
    val _ret = __method_bind.initialize.call(this._handle)
    return _ret.asBoolean()
  }

  fun setLibrary(library: GDNativeLibrary) {
    val _arg = Variant.new(library)
    __method_bind.setLibrary.call(this._handle, _arg, 1)
  }

  fun terminate(): Boolean {
    val _ret = __method_bind.terminate.call(this._handle)
    return _ret.asBoolean()
  }

  companion object {
    fun new(): GDNative = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GDNative(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GDNative = GDNative(ptr)
    /**
     * Container for method_bind pointers for GDNative
     */
    private object __method_bind {
      val callNative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "callNative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method callNative" }
        }
      val getLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "getLibrary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLibrary" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val setLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "setLibrary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLibrary" }
        }
      val terminate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "terminate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method terminate" }
        }}
  }
}
