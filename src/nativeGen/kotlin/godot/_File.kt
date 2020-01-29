// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
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

open class _File(
  _handle: COpaquePointer
) : Reference(_handle) {
  var endianSwap: Boolean
    get() {
       return getEndianSwap() 
    }
    set(value) {
      setEndianSwap(value)
    }

  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun eofReached(): Boolean {
    val _ret = __method_bind.eofReached.call(this._handle)
    return _ret.asBoolean()
  }

  fun fileExists(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.fileExists.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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

  fun getAsText(): String {
    val _ret = __method_bind.getAsText.call(this._handle)
    return _ret.asString()
  }

  fun getBuffer(len: Int): PoolByteArray {
    val _arg = Variant.new(len)
    val _ret = __method_bind.getBuffer.call(this._handle, _arg, 1)
    return _ret.asPoolByteArray()
  }

  fun getCsvLine(delim: String = ","): PoolStringArray {
    val _arg = Variant.new(delim)
    val _ret = __method_bind.getCsvLine.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getDouble(): Float {
    val _ret = __method_bind.getDouble.call(this._handle)
    return _ret.asFloat()
  }

  fun getEndianSwap(): Boolean {
    val _ret = __method_bind.getEndianSwap.call(this._handle)
    return _ret.asBoolean()
  }

  fun getError(): GDError {
    val _ret = __method_bind.getError.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun getFloat(): Float {
    val _ret = __method_bind.getFloat.call(this._handle)
    return _ret.asFloat()
  }

  fun getLen(): Int {
    val _ret = __method_bind.getLen.call(this._handle)
    return _ret.asInt()
  }

  fun getLine(): String {
    val _ret = __method_bind.getLine.call(this._handle)
    return _ret.asString()
  }

  fun getMd5(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getMd5.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getModifiedTime(file: String): Int {
    val _arg = Variant.new(file)
    val _ret = __method_bind.getModifiedTime.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getPascalString(): String {
    val _ret = __method_bind.getPascalString.call(this._handle)
    return _ret.asString()
  }

  fun getPath(): String {
    val _ret = __method_bind.getPath.call(this._handle)
    return _ret.asString()
  }

  fun getPathAbsolute(): String {
    val _ret = __method_bind.getPathAbsolute.call(this._handle)
    return _ret.asString()
  }

  fun getPosition(): Int {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asInt()
  }

  fun getReal(): Float {
    val _ret = __method_bind.getReal.call(this._handle)
    return _ret.asFloat()
  }

  fun getSha256(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getSha256.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getVar(allowObjects: Boolean = false): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.getVar.call(this._handle, _arg, 1)
    return _ret
  }

  fun isOpen(): Boolean {
    val _ret = __method_bind.isOpen.call(this._handle)
    return _ret.asBoolean()
  }

  fun open(path: String, flags: Int): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(flags)
    val _ret = __method_bind.open.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun openCompressed(
    path: String,
    modeFlags: Int,
    compressionMode: Int = 0
  ): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(compressionMode)
    val _ret = __method_bind.openCompressed.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun openEncrypted(
    path: String,
    modeFlags: Int,
    key: PoolByteArray
  ): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(key)
    val _ret = __method_bind.openEncrypted.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun openEncryptedWithPass(
    path: String,
    modeFlags: Int,
    pass: String
  ): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(pass)
    val _ret = __method_bind.openEncryptedWithPass.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun seek(position: Int) {
    val _arg = Variant.new(position)
    __method_bind.seek.call(this._handle, _arg, 1)
  }

  fun seekEnd(position: Int = 0) {
    val _arg = Variant.new(position)
    __method_bind.seekEnd.call(this._handle, _arg, 1)
  }

  fun setEndianSwap(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEndianSwap.call(this._handle, _arg, 1)
  }

  fun store16(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.store16.call(this._handle, _arg, 1)
  }

  fun store32(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.store32.call(this._handle, _arg, 1)
  }

  fun store64(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.store64.call(this._handle, _arg, 1)
  }

  fun store8(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.store8.call(this._handle, _arg, 1)
  }

  fun storeBuffer(buffer: PoolByteArray) {
    val _arg = Variant.new(buffer)
    __method_bind.storeBuffer.call(this._handle, _arg, 1)
  }

  fun storeCsvLine(values: PoolStringArray, delim: String = ",") {
    val _args = VariantArray.new()
    _args.append(values)
    _args.append(delim)
    __method_bind.storeCsvLine.call(this._handle, _args.toVariant(), 2)
  }

  fun storeDouble(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.storeDouble.call(this._handle, _arg, 1)
  }

  fun storeFloat(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.storeFloat.call(this._handle, _arg, 1)
  }

  fun storeLine(line: String) {
    val _arg = Variant.new(line)
    __method_bind.storeLine.call(this._handle, _arg, 1)
  }

  fun storePascalString(string: String) {
    val _arg = Variant.new(string)
    __method_bind.storePascalString.call(this._handle, _arg, 1)
  }

  fun storeReal(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.storeReal.call(this._handle, _arg, 1)
  }

  fun storeString(string: String) {
    val _arg = Variant.new(string)
    __method_bind.storeString.call(this._handle, _arg, 1)
  }

  fun storeVar(value: Variant, fullObjects: Boolean = false) {
    val _args = VariantArray.new()
    _args.append(value)
    _args.append(fullObjects)
    __method_bind.storeVar.call(this._handle, _args.toVariant(), 2)
  }

  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESSION_FASTLZ(0),

    COMPRESSION_DEFLATE(1),

    COMPRESSION_ZSTD(2),

    COMPRESSION_GZIP(3);

    companion object {
      fun from(value: Int): CompressionMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ModeFlags(
    val value: Int
  ) {
    READ(1),

    WRITE(2),

    READ_WRITE(3),

    WRITE_READ(7);

    companion object {
      fun from(value: Int): ModeFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val COMPRESSION_DEFLATE: Int = 1

    val COMPRESSION_FASTLZ: Int = 0

    val COMPRESSION_GZIP: Int = 3

    val COMPRESSION_ZSTD: Int = 2

    val READ: Int = 1

    val READ_WRITE: Int = 3

    val WRITE: Int = 2

    val WRITE_READ: Int = 7

    fun new(): _File = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_File".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _File" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _File(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _File = _File(ptr)
    /**
     * Container for method_bind pointers for _File
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val eofReached: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "eof_reached".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eof_reached" }
        }
      val fileExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "file_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method file_exists" }
        }
      val get16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_16" }
        }
      val get32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_32" }
        }
      val get64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_64" }
        }
      val get8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_8" }
        }
      val getAsText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_text" }
        }
      val getBuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffer" }
        }
      val getCsvLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_csv_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_csv_line" }
        }
      val getDouble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_double" }
        }
      val getEndianSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_endian_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_endian_swap" }
        }
      val getError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error" }
        }
      val getFloat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_float" }
        }
      val getLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_len" }
        }
      val getLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line" }
        }
      val getMd5: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_md5".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_md5" }
        }
      val getModifiedTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_modified_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modified_time" }
        }
      val getPascalString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_pascal_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pascal_string" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getPathAbsolute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_path_absolute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_absolute" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getReal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_real".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_real" }
        }
      val getSha256: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_sha256".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sha256" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isOpen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "is_open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_open" }
        }
      val open: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open" }
        }
      val openCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_compressed" }
        }
      val openEncrypted: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_encrypted".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_encrypted" }
        }
      val openEncryptedWithPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_encrypted_with_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_encrypted_with_pass" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val seekEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "seek_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek_end" }
        }
      val setEndianSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "set_endian_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_endian_swap" }
        }
      val store16: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_16" }
        }
      val store32: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_32" }
        }
      val store64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_64" }
        }
      val store8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_8" }
        }
      val storeBuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_buffer" }
        }
      val storeCsvLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_csv_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_csv_line" }
        }
      val storeDouble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_double" }
        }
      val storeFloat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_float" }
        }
      val storeLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_line" }
        }
      val storePascalString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_pascal_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_pascal_string" }
        }
      val storeReal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_real".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_real" }
        }
      val storeString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_string" }
        }
      val storeVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_var" }
        }}
  }
}
