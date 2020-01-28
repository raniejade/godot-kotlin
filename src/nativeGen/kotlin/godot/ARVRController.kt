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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRController(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getControllerId(): Int {
    val _ret = __method_bind.get_controller_id.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerName(): String {
    val _ret = __method_bind.get_controller_name.call(this._handle)
    return _ret.asString()
  }

  fun getHand(): ARVRPositionalTracker.TrackerHand {
    val _ret = __method_bind.get_hand.call(this._handle)
    return ARVRPositionalTracker.TrackerHand.from(_ret.asInt())
  }

  fun getIsActive(): Boolean {
    val _ret = __method_bind.get_is_active.call(this._handle)
    return _ret.asBoolean()
  }

  fun getJoystickAxis(axis: Int): Float {
    val _arg = Variant.new(axis)
    val _ret = __method_bind.get_joystick_axis.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getJoystickId(): Int {
    val _ret = __method_bind.get_joystick_id.call(this._handle)
    return _ret.asInt()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.get_mesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getRumble(): Float {
    val _ret = __method_bind.get_rumble.call(this._handle)
    return _ret.asFloat()
  }

  fun isButtonPressed(button: Int): Int {
    val _arg = Variant.new(button)
    val _ret = __method_bind.is_button_pressed.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun setControllerId(controllerId: Int) {
    val _arg = Variant.new(controllerId)
    __method_bind.set_controller_id.call(this._handle, _arg, 1)
  }

  fun setRumble(rumble: Float) {
    val _arg = Variant.new(rumble)
    __method_bind.set_rumble.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ARVRController = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRController".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRController" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRController(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ARVRController = ARVRController(ptr)
    /**
     * Container for method_bind pointers for ARVRController
     */
    private object __method_bind {
      val get_controller_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_controller_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_id" }
        }
      val get_controller_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_controller_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_name" }
        }
      val get_hand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_hand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hand" }
        }
      val get_is_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_is_active" }
        }
      val get_joystick_axis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_joystick_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joystick_axis" }
        }
      val get_joystick_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_joystick_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joystick_id" }
        }
      val get_mesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val get_rumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "get_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rumble" }
        }
      val is_button_pressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "is_button_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_button_pressed" }
        }
      val set_controller_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "set_controller_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_id" }
        }
      val set_rumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "set_rumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rumble" }
        }}
  }
}
