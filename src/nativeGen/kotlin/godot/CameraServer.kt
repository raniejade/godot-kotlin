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
  companion object {
    val Instance: CameraServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("CameraServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton CameraServer" }
          CameraServer(
            handle
          )
        }

    val FeedCbcrImage: Int = 1

    val FeedRgbaImage: Int = 0

    val FeedYcbcrImage: Int = 0

    val FeedYImage: Int = 0
  }
}
