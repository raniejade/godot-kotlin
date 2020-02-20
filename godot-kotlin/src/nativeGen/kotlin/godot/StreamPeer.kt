// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

open class StreamPeer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var bigEndian: Boolean
    get() {
       return isBigEndianEnabled() 
    }
    set(value) {
      setBigEndian(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun get16(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.get16.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun get32(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.get32.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun get64(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.get64.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun get8(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.get8.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAvailableBytes(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAvailableBytes.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getData(bytes: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getData.call(self._handle, listOf(bytes), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDouble(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDouble.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFloat(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFloat.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPartialData(bytes: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPartialData.call(self._handle, listOf(bytes), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getString(bytes: Int = -1): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getString.call(self._handle, listOf(bytes), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getU16(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getU16.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getU32(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getU32.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getU64(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getU64.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getU8(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getU8.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUtf8String(bytes: Int = -1): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getUtf8String.call(self._handle, listOf(bytes), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVar(allowObjects: Boolean = false): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getVar.call(self._handle, listOf(allowObjects), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isBigEndianEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBigEndianEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun put16(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.put16.call(self._handle, listOf(value), null)
    }
  }

  fun put32(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.put32.call(self._handle, listOf(value), null)
    }
  }

  fun put64(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.put64.call(self._handle, listOf(value), null)
    }
  }

  fun put8(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.put8.call(self._handle, listOf(value), null)
    }
  }

  fun putData(data: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.putData.call(self._handle, listOf(data), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun putDouble(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putDouble.call(self._handle, listOf(value), null)
    }
  }

  fun putFloat(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putFloat.call(self._handle, listOf(value), null)
    }
  }

  fun putPartialData(data: PoolByteArray): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.putPartialData.call(self._handle, listOf(data), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun putString(value: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putString.call(self._handle, listOf(value), null)
    }
  }

  fun putU16(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putU16.call(self._handle, listOf(value), null)
    }
  }

  fun putU32(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putU32.call(self._handle, listOf(value), null)
    }
  }

  fun putU64(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putU64.call(self._handle, listOf(value), null)
    }
  }

  fun putU8(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putU8.call(self._handle, listOf(value), null)
    }
  }

  fun putUtf8String(value: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.putUtf8String.call(self._handle, listOf(value), null)
    }
  }

  fun putVar(value: Variant, fullObjects: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(value)
      _args.add(fullObjects)
      __method_bind.putVar.call(self._handle, _args, null)
    }
  }

  fun setBigEndian(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBigEndian.call(self._handle, listOf(enable), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for StreamPeer
     */
    private object __method_bind {
      val get16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_16" }
        }
      val get32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_32" }
        }
      val get64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_64" }
        }
      val get8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_8" }
        }
      val getAvailableBytes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_available_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_bytes" }
        }
      val getData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getDouble: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_double" }
        }
      val getFloat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_float" }
        }
      val getPartialData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_partial_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_partial_data" }
        }
      val getString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_string" }
        }
      val getU16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u16" }
        }
      val getU32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u32" }
        }
      val getU64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u64" }
        }
      val getU8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u8" }
        }
      val getUtf8String: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_utf8_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_utf8_string" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isBigEndianEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "is_big_endian_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_big_endian_enabled" }
        }
      val put16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_16" }
        }
      val put32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_32" }
        }
      val put64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_64" }
        }
      val put8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_8" }
        }
      val putData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_data" }
        }
      val putDouble: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_double" }
        }
      val putFloat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_float" }
        }
      val putPartialData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_partial_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_partial_data" }
        }
      val putString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_string" }
        }
      val putU16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u16" }
        }
      val putU32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u32" }
        }
      val putU64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u64" }
        }
      val putU8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u8" }
        }
      val putUtf8String: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_utf8_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_utf8_string" }
        }
      val putVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_var" }
        }
      val setBigEndian: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "set_big_endian".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_big_endian" }
        }}
  }
}
