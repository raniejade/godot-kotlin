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

open class ARVRPositionalTracker internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class TrackerHand(
    val value: Int
  ) {
    TRACKER_HAND_UNKNOWN(0),

    TRACKER_LEFT_HAND(1),

    TRACKER_RIGHT_HAND(2);
  }

  companion object {
    val TRACKER_HAND_UNKNOWN: Int = 0

    val TRACKER_LEFT_HAND: Int = 1

    val TRACKER_RIGHT_HAND: Int = 2

    fun new(): ARVRPositionalTracker = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRPositionalTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ARVRPositionalTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRPositionalTracker(
        fn()
      )
    }}
}
