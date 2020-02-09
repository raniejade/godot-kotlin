// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    _handle = __new()
  }

  fun getControllerId(): Int {
    val _ret = __method_bind.getControllerId.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerName(): String {
    val _ret = __method_bind.getControllerName.call(this._handle)
    return _ret.asString()
  }

  fun getHand(): ARVRPositionalTracker.TrackerHand {
    val _ret = __method_bind.getHand.call(this._handle)
    return ARVRPositionalTracker.TrackerHand.from(_ret.asInt())
  }

  fun getIsActive(): Boolean {
    val _ret = __method_bind.getIsActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun getJoystickAxis(axis: Int): Float {
    val _arg = Variant(axis)
    val _ret = __method_bind.getJoystickAxis.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getJoystickId(): Int {
    val _ret = __method_bind.getJoystickId.call(this._handle)
    return _ret.asInt()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.toAny() as Mesh
  }

  fun getRumble(): Float {
    val _ret = __method_bind.getRumble.call(this._handle)
    return _ret.asFloat()
  }

  fun isButtonPressed(button: Int): Int {
    val _arg = Variant(button)
    val _ret = __method_bind.isButtonPressed.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun setControllerId(controllerId: Int) {
    val _arg = Variant(controllerId)
    __method_bind.setControllerId.call(this._handle, listOf(_arg))
  }

  fun setRumble(rumble: Float) {
    val _arg = Variant(rumble)
    __method_bind.setRumble.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
      val getControllerId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_controller_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_id" }
        }
      val getControllerName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_controller_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_name" }
        }
      val getHand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_hand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hand" }
        }
      val getIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_is_active" }
        }
      val getJoystickAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_joystick_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joystick_axis" }
        }
      val getJoystickId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_joystick_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joystick_id" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val getRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rumble" }
        }
      val isButtonPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "is_button_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_button_pressed" }
        }
      val setControllerId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "set_controller_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_id" }
        }
      val setRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "set_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rumble" }
        }}
  }
}
