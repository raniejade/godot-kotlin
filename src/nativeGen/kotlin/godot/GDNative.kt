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
    calling_type: String,
    procedure_name: String,
    arguments: VariantArray
  ): Variant {
    TODO()
  }

  fun getLibrary(): GDNativeLibrary {
    TODO()
  }

  fun initialize(): Boolean {
    TODO()
  }

  fun setLibrary(library: GDNativeLibrary) {
    TODO()
  }

  fun terminate(): Boolean {
    TODO()
  }

  companion object {
    fun new(): GDNative = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GDNative" }
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
