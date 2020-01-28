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

  var storage: Int
    get() {
       return ImageTexture.Storage.from(getStorage()) 
    }
    set(value) {
      setStorage(ImageTexture.Storage.from(value))
    }

  fun create(
    width: Int,
    height: Int,
    format: Int,
    flags: Int
  ) {
    val _args = VariantArray.new()
    _args.append(width)
    _args.append(height)
    _args.append(format)
    _args.append(flags)
    __method_bind.create.call(this._handle, _args.toVariant(), 4)
  }

  fun createFromImage(image: Image, flags: Int) {
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
            "createFromImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createFromImage" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "getFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFormat" }
        }
      val getLossyStorageQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "getLossyStorageQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLossyStorageQuality" }
        }
      val getStorage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "getStorage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStorage" }
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
            "setData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setData" }
        }
      val setLossyStorageQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "setLossyStorageQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLossyStorageQuality" }
        }
      val setSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "setSizeOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSizeOverride" }
        }
      val setStorage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
            "setStorage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStorage" }
        }}
  }
}
