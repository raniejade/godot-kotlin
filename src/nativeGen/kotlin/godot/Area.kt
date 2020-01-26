// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector3
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

open class Area internal constructor(
  _handle: COpaquePointer
) : CollisionObject(_handle) {
  fun getAngularDamp(): Float {
    TODO()
  }

  fun getAudioBus(): String {
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

  fun getGravity(): Float {
    TODO()
  }

  fun getGravityDistanceScale(): Float {
    TODO()
  }

  fun getGravityVector(): Vector3 {
    TODO()
  }

  fun getLinearDamp(): Float {
    TODO()
  }

  fun getOverlappingAreas(): VariantArray {
    TODO()
  }

  fun getOverlappingBodies(): VariantArray {
    TODO()
  }

  fun getPriority(): Float {
    TODO()
  }

  fun getReverbAmount(): Float {
    TODO()
  }

  fun getReverbBus(): String {
    TODO()
  }

  fun getReverbUniformity(): Float {
    TODO()
  }

  fun getSpaceOverrideMode(): SpaceOverride {
    TODO()
  }

  fun isGravityAPoint(): Boolean {
    TODO()
  }

  fun isMonitorable(): Boolean {
    TODO()
  }

  fun isMonitoring(): Boolean {
    TODO()
  }

  fun isOverridingAudioBus(): Boolean {
    TODO()
  }

  fun isUsingReverbBus(): Boolean {
    TODO()
  }

  fun overlapsArea(): Boolean {
    TODO()
  }

  fun overlapsBody(): Boolean {
    TODO()
  }

  fun setAngularDamp() {
    TODO()
  }

  fun setAudioBus() {
    TODO()
  }

  fun setAudioBusOverride() {
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

  fun setGravity() {
    TODO()
  }

  fun setGravityDistanceScale() {
    TODO()
  }

  fun setGravityIsPoint() {
    TODO()
  }

  fun setGravityVector() {
    TODO()
  }

  fun setLinearDamp() {
    TODO()
  }

  fun setMonitorable() {
    TODO()
  }

  fun setMonitoring() {
    TODO()
  }

  fun setPriority() {
    TODO()
  }

  fun setReverbAmount() {
    TODO()
  }

  fun setReverbBus() {
    TODO()
  }

  fun setReverbUniformity() {
    TODO()
  }

  fun setSpaceOverrideMode() {
    TODO()
  }

  fun setUseReverbBus() {
    TODO()
  }

  enum class SpaceOverride(
    val value: Int
  ) {
    SPACE_OVERRIDE_DISABLED(0),

    SPACE_OVERRIDE_COMBINE(1),

    SPACE_OVERRIDE_COMBINE_REPLACE(2),

    SPACE_OVERRIDE_REPLACE(3),

    SPACE_OVERRIDE_REPLACE_COMBINE(4);
  }

  companion object {
    val SPACE_OVERRIDE_COMBINE: Int = 1

    val SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2

    val SPACE_OVERRIDE_DISABLED: Int = 0

    val SPACE_OVERRIDE_REPLACE: Int = 3

    val SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4

    fun new(): Area = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Area" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Area
     */
    private object __method_bind {
      val get_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
            }
          }

      val get_audio_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_audio_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_audio_bus" }
            }
          }

      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val get_gravity_distance_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_gravity_distance_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity_distance_scale" }
            }
          }

      val get_gravity_vector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_gravity_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity_vector" }
            }
          }

      val get_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
            }
          }

      val get_overlapping_areas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_overlapping_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_overlapping_areas" }
            }
          }

      val get_overlapping_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_overlapping_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_overlapping_bodies" }
            }
          }

      val get_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_priority" }
            }
          }

      val get_reverb_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_reverb_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_reverb_amount" }
            }
          }

      val get_reverb_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_reverb_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_reverb_bus" }
            }
          }

      val get_reverb_uniformity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_reverb_uniformity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_reverb_uniformity" }
            }
          }

      val get_space_override_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "get_space_override_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space_override_mode" }
            }
          }

      val is_gravity_a_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "is_gravity_a_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_gravity_a_point" }
            }
          }

      val is_monitorable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "is_monitorable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_monitorable" }
            }
          }

      val is_monitoring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "is_monitoring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_monitoring" }
            }
          }

      val is_overriding_audio_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "is_overriding_audio_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_overriding_audio_bus" }
            }
          }

      val is_using_reverb_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "is_using_reverb_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_reverb_bus" }
            }
          }

      val overlaps_area: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "overlaps_area".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method overlaps_area" }
            }
          }

      val overlaps_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "overlaps_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method overlaps_body" }
            }
          }

      val set_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
            }
          }

      val set_audio_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_audio_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_bus" }
            }
          }

      val set_audio_bus_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_audio_bus_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_bus_override" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity" }
            }
          }

      val set_gravity_distance_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_gravity_distance_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_distance_scale" }
            }
          }

      val set_gravity_is_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_gravity_is_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_is_point" }
            }
          }

      val set_gravity_vector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_gravity_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_vector" }
            }
          }

      val set_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
            }
          }

      val set_monitorable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_monitorable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_monitorable" }
            }
          }

      val set_monitoring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_monitoring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_monitoring" }
            }
          }

      val set_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_priority" }
            }
          }

      val set_reverb_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_reverb_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_reverb_amount" }
            }
          }

      val set_reverb_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_reverb_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_reverb_bus" }
            }
          }

      val set_reverb_uniformity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_reverb_uniformity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_reverb_uniformity" }
            }
          }

      val set_space_override_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_space_override_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_space_override_mode" }
            }
          }

      val set_use_reverb_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
              "set_use_reverb_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_reverb_bus" }
            }
          }
    }
  }
}
