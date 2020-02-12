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

open class VehicleWheel(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBrake(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBrake.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDampingCompression(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDampingCompression.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDampingRelaxation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDampingRelaxation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEngineForce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEngineForce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFrictionSlip(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFrictionSlip.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRollInfluence(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRollInfluence.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRpm(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRpm.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSkidinfo(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSkidinfo.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSteering(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSteering.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSuspensionMaxForce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSuspensionMaxForce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSuspensionRestLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSuspensionRestLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSuspensionStiffness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSuspensionStiffness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSuspensionTravel(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSuspensionTravel.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isInContact(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInContact.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsedAsSteering(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsedAsSteering.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsedAsTraction(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsedAsTraction.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBrake(brake: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBrake.call(self._handle, listOf(brake), null)
    }
  }

  fun setDampingCompression(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDampingCompression.call(self._handle, listOf(length), null)
    }
  }

  fun setDampingRelaxation(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDampingRelaxation.call(self._handle, listOf(length), null)
    }
  }

  fun setEngineForce(engineForce: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEngineForce.call(self._handle, listOf(engineForce), null)
    }
  }

  fun setFrictionSlip(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrictionSlip.call(self._handle, listOf(length), null)
    }
  }

  fun setRadius(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadius.call(self._handle, listOf(length), null)
    }
  }

  fun setRollInfluence(rollInfluence: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRollInfluence.call(self._handle, listOf(rollInfluence), null)
    }
  }

  fun setSteering(steering: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSteering.call(self._handle, listOf(steering), null)
    }
  }

  fun setSuspensionMaxForce(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSuspensionMaxForce.call(self._handle, listOf(length), null)
    }
  }

  fun setSuspensionRestLength(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSuspensionRestLength.call(self._handle, listOf(length), null)
    }
  }

  fun setSuspensionStiffness(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSuspensionStiffness.call(self._handle, listOf(length), null)
    }
  }

  fun setSuspensionTravel(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSuspensionTravel.call(self._handle, listOf(length), null)
    }
  }

  fun setUseAsSteering(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseAsSteering.call(self._handle, listOf(enable), null)
    }
  }

  fun setUseAsTraction(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseAsTraction.call(self._handle, listOf(enable), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleWheel".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VehicleWheel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VehicleWheel
     */
    private object __method_bind {
      val getBrake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_brake" }
        }
      val getDampingCompression: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_compression" }
        }
      val getDampingRelaxation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_relaxation" }
        }
      val getEngineForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_engine_force" }
        }
      val getFrictionSlip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction_slip" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val getRollInfluence: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_roll_influence" }
        }
      val getRpm: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_rpm".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpm" }
        }
      val getSkidinfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_skidinfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skidinfo" }
        }
      val getSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steering" }
        }
      val getSuspensionMaxForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_max_force" }
        }
      val getSuspensionRestLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_rest_length" }
        }
      val getSuspensionStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_stiffness" }
        }
      val getSuspensionTravel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "get_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suspension_travel" }
        }
      val isInContact: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_in_contact".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_contact" }
        }
      val isUsedAsSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_steering" }
        }
      val isUsedAsTraction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "is_used_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_used_as_traction" }
        }
      val setBrake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_brake" }
        }
      val setDampingCompression: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_compression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_compression" }
        }
      val setDampingRelaxation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_damping_relaxation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_relaxation" }
        }
      val setEngineForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_engine_force" }
        }
      val setFrictionSlip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_friction_slip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction_slip" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val setRollInfluence: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_roll_influence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_roll_influence" }
        }
      val setSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steering" }
        }
      val setSuspensionMaxForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_max_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_max_force" }
        }
      val setSuspensionRestLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_rest_length" }
        }
      val setSuspensionStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_stiffness" }
        }
      val setSuspensionTravel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_suspension_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suspension_travel" }
        }
      val setUseAsSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_steering" }
        }
      val setUseAsTraction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
            "set_use_as_traction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_as_traction" }
        }}
  }
}
