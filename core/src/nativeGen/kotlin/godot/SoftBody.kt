// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class SoftBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : MeshInstance(null) {
  var areaAngularStiffness: Float
    get() {
       return getAreaAngularStiffness() 
    }
    set(value) {
      setAreaAngularStiffness(value)
    }

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var dampingCoefficient: Float
    get() {
       return getDampingCoefficient() 
    }
    set(value) {
      setDampingCoefficient(value)
    }

  var dragCoefficient: Float
    get() {
       return getDragCoefficient() 
    }
    set(value) {
      setDragCoefficient(value)
    }

  var linearStiffness: Float
    get() {
       return getLinearStiffness() 
    }
    set(value) {
      setLinearStiffness(value)
    }

  var parentCollisionIgnore: NodePath
    get() {
       return getParentCollisionIgnore() 
    }
    set(value) {
      setParentCollisionIgnore(value)
    }

  var poseMatchingCoefficient: Float
    get() {
       return getPoseMatchingCoefficient() 
    }
    set(value) {
      setPoseMatchingCoefficient(value)
    }

  var pressureCoefficient: Float
    get() {
       return getPressureCoefficient() 
    }
    set(value) {
      setPressureCoefficient(value)
    }

  var rayPickable: Boolean
    get() {
       return isRayPickable() 
    }
    set(value) {
      setRayPickable(value)
    }

  var simulationPrecision: Int
    get() {
       return getSimulationPrecision() 
    }
    set(value) {
      setSimulationPrecision(value)
    }

  var totalMass: Float
    get() {
       return getTotalMass() 
    }
    set(value) {
      setTotalMass(value)
    }

  var volumeStiffness: Float
    get() {
       return getVolumeStiffness() 
    }
    set(value) {
      setVolumeStiffness(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for parentCollisionIgnore
   */
  fun parentCollisionIgnore(cb: NodePath.() -> Unit) {
    val _p = parentCollisionIgnore
    cb(_p)
    parentCollisionIgnore = _p
  }

  fun addCollisionExceptionWith(body: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCollisionExceptionWith.call(self._handle, listOf(body), null)
    }
  }

  fun getAreaAngularStiffness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAreaAngularStiffness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCollisionExceptions(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getCollisionExceptions.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCollisionLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayerBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMaskBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getDampingCoefficient(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDampingCoefficient.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDragCoefficient(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDragCoefficient.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLinearStiffness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLinearStiffness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParentCollisionIgnore(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getParentCollisionIgnore.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPoseMatchingCoefficient(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPoseMatchingCoefficient.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPressureCoefficient(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPressureCoefficient.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSimulationPrecision(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSimulationPrecision.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTotalMass(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTotalMass.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVolumeStiffness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVolumeStiffness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isRayPickable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRayPickable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeCollisionExceptionWith(body: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeCollisionExceptionWith.call(self._handle, listOf(body), null)
    }
  }

  fun setAreaAngularStiffness(areaAngularStiffness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAreaAngularStiffness.call(self._handle, listOf(areaAngularStiffness), null)
    }
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionLayer.call(self._handle, listOf(collisionLayer), null)
    }
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionLayerBit.call(self._handle, _args, null)
    }
  }

  fun setCollisionMask(collisionMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(collisionMask), null)
    }
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionMaskBit.call(self._handle, _args, null)
    }
  }

  fun setDampingCoefficient(dampingCoefficient: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDampingCoefficient.call(self._handle, listOf(dampingCoefficient), null)
    }
  }

  fun setDragCoefficient(dragCoefficient: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDragCoefficient.call(self._handle, listOf(dragCoefficient), null)
    }
  }

  fun setLinearStiffness(linearStiffness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLinearStiffness.call(self._handle, listOf(linearStiffness), null)
    }
  }

  fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParentCollisionIgnore.call(self._handle, listOf(parentCollisionIgnore), null)
    }
  }

  fun setPoseMatchingCoefficient(poseMatchingCoefficient: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPoseMatchingCoefficient.call(self._handle, listOf(poseMatchingCoefficient),
          null)
    }
  }

  fun setPressureCoefficient(pressureCoefficient: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressureCoefficient.call(self._handle, listOf(pressureCoefficient), null)
    }
  }

  fun setRayPickable(rayPickable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRayPickable.call(self._handle, listOf(rayPickable), null)
    }
  }

  fun setSimulationPrecision(simulationPrecision: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSimulationPrecision.call(self._handle, listOf(simulationPrecision), null)
    }
  }

  fun setTotalMass(mass: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTotalMass.call(self._handle, listOf(mass), null)
    }
  }

  fun setVolumeStiffness(volumeStiffness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVolumeStiffness.call(self._handle, listOf(volumeStiffness), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SoftBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SoftBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SoftBody
     */
    private object __method_bind {
      val addCollisionExceptionWith: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "add_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_collision_exception_with" }
        }
      val getAreaAngularStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_areaAngular_stiffness" }
        }
      val getCollisionExceptions: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_exceptions" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getDampingCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_coefficient" }
        }
      val getDragCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_coefficient" }
        }
      val getLinearStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_stiffness" }
        }
      val getParentCollisionIgnore: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_collision_ignore" }
        }
      val getPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pose_matching_coefficient" }
        }
      val getPressureCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure_coefficient" }
        }
      val getSimulationPrecision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simulation_precision" }
        }
      val getTotalMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_mass" }
        }
      val getVolumeStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_stiffness" }
        }
      val isRayPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
        }
      val removeCollisionExceptionWith: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "remove_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_collision_exception_with" }
        }
      val setAreaAngularStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_areaAngular_stiffness" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setDampingCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_coefficient" }
        }
      val setDragCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_coefficient" }
        }
      val setLinearStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_stiffness" }
        }
      val setParentCollisionIgnore: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_parent_collision_ignore" }
        }
      val setPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pose_matching_coefficient" }
        }
      val setPressureCoefficient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure_coefficient" }
        }
      val setRayPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
        }
      val setSimulationPrecision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_simulation_precision" }
        }
      val setTotalMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_total_mass" }
        }
      val setVolumeStiffness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume_stiffness" }
        }}
  }
}
