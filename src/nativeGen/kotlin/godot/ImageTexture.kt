// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class ImageTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
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

  fun create(
    width: Int,
    height: Int,
    format: Int,
    flags: Int = 7
  ) {
    val _args = VariantArray.new()
    _args.append(width)
    _args.append(height)
    _args.append(format)
    _args.append(flags)
    __method_bind.create.call(this._handle, _args.toVariant(), 4)
  }

  fun createFromImage(image: Image, flags: Int = 7) {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(flags)
    __method_bind.createFromImage.call(this._handle, _args.toVariant(), 2)
  }

  fun getFormat(): Image.Format {
    val _ret = __method_bind.getFormat.call(this._handle)
    return Image.Format.from(_ret.asInt())
  }

  fun getLossyStorageQuality(): Float {
    val _ret = __method_bind.getLossyStorageQuality.call(this._handle)
    return _ret.asFloat()
  }

  fun getStorage(): Storage {
    val _ret = __method_bind.getStorage.call(this._handle)
    return ImageTexture.Storage.from(_ret.asInt())
  }

  fun load(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setData(image: Image) {
    val _arg = Variant.new(image)
    __method_bind.setData.call(this._handle, _arg, 1)
  }

  fun setLossyStorageQuality(quality: Float) {
    val _arg = Variant.new(quality)
    __method_bind.setLossyStorageQuality.call(this._handle, _arg, 1)
  }

  fun setSizeOverride(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSizeOverride.call(this._handle, _arg, 1)
  }

  fun setStorage(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setStorage.call(this._handle, _arg, 1)
  }

  enum class Storage(
    val value: Int
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);

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
    val STORAGE_COMPRESS_LOSSLESS: Int = 2

    val STORAGE_COMPRESS_LOSSY: Int = 1

    val STORAGE_RAW: Int = 0

    fun new(): ImageTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImageTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ImageTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ImageTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ImageTexture = ImageTexture(ptr)
    /**
     * Container for method_bind pointers for ImageTexture
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val createFromImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "create_from_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_image" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getLossyStorageQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lossy_storage_quality" }
        }
      val getStorage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "get_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_storage" }
        }
      val load: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val setData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val setLossyStorageQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_lossy_storage_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lossy_storage_quality" }
        }
      val setSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_size_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size_override" }
        }
      val setStorage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "set_storage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_storage" }
        }}
  }
}
