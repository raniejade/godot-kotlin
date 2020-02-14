// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlags.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLossyStorageQuality(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLossyStorageQuality.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSide(side: Int): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSide.call(self._handle, listOf(side), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun getStorage(): Storage {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStorage.call(self._handle, emptyList(), _retPtr)
      CubeMap.Storage.from(_ret.value)
    }
  }

  fun getWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun setLossyStorageQuality(quality: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLossyStorageQuality.call(self._handle, listOf(quality), null)
    }
  }

  fun setSide(side: Int, image: Image) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(side)
      _args.add(image)
      __method_bind.setSide.call(self._handle, _args, null)
    }
  }

  fun setStorage(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStorage.call(self._handle, listOf(mode), null)
    }
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
