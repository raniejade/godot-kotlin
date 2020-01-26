// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
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
  fun addCollisionExceptionWith() {
    TODO()
  }

  fun getAreaAngularStiffness(): Float {
    TODO()
  }

  fun getCollisionExceptions(): VariantArray {
    TODO()
  }

  fun getCollisionLayer(): Int {
    TODO()
  }

  fun getCollisionLayerBit(): Boolean {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(): Boolean {
    TODO()
  }

  fun getDampingCoefficient(): Float {
    TODO()
  }

  fun getDragCoefficient(): Float {
    TODO()
  }

  fun getLinearStiffness(): Float {
    TODO()
  }

  fun getParentCollisionIgnore(): NodePath {
    TODO()
  }

  fun getPoseMatchingCoefficient(): Float {
    TODO()
  }

  fun getPressureCoefficient(): Float {
    TODO()
  }

  fun getSimulationPrecision(): Int {
    TODO()
  }

  fun getTotalMass(): Float {
    TODO()
  }

  fun getVolumeStiffness(): Float {
    TODO()
  }

  fun isRayPickable(): Boolean {
    TODO()
  }

  fun removeCollisionExceptionWith() {
    TODO()
  }

  fun setAreaAngularStiffness() {
    TODO()
  }

  fun setCollisionLayer() {
    TODO()
  }

  fun setCollisionLayerBit() {
    TODO()
  }

  fun setCollisionMask() {
    TODO()
  }

  fun setCollisionMaskBit() {
    TODO()
  }

  fun setDampingCoefficient() {
    TODO()
  }

  fun setDragCoefficient() {
    TODO()
  }

  fun setLinearStiffness() {
    TODO()
  }

  fun setParentCollisionIgnore() {
    TODO()
  }

  fun setPoseMatchingCoefficient() {
    TODO()
  }

  fun setPressureCoefficient() {
    TODO()
  }

  fun setRayPickable() {
    TODO()
  }

  fun setSimulationPrecision() {
    TODO()
  }

  fun setTotalMass() {
    TODO()
  }

  fun setVolumeStiffness() {
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
