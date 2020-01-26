// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addFeed() {
    TODO()
  }

  fun feeds(): VariantArray {
    TODO()
  }

  fun getFeed(): CameraFeed {
    TODO()
  }

  fun getFeedCount(): Int {
    TODO()
  }

  fun removeFeed() {
    TODO()
  }

  enum class FeedImage(
    val value: Int
  ) {
    FEED_RGBA_IMAGE(0),

    FEED_YCbCr_IMAGE(0),

    FEED_Y_IMAGE(0),

    FEED_CbCr_IMAGE(1);
  }

  companion object {
    val Instance: CameraServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("CameraServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton CameraServer" }
          CameraServer(
            handle
          )
        }

    val FEED_CbCr_IMAGE: Int = 1

    val FEED_RGBA_IMAGE: Int = 0

    val FEED_YCbCr_IMAGE: Int = 0

    val FEED_Y_IMAGE: Int = 0

    /**
     * Container for method_bind pointers for CameraServer
     */
    private object __method_bind {
      val add_feed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
              "add_feed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_feed" }
            }
          }

      val feeds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
              "feeds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method feeds" }
            }
          }

      val get_feed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
              "get_feed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feed" }
            }
          }

      val get_feed_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
              "get_feed_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feed_count" }
            }
          }

      val remove_feed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
              "remove_feed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_feed" }
            }
          }
    }
  }
}
