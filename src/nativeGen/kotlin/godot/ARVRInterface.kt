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

open class ARVRInterface internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class Tracking_status(
    val value: Int
  ) {
    ARVR_NORMAL_TRACKING(0),

    ARVR_EXCESSIVE_MOTION(1),

    ARVR_INSUFFICIENT_FEATURES(2),

    ARVR_UNKNOWN_TRACKING(3),

    ARVR_NOT_TRACKING(4);
  }

  enum class Eyes(
    val value: Int
  ) {
    EYE_MONO(0),

    EYE_LEFT(1),

    EYE_RIGHT(2);
  }

  enum class Capabilities(
    val value: Int
  ) {
    ARVR_NONE(0),

    ARVR_MONO(1),

    ARVR_STEREO(2),

    ARVR_AR(4),

    ARVR_EXTERNAL(8);
  }

  companion object {
    val ARVR_AR: Int = 4

    val ARVR_EXCESSIVE_MOTION: Int = 1

    val ARVR_EXTERNAL: Int = 8

    val ARVR_INSUFFICIENT_FEATURES: Int = 2

    val ARVR_MONO: Int = 1

    val ARVR_NONE: Int = 0

    val ARVR_NORMAL_TRACKING: Int = 0

    val ARVR_NOT_TRACKING: Int = 4

    val ARVR_STEREO: Int = 2

    val ARVR_UNKNOWN_TRACKING: Int = 3

    val EYE_LEFT: Int = 1

    val EYE_MONO: Int = 0

    val EYE_RIGHT: Int = 2
  }
}
