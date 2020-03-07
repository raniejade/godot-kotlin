// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(rotationMode)
      _args.add(keepHeight)
      __method_bind.centerOnHmd.call(self._handle, _args, null)
    }
  }

  fun findInterface(name: String): ARVRInterface {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ARVRInterface
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.findInterface.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<ARVRInterface>(_tmp.value!!)
      _ret
    }
  }

  fun getHmdTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getHmdTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInterface(idx: Int): ARVRInterface {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ARVRInterface
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getInterface.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<ARVRInterface>(_tmp.value!!)
      _ret
    }
  }

  fun getInterfaceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInterfaceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInterfaces(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getInterfaces.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLastCommitUsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastCommitUsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLastFrameUsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastFrameUsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLastProcessUsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastProcessUsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPrimaryInterface(): ARVRInterface {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ARVRInterface
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPrimaryInterface.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ARVRInterface>(_tmp.value!!)
      _ret
    }
  }

  fun getReferenceFrame(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getReferenceFrame.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTracker(idx: Int): ARVRPositionalTracker {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ARVRPositionalTracker
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTracker.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<ARVRPositionalTracker>(_tmp.value!!)
      _ret
    }
  }

  fun getTrackerCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTrackerCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWorldScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWorldScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setPrimaryInterface(`interface`: ARVRInterface) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPrimaryInterface.call(self._handle, listOf(`interface`), null)
    }
  }

  fun setWorldScale(arg0: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWorldScale.call(self._handle, listOf(arg0), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ARVRServer
     */
    private object __method_bind {
      val centerOnHmd: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "center_on_hmd".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method center_on_hmd" }
            }
          }

      val findInterface: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "find_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_interface" }
            }
          }

      val getHmdTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_hmd_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hmd_transform" }
            }
          }

      val getInterface: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interface" }
            }
          }

      val getInterfaceCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interface_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interface_count" }
            }
          }

      val getInterfaces: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_interfaces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interfaces" }
            }
          }

      val getLastCommitUsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_commit_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_commit_usec" }
            }
          }

      val getLastFrameUsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_frame_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_frame_usec" }
            }
          }

      val getLastProcessUsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_last_process_usec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_process_usec" }
            }
          }

      val getPrimaryInterface: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_primary_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_primary_interface" }
            }
          }

      val getReferenceFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_reference_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_reference_frame" }
            }
          }

      val getTracker: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_tracker".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracker" }
            }
          }

      val getTrackerCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_tracker_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracker_count" }
            }
          }

      val getWorldScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "get_world_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world_scale" }
            }
          }

      val setPrimaryInterface: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "set_primary_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_primary_interface" }
            }
          }

      val setWorldScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRServer".cstr.ptr,
              "set_world_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_world_scale" }
            }
          }
    }
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
