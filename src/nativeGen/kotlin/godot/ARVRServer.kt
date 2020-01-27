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

open class ARVRServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun centerOnHmd(rotationMode: Int, keepHeight: Boolean) {
    val _args = VariantArray.new()
    _args.append(rotationMode)
    _args.append(keepHeight)
    __method_bind.center_on_hmd.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun findInterface(name: String): ARVRInterface {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.find_interface.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getHmdTransform(): Transform {
    val _ret = __method_bind.get_hmd_transform.call(this.toVariant())
    return _ret.asTransform()
  }

  fun getInterface(idx: Int): ARVRInterface {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_interface.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getInterfaceCount(): Int {
    val _ret = __method_bind.get_interface_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getInterfaces(): VariantArray {
    val _ret = __method_bind.get_interfaces.call(this.toVariant())
    return _ret.asArray()
  }

  fun getLastCommitUsec(): Int {
    val _ret = __method_bind.get_last_commit_usec.call(this.toVariant())
    return _ret.asInt()
  }

  fun getLastFrameUsec(): Int {
    val _ret = __method_bind.get_last_frame_usec.call(this.toVariant())
    return _ret.asInt()
  }

  fun getLastProcessUsec(): Int {
    val _ret = __method_bind.get_last_process_usec.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPrimaryInterface(): ARVRInterface {
    val _ret = __method_bind.get_primary_interface.call(this.toVariant())
    return _ret.asObject(::ARVRInterface)!!
  }

  fun getReferenceFrame(): Transform {
    val _ret = __method_bind.get_reference_frame.call(this.toVariant())
    return _ret.asTransform()
  }

  fun getTracker(idx: Int): ARVRPositionalTracker {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_tracker.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::ARVRPositionalTracker)!!
  }

  fun getTrackerCount(): Int {
    val _ret = __method_bind.get_tracker_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getWorldScale(): Float {
    val _ret = __method_bind.get_world_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setPrimaryInterface(`interface`: ARVRInterface) {
    val _args = VariantArray.new()
    _args.append(`interface`)
    __method_bind.set_primary_interface.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setWorldScale(arg0: Float) {
    val _args = VariantArray.new()
    _args.append(arg0)
    __method_bind.set_world_scale.call(this.toVariant(), _args.toVariant(), 1)
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

    /**
     * Container for method_bind pointers for ARVRServer
     */
    private object __method_bind {
      val center_on_hmd: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "center_on_hmd".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method center_on_hmd" }
            }
          }

      val find_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "find_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_interface" }
            }
          }

      val get_hmd_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_hmd_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hmd_transform" }
            }
          }

      val get_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interface" }
            }
          }

      val get_interface_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interface_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interface_count" }
            }
          }

      val get_interfaces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interfaces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interfaces" }
            }
          }

      val get_last_commit_usec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_commit_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_commit_usec" }
            }
          }

      val get_last_frame_usec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_frame_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_frame_usec" }
            }
          }

      val get_last_process_usec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_process_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_process_usec" }
            }
          }

      val get_primary_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_primary_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_primary_interface" }
            }
          }

      val get_reference_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_reference_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_reference_frame" }
            }
          }

      val get_tracker: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_tracker".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracker" }
            }
          }

      val get_tracker_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_tracker_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracker_count" }
            }
          }

      val get_world_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_world_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world_scale" }
            }
          }

      val set_primary_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "set_primary_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_primary_interface" }
            }
          }

      val set_world_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "set_world_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_world_scale" }
            }
          }
    }
  }
}
