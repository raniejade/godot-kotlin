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
    val _arg = Variant.new(axis)
    val _ret = __method_bind.getJoystickAxis.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getJoystickId(): Int {
    val _ret = __method_bind.getJoystickId.call(this._handle)
    return _ret.asInt()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getRumble(): Float {
    val _ret = __method_bind.getRumble.call(this._handle)
    return _ret.asFloat()
  }

  fun isButtonPressed(button: Int): Int {
    val _arg = Variant.new(button)
    val _ret = __method_bind.isButtonPressed.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun setControllerId(controllerId: Int) {
    val _arg = Variant.new(controllerId)
    __method_bind.setControllerId.call(this._handle, _arg, 1)
  }

  fun setRumble(rumble: Float) {
    val _arg = Variant.new(rumble)
    __method_bind.setRumble.call(this._handle, _arg, 1)
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
      val getControllerId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getControllerId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControllerId" }
        }
      val getControllerName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getControllerName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControllerName" }
        }
      val getHand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getHand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHand" }
        }
      val getIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getIsActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIsActive" }
        }
      val getJoystickAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getJoystickAxis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJoystickAxis" }
        }
      val getJoystickId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getJoystickId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJoystickId" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val getRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "getRumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRumble" }
        }
      val isButtonPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "isButtonPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isButtonPressed" }
        }
      val setControllerId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "setControllerId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setControllerId" }
        }
      val setRumble: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
            "setRumble".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRumble" }
        }}
  }
}
