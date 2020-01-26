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
      requireNotNull(fnPtr) { "No instance found for singleton ARVRPositionalTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRPositionalTracker(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ARVRPositionalTracker
     */
    private object __method_bind {
      val _set_joy_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_joy_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_joy_id" }
            }
          }

      val _set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_mesh" }
            }
          }

      val _set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_name" }
            }
          }

      val _set_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_orientation" }
            }
          }

      val _set_rw_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_rw_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_rw_position" }
            }
          }

      val _set_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "_set_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_type" }
            }
          }

      val get_hand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_hand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hand" }
            }
          }

      val get_joy_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_joy_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_id" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_orientation" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_rumble: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rumble" }
            }
          }

      val get_tracks_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_tracks_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracks_orientation" }
            }
          }

      val get_tracks_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_tracks_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracks_position" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val get_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_type" }
            }
          }

      val set_rumble: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "set_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rumble" }
            }
          }
    }
  }
}
