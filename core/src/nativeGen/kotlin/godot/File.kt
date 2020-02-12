// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class File(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var endianSwap: Boolean
    get() {
       return getEndianSwap() 
    }
    set(value) {
      setEndianSwap(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun eofReached(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.eofReached.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun fileExists(path: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.fileExists.call(self._handle, listOf(path), _retPtr)
      _ret.value
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

  fun getAsText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAsText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBuffer(len: Int): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBuffer.call(self._handle, listOf(len), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCsvLine(delim: String = ","): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getCsvLine.call(self._handle, listOf(delim), _retPtr)
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

  fun getEndianSwap(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEndianSwap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getError(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getError.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
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

  fun getLen(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLine(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLine.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMd5(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getMd5.call(self._handle, listOf(path), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getModifiedTime(file: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getModifiedTime.call(self._handle, listOf(file), _retPtr)
      _ret.value
    }
  }

  fun getPascalString(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPascalString.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPathAbsolute(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPathAbsolute.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPosition(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getReal(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReal.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSha256(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSha256.call(self._handle, listOf(path), _retPtr)
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

  fun isOpen(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOpen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun open(path: String, flags: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(flags)
      __method_bind.open.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun openCompressed(
    path: String,
    modeFlags: Int,
    compressionMode: Int = 0
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(modeFlags)
      _args.add(compressionMode)
      __method_bind.openCompressed.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun openEncrypted(
    path: String,
    modeFlags: Int,
    key: PoolByteArray
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(modeFlags)
      _args.add(key)
      __method_bind.openEncrypted.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun openEncryptedWithPass(
    path: String,
    modeFlags: Int,
    pass: String
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(modeFlags)
      _args.add(pass)
      __method_bind.openEncryptedWithPass.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun seek(position: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.seek.call(self._handle, listOf(position), null)
    }
  }

  fun seekEnd(position: Int = 0) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.seekEnd.call(self._handle, listOf(position), null)
    }
  }

  fun setEndianSwap(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEndianSwap.call(self._handle, listOf(enable), null)
    }
  }

  fun store16(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.store16.call(self._handle, listOf(value), null)
    }
  }

  fun store32(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.store32.call(self._handle, listOf(value), null)
    }
  }

  fun store64(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.store64.call(self._handle, listOf(value), null)
    }
  }

  fun store8(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.store8.call(self._handle, listOf(value), null)
    }
  }

  fun storeBuffer(buffer: PoolByteArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeBuffer.call(self._handle, listOf(buffer), null)
    }
  }

  fun storeCsvLine(values: PoolStringArray, delim: String = ",") {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(values)
      _args.add(delim)
      __method_bind.storeCsvLine.call(self._handle, _args, null)
    }
  }

  fun storeDouble(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeDouble.call(self._handle, listOf(value), null)
    }
  }

  fun storeFloat(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeFloat.call(self._handle, listOf(value), null)
    }
  }

  fun storeLine(line: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeLine.call(self._handle, listOf(line), null)
    }
  }

  fun storePascalString(string: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storePascalString.call(self._handle, listOf(string), null)
    }
  }

  fun storeReal(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeReal.call(self._handle, listOf(value), null)
    }
  }

  fun storeString(string: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.storeString.call(self._handle, listOf(string), null)
    }
  }

  fun storeVar(value: Variant, fullObjects: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(value)
      _args.add(fullObjects)
      __method_bind.storeVar.call(self._handle, _args, null)
    }
  }

  enum class CompressionMode(
    val value: Int
  ) {
    FASTLZ(0),

    DEFLATE(1),

    ZSTD(2),

    GZIP(3);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("File".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for File" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for File
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val eofReached: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "eof_reached".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eof_reached" }
        }
      val fileExists: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "file_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method file_exists" }
        }
      val get16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_16" }
        }
      val get32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_32" }
        }
      val get64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_64" }
        }
      val get8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_8" }
        }
      val getAsText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_text" }
        }
      val getBuffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffer" }
        }
      val getCsvLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_csv_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_csv_line" }
        }
      val getDouble: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_double" }
        }
      val getEndianSwap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_endian_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_endian_swap" }
        }
      val getError: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error" }
        }
      val getFloat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_float" }
        }
      val getLen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_len" }
        }
      val getLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line" }
        }
      val getMd5: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_md5".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_md5" }
        }
      val getModifiedTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_modified_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modified_time" }
        }
      val getPascalString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_pascal_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pascal_string" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getPathAbsolute: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_path_absolute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_absolute" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getReal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_real".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_real" }
        }
      val getSha256: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_sha256".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sha256" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isOpen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "is_open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_open" }
        }
      val open: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open" }
        }
      val openCompressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_compressed" }
        }
      val openEncrypted: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_encrypted".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_encrypted" }
        }
      val openEncryptedWithPass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "open_encrypted_with_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_encrypted_with_pass" }
        }
      val seek: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val seekEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "seek_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek_end" }
        }
      val setEndianSwap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "set_endian_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_endian_swap" }
        }
      val store16: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_16".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_16" }
        }
      val store32: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_32".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_32" }
        }
      val store64: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_64" }
        }
      val store8: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_8" }
        }
      val storeBuffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_buffer" }
        }
      val storeCsvLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_csv_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_csv_line" }
        }
      val storeDouble: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_double".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_double" }
        }
      val storeFloat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_float".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_float" }
        }
      val storeLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_line" }
        }
      val storePascalString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_pascal_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_pascal_string" }
        }
      val storeReal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_real".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_real" }
        }
      val storeString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_string" }
        }
      val storeVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_File".cstr.ptr,
            "store_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method store_var" }
        }}
  }
}
