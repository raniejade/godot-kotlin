// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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

open class ARVRServer(
  _handle: COpaquePointer
) : Object(_handle) {
  var primaryInterface: Object
    get() {
       return getPrimaryInterface() 
    }
    set(value) {
      setPrimaryInterface(value)
    }

  var worldScale: Float
    get() {
       return getWorldScale() 
    }
    set(value) {
      setWorldScale(value)
    }

  fun centerOnHmd(rotationMode: Int, keepHeight: Boolean) {
    val _args = VariantArray.new()
    _args.append(rotationMode)
    _args.append(keepHeight)
    __method_bind.centerOnHmd.call(this._handle, _args.toVariant(), 2)
  }

  fun findInterface(name: String): ARVRInterface {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findInterface.call(this._handle, _arg, 1)
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getHmdTransform(): Transform {
    val _ret = __method_bind.getHmdTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getInterface(idx: Int): ARVRInterface {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getInterface.call(this._handle, _arg, 1)
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getInterfaceCount(): Int {
    val _ret = __method_bind.getInterfaceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInterfaces(): VariantArray {
    val _ret = __method_bind.getInterfaces.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getLastCommitUsec(): Int {
    val _ret = __method_bind.getLastCommitUsec.call(this._handle)
    return _ret.asInt()
  }

  fun getLastFrameUsec(): Int {
    val _ret = __method_bind.getLastFrameUsec.call(this._handle)
    return _ret.asInt()
  }

  fun getLastProcessUsec(): Int {
    val _ret = __method_bind.getLastProcessUsec.call(this._handle)
    return _ret.asInt()
  }

  fun getPrimaryInterface(): ARVRInterface {
    val _ret = __method_bind.getPrimaryInterface.call(this._handle)
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getReferenceFrame(): Transform {
    val _ret = __method_bind.getReferenceFrame.call(this._handle)
    return _ret.asTransform()
  }

  fun getTracker(idx: Int): ARVRPositionalTracker {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTracker.call(this._handle, _arg, 1)
    return _ret.asObject(::ARVRPositionalTracker)!!
  }

  fun getTrackerCount(): Int {
    val _ret = __method_bind.getTrackerCount.call(this._handle)
    return _ret.asInt()
  }

  fun getWorldScale(): Float {
    val _ret = __method_bind.getWorldScale.call(this._handle)
    return _ret.asFloat()
  }

  fun setPrimaryInterface(`interface`: ARVRInterface) {
    val _arg = Variant.new(`interface`)
    __method_bind.setPrimaryInterface.call(this._handle, _arg, 1)
  }

  fun setWorldScale(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setWorldScale.call(this._handle, _arg, 1)
  }

  enum class RotationMode(
    val value: Int
  ) {
    RESET_FULL_ROTATION(0),

    RESET_BUT_KEEP_TILT(1),

    DONT_RESET_ROTATION(2);

    companion object {
      fun from(value: Int): RotationMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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

    companion object {
      fun from(value: Int): TrackerType {
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
    val Instance: ARVRServer
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("ARVRServer".cstr.ptr)
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

    /**
     * Container for method_bind pointers for ARVRServer
     */
    private object __method_bind {
      val centerOnHmd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "centerOnHmd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method centerOnHmd" }
        }
      val findInterface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "findInterface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findInterface" }
        }
      val getHmdTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getHmdTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHmdTransform" }
        }
      val getInterface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getInterface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInterface" }
        }
      val getInterfaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getInterfaceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInterfaceCount" }
        }
      val getInterfaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getInterfaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInterfaces" }
        }
      val getLastCommitUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getLastCommitUsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastCommitUsec" }
        }
      val getLastFrameUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getLastFrameUsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastFrameUsec" }
        }
      val getLastProcessUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getLastProcessUsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastProcessUsec" }
        }
      val getPrimaryInterface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getPrimaryInterface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPrimaryInterface" }
        }
      val getReferenceFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getReferenceFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getReferenceFrame" }
        }
      val getTracker: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getTracker".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTracker" }
        }
      val getTrackerCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getTrackerCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTrackerCount" }
        }
      val getWorldScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "getWorldScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWorldScale" }
        }
      val setPrimaryInterface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "setPrimaryInterface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPrimaryInterface" }
        }
      val setWorldScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "setWorldScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWorldScale" }
        }}
  }
}
