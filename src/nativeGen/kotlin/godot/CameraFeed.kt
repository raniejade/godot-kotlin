// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraFeed internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class FeedDataType(
    val value: Int
  ) {
    FEED_NOIMAGE(0),

    FEED_RGB(1),

    FEED_YCbCr(2),

    FEED_YCbCr_Sep(3);
  }

  enum class FeedPosition(
    val value: Int
  ) {
    FEED_UNSPECIFIED(0),

    FEED_FRONT(1),

    FEED_BACK(2);
  }

  companion object {
    val FEED_BACK: Int = 2

    val FEED_FRONT: Int = 1

    val FEED_NOIMAGE: Int = 0

    val FEED_RGB: Int = 1

    val FEED_UNSPECIFIED: Int = 0

    val FEED_YCbCr: Int = 2

    val FEED_YCbCr_Sep: Int = 3

    fun new(): CameraFeed = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraFeed".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CameraFeed" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CameraFeed(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CameraFeed
     */
    private object __method_bind {
      val _allocate_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_allocate_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _allocate_texture" }
            }
          }

      val _set_RGB_img: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_set_RGB_img".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_RGB_img" }
            }
          }

      val _set_YCbCr_img: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_set_YCbCr_img".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_YCbCr_img" }
            }
          }

      val _set_YCbCr_imgs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_set_YCbCr_imgs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_YCbCr_imgs" }
            }
          }

      val _set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_name" }
            }
          }

      val _set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "_set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_position" }
            }
          }

      val get_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "get_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_id" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }
    }
  }
}
