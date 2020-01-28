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

  fun getDampingCompression(): Float {
    val _ret = __method_bind.getDampingCompression.call(this._handle)
    return _ret.asFloat()
  }

  fun getDampingRelaxation(): Float {
    val _ret = __method_bind.getDampingRelaxation.call(this._handle)
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

  fun setDampingCompression(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setDampingCompression.call(this._handle, _arg, 1)
  }

  fun setDampingRelaxation(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setDampingRelaxation.call(this._handle, _arg, 1)
  }

  fun setFrictionSlip(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setFrictionSlip.call(this._handle, _arg, 1)
  }

  fun setRadius(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setRadius.call(this._handle, _arg, 1)
  }

  fun setRollInfluence(rollInfluence: Float) {
    val _arg = Variant.new(rollInfluence)
    __method_bind.setRollInfluence.call(this._handle, _arg, 1)
  }

  fun setSuspensionMaxForce(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionMaxForce.call(this._handle, _arg, 1)
  }

  fun setSuspensionRestLength(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionRestLength.call(this._handle, _arg, 1)
  }

  fun setSuspensionStiffness(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionStiffness.call(this._handle, _arg, 1)
  }

  fun setSuspensionTravel(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setSuspensionTravel.call(this._handle, _arg, 1)
  }

  fun setUseAsSteering(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseAsSteering.call(this._handle, _arg, 1)
  }

  fun setUseAsTraction(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseAsTraction.call(this._handle, _arg, 1)
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
      val getDampingCompression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getDampingCompression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDampingCompression" }
        }
      val getDampingRelaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getDampingRelaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDampingRelaxation" }
        }
      val getFrictionSlip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getFrictionSlip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrictionSlip" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadius" }
        }
      val getRollInfluence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getRollInfluence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRollInfluence" }
        }
      val getRpm: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getRpm".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRpm" }
        }
      val getSkidinfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getSkidinfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkidinfo" }
        }
      val getSuspensionMaxForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getSuspensionMaxForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSuspensionMaxForce" }
        }
      val getSuspensionRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getSuspensionRestLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSuspensionRestLength" }
        }
      val getSuspensionStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getSuspensionStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSuspensionStiffness" }
        }
      val getSuspensionTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "getSuspensionTravel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSuspensionTravel" }
        }
      val isInContact: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "isInContact".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInContact" }
        }
      val isUsedAsSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "isUsedAsSteering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsedAsSteering" }
        }
      val isUsedAsTraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "isUsedAsTraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsedAsTraction" }
        }
      val setDampingCompression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setDampingCompression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDampingCompression" }
        }
      val setDampingRelaxation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setDampingRelaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDampingRelaxation" }
        }
      val setFrictionSlip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setFrictionSlip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrictionSlip" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadius" }
        }
      val setRollInfluence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setRollInfluence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRollInfluence" }
        }
      val setSuspensionMaxForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setSuspensionMaxForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSuspensionMaxForce" }
        }
      val setSuspensionRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setSuspensionRestLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSuspensionRestLength" }
        }
      val setSuspensionStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setSuspensionStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSuspensionStiffness" }
        }
      val setSuspensionTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setSuspensionTravel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSuspensionTravel" }
        }
      val setUseAsSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setUseAsSteering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseAsSteering" }
        }
      val setUseAsTraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "setUseAsTraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseAsTraction" }
        }}
  }
}
