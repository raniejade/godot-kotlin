// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VehicleWheel internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getDampingCompression(): Float {
    val _ret = __method_bind.get_damping_compression.call(this._handle)
    return _ret.asFloat()
  }

  fun getDampingRelaxation(): Float {
    val _ret = __method_bind.get_damping_relaxation.call(this._handle)
    return _ret.asFloat()
  }

  fun getFrictionSlip(): Float {
    val _ret = __method_bind.get_friction_slip.call(this._handle)
    return _ret.asFloat()
  }

  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this._handle)
    return _ret.asFloat()
  }

  fun getRollInfluence(): Float {
    val _ret = __method_bind.get_roll_influence.call(this._handle)
    return _ret.asFloat()
  }

  fun getRpm(): Float {
    val _ret = __method_bind.get_rpm.call(this._handle)
    return _ret.asFloat()
  }

  fun getSkidinfo(): Float {
    val _ret = __method_bind.get_skidinfo.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionMaxForce(): Float {
    val _ret = __method_bind.get_suspension_max_force.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionRestLength(): Float {
    val _ret = __method_bind.get_suspension_rest_length.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionStiffness(): Float {
    val _ret = __method_bind.get_suspension_stiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionTravel(): Float {
    val _ret = __method_bind.get_suspension_travel.call(this._handle)
    return _ret.asFloat()
  }

  fun isInContact(): Boolean {
    val _ret = __method_bind.is_in_contact.call(this._handle)
    return _ret.asBool()
  }

  fun isUsedAsSteering(): Boolean {
    val _ret = __method_bind.is_used_as_steering.call(this._handle)
    return _ret.asBool()
  }

  fun isUsedAsTraction(): Boolean {
    val _ret = __method_bind.is_used_as_traction.call(this._handle)
    return _ret.asBool()
  }

  fun setDampingCompression(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_damping_compression.call(this._handle, _arg, 1)
  }

  fun setDampingRelaxation(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_damping_relaxation.call(this._handle, _arg, 1)
  }

  fun setFrictionSlip(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_friction_slip.call(this._handle, _arg, 1)
  }

  fun setRadius(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_radius.call(this._handle, _arg, 1)
  }

  fun setRollInfluence(rollInfluence: Float) {
    val _arg = Variant.new(rollInfluence)
    __method_bind.set_roll_influence.call(this._handle, _arg, 1)
  }

  fun setSuspensionMaxForce(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_suspension_max_force.call(this._handle, _arg, 1)
  }

  fun setSuspensionRestLength(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_suspension_rest_length.call(this._handle, _arg, 1)
  }

  fun setSuspensionStiffness(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_suspension_stiffness.call(this._handle, _arg, 1)
  }

  fun setSuspensionTravel(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_suspension_travel.call(this._handle, _arg, 1)
  }

  fun setUseAsSteering(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_as_steering.call(this._handle, _arg, 1)
  }

  fun setUseAsTraction(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_as_traction.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VehicleWheel = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleWheel".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VehicleWheel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VehicleWheel(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VehicleWheel = VehicleWheel(ptr)
    /**
     * Container for method_bind pointers for VehicleWheel
     */
    private object __method_bind {
      val get_damping_compression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_compression" }
        }
      val get_damping_relaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_relaxation" }
        }
      val get_friction_slip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction_slip" }
        }
      val get_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val get_roll_influence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_roll_influence" }
        }
      val get_rpm: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_rpm".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpm" }
        }
      val get_skidinfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_skidinfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skidinfo" }
        }
      val get_suspension_max_force: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_max_force" }
        }
      val get_suspension_rest_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_rest_length" }
        }
      val get_suspension_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_stiffness" }
        }
      val get_suspension_travel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_travel" }
        }
      val is_in_contact: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_in_contact".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_contact" }
        }
      val is_used_as_steering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_steering" }
        }
      val is_used_as_traction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_traction" }
        }
      val set_damping_compression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_compression" }
        }
      val set_damping_relaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_relaxation" }
        }
      val set_friction_slip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction_slip" }
        }
      val set_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val set_roll_influence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_roll_influence" }
        }
      val set_suspension_max_force: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_max_force" }
        }
      val set_suspension_rest_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_rest_length" }
        }
      val set_suspension_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_stiffness" }
        }
      val set_suspension_travel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_travel" }
        }
      val set_use_as_steering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_steering" }
        }
      val set_use_as_traction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_traction" }
        }}
  }
}
