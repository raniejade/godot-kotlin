// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class GDNative(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var library: GDNativeLibrary
    get() {
       return getLibrary() 
    }
    set(value) {
      setLibrary(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun callNative(
    callingType: String,
    procedureName: String,
    arguments: VariantArray
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(callingType))
    _args.add(Variant.fromAny(procedureName))
    _args.add(Variant.fromAny(arguments))
    val _ret = __method_bind.callNative.call(this._handle, _args)
    return _ret
  }

  fun getLibrary(): GDNativeLibrary {
    val _ret = __method_bind.getLibrary.call(this._handle)
    return _ret.toAny() as GDNativeLibrary
  }

  fun initialize(): Boolean {
    val _ret = __method_bind.initialize.call(this._handle)
    return _ret.asBoolean()
  }

  fun setLibrary(library: GDNativeLibrary) {
    val _arg = Variant(library)
    __method_bind.setLibrary.call(this._handle, listOf(_arg))
  }

  fun terminate(): Boolean {
    val _ret = __method_bind.terminate.call(this._handle)
    return _ret.asBoolean()
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GDNative
     */
    private object __method_bind {
      val callNative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "call_native".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_native" }
        }
      val getLibrary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "get_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_library" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val setLibrary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "set_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_library" }
        }
      val terminate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNative".cstr.ptr,
            "terminate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method terminate" }
        }}
  }
}
