// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
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

open class CubeMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var flags: Int
    get() {
       return getFlags() 
    }
    set(value) {
      setFlags(value)
    }

  var lossyStorageQuality: Float
    get() {
       return getLossyStorageQuality() 
    }
    set(value) {
      setLossyStorageQuality(value)
    }

  var storageMode: Storage
    get() {
       return getStorage() 
    }
    set(value) {
      setStorage(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFlags(): Int {
    val _ret = __method_bind.getFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getHeight(): Int {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getLossyStorageQuality(): Float {
    val _ret = __method_bind.getLossyStorageQuality.call(this._handle)
    return _ret.asFloat()
  }

  fun getSide(side: Int): Image {
    val _arg = Variant(side)
    val _ret = __method_bind.getSide.call(this._handle, listOf(_arg))
    return _ret.toAny() as Image
  }

  fun getStorage(): Storage {
    val _ret = __method_bind.getStorage.call(this._handle)
    return CubeMap.Storage.from(_ret.asInt())
  }

  fun getWidth(): Int {
    val _ret = __method_bind.getWidth.call(this._handle)
    return _ret.asInt()
  }

  fun setFlags(flags: Int) {
    val _arg = Variant(flags)
    __method_bind.setFlags.call(this._handle, listOf(_arg))
  }

  fun setLossyStorageQuality(quality: Float) {
    val _arg = Variant(quality)
    __method_bind.setLossyStorageQuality.call(this._handle, listOf(_arg))
  }

  fun setSide(side: Int, image: Image) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(side))
    _args.add(Variant.fromAny(image))
    __method_bind.setSide.call(this._handle, _args)
  }

  fun setStorage(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setStorage.call(this._handle, listOf(_arg))
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    DEFAULT(7);

    companion object {
      fun from(value: Int): Flags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Side(
    val value: Int
  ) {
    LEFT(0),

    RIGHT(1),

    BOTTOM(2),

    TOP(3),

    FRONT(4),

    BACK(5);

    companion object {
      fun from(value: Int): Side {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Storage(
    val value: Int
  ) {
    RAW(0),

    COMPRESS_LOSSY(1),

    COMPRESS_LOSSLESS(2);

    companion object {
      fun from(value: Int): Storage {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CubeMap
     */
    private object __method_bind {
      val getFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flags" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getLossyStorageQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lossy_storage_quality" }
        }
      val getSide: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_side".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_side" }
        }
      val getStorage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_storage" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val setFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flags" }
        }
      val setLossyStorageQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "set_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lossy_storage_quality" }
        }
      val setSide: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "set_side".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_side" }
        }
      val setStorage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
            "set_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_storage" }
        }}
  }
}
