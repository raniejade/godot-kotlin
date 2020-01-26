// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getCameraActive(): Boolean {
    TODO()
  }

  fun getCameraFeedId(): Int {
    TODO()
  }

  fun getWhichFeed(): CameraServer.FeedImage {
    TODO()
  }

  fun setCameraActive() {
    TODO()
  }

  fun setCameraFeedId() {
    TODO()
  }

  fun setWhichFeed() {
    TODO()
  }

  companion object {
    fun new(): CameraTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CameraTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CameraTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CameraTexture
     */
    private object __method_bind {
      val get_camera_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "get_camera_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_active" }
            }
          }

      val get_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "get_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
            }
          }

      val get_which_feed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "get_which_feed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_which_feed" }
            }
          }

      val set_camera_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "set_camera_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_camera_active" }
            }
          }

      val set_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "set_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
            }
          }

      val set_which_feed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
              "set_which_feed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_which_feed" }
            }
          }
    }
  }
}
