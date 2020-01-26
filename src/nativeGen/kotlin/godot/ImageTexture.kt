// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class ImageTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun create(
    width: Int,
    height: Int,
    format: Int,
    flags: Int
  ) {
    TODO()
  }

  fun createFromImage(image: Image, flags: Int) {
    TODO()
  }

  fun getFormat(): Image.Format {
    TODO()
  }

  fun getLossyStorageQuality(): Float {
    TODO()
  }

  fun getStorage(): Storage {
    TODO()
  }

  fun load(path: String): Error {
    TODO()
  }

  fun setData(image: Image) {
    TODO()
  }

  fun setLossyStorageQuality(quality: Float) {
    TODO()
  }

  fun setSizeOverride(size: Vector2) {
    TODO()
  }

  fun setStorage(mode: Int) {
    TODO()
  }

  enum class Storage(
    val value: Int
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);
  }

  companion object {
    val STORAGE_COMPRESS_LOSSLESS: Int = 2

    val STORAGE_COMPRESS_LOSSY: Int = 1

    val STORAGE_RAW: Int = 0

    fun new(): ImageTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImageTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ImageTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ImageTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ImageTexture
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val create_from_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "create_from_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_image" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_lossy_storage_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "get_lossy_storage_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lossy_storage_quality" }
            }
          }

      val get_storage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "get_storage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_storage" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data" }
            }
          }

      val set_lossy_storage_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "set_lossy_storage_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lossy_storage_quality" }
            }
          }

      val set_size_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "set_size_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size_override" }
            }
          }

      val set_storage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImageTexture".cstr.ptr,
              "set_storage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_storage" }
            }
          }
    }
  }
}
