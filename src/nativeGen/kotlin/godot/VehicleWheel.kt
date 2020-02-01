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

open class VehicleWheel(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var brake: Float
    get() {
       return getBrake() 
    }
    set(value) {
      setBrake(value)
    }

  var dampingCompression: Float
    get() {
       return getDampingCompression() 
    }
    set(value) {
      setDampingCompression(value)
    }

  var dampingRelaxation: Float
    get() {
       return getDampingRelaxation() 
    }
    set(value) {
      setDampingRelaxation(value)
    }

  var engineForce: Float
    get() {
       return getEngineForce() 
    }
    set(value) {
      setEngineForce(value)
    }

  var steering: Float
    get() {
       return getSteering() 
    }
    set(value) {
      setSteering(value)
    }

  var suspensionMaxForce: Float
    get() {
       return getSuspensionMaxForce() 
    }
    set(value) {
      setSuspensionMaxForce(value)
    }

  var suspensionStiffness: Float
    get() {
       return getSuspensionStiffness() 
    }
    set(value) {
      setSuspensionStiffness(value)
    }

  var suspensionTravel: Float
    get() {
       return getSuspensionTravel() 
    }
    set(value) {
      setSuspensionTravel(value)
    }

  var useAsSteering: Boolean
    get() {
       return isUsedAsSteering() 
    }
    set(value) {
      setUseAsSteering(value)
    }

  var useAsTraction: Boolean
    get() {
       return isUsedAsTraction() 
    }
    set(value) {
      setUseAsTraction(value)
    }

  var wheelFrictionSlip: Float
    get() {
       return getFrictionSlip() 
    }
    set(value) {
      setFrictionSlip(value)
    }

  var wheelRadius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
    }

  var wheelRestLength: Float
    get() {
       return getSuspensionRestLength() 
    }
    set(value) {
      setSuspensionRestLength(value)
    }

  var wheelRollInfluence: Float
    get() {
       return getRollInfluence() 
    }
    set(value) {
      setRollInfluence(value)
    }

  fun getBrake(): Float {
    val _ret = __method_bind.getBrake.call(this._handle)
    return _ret.asFloat()
  }

  fun getDampingCompression(): Float {
    val _ret = __method_bind.getDampingCompression.call(this._handle)
    return _ret.asFloat()
  }

  fun getDampingRelaxation(): Float {
    val _ret = __method_bind.getDampingRelaxation.call(this._handle)
    return _ret.asFloat()
  }

  fun getEngineForce(): Float {
    val _ret = __method_bind.getEngineForce.call(this._handle)
    return _ret.asFloat()
  }

  fun getFrictionSlip(): Float {
    val _ret = __method_bind.getFrictionSlip.call(this._handle)
    return _ret.asFloat()
  }

  fun getRadius(): Float {
    val _ret = __method_bind.getRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getRollInfluence(): Float {
    val _ret = __method_bind.getRollInfluence.call(this._handle)
    return _ret.asFloat()
  }

  fun getRpm(): Float {
    val _ret = __method_bind.getRpm.call(this._handle)
    return _ret.asFloat()
  }

  fun getSkidinfo(): Float {
    val _ret = __method_bind.getSkidinfo.call(this._handle)
    return _ret.asFloat()
  }

  fun getSteering(): Float {
    val _ret = __method_bind.getSteering.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionMaxForce(): Float {
    val _ret = __method_bind.getSuspensionMaxForce.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionRestLength(): Float {
    val _ret = __method_bind.getSuspensionRestLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionStiffness(): Float {
    val _ret = __method_bind.getSuspensionStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getSuspensionTravel(): Float {
    val _ret = __method_bind.getSuspensionTravel.call(this._handle)
    return _ret.asFloat()
  }

  fun isInContact(): Boolean {
    val _ret = __method_bind.isInContact.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsedAsSteering(): Boolean {
    val _ret = __method_bind.isUsedAsSteering.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsedAsTraction(): Boolean {
    val _ret = __method_bind.isUsedAsTraction.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBrake(brake: Float) {
    val _arg = Variant.new(brake)
    __method_bind.setBrake.call(this._handle, listOf(_arg))
  }

  fun setDampingCompression(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setDampingCompression.call(this._handle, listOf(_arg))
  }

  fun setDampingRelaxation(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setDampingRelaxation.call(this._handle, listOf(_arg))
  }

  fun setEngineForce(engineForce: Float) {
    val _arg = Variant.new(engineForce)
    __method_bind.setEngineForce.call(this._handle, listOf(_arg))
  }

  fun setFrictionSlip(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setFrictionSlip.call(this._handle, listOf(_arg))
  }

  fun setRadius(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setRadius.call(this._handle, listOf(_arg))
  }

  fun setRollInfluence(rollInfluence: Float) {
    val _arg = Variant.new(rollInfluence)
    __method_bind.setRollInfluence.call(this._handle, listOf(_arg))
  }

  fun setSteering(steering: Float) {
    val _arg = Variant.new(steering)
    __method_bind.setSteering.call(this._handle, listOf(_arg))
  }

  fun setSuspensionMaxForce(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionMaxForce.call(this._handle, listOf(_arg))
  }

  fun setSuspensionRestLength(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionRestLength.call(this._handle, listOf(_arg))
  }

  fun setSuspensionStiffness(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionStiffness.call(this._handle, listOf(_arg))
  }

  fun setSuspensionTravel(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionTravel.call(this._handle, listOf(_arg))
  }

  fun setUseAsSteering(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseAsSteering.call(this._handle, listOf(_arg))
  }

  fun setUseAsTraction(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseAsTraction.call(this._handle, listOf(_arg))
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
      val getBrake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_brake" }
        }
      val getDampingCompression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_compression" }
        }
      val getDampingRelaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_relaxation" }
        }
      val getEngineForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_engine_force" }
        }
      val getFrictionSlip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction_slip" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val getRollInfluence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_roll_influence" }
        }
      val getRpm: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_rpm".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpm" }
        }
      val getSkidinfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_skidinfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skidinfo" }
        }
      val getSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steering" }
        }
      val getSuspensionMaxForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_max_force" }
        }
      val getSuspensionRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_rest_length" }
        }
      val getSuspensionStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_stiffness" }
        }
      val getSuspensionTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_travel" }
        }
      val isInContact: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_in_contact".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_contact" }
        }
      val isUsedAsSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_steering" }
        }
      val isUsedAsTraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_traction" }
        }
      val setBrake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_brake" }
        }
      val setDampingCompression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_compression" }
        }
      val setDampingRelaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_relaxation" }
        }
      val setEngineForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_engine_force" }
        }
      val setFrictionSlip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction_slip" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val setRollInfluence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_roll_influence" }
        }
      val setSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steering" }
        }
      val setSuspensionMaxForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_max_force" }
        }
      val setSuspensionRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_rest_length" }
        }
      val setSuspensionStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_stiffness" }
        }
      val setSuspensionTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_travel" }
        }
      val setUseAsSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_steering" }
        }
      val setUseAsTraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_traction" }
        }}
  }
}
