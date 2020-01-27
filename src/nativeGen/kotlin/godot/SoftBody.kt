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

open class SoftBody internal constructor(
  _handle: COpaquePointer
) : MeshInstance(_handle) {
  fun addCollisionExceptionWith(body: Node) {
    val _args = VariantArray.new()
    _args.append(body)
    val _ret = __method_bind.add_collision_exception_with.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun getAreaAngularStiffness(): Float {
    val _ret = __method_bind.get_areaAngular_stiffness.call(this.toVariant())
    TODO()
  }

  fun getCollisionExceptions(): VariantArray {
    val _ret = __method_bind.get_collision_exceptions.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    TODO()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getDampingCoefficient(): Float {
    val _ret = __method_bind.get_damping_coefficient.call(this.toVariant())
    TODO()
  }

  fun getDragCoefficient(): Float {
    val _ret = __method_bind.get_drag_coefficient.call(this.toVariant())
    TODO()
  }

  fun getLinearStiffness(): Float {
    val _ret = __method_bind.get_linear_stiffness.call(this.toVariant())
    TODO()
  }

  fun getParentCollisionIgnore(): NodePath {
    val _ret = __method_bind.get_parent_collision_ignore.call(this.toVariant())
    TODO()
  }

  fun getPoseMatchingCoefficient(): Float {
    val _ret = __method_bind.get_pose_matching_coefficient.call(this.toVariant())
    TODO()
  }

  fun getPressureCoefficient(): Float {
    val _ret = __method_bind.get_pressure_coefficient.call(this.toVariant())
    TODO()
  }

  fun getSimulationPrecision(): Int {
    val _ret = __method_bind.get_simulation_precision.call(this.toVariant())
    TODO()
  }

  fun getTotalMass(): Float {
    val _ret = __method_bind.get_total_mass.call(this.toVariant())
    TODO()
  }

  fun getVolumeStiffness(): Float {
    val _ret = __method_bind.get_volume_stiffness.call(this.toVariant())
    TODO()
  }

  fun isRayPickable(): Boolean {
    val _ret = __method_bind.is_ray_pickable.call(this.toVariant())
    TODO()
  }

  fun removeCollisionExceptionWith(body: Node) {
    val _args = VariantArray.new()
    _args.append(body)
    val _ret = __method_bind.remove_collision_exception_with.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setAreaAngularStiffness(areaAngularStiffness: Float) {
    val _args = VariantArray.new()
    _args.append(areaAngularStiffness)
    val _ret = __method_bind.set_areaAngular_stiffness.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _args = VariantArray.new()
    _args.append(collisionLayer)
    val _ret = __method_bind.set_collision_layer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setCollisionMask(collisionMask: Int) {
    val _args = VariantArray.new()
    _args.append(collisionMask)
    val _ret = __method_bind.set_collision_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setDampingCoefficient(dampingCoefficient: Float) {
    val _args = VariantArray.new()
    _args.append(dampingCoefficient)
    val _ret = __method_bind.set_damping_coefficient.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDragCoefficient(dragCoefficient: Float) {
    val _args = VariantArray.new()
    _args.append(dragCoefficient)
    val _ret = __method_bind.set_drag_coefficient.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLinearStiffness(linearStiffness: Float) {
    val _args = VariantArray.new()
    _args.append(linearStiffness)
    val _ret = __method_bind.set_linear_stiffness.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val _args = VariantArray.new()
    _args.append(parentCollisionIgnore)
    val _ret = __method_bind.set_parent_collision_ignore.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setPoseMatchingCoefficient(poseMatchingCoefficient: Float) {
    val _args = VariantArray.new()
    _args.append(poseMatchingCoefficient)
    val _ret = __method_bind.set_pose_matching_coefficient.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setPressureCoefficient(pressureCoefficient: Float) {
    val _args = VariantArray.new()
    _args.append(pressureCoefficient)
    val _ret = __method_bind.set_pressure_coefficient.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRayPickable(rayPickable: Boolean) {
    val _args = VariantArray.new()
    _args.append(rayPickable)
    val _ret = __method_bind.set_ray_pickable.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSimulationPrecision(simulationPrecision: Int) {
    val _args = VariantArray.new()
    _args.append(simulationPrecision)
    val _ret = __method_bind.set_simulation_precision.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTotalMass(mass: Float) {
    val _args = VariantArray.new()
    _args.append(mass)
    val _ret = __method_bind.set_total_mass.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVolumeStiffness(volumeStiffness: Float) {
    val _args = VariantArray.new()
    _args.append(volumeStiffness)
    val _ret = __method_bind.set_volume_stiffness.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): SoftBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SoftBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SoftBody" }
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
      val add_collision_exception_with: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "add_collision_exception_with".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_exception_with" }
            }
          }

      val get_areaAngular_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_areaAngular_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_areaAngular_stiffness" }
            }
          }

      val get_collision_exceptions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_collision_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_exceptions" }
            }
          }

      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_damping_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_damping_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping_coefficient" }
            }
          }

      val get_drag_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_drag_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_coefficient" }
            }
          }

      val get_linear_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_linear_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_stiffness" }
            }
          }

      val get_parent_collision_ignore: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_parent_collision_ignore".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_collision_ignore" }
            }
          }

      val get_pose_matching_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_pose_matching_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pose_matching_coefficient"
              }
            }
          }

      val get_pressure_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_pressure_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressure_coefficient" }
            }
          }

      val get_simulation_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_simulation_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_simulation_precision" }
            }
          }

      val get_total_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_total_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_mass" }
            }
          }

      val get_volume_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "get_volume_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_stiffness" }
            }
          }

      val is_ray_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "is_ray_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
            }
          }

      val remove_collision_exception_with: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "remove_collision_exception_with".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_collision_exception_with" }
            }
          }

      val set_areaAngular_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_areaAngular_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_areaAngular_stiffness" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_damping_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_damping_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping_coefficient" }
            }
          }

      val set_drag_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_drag_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_coefficient" }
            }
          }

      val set_linear_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_linear_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_stiffness" }
            }
          }

      val set_parent_collision_ignore: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_parent_collision_ignore".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_parent_collision_ignore" }
            }
          }

      val set_pose_matching_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_pose_matching_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pose_matching_coefficient"
              }
            }
          }

      val set_pressure_coefficient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_pressure_coefficient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressure_coefficient" }
            }
          }

      val set_ray_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_ray_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
            }
          }

      val set_simulation_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_simulation_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_simulation_precision" }
            }
          }

      val set_total_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_total_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_total_mass" }
            }
          }

      val set_volume_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
              "set_volume_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_stiffness" }
            }
          }
    }
  }
}
