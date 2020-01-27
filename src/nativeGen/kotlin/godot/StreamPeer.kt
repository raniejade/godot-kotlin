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

open class StreamPeer internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun get16(): Int {
    val _ret = __method_bind.get_16.call(this.toVariant())
    return _ret.asInt()
  }

  fun get32(): Int {
    val _ret = __method_bind.get_32.call(this.toVariant())
    return _ret.asInt()
  }

  fun get64(): Int {
    val _ret = __method_bind.get_64.call(this.toVariant())
    return _ret.asInt()
  }

  fun get8(): Int {
    val _ret = __method_bind.get_8.call(this.toVariant())
    return _ret.asInt()
  }

  fun getAvailableBytes(): Int {
    val _ret = __method_bind.get_available_bytes.call(this.toVariant())
    return _ret.asInt()
  }

  fun getData(bytes: Int): VariantArray {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.get_data.call(this.toVariant(), _arg, 1)
    return _ret.asArray()
  }

  fun getDouble(): Float {
    val _ret = __method_bind.get_double.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFloat(): Float {
    val _ret = __method_bind.get_float.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPartialData(bytes: Int): VariantArray {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.get_partial_data.call(this.toVariant(), _arg, 1)
    return _ret.asArray()
  }

  fun getString(bytes: Int): String {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.get_string.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getU16(): Int {
    val _ret = __method_bind.get_u16.call(this.toVariant())
    return _ret.asInt()
  }

  fun getU32(): Int {
    val _ret = __method_bind.get_u32.call(this.toVariant())
    return _ret.asInt()
  }

  fun getU64(): Int {
    val _ret = __method_bind.get_u64.call(this.toVariant())
    return _ret.asInt()
  }

  fun getU8(): Int {
    val _ret = __method_bind.get_u8.call(this.toVariant())
    return _ret.asInt()
  }

  fun getUtf8String(bytes: Int): String {
    val _arg = Variant.new(bytes)
    val _ret = __method_bind.get_utf8_string.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getVar(allowObjects: Boolean): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.get_var.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun isBigEndianEnabled(): Boolean {
    val _ret = __method_bind.is_big_endian_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun put16(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_16.call(this.toVariant(), _arg, 1)
  }

  fun put32(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_32.call(this.toVariant(), _arg, 1)
  }

  fun put64(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_64.call(this.toVariant(), _arg, 1)
  }

  fun put8(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_8.call(this.toVariant(), _arg, 1)
  }

  fun putData(data: PoolByteArray): GDError {
    val _arg = Variant.new(data)
    val _ret = __method_bind.put_data.call(this.toVariant(), _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun putDouble(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.put_double.call(this.toVariant(), _arg, 1)
  }

  fun putFloat(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.put_float.call(this.toVariant(), _arg, 1)
  }

  fun putPartialData(data: PoolByteArray): VariantArray {
    val _arg = Variant.new(data)
    val _ret = __method_bind.put_partial_data.call(this.toVariant(), _arg, 1)
    return _ret.asArray()
  }

  fun putString(value: String) {
    val _arg = Variant.new(value)
    __method_bind.put_string.call(this.toVariant(), _arg, 1)
  }

  fun putU16(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_u16.call(this.toVariant(), _arg, 1)
  }

  fun putU32(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_u32.call(this.toVariant(), _arg, 1)
  }

  fun putU64(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_u64.call(this.toVariant(), _arg, 1)
  }

  fun putU8(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.put_u8.call(this.toVariant(), _arg, 1)
  }

  fun putUtf8String(value: String) {
    val _arg = Variant.new(value)
    __method_bind.put_utf8_string.call(this.toVariant(), _arg, 1)
  }

  fun putVar(value: Variant, fullObjects: Boolean) {
    val _args = VariantArray.new()
    _args.append(value)
    _args.append(fullObjects)
    __method_bind.put_var.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setBigEndian(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_big_endian.call(this.toVariant(), _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for StreamPeer
     */
    private object __method_bind {
      val get_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_16" }
            }
          }

      val get_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_32" }
            }
          }

      val get_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_64" }
            }
          }

      val get_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_8" }
            }
          }

      val get_available_bytes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_available_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_available_bytes" }
            }
          }

      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_double" }
            }
          }

      val get_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_float" }
            }
          }

      val get_partial_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_partial_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_partial_data" }
            }
          }

      val get_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_string" }
            }
          }

      val get_u16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u16" }
            }
          }

      val get_u32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u32" }
            }
          }

      val get_u64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u64" }
            }
          }

      val get_u8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u8" }
            }
          }

      val get_utf8_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_utf8_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_utf8_string" }
            }
          }

      val get_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var" }
            }
          }

      val is_big_endian_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "is_big_endian_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_big_endian_enabled" }
            }
          }

      val put_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_16" }
            }
          }

      val put_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_32" }
            }
          }

      val put_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_64" }
            }
          }

      val put_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_8" }
            }
          }

      val put_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_data" }
            }
          }

      val put_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_double" }
            }
          }

      val put_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_float" }
            }
          }

      val put_partial_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_partial_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_partial_data" }
            }
          }

      val put_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_string" }
            }
          }

      val put_u16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u16" }
            }
          }

      val put_u32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u32" }
            }
          }

      val put_u64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u64" }
            }
          }

      val put_u8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u8" }
            }
          }

      val put_utf8_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_utf8_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_utf8_string" }
            }
          }

      val put_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_var" }
            }
          }

      val set_big_endian: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "set_big_endian".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_big_endian" }
            }
          }
    }
  }
}
