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
  fun addCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.add_collision_exception_with.call(this._handle, _arg, 1)
  }

  fun getAreaAngularStiffness(): Float {
    val _ret = __method_bind.get_areaAngular_stiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionExceptions(): VariantArray {
    val _ret = __method_bind.get_collision_exceptions.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getDampingCoefficient(): Float {
    val _ret = __method_bind.get_damping_coefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getDragCoefficient(): Float {
    val _ret = __method_bind.get_drag_coefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearStiffness(): Float {
    val _ret = __method_bind.get_linear_stiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getParentCollisionIgnore(): NodePath {
    val _ret = __method_bind.get_parent_collision_ignore.call(this._handle)
    return _ret.asNodePath()
  }

  fun getPoseMatchingCoefficient(): Float {
    val _ret = __method_bind.get_pose_matching_coefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getPressureCoefficient(): Float {
    val _ret = __method_bind.get_pressure_coefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getSimulationPrecision(): Int {
    val _ret = __method_bind.get_simulation_precision.call(this._handle)
    return _ret.asInt()
  }

  fun getTotalMass(): Float {
    val _ret = __method_bind.get_total_mass.call(this._handle)
    return _ret.asFloat()
  }

  fun getVolumeStiffness(): Float {
    val _ret = __method_bind.get_volume_stiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun isRayPickable(): Boolean {
    val _ret = __method_bind.is_ray_pickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.remove_collision_exception_with.call(this._handle, _arg, 1)
  }

  fun setAreaAngularStiffness(areaAngularStiffness: Float) {
    val _arg = Variant.new(areaAngularStiffness)
    __method_bind.set_areaAngular_stiffness.call(this._handle, _arg, 1)
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.set_collision_layer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_layer_bit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.set_collision_mask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this._handle, _args.toVariant(), 2)
  }

  fun setDampingCoefficient(dampingCoefficient: Float) {
    val _arg = Variant.new(dampingCoefficient)
    __method_bind.set_damping_coefficient.call(this._handle, _arg, 1)
  }

  fun setDragCoefficient(dragCoefficient: Float) {
    val _arg = Variant.new(dragCoefficient)
    __method_bind.set_drag_coefficient.call(this._handle, _arg, 1)
  }

  fun setLinearStiffness(linearStiffness: Float) {
    val _arg = Variant.new(linearStiffness)
    __method_bind.set_linear_stiffness.call(this._handle, _arg, 1)
  }

  fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val _arg = Variant.new(parentCollisionIgnore)
    __method_bind.set_parent_collision_ignore.call(this._handle, _arg, 1)
  }

  fun setPoseMatchingCoefficient(poseMatchingCoefficient: Float) {
    val _arg = Variant.new(poseMatchingCoefficient)
    __method_bind.set_pose_matching_coefficient.call(this._handle, _arg, 1)
  }

  fun setPressureCoefficient(pressureCoefficient: Float) {
    val _arg = Variant.new(pressureCoefficient)
    __method_bind.set_pressure_coefficient.call(this._handle, _arg, 1)
  }

  fun setRayPickable(rayPickable: Boolean) {
    val _arg = Variant.new(rayPickable)
    __method_bind.set_ray_pickable.call(this._handle, _arg, 1)
  }

  fun setSimulationPrecision(simulationPrecision: Int) {
    val _arg = Variant.new(simulationPrecision)
    __method_bind.set_simulation_precision.call(this._handle, _arg, 1)
  }

  fun setTotalMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.set_total_mass.call(this._handle, _arg, 1)
  }

  fun setVolumeStiffness(volumeStiffness: Float) {
    val _arg = Variant.new(volumeStiffness)
    __method_bind.set_volume_stiffness.call(this._handle, _arg, 1)
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
      val add_collision_exception_with: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "add_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_collision_exception_with" }
        }
      val get_areaAngular_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_areaAngular_stiffness" }
        }
      val get_collision_exceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_exceptions" }
        }
      val get_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val get_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_damping_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping_coefficient" }
        }
      val get_drag_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_coefficient" }
        }
      val get_linear_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_stiffness" }
        }
      val get_parent_collision_ignore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_collision_ignore" }
        }
      val get_pose_matching_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pose_matching_coefficient" }
        }
      val get_pressure_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure_coefficient" }
        }
      val get_simulation_precision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simulation_precision" }
        }
      val get_total_mass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_mass" }
        }
      val get_volume_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "get_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_stiffness" }
        }
      val is_ray_pickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
        }
      val remove_collision_exception_with: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "remove_collision_exception_with".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_collision_exception_with" }
        }
      val set_areaAngular_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_areaAngular_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_areaAngular_stiffness" }
        }
      val set_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val set_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_damping_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_damping_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping_coefficient" }
        }
      val set_drag_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_drag_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_coefficient" }
        }
      val set_linear_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_linear_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_stiffness" }
        }
      val set_parent_collision_ignore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_parent_collision_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_parent_collision_ignore" }
        }
      val set_pose_matching_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pose_matching_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pose_matching_coefficient" }
        }
      val set_pressure_coefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_pressure_coefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure_coefficient" }
        }
      val set_ray_pickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
        }
      val set_simulation_precision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_simulation_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_simulation_precision" }
        }
      val set_total_mass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_total_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_total_mass" }
        }
      val set_volume_stiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "set_volume_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume_stiffness" }
        }}
  }
}
