// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Basis
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
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

open class ARVRPositionalTracker(
  _handle: COpaquePointer
) : Object(_handle) {
  fun getHand(): TrackerHand {
    val _ret = __method_bind.get_hand.call(this._handle)
    return ARVRPositionalTracker.TrackerHand.from(_ret.asInt())
  }

  fun getJoyId(): Int {
    val _ret = __method_bind.get_joy_id.call(this._handle)
    return _ret.asInt()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.get_mesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getName(): String {
    val _ret = __method_bind.get_name.call(this._handle)
    return _ret.asString()
  }

  fun getOrientation(): Basis {
    val _ret = __method_bind.get_orientation.call(this._handle)
    return _ret.asBasis()
  }

  fun getPosition(): Vector3 {
    val _ret = __method_bind.get_position.call(this._handle)
    return _ret.asVector3()
  }

  fun getRumble(): Float {
    val _ret = __method_bind.get_rumble.call(this._handle)
    return _ret.asFloat()
  }

  fun getTracksOrientation(): Boolean {
    val _ret = __method_bind.get_tracks_orientation.call(this._handle)
    return _ret.asBool()
  }

  fun getTracksPosition(): Boolean {
    val _ret = __method_bind.get_tracks_position.call(this._handle)
    return _ret.asBool()
  }

  fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    val _arg = Variant.new(adjustByReferenceFrame)
    val _ret = __method_bind.get_transform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getType(): ARVRServer.TrackerType {
    val _ret = __method_bind.get_type.call(this._handle)
    return ARVRServer.TrackerType.from(_ret.asInt())
  }

  fun setRumble(rumble: Float) {
    val _arg = Variant.new(rumble)
    __method_bind.set_rumble.call(this._handle, _arg, 1)
  }

  enum class TrackerHand(
    val value: Int
  ) {
    TRACKER_HAND_UNKNOWN(0),

    TRACKER_LEFT_HAND(1),

    TRACKER_RIGHT_HAND(2);

    companion object {
      fun from(value: Int): TrackerHand {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val TRACKER_HAND_UNKNOWN: Int = 0

    val TRACKER_LEFT_HAND: Int = 1

    val TRACKER_RIGHT_HAND: Int = 2

    fun new(): ARVRPositionalTracker = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRPositionalTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRPositionalTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRPositionalTracker(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ARVRPositionalTracker = ARVRPositionalTracker(ptr)
    /**
     * Container for method_bind pointers for ARVRPositionalTracker
     */
    private object __method_bind {
      val get_hand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_hand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hand" }
        }
      val get_joy_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_joy_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_id" }
        }
      val get_mesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val get_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val get_orientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_orientation" }
        }
      val get_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val get_rumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rumble" }
        }
      val get_tracks_orientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_tracks_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracks_orientation" }
        }
      val get_tracks_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_tracks_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracks_position" }
        }
      val get_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val get_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_type" }
        }
      val set_rumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "set_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rumble" }
        }}
  }
}
