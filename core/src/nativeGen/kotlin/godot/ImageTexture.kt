// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class ImageTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var lossyQuality: Float
    get() {
       return getLossyStorageQuality() 
    }
    set(value) {
      setLossyStorageQuality(value)
    }

  var storage: Storage
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

  fun create(
    width: Int,
    height: Int,
    format: Int,
    flags: Int = 7
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      _args.add(format)
      _args.add(flags)
      __method_bind.create.call(self._handle, _args, null)
    }
  }

  fun createFromImage(image: Image, flags: Int = 7) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(flags)
      __method_bind.createFromImage.call(self._handle, _args, null)
    }
  }

  fun getFormat(): Image.Format {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      Image.Format.from(_ret.value)
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

  fun getStorage(): Storage {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStorage.call(self._handle, emptyList(), _retPtr)
      ImageTexture.Storage.from(_ret.value)
    }
  }

  fun load(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.load.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setData(image: Image) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setData.call(self._handle, listOf(image), null)
    }
  }

  fun setLossyStorageQuality(quality: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLossyStorageQuality.call(self._handle, listOf(quality), null)
    }
  }

  fun setSizeOverride(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSizeOverride.call(self._handle, listOf(size), null)
    }
  }

  fun setStorage(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStorage.call(self._handle, listOf(mode), null)
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImageTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ImageTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ImageTexture
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val createFromImage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "create_from_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_image" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getLossyStorageQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lossy_storage_quality" }
        }
      val getStorage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_storage" }
        }
      val load: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val setData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val setLossyStorageQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lossy_storage_quality" }
        }
      val setSizeOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_size_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size_override" }
        }
      val setStorage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_storage" }
        }}
  }
}
