// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class CPUParticles2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun convertFromParticles(particles: Node) {
    val _args = VariantArray.new()
    _args.append(particles)
    __method_bind.convert_from_particles.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun getAmount(): Int {
    val _ret = __method_bind.get_amount.call(this.toVariant())
    return _ret.asInt()
  }

  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getColorRamp(): Gradient {
    val _ret = __method_bind.get_color_ramp.call(this.toVariant())
    return _ret.asObject(::Gradient)!!
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.get_draw_order.call(this.toVariant())
    return CPUParticles2D.DrawOrder.from(_ret.asInt())
  }

  fun getEmissionColors(): PoolColorArray {
    val _ret = __method_bind.get_emission_colors.call(this.toVariant())
    return _ret.asPoolColorArray()
  }

  fun getEmissionNormals(): PoolVector2Array {
    val _ret = __method_bind.get_emission_normals.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun getEmissionPoints(): PoolVector2Array {
    val _ret = __method_bind.get_emission_points.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun getEmissionRectExtents(): Vector2 {
    val _ret = __method_bind.get_emission_rect_extents.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.get_emission_shape.call(this.toVariant())
    return CPUParticles2D.EmissionShape.from(_ret.asInt())
  }

  fun getEmissionSphereRadius(): Float {
    val _ret = __method_bind.get_emission_sphere_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getExplosivenessRatio(): Float {
    val _ret = __method_bind.get_explosiveness_ratio.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFixedFps(): Int {
    val _ret = __method_bind.get_fixed_fps.call(this.toVariant())
    return _ret.asInt()
  }

  fun getFlatness(): Float {
    val _ret = __method_bind.get_flatness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.get_fractional_delta.call(this.toVariant())
    return _ret.asBool()
  }

  fun getGravity(): Vector2 {
    val _ret = __method_bind.get_gravity.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.get_lifetime.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getNormalmap(): Texture {
    val _ret = __method_bind.get_normalmap.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.get_one_shot.call(this.toVariant())
    return _ret.asBool()
  }

  fun getParam(param: Int): Float {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getParamCurve(param: Int): Curve {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param_curve.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Curve)!!
  }

  fun getParamRandomness(param: Int): Float {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param_randomness.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getParticleFlag(flag: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(flag)
    val _ret = __method_bind.get_particle_flag.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun getPreProcessTime(): Float {
    val _ret = __method_bind.get_pre_process_time.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRandomnessRatio(): Float {
    val _ret = __method_bind.get_randomness_ratio.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.get_speed_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSpread(): Float {
    val _ret = __method_bind.get_spread.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.get_use_local_coordinates.call(this.toVariant())
    return _ret.asBool()
  }

  fun isEmitting(): Boolean {
    val _ret = __method_bind.is_emitting.call(this.toVariant())
    return _ret.asBool()
  }

  fun restart() {
    __method_bind.restart.call(this.toVariant())
  }

  fun setAmount(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    __method_bind.set_amount.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    __method_bind.set_color.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setColorRamp(ramp: Gradient) {
    val _args = VariantArray.new()
    _args.append(ramp)
    __method_bind.set_color_ramp.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDrawOrder(order: Int) {
    val _args = VariantArray.new()
    _args.append(order)
    __method_bind.set_draw_order.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionColors(array: PoolColorArray) {
    val _args = VariantArray.new()
    _args.append(array)
    __method_bind.set_emission_colors.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionNormals(array: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(array)
    __method_bind.set_emission_normals.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionPoints(array: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(array)
    __method_bind.set_emission_points.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionRectExtents(extents: Vector2) {
    val _args = VariantArray.new()
    _args.append(extents)
    __method_bind.set_emission_rect_extents.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionShape(shape: Int) {
    val _args = VariantArray.new()
    _args.append(shape)
    __method_bind.set_emission_shape.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _args = VariantArray.new()
    _args.append(radius)
    __method_bind.set_emission_sphere_radius.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmitting(emitting: Boolean) {
    val _args = VariantArray.new()
    _args.append(emitting)
    __method_bind.set_emitting.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    __method_bind.set_explosiveness_ratio.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFixedFps(fps: Int) {
    val _args = VariantArray.new()
    _args.append(fps)
    __method_bind.set_fixed_fps.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFlatness(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    __method_bind.set_flatness.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFractionalDelta(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_fractional_delta.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setGravity(accelVec: Vector2) {
    val _args = VariantArray.new()
    _args.append(accelVec)
    __method_bind.set_gravity.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLifetime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    __method_bind.set_lifetime.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setNormalmap(normalmap: Texture) {
    val _args = VariantArray.new()
    _args.append(normalmap)
    __method_bind.set_normalmap.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setOneShot(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_one_shot.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.set_param.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParamCurve(param: Int, curve: Curve) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(curve)
    __method_bind.set_param_curve.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(randomness)
    __method_bind.set_param_randomness.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParticleFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.set_particle_flag.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPreProcessTime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    __method_bind.set_pre_process_time.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRandomnessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    __method_bind.set_randomness_ratio.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSpeedScale(scale: Float) {
    val _args = VariantArray.new()
    _args.append(scale)
    __method_bind.set_speed_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSpread(degrees: Float) {
    val _args = VariantArray.new()
    _args.append(degrees)
    __method_bind.set_spread.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_use_local_coordinates.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_ALIGN_Y_TO_VELOCITY(0),

    FLAG_ROTATE_Y(1),

    FLAG_DISABLE_Z(2),

    FLAG_MAX(3);

    companion object {
      fun from(value: Int): Flags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EmissionShape(
    val value: Int
  ) {
    EMISSION_SHAPE_POINT(0),

    EMISSION_SHAPE_CIRCLE(1),

    EMISSION_SHAPE_RECTANGLE(2),

    EMISSION_SHAPE_POINTS(3),

    EMISSION_SHAPE_DIRECTED_POINTS(4);

    companion object {
      fun from(value: Int): EmissionShape {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Parameter(
    val value: Int
  ) {
    PARAM_INITIAL_LINEAR_VELOCITY(0),

    PARAM_ANGULAR_VELOCITY(1),

    PARAM_ORBIT_VELOCITY(2),

    PARAM_LINEAR_ACCEL(3),

    PARAM_RADIAL_ACCEL(4),

    PARAM_TANGENTIAL_ACCEL(5),

    PARAM_DAMPING(6),

    PARAM_ANGLE(7),

    PARAM_SCALE(8),

    PARAM_HUE_VARIATION(9),

    PARAM_ANIM_SPEED(10),

    PARAM_ANIM_OFFSET(11),

    PARAM_MAX(12);

    companion object {
      fun from(value: Int): Parameter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1);

    companion object {
      fun from(value: Int): DrawOrder {
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
    val DRAW_ORDER_INDEX: Int = 0

    val DRAW_ORDER_LIFETIME: Int = 1

    val EMISSION_SHAPE_CIRCLE: Int = 1

    val EMISSION_SHAPE_DIRECTED_POINTS: Int = 4

    val EMISSION_SHAPE_POINT: Int = 0

    val EMISSION_SHAPE_POINTS: Int = 3

    val EMISSION_SHAPE_RECTANGLE: Int = 2

    val FLAG_ALIGN_Y_TO_VELOCITY: Int = 0

    val FLAG_DISABLE_Z: Int = 2

    val FLAG_MAX: Int = 3

    val FLAG_ROTATE_Y: Int = 1

    val PARAM_ANGLE: Int = 7

    val PARAM_ANGULAR_VELOCITY: Int = 1

    val PARAM_ANIM_OFFSET: Int = 11

    val PARAM_ANIM_SPEED: Int = 10

    val PARAM_DAMPING: Int = 6

    val PARAM_HUE_VARIATION: Int = 9

    val PARAM_INITIAL_LINEAR_VELOCITY: Int = 0

    val PARAM_LINEAR_ACCEL: Int = 3

    val PARAM_MAX: Int = 12

    val PARAM_ORBIT_VELOCITY: Int = 2

    val PARAM_RADIAL_ACCEL: Int = 4

    val PARAM_SCALE: Int = 8

    val PARAM_TANGENTIAL_ACCEL: Int = 5

    fun new(): CPUParticles2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CPUParticles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CPUParticles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CPUParticles2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CPUParticles2D = CPUParticles2D(ptr)
    /**
     * Container for method_bind pointers for CPUParticles2D
     */
    private object __method_bind {
      val convert_from_particles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "convert_from_particles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convert_from_particles" }
            }
          }

      val get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_amount" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
            }
          }

      val get_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
            }
          }

      val get_emission_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_colors" }
            }
          }

      val get_emission_normals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_normals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_normals" }
            }
          }

      val get_emission_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_points" }
            }
          }

      val get_emission_rect_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_rect_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_rect_extents" }
            }
          }

      val get_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
            }
          }

      val get_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
            }
          }

      val get_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
            }
          }

      val get_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
            }
          }

      val get_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flatness" }
            }
          }

      val get_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
            }
          }

      val get_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val get_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
            }
          }

      val get_normalmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normalmap" }
            }
          }

      val get_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val get_param_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_param_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_curve" }
            }
          }

      val get_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
            }
          }

      val get_particle_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_particle_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particle_flag" }
            }
          }

      val get_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
            }
          }

      val get_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spread" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "get_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
            }
          }

      val is_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "is_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emitting" }
            }
          }

      val restart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method restart" }
            }
          }

      val set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_amount" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
            }
          }

      val set_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
            }
          }

      val set_emission_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_colors" }
            }
          }

      val set_emission_normals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_normals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_normals" }
            }
          }

      val set_emission_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_points" }
            }
          }

      val set_emission_rect_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_rect_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_rect_extents" }
            }
          }

      val set_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
            }
          }

      val set_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
            }
          }

      val set_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emitting" }
            }
          }

      val set_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
            }
          }

      val set_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
            }
          }

      val set_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flatness" }
            }
          }

      val set_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
            }
          }

      val set_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity" }
            }
          }

      val set_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
            }
          }

      val set_normalmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normalmap" }
            }
          }

      val set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }

      val set_param_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_param_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_curve" }
            }
          }

      val set_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
            }
          }

      val set_particle_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_particle_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particle_flag" }
            }
          }

      val set_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
            }
          }

      val set_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spread" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
              "set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
            }
          }
    }
  }
}
