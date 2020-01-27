// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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
    val _ret = __method_bind.get_angular_damp.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAudioBus(): String {
    val _ret = __method_bind.get_audio_bus.call(this.toVariant())
    return _ret.asString()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getGravity(): Float {
    val _ret = __method_bind.get_gravity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGravityDistanceScale(): Float {
    val _ret = __method_bind.get_gravity_distance_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGravityVector(): Vector3 {
    val _ret = __method_bind.get_gravity_vector.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.get_linear_damp.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getOverlappingAreas(): VariantArray {
    val _ret = __method_bind.get_overlapping_areas.call(this.toVariant())
    return _ret.asArray()
  }

  fun getOverlappingBodies(): VariantArray {
    val _ret = __method_bind.get_overlapping_bodies.call(this.toVariant())
    return _ret.asArray()
  }

  fun getPriority(): Float {
    val _ret = __method_bind.get_priority.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getReverbAmount(): Float {
    val _ret = __method_bind.get_reverb_amount.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getReverbBus(): String {
    val _ret = __method_bind.get_reverb_bus.call(this.toVariant())
    return _ret.asString()
  }

  fun getReverbUniformity(): Float {
    val _ret = __method_bind.get_reverb_uniformity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSpaceOverrideMode(): SpaceOverride {
    val _ret = __method_bind.get_space_override_mode.call(this.toVariant())
    return Area.SpaceOverride.from(_ret.asInt())
  }

  fun isGravityAPoint(): Boolean {
    val _ret = __method_bind.is_gravity_a_point.call(this.toVariant())
    return _ret.asBool()
  }

  fun isMonitorable(): Boolean {
    val _ret = __method_bind.is_monitorable.call(this.toVariant())
    return _ret.asBool()
  }

  fun isMonitoring(): Boolean {
    val _ret = __method_bind.is_monitoring.call(this.toVariant())
    return _ret.asBool()
  }

  fun isOverridingAudioBus(): Boolean {
    val _ret = __method_bind.is_overriding_audio_bus.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingReverbBus(): Boolean {
    val _ret = __method_bind.is_using_reverb_bus.call(this.toVariant())
    return _ret.asBool()
  }

  fun overlapsArea(area: Node): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.overlaps_area.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun overlapsBody(body: Node): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.overlaps_body.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant.new(angularDamp)
    __method_bind.set_angular_damp.call(this.toVariant(), _arg, 1)
  }

  fun setAudioBus(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_audio_bus.call(this.toVariant(), _arg, 1)
  }

  fun setAudioBusOverride(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_audio_bus_override.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.set_collision_layer.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.set_collision_mask.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setGravity(gravity: Float) {
    val _arg = Variant.new(gravity)
    __method_bind.set_gravity.call(this.toVariant(), _arg, 1)
  }

  fun setGravityDistanceScale(distanceScale: Float) {
    val _arg = Variant.new(distanceScale)
    __method_bind.set_gravity_distance_scale.call(this.toVariant(), _arg, 1)
  }

  fun setGravityIsPoint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_gravity_is_point.call(this.toVariant(), _arg, 1)
  }

  fun setGravityVector(vector: Vector3) {
    val _arg = Variant.new(vector)
    __method_bind.set_gravity_vector.call(this.toVariant(), _arg, 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.set_linear_damp.call(this.toVariant(), _arg, 1)
  }

  fun setMonitorable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_monitorable.call(this.toVariant(), _arg, 1)
  }

  fun setMonitoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_monitoring.call(this.toVariant(), _arg, 1)
  }

  fun setPriority(priority: Float) {
    val _arg = Variant.new(priority)
    __method_bind.set_priority.call(this.toVariant(), _arg, 1)
  }

  fun setReverbAmount(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_reverb_amount.call(this.toVariant(), _arg, 1)
  }

  fun setReverbBus(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_reverb_bus.call(this.toVariant(), _arg, 1)
  }

  fun setReverbUniformity(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_reverb_uniformity.call(this.toVariant(), _arg, 1)
  }

  fun setSpaceOverrideMode(enable: Int) {
    val _arg = Variant.new(enable)
    __method_bind.set_space_override_mode.call(this.toVariant(), _arg, 1)
  }

  fun setUseReverbBus(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_reverb_bus.call(this.toVariant(), _arg, 1)
  }

  enum class SpaceOverride(
    val value: Int
  ) {
    SPACE_OVERRIDE_DISABLED(0),

    SPACE_OVERRIDE_COMBINE(1),

    SPACE_OVERRIDE_COMBINE_REPLACE(2),

    SPACE_OVERRIDE_REPLACE(3),

    SPACE_OVERRIDE_REPLACE_COMBINE(4);

    companion object {
      fun from(value: Int): SpaceOverride {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val SPACE_OVERRIDE_COMBINE: Int = 1

    val SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2

    val SPACE_OVERRIDE_DISABLED: Int = 0

    val SPACE_OVERRIDE_REPLACE: Int = 3

    val SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4

    fun new(): Area = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Area" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Area = Area(ptr)
    /**
     * Container for method_bind pointers for Area
     */
    private object __method_bind {
      val get_angular_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val get_audio_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_bus" }
        }
      val get_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val get_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val get_gravity_distance_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_distance_scale" }
        }
      val get_gravity_vector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_vector" }
        }
      val get_linear_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val get_overlapping_areas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_areas" }
        }
      val get_overlapping_bodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_bodies" }
        }
      val get_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_priority" }
        }
      val get_reverb_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_amount" }
        }
      val get_reverb_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_bus" }
        }
      val get_reverb_uniformity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_uniformity" }
        }
      val get_space_override_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_override_mode" }
        }
      val is_gravity_a_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_gravity_a_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_gravity_a_point" }
        }
      val is_monitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitorable" }
        }
      val is_monitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitoring" }
        }
      val is_overriding_audio_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_overriding_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_audio_bus" }
        }
      val is_using_reverb_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_using_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_reverb_bus" }
        }
      val overlaps_area: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_area" }
        }
      val overlaps_body: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_body" }
        }
      val set_angular_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val set_audio_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus" }
        }
      val set_audio_bus_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus_override" }
        }
      val set_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val set_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val set_gravity_distance_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_distance_scale" }
        }
      val set_gravity_is_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_is_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_is_point" }
        }
      val set_gravity_vector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_vector" }
        }
      val set_linear_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val set_monitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitorable" }
        }
      val set_monitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitoring" }
        }
      val set_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_priority" }
        }
      val set_reverb_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_amount" }
        }
      val set_reverb_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_bus" }
        }
      val set_reverb_uniformity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_uniformity" }
        }
      val set_space_override_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_space_override_mode" }
        }
      val set_use_reverb_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_use_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_reverb_bus" }
        }}
  }
}
