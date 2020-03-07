// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class ARVRController(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var controllerId: Int
    get() {
       return getControllerId() 
    }
    set(value) {
      setControllerId(value)
    }

  var rumble: Float
    get() {
       return getRumble() 
    }
    set(value) {
      setRumble(value)
    }

  /**
   * ARVRController::button_pressed signal
   */
  val signalButtonPressed: Signal1<Int> = Signal1("button_pressed")

  /**
   * ARVRController::button_release signal
   */
  val signalButtonRelease: Signal1<Int> = Signal1("button_release")

  /**
   * ARVRController::mesh_updated signal
   */
  val signalMeshUpdated: Signal1<Mesh> = Signal1("mesh_updated")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getControllerId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getControllerId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getControllerName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getControllerName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getHand(): ARVRPositionalTracker.TrackerHand {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHand.call(self._handle, emptyList(), _retPtr)
      ARVRPositionalTracker.TrackerHand.from(_ret.value)
    }
  }

  fun getIsActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIsActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getJoystickAxis(axis: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoystickAxis.call(self._handle, listOf(axis), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getJoystickId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoystickId.call(self._handle, emptyList(), _retPtr)
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

  fun getRumble(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRumble.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isButtonPressed(button: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.isButtonPressed.call(self._handle, listOf(button), _retPtr)
      _ret.value
    }
  }

  fun setControllerId(controllerId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setControllerId.call(self._handle, listOf(controllerId), null)
    }
  }

  fun setRumble(rumble: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRumble.call(self._handle, listOf(rumble), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRController".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRController" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ARVRController
     */
    private object __method_bind {
      val getControllerId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_controller_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_id" }
            }
          }

      val getControllerName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_controller_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_name" }
            }
          }

      val getHand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_hand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hand" }
            }
          }

      val getIsActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_is_active" }
            }
          }

      val getJoystickAxis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_joystick_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joystick_axis" }
            }
          }

      val getJoystickId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_joystick_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joystick_id" }
            }
          }

      val getMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val getRumble: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rumble" }
            }
          }

      val isButtonPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "is_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_button_pressed" }
            }
          }

      val setControllerId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "set_controller_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_id" }
            }
          }

      val setRumble: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "set_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rumble" }
            }
          }
    }
  }
}
