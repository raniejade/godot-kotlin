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
  var rumble: Float
    get() {
       return getRumble() 
    }
    set(value) {
      setRumble(value)
    }

  fun getHand(): TrackerHand {
    val _ret = __method_bind.getHand.call(this._handle)
    return ARVRPositionalTracker.TrackerHand.from(_ret.asInt())
  }

  fun getJoyId(): Int {
    val _ret = __method_bind.getJoyId.call(this._handle)
    return _ret.asInt()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getOrientation(): Basis {
    val _ret = __method_bind.getOrientation.call(this._handle)
    return _ret.asBasis()
  }

  fun getPosition(): Vector3 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector3()
  }

  fun getRumble(): Float {
    val _ret = __method_bind.getRumble.call(this._handle)
    return _ret.asFloat()
  }

  fun getTracksOrientation(): Boolean {
    val _ret = __method_bind.getTracksOrientation.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTracksPosition(): Boolean {
    val _ret = __method_bind.getTracksPosition.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    val _arg = Variant.new(adjustByReferenceFrame)
    val _ret = __method_bind.getTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getType(): ARVRServer.TrackerType {
    val _ret = __method_bind.getType.call(this._handle)
    return ARVRServer.TrackerType.from(_ret.asInt())
  }

  fun setRumble(rumble: Float) {
    val _arg = Variant.new(rumble)
    __method_bind.setRumble.call(this._handle, _arg, 1)
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
      val getHand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getHand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHand" }
        }
      val getJoyId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getJoyId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJoyId" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getName" }
        }
      val getOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOrientation" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPosition" }
        }
      val getRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getRumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRumble" }
        }
      val getTracksOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getTracksOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTracksOrientation" }
        }
      val getTracksPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getTracksPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTracksPosition" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val getType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "getType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getType" }
        }
      val setRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
            "setRumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRumble" }
        }}
  }
}
