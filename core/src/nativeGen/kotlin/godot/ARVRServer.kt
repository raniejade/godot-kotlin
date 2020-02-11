// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  var primaryInterface: ARVRInterface
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

  /**
   * ARVRServer::interface_added signal
   */
  val signalInterfaceAdded: Signal1<String> = Signal1("interface_added")

  /**
   * ARVRServer::interface_removed signal
   */
  val signalInterfaceRemoved: Signal1<String> = Signal1("interface_removed")

  /**
   * ARVRServer::tracker_added signal
   */
  val signalTrackerAdded: Signal3<String, Int, Int> = Signal3("tracker_added")

  /**
   * ARVRServer::tracker_removed signal
   */
  val signalTrackerRemoved: Signal3<String, Int, Int> = Signal3("tracker_removed")

  fun centerOnHmd(rotationMode: Int, keepHeight: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(rotationMode))
    _args.add(Variant.fromAny(keepHeight))
    __method_bind.centerOnHmd.call(this._handle, _args)
  }

  fun findInterface(name: String): ARVRInterface {
    val _arg = Variant(name)
    val _ret = __method_bind.findInterface.call(this._handle, listOf(_arg))
    return _ret.toAny() as ARVRInterface
  }

  fun getHmdTransform(): Transform {
    val _ret = __method_bind.getHmdTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getInterface(idx: Int): ARVRInterface {
    val _arg = Variant(idx)
    val _ret = __method_bind.getInterface.call(this._handle, listOf(_arg))
    return _ret.toAny() as ARVRInterface
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
    return _ret.toAny() as ARVRInterface
  }

  fun getReferenceFrame(): Transform {
    val _ret = __method_bind.getReferenceFrame.call(this._handle)
    return _ret.asTransform()
  }

  fun getTracker(idx: Int): ARVRPositionalTracker {
    val _arg = Variant(idx)
    val _ret = __method_bind.getTracker.call(this._handle, listOf(_arg))
    return _ret.toAny() as ARVRPositionalTracker
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
    val _arg = Variant(`interface`)
    __method_bind.setPrimaryInterface.call(this._handle, listOf(_arg))
  }

  fun setWorldScale(arg0: Float) {
    val _arg = Variant(arg0)
    __method_bind.setWorldScale.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for ARVRServer
     */
    private object __method_bind {
      val centerOnHmd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "center_on_hmd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_on_hmd" }
        }
      val findInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "find_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_interface" }
        }
      val getHmdTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_hmd_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hmd_transform" }
        }
      val getInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_interface" }
        }
      val getInterfaceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_interface_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_interface_count" }
        }
      val getInterfaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_interfaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_interfaces" }
        }
      val getLastCommitUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_last_commit_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_commit_usec" }
        }
      val getLastFrameUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_last_frame_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_frame_usec" }
        }
      val getLastProcessUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_last_process_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_process_usec" }
        }
      val getPrimaryInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_primary_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_primary_interface" }
        }
      val getReferenceFrame: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_reference_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reference_frame" }
        }
      val getTracker: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_tracker".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracker" }
        }
      val getTrackerCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_tracker_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracker_count" }
        }
      val getWorldScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "get_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_scale" }
        }
      val setPrimaryInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "set_primary_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_primary_interface" }
        }
      val setWorldScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
            "set_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_world_scale" }
        }}
  }
}

object ARVRServer : ARVRServerInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("ARVRServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton ARVRServer" }
      _handle = handle
    }
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
    CONTROLLER(1),

    BASESTATION(2),

    ANCHOR(4),

    ANY_KNOWN(127),

    UNKNOWN(128),

    ANY(255);

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
}
