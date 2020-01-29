// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeer(
  _handle: COpaquePointer
) : Reference(_handle) {
  var bigEndian: Boolean
    get() {
       return isBigEndianEnabled() 
    }
    set(value) {
      setBigEndian(value)
    }

  fun get16(): Int {
    val _ret = __method_bind.get16.call(this._handle)
    return _ret.asInt()
  }

  fun get32(): Int {
    val _ret = __method_bind.get32.call(this._handle)
    return _ret.asInt()
  }

  fun get64(): Int {
    val _ret = __method_bind.get64.call(this._handle)
    return _ret.asInt()
  }

  fun get8(): Int {
    val _ret = __method_bind.get8.call(this._handle)
    return _ret.asInt()
  }

  fun getAvailableBytes(): Int {
    val _ret = __method_bind.getAvailableBytes.call(this._handle)
    return _ret.asInt()
  }

  fun getData(bytes: Int): VariantArray {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.getData.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getDouble(): Float {
    val _ret = __method_bind.getDouble.call(this._handle)
    return _ret.asFloat()
  }

  fun getFloat(): Float {
    val _ret = __method_bind.getFloat.call(this._handle)
    return _ret.asFloat()
  }

  fun getPartialData(bytes: Int): VariantArray {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.getPartialData.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getString(bytes: Int = -1): String {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.getString.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getU16(): Int {
    val _ret = __method_bind.getU16.call(this._handle)
    return _ret.asInt()
  }

  fun getU32(): Int {
    val _ret = __method_bind.getU32.call(this._handle)
    return _ret.asInt()
  }

  fun getU64(): Int {
    val _ret = __method_bind.getU64.call(this._handle)
    return _ret.asInt()
  }

  fun getU8(): Int {
    val _ret = __method_bind.getU8.call(this._handle)
    return _ret.asInt()
  }

  fun getUtf8String(bytes: Int = -1): String {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.getUtf8String.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getVar(allowObjects: Boolean = false): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.getVar.call(this._handle, _arg, 1)
    return _ret
  }

  fun isBigEndianEnabled(): Boolean {
    val _ret = __method_bind.isBigEndianEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun put16(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put16.call(this._handle, _arg, 1)
  }

  fun put32(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put32.call(this._handle, _arg, 1)
  }

  fun put64(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put64.call(this._handle, _arg, 1)
  }

  fun put8(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put8.call(this._handle, _arg, 1)
  }

  fun putData(data: PoolByteArray): GDError {
    val _arg = Variant.new(data)
    val _ret = __method_bind.putData.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun putDouble(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.putDouble.call(this._handle, _arg, 1)
  }

  fun putFloat(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.putFloat.call(this._handle, _arg, 1)
  }

  fun putPartialData(data: PoolByteArray): VariantArray {
    val _arg = Variant.new(data)
    val _ret = __method_bind.putPartialData.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun putString(value: String) {
    val _arg = Variant.new(value)
    __method_bind.putString.call(this._handle, _arg, 1)
  }

  fun putU16(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.putU16.call(this._handle, _arg, 1)
  }

  fun putU32(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.putU32.call(this._handle, _arg, 1)
  }

  fun putU64(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.putU64.call(this._handle, _arg, 1)
  }

  fun putU8(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.putU8.call(this._handle, _arg, 1)
  }

  fun putUtf8String(value: String) {
    val _arg = Variant.new(value)
    __method_bind.putUtf8String.call(this._handle, _arg, 1)
  }

  fun putVar(value: Variant, fullObjects: Boolean = false) {
    val _args = VariantArray.new()
    _args.append(value)
    _args.append(fullObjects)
    __method_bind.putVar.call(this._handle, _args.toVariant(), 2)
  }

  fun setBigEndian(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setBigEndian.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for StreamPeer
     */
    private object __method_bind {
      val get16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_16" }
        }
      val get32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_32" }
        }
      val get64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_64" }
        }
      val get8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_8" }
        }
      val getAvailableBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_available_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_bytes" }
        }
      val getData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getDouble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_double" }
        }
      val getFloat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_float" }
        }
      val getPartialData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_partial_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_partial_data" }
        }
      val getString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_string" }
        }
      val getU16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u16" }
        }
      val getU32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u32" }
        }
      val getU64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u64" }
        }
      val getU8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_u8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_u8" }
        }
      val getUtf8String: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_utf8_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_utf8_string" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isBigEndianEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "is_big_endian_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_big_endian_enabled" }
        }
      val put16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_16" }
        }
      val put32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_32" }
        }
      val put64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_64" }
        }
      val put8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_8" }
        }
      val putData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_data" }
        }
      val putDouble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_double" }
        }
      val putFloat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_float" }
        }
      val putPartialData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_partial_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_partial_data" }
        }
      val putString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_string" }
        }
      val putU16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u16" }
        }
      val putU32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u32" }
        }
      val putU64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u64" }
        }
      val putU8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_u8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_u8" }
        }
      val putUtf8String: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_utf8_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_utf8_string" }
        }
      val putVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "put_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_var" }
        }
      val setBigEndian: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
            "set_big_endian".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_big_endian" }
        }}
  }
}
