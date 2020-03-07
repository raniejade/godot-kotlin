// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class ARVRPositionalTracker(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  var rumble: Float
    get() {
       return getRumble() 
    }
    set(value) {
      setRumble(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _set_joy_id(joyId: Int) {
    TODO()
  }

  open fun _set_mesh(mesh: Mesh) {
    TODO()
  }

  open fun _set_name(name: String) {
    TODO()
  }

  open fun _set_orientation(orientation: Basis) {
    TODO()
  }

  open fun _set_rw_position(rwPosition: Vector3) {
    TODO()
  }

  open fun _set_type(type: Int) {
    TODO()
  }

  fun getHand(): TrackerHand {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHand.call(self._handle, emptyList(), _retPtr)
      ARVRPositionalTracker.TrackerHand.from(_ret.value)
    }
  }

  fun getJoyId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoyId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMesh(): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun getName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getOrientation(): Basis {
    val self = this
    return Allocator.allocationScope {
      val _ret = Basis()
      val _retPtr = _ret._value.ptr
      __method_bind.getOrientation.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPosition(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRumble(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRumble.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTracksOrientation(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTracksOrientation.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTracksPosition(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTracksPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, listOf(adjustByReferenceFrame), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getType(): ARVRServer.TrackerType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getType.call(self._handle, emptyList(), _retPtr)
      ARVRServer.TrackerType.from(_ret.value)
    }
  }

  fun setRumble(rumble: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRumble.call(self._handle, listOf(rumble), null)
    }
  }

  enum class TrackerHand(
    val value: Int
  ) {
    UNKNOWN(0),

    LEFT_HAND(1),

    RIGHT_HAND(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRPositionalTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRPositionalTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ARVRPositionalTracker
     */
    private object __method_bind {
      val getHand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_hand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hand" }
            }
          }

      val getJoyId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_joy_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_id" }
            }
          }

      val getMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val getName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val getOrientation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_orientation" }
            }
          }

      val getPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val getRumble: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rumble" }
            }
          }

      val getTracksOrientation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_tracks_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracks_orientation" }
            }
          }

      val getTracksPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_tracks_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracks_position" }
            }
          }

      val getTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val getType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_type" }
            }
          }

      val setRumble: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRPositionalTracker".cstr.ptr,
              "set_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rumble" }
            }
          }
    }
  }
}
