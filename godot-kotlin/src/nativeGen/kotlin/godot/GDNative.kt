// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(callingType)
      _args.add(procedureName)
      _args.add(arguments)
      __method_bind.callNative.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLibrary(): GDNativeLibrary {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: GDNativeLibrary
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLibrary.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<GDNativeLibrary>(_tmp.value!!)
      _ret
    }
  }

  fun initialize(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.initialize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setLibrary(library: GDNativeLibrary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLibrary.call(self._handle, listOf(library), null)
    }
  }

  fun terminate(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.terminate.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
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
