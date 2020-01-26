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

open class ARVRServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class RotationMode(
    val value: Int
  ) {
    RESET_FULL_ROTATION(0),

    RESET_BUT_KEEP_TILT(1),

    DONT_RESET_ROTATION(2);
  }

  enum class TrackerType(
    val value: Int
  ) {
    TRACKER_CONTROLLER(1),

    TRACKER_BASESTATION(2),

    TRACKER_ANCHOR(4),

    TRACKER_ANY_KNOWN(127),

    TRACKER_UNKNOWN(128),

    TRACKER_ANY(255);
  }

  companion object {
    val Instance: ARVRServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("ARVRServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton ARVRServer" }
          ARVRServer(
            handle
          )
        }

    val DONT_RESET_ROTATION: Int = 2

    val RESET_BUT_KEEP_TILT: Int = 1

    val RESET_FULL_ROTATION: Int = 0

    val TRACKER_ANCHOR: Int = 4

    val TRACKER_ANY: Int = 255

    val TRACKER_ANY_KNOWN: Int = 127

    val TRACKER_BASESTATION: Int = 2

    val TRACKER_CONTROLLER: Int = 1

    val TRACKER_UNKNOWN: Int = 128
  }
}
