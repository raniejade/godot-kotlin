// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SoftBody(
  _handle: COpaquePointer
) : MeshInstance(_handle) {
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

  fun addCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.addCollisionExceptionWith.call(this._handle, _arg, 1)
  }

  fun getAreaAngularStiffness(): Float {
    val _ret = __method_bind.getAreaAngularStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionExceptions(): VariantArray {
    val _ret = __method_bind.getCollisionExceptions.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getDampingCoefficient(): Float {
    val _ret = __method_bind.getDampingCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getDragCoefficient(): Float {
    val _ret = __method_bind.getDragCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearStiffness(): Float {
    val _ret = __method_bind.getLinearStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getParentCollisionIgnore(): NodePath {
    val _ret = __method_bind.getParentCollisionIgnore.call(this._handle)
    return _ret.asNodePath()
  }

  fun getPoseMatchingCoefficient(): Float {
    val _ret = __method_bind.getPoseMatchingCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getPressureCoefficient(): Float {
    val _ret = __method_bind.getPressureCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getSimulationPrecision(): Int {
    val _ret = __method_bind.getSimulationPrecision.call(this._handle)
    return _ret.asInt()
  }

  fun getTotalMass(): Float {
    val _ret = __method_bind.getTotalMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getVolumeStiffness(): Float {
    val _ret = __method_bind.getVolumeStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun isRayPickable(): Boolean {
    val _ret = __method_bind.isRayPickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.removeCollisionExceptionWith.call(this._handle, _arg, 1)
  }

  fun setAreaAngularStiffness(areaAngularStiffness: Float) {
    val _arg = Variant.new(areaAngularStiffness)
    __method_bind.setAreaAngularStiffness.call(this._handle, _arg, 1)
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.setCollisionLayer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionLayerBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setDampingCoefficient(dampingCoefficient: Float) {
    val _arg = Variant.new(dampingCoefficient)
    __method_bind.setDampingCoefficient.call(this._handle, _arg, 1)
  }

  fun setDragCoefficient(dragCoefficient: Float) {
    val _arg = Variant.new(dragCoefficient)
    __method_bind.setDragCoefficient.call(this._handle, _arg, 1)
  }

  fun setLinearStiffness(linearStiffness: Float) {
    val _arg = Variant.new(linearStiffness)
    __method_bind.setLinearStiffness.call(this._handle, _arg, 1)
  }

  fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val _arg = Variant.new(parentCollisionIgnore)
    __method_bind.setParentCollisionIgnore.call(this._handle, _arg, 1)
  }

  fun setPoseMatchingCoefficient(poseMatchingCoefficient: Float) {
    val _arg = Variant.new(poseMatchingCoefficient)
    __method_bind.setPoseMatchingCoefficient.call(this._handle, _arg, 1)
  }

  fun setPressureCoefficient(pressureCoefficient: Float) {
    val _arg = Variant.new(pressureCoefficient)
    __method_bind.setPressureCoefficient.call(this._handle, _arg, 1)
  }

  fun setRayPickable(rayPickable: Boolean) {
    val _arg = Variant.new(rayPickable)
    __method_bind.setRayPickable.call(this._handle, _arg, 1)
  }

  fun setSimulationPrecision(simulationPrecision: Int) {
    val _arg = Variant.new(simulationPrecision)
    __method_bind.setSimulationPrecision.call(this._handle, _arg, 1)
  }

  fun setTotalMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.setTotalMass.call(this._handle, _arg, 1)
  }

  fun setVolumeStiffness(volumeStiffness: Float) {
    val _arg = Variant.new(volumeStiffness)
    __method_bind.setVolumeStiffness.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SoftBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SoftBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SoftBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SoftBody(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SoftBody = SoftBody(ptr)
    /**
     * Container for method_bind pointers for SoftBody
     */
    private object __method_bind {
      val addCollisionExceptionWith: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "add_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_collision_exception_with" }
        }
      val getAreaAngularStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_areaAngular_stiffness" }
        }
      val getCollisionExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_exceptions" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getDampingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_coefficient" }
        }
      val getDragCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_coefficient" }
        }
      val getLinearStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_stiffness" }
        }
      val getParentCollisionIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_collision_ignore" }
        }
      val getPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pose_matching_coefficient" }
        }
      val getPressureCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure_coefficient" }
        }
      val getSimulationPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simulation_precision" }
        }
      val getTotalMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_mass" }
        }
      val getVolumeStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_stiffness" }
        }
      val isRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
        }
      val removeCollisionExceptionWith: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "remove_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_collision_exception_with" }
        }
      val setAreaAngularStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_areaAngular_stiffness" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setDampingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_coefficient" }
        }
      val setDragCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_coefficient" }
        }
      val setLinearStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_stiffness" }
        }
      val setParentCollisionIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_parent_collision_ignore" }
        }
      val setPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pose_matching_coefficient" }
        }
      val setPressureCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure_coefficient" }
        }
      val setRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
        }
      val setSimulationPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_simulation_precision" }
        }
      val setTotalMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_total_mass" }
        }
      val setVolumeStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume_stiffness" }
        }}
  }
}
