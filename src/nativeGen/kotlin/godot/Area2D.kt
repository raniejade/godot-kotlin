// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Area2D(
  _handle: COpaquePointer
) : CollisionObject2D(_handle) {
  fun getAngularDamp(): Float {
    val _ret = __method_bind.get_angular_damp.call(this._handle)
    return _ret.asFloat()
  }

  fun getAudioBusName(): String {
    val _ret = __method_bind.get_audio_bus_name.call(this._handle)
    return _ret.asString()
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

  fun getGravity(): Float {
    val _ret = __method_bind.get_gravity.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityDistanceScale(): Float {
    val _ret = __method_bind.get_gravity_distance_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityVector(): Vector2 {
    val _ret = __method_bind.get_gravity_vector.call(this._handle)
    return _ret.asVector2()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.get_linear_damp.call(this._handle)
    return _ret.asFloat()
  }

  fun getOverlappingAreas(): VariantArray {
    val _ret = __method_bind.get_overlapping_areas.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getOverlappingBodies(): VariantArray {
    val _ret = __method_bind.get_overlapping_bodies.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getPriority(): Float {
    val _ret = __method_bind.get_priority.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpaceOverrideMode(): SpaceOverride {
    val _ret = __method_bind.get_space_override_mode.call(this._handle)
    return Area2D.SpaceOverride.from(_ret.asInt())
  }

  fun isGravityAPoint(): Boolean {
    val _ret = __method_bind.is_gravity_a_point.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMonitorable(): Boolean {
    val _ret = __method_bind.is_monitorable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMonitoring(): Boolean {
    val _ret = __method_bind.is_monitoring.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOverridingAudioBus(): Boolean {
    val _ret = __method_bind.is_overriding_audio_bus.call(this._handle)
    return _ret.asBoolean()
  }

  fun overlapsArea(area: Node): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.overlaps_area.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun overlapsBody(body: Node): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.overlaps_body.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant.new(angularDamp)
    __method_bind.set_angular_damp.call(this._handle, _arg, 1)
  }

  fun setAudioBusName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_audio_bus_name.call(this._handle, _arg, 1)
  }

  fun setAudioBusOverride(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_audio_bus_override.call(this._handle, _arg, 1)
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

  fun setGravity(gravity: Float) {
    val _arg = Variant.new(gravity)
    __method_bind.set_gravity.call(this._handle, _arg, 1)
  }

  fun setGravityDistanceScale(distanceScale: Float) {
    val _arg = Variant.new(distanceScale)
    __method_bind.set_gravity_distance_scale.call(this._handle, _arg, 1)
  }

  fun setGravityIsPoint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_gravity_is_point.call(this._handle, _arg, 1)
  }

  fun setGravityVector(vector: Vector2) {
    val _arg = Variant.new(vector)
    __method_bind.set_gravity_vector.call(this._handle, _arg, 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.set_linear_damp.call(this._handle, _arg, 1)
  }

  fun setMonitorable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_monitorable.call(this._handle, _arg, 1)
  }

  fun setMonitoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_monitoring.call(this._handle, _arg, 1)
  }

  fun setPriority(priority: Float) {
    val _arg = Variant.new(priority)
    __method_bind.set_priority.call(this._handle, _arg, 1)
  }

  fun setSpaceOverrideMode(spaceOverrideMode: Int) {
    val _arg = Variant.new(spaceOverrideMode)
    __method_bind.set_space_override_mode.call(this._handle, _arg, 1)
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

    fun new(): Area2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Area2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Area2D = Area2D(ptr)
    /**
     * Container for method_bind pointers for Area2D
     */
    private object __method_bind {
      val get_angular_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val get_audio_bus_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_audio_bus_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_bus_name" }
        }
      val get_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val get_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val get_gravity_distance_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_distance_scale" }
        }
      val get_gravity_vector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_vector" }
        }
      val get_linear_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val get_overlapping_areas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_overlapping_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_areas" }
        }
      val get_overlapping_bodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_overlapping_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_bodies" }
        }
      val get_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_priority" }
        }
      val get_space_override_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_override_mode" }
        }
      val is_gravity_a_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "is_gravity_a_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_gravity_a_point" }
        }
      val is_monitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "is_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitorable" }
        }
      val is_monitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "is_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitoring" }
        }
      val is_overriding_audio_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "is_overriding_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_audio_bus" }
        }
      val overlaps_area: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "overlaps_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_area" }
        }
      val overlaps_body: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "overlaps_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_body" }
        }
      val set_angular_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val set_audio_bus_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_audio_bus_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus_name" }
        }
      val set_audio_bus_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_audio_bus_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus_override" }
        }
      val set_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val set_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val set_gravity_distance_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_distance_scale" }
        }
      val set_gravity_is_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_gravity_is_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_is_point" }
        }
      val set_gravity_vector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_vector" }
        }
      val set_linear_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val set_monitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitorable" }
        }
      val set_monitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitoring" }
        }
      val set_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_priority" }
        }
      val set_space_override_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_space_override_mode" }
        }}
  }
}
