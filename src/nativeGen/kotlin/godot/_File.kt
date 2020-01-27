// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class _File internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun close() {
    val _ret = __method_bind.close.call(this.toVariant())
    TODO()
  }

  fun eofReached(): Boolean {
    val _ret = __method_bind.eof_reached.call(this.toVariant())
    TODO()
  }

  fun fileExists(path: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.file_exists.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun get16(): Int {
    val _ret = __method_bind.get_16.call(this.toVariant())
    TODO()
  }

  fun get32(): Int {
    val _ret = __method_bind.get_32.call(this.toVariant())
    TODO()
  }

  fun get64(): Int {
    val _ret = __method_bind.get_64.call(this.toVariant())
    TODO()
  }

  fun get8(): Int {
    val _ret = __method_bind.get_8.call(this.toVariant())
    TODO()
  }

  fun getAsText(): String {
    val _ret = __method_bind.get_as_text.call(this.toVariant())
    TODO()
  }

  fun getBuffer(len: Int): PoolByteArray {
    val _args = VariantArray.new()
    _args.append(len)
    val _ret = __method_bind.get_buffer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCsvLine(delim: String): PoolStringArray {
    val _args = VariantArray.new()
    _args.append(delim)
    val _ret = __method_bind.get_csv_line.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getDouble(): Float {
    val _ret = __method_bind.get_double.call(this.toVariant())
    TODO()
  }

  fun getEndianSwap(): Boolean {
    val _ret = __method_bind.get_endian_swap.call(this.toVariant())
    TODO()
  }

  fun getError(): Error {
    val _ret = __method_bind.get_error.call(this.toVariant())
    TODO()
  }

  fun getFloat(): Float {
    val _ret = __method_bind.get_float.call(this.toVariant())
    TODO()
  }

  fun getLen(): Int {
    val _ret = __method_bind.get_len.call(this.toVariant())
    TODO()
  }

  fun getLine(): String {
    val _ret = __method_bind.get_line.call(this.toVariant())
    TODO()
  }

  fun getMd5(path: String): String {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_md5.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getModifiedTime(file: String): Int {
    val _args = VariantArray.new()
    _args.append(file)
    val _ret = __method_bind.get_modified_time.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPascalString(): String {
    val _ret = __method_bind.get_pascal_string.call(this.toVariant())
    TODO()
  }

  fun getPath(): String {
    val _ret = __method_bind.get_path.call(this.toVariant())
    TODO()
  }

  fun getPathAbsolute(): String {
    val _ret = __method_bind.get_path_absolute.call(this.toVariant())
    TODO()
  }

  fun getPosition(): Int {
    val _ret = __method_bind.get_position.call(this.toVariant())
    TODO()
  }

  fun getReal(): Float {
    val _ret = __method_bind.get_real.call(this.toVariant())
    TODO()
  }

  fun getSha256(path: String): String {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_sha256.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVar(allowObjects: Boolean): Variant {
    val _args = VariantArray.new()
    _args.append(allowObjects)
    val _ret = __method_bind.get_var.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isOpen(): Boolean {
    val _ret = __method_bind.is_open.call(this.toVariant())
    TODO()
  }

  fun open(path: String, flags: Int): Error {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(flags)
    val _ret = __method_bind.open.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun openCompressed(
    path: String,
    modeFlags: Int,
    compressionMode: Int
  ): Error {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(compressionMode)
    val _ret = __method_bind.open_compressed.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun openEncrypted(
    path: String,
    modeFlags: Int,
    key: PoolByteArray
  ): Error {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(key)
    val _ret = __method_bind.open_encrypted.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun openEncryptedWithPass(
    path: String,
    modeFlags: Int,
    pass: String
  ): Error {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(modeFlags)
    _args.append(pass)
    val _ret = __method_bind.open_encrypted_with_pass.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun seek(position: Int) {
    val _args = VariantArray.new()
    _args.append(position)
    val _ret = __method_bind.seek.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun seekEnd(position: Int) {
    val _args = VariantArray.new()
    _args.append(position)
    val _ret = __method_bind.seek_end.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEndianSwap(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_endian_swap.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun store16(value: Int) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_16.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun store32(value: Int) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_32.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun store64(value: Int) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_64.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun store8(value: Int) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_8.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeBuffer(buffer: PoolByteArray) {
    val _args = VariantArray.new()
    _args.append(buffer)
    val _ret = __method_bind.store_buffer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeCsvLine(values: PoolStringArray, delim: String) {
    val _args = VariantArray.new()
    _args.append(values)
    _args.append(delim)
    val _ret = __method_bind.store_csv_line.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun storeDouble(value: Float) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_double.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeFloat(value: Float) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_float.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeLine(line: String) {
    val _args = VariantArray.new()
    _args.append(line)
    val _ret = __method_bind.store_line.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storePascalString(string: String) {
    val _args = VariantArray.new()
    _args.append(string)
    val _ret = __method_bind.store_pascal_string.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeReal(value: Float) {
    val _args = VariantArray.new()
    _args.append(value)
    val _ret = __method_bind.store_real.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeString(string: String) {
    val _args = VariantArray.new()
    _args.append(string)
    val _ret = __method_bind.store_string.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun storeVar(value: Variant, fullObjects: Boolean) {
    val _args = VariantArray.new()
    _args.append(value)
    _args.append(fullObjects)
    val _ret = __method_bind.store_var.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton _File" }
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
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val eof_reached: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "eof_reached".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method eof_reached" }
            }
          }

      val file_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "file_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method file_exists" }
            }
          }

      val get_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_16" }
            }
          }

      val get_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_32" }
            }
          }

      val get_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_64" }
            }
          }

      val get_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_8" }
            }
          }

      val get_as_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_as_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_text" }
            }
          }

      val get_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffer" }
            }
          }

      val get_csv_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_csv_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_csv_line" }
            }
          }

      val get_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_double" }
            }
          }

      val get_endian_swap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_endian_swap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_endian_swap" }
            }
          }

      val get_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error" }
            }
          }

      val get_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_float" }
            }
          }

      val get_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_len".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_len" }
            }
          }

      val get_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line" }
            }
          }

      val get_md5: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_md5".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_md5" }
            }
          }

      val get_modified_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_modified_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modified_time" }
            }
          }

      val get_pascal_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_pascal_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pascal_string" }
            }
          }

      val get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path" }
            }
          }

      val get_path_absolute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_path_absolute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_absolute" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_real: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_real".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_real" }
            }
          }

      val get_sha256: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_sha256".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sha256" }
            }
          }

      val get_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "get_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var" }
            }
          }

      val is_open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "is_open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_open" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val open_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_compressed" }
            }
          }

      val open_encrypted: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_encrypted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_encrypted" }
            }
          }

      val open_encrypted_with_pass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "open_encrypted_with_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_encrypted_with_pass" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val seek_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "seek_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek_end" }
            }
          }

      val set_endian_swap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "set_endian_swap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_endian_swap" }
            }
          }

      val store_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_16" }
            }
          }

      val store_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_32" }
            }
          }

      val store_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_64" }
            }
          }

      val store_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_8" }
            }
          }

      val store_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_buffer" }
            }
          }

      val store_csv_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_csv_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_csv_line" }
            }
          }

      val store_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_double" }
            }
          }

      val store_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_float" }
            }
          }

      val store_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_line" }
            }
          }

      val store_pascal_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_pascal_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_pascal_string" }
            }
          }

      val store_real: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_real".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_real" }
            }
          }

      val store_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_string" }
            }
          }

      val store_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
              "store_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method store_var" }
            }
          }
    }
  }
}
