// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
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
  }
}
