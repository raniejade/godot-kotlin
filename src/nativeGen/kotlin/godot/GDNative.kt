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

open class GDNative internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun callNative(
    callingType: String,
    procedureName: String,
    arguments: VariantArray
  ): Variant {
    val _args = VariantArray.new()
    _args.append(callingType)
    _args.append(procedureName)
    _args.append(arguments)
    val _ret = __method_bind.call_native.call(this.toVariant(), _args.toVariant(), 3)
    return _ret
  }

  fun getLibrary(): GDNativeLibrary {
    val _ret = __method_bind.get_library.call(this.toVariant())
    return _ret.asObject(::GDNativeLibrary)!!
  }

  fun initialize(): Boolean {
    val _ret = __method_bind.initialize.call(this.toVariant())
    return _ret.asBool()
  }

  fun setLibrary(library: GDNativeLibrary) {
    val _arg = Variant.new(library)
    __method_bind.set_library.call(this.toVariant(), _arg, 1)
  }

  fun terminate(): Boolean {
    val _ret = __method_bind.terminate.call(this.toVariant())
    return _ret.asBool()
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
      val call_native: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
              "call_native".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_native" }
            }
          }

      val get_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
              "get_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_library" }
            }
          }

      val initialize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
              "initialize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method initialize" }
            }
          }

      val set_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
              "set_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_library" }
            }
          }

      val terminate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
              "terminate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method terminate" }
            }
          }
    }
  }
}
