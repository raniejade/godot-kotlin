// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class CPUParticles internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun convertFromParticles(particles: Node) {
    val _args = VariantArray.new()
    _args.append(particles)
    val _ret = __method_bind.convert_from_particles.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getAmount(): Int {
    val _ret = __method_bind.get_amount.call(this.toVariant())
    TODO()
  }

  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    TODO()
  }

  fun getColorRamp(): Gradient {
    val _ret = __method_bind.get_color_ramp.call(this.toVariant())
    TODO()
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.get_draw_order.call(this.toVariant())
    TODO()
  }

  fun getEmissionBoxExtents(): Vector3 {
    val _ret = __method_bind.get_emission_box_extents.call(this.toVariant())
    TODO()
  }

  fun getEmissionColors(): PoolColorArray {
    val _ret = __method_bind.get_emission_colors.call(this.toVariant())
    TODO()
  }

  fun getEmissionNormals(): PoolVector3Array {
    val _ret = __method_bind.get_emission_normals.call(this.toVariant())
    TODO()
  }

  fun getEmissionPoints(): PoolVector3Array {
    val _ret = __method_bind.get_emission_points.call(this.toVariant())
    TODO()
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.get_emission_shape.call(this.toVariant())
    TODO()
  }

  fun getEmissionSphereRadius(): Float {
    val _ret = __method_bind.get_emission_sphere_radius.call(this.toVariant())
    TODO()
  }

  fun getExplosivenessRatio(): Float {
    val _ret = __method_bind.get_explosiveness_ratio.call(this.toVariant())
    TODO()
  }

  fun getFixedFps(): Int {
    val _ret = __method_bind.get_fixed_fps.call(this.toVariant())
    TODO()
  }

  fun getFlatness(): Float {
    val _ret = __method_bind.get_flatness.call(this.toVariant())
    TODO()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.get_fractional_delta.call(this.toVariant())
    TODO()
  }

  fun getGravity(): Vector3 {
    val _ret = __method_bind.get_gravity.call(this.toVariant())
    TODO()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.get_lifetime.call(this.toVariant())
    TODO()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.get_mesh.call(this.toVariant())
    TODO()
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.get_one_shot.call(this.toVariant())
    TODO()
  }

  fun getParam(param: Int): Float {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getParamCurve(param: Int): Curve {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param_curve.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getParamRandomness(param: Int): Float {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param_randomness.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getParticleFlag(flag: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(flag)
    val _ret = __method_bind.get_particle_flag.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPreProcessTime(): Float {
    val _ret = __method_bind.get_pre_process_time.call(this.toVariant())
    TODO()
  }

  fun getRandomnessRatio(): Float {
    val _ret = __method_bind.get_randomness_ratio.call(this.toVariant())
    TODO()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.get_speed_scale.call(this.toVariant())
    TODO()
  }

  fun getSpread(): Float {
    val _ret = __method_bind.get_spread.call(this.toVariant())
    TODO()
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.get_use_local_coordinates.call(this.toVariant())
    TODO()
  }

  fun isEmitting(): Boolean {
    val _ret = __method_bind.is_emitting.call(this.toVariant())
    TODO()
  }

  fun restart() {
    val _ret = __method_bind.restart.call(this.toVariant())
    TODO()
  }

  fun setAmount(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_amount.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    val _ret = __method_bind.set_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setColorRamp(ramp: Gradient) {
    val _args = VariantArray.new()
    _args.append(ramp)
    val _ret = __method_bind.set_color_ramp.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDrawOrder(order: Int) {
    val _args = VariantArray.new()
    _args.append(order)
    val _ret = __method_bind.set_draw_order.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionBoxExtents(extents: Vector3) {
    val _args = VariantArray.new()
    _args.append(extents)
    val _ret = __method_bind.set_emission_box_extents.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionColors(array: PoolColorArray) {
    val _args = VariantArray.new()
    _args.append(array)
    val _ret = __method_bind.set_emission_colors.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionNormals(array: PoolVector3Array) {
    val _args = VariantArray.new()
    _args.append(array)
    val _ret = __method_bind.set_emission_normals.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionPoints(array: PoolVector3Array) {
    val _args = VariantArray.new()
    _args.append(array)
    val _ret = __method_bind.set_emission_points.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionShape(shape: Int) {
    val _args = VariantArray.new()
    _args.append(shape)
    val _ret = __method_bind.set_emission_shape.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _args = VariantArray.new()
    _args.append(radius)
    val _ret = __method_bind.set_emission_sphere_radius.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmitting(emitting: Boolean) {
    val _args = VariantArray.new()
    _args.append(emitting)
    val _ret = __method_bind.set_emitting.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    val _ret = __method_bind.set_explosiveness_ratio.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFixedFps(fps: Int) {
    val _args = VariantArray.new()
    _args.append(fps)
    val _ret = __method_bind.set_fixed_fps.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFlatness(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_flatness.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFractionalDelta(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_fractional_delta.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setGravity(accelVec: Vector3) {
    val _args = VariantArray.new()
    _args.append(accelVec)
    val _ret = __method_bind.set_gravity.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLifetime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    val _ret = __method_bind.set_lifetime.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMesh(mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(mesh)
    val _ret = __method_bind.set_mesh.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOneShot(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_one_shot.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    val _ret = __method_bind.set_param.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setParamCurve(param: Int, curve: Curve) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(curve)
    val _ret = __method_bind.set_param_curve.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(randomness)
    val _ret = __method_bind.set_param_randomness.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setParticleFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    val _ret = __method_bind.set_particle_flag.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPreProcessTime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    val _ret = __method_bind.set_pre_process_time.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRandomnessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    val _ret = __method_bind.set_randomness_ratio.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSpeedScale(scale: Float) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.set_speed_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSpread(degrees: Float) {
    val _args = VariantArray.new()
    _args.append(degrees)
    val _ret = __method_bind.set_spread.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_local_coordinates.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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

    EMISSION_SHAPE_SPHERE(1),

    EMISSION_SHAPE_BOX(2),

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

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);

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

    val DRAW_ORDER_VIEW_DEPTH: Int = 2

    val EMISSION_SHAPE_BOX: Int = 2

    val EMISSION_SHAPE_DIRECTED_POINTS: Int = 4

    val EMISSION_SHAPE_POINT: Int = 0

    val EMISSION_SHAPE_POINTS: Int = 3

    val EMISSION_SHAPE_SPHERE: Int = 1

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

    fun new(): CPUParticles = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CPUParticles".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CPUParticles" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CPUParticles(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CPUParticles = CPUParticles(ptr)
    /**
     * Container for method_bind pointers for CPUParticles
     */
    private object __method_bind {
      val convert_from_particles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "convert_from_particles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convert_from_particles" }
            }
          }

      val get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_amount" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
            }
          }

      val get_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
            }
          }

      val get_emission_box_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_box_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_box_extents" }
            }
          }

      val get_emission_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_colors" }
            }
          }

      val get_emission_normals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_normals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_normals" }
            }
          }

      val get_emission_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_points" }
            }
          }

      val get_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
            }
          }

      val get_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
            }
          }

      val get_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
            }
          }

      val get_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
            }
          }

      val get_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flatness" }
            }
          }

      val get_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
            }
          }

      val get_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val get_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val get_param_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_param_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_curve" }
            }
          }

      val get_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
            }
          }

      val get_particle_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_particle_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particle_flag" }
            }
          }

      val get_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
            }
          }

      val get_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spread" }
            }
          }

      val get_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "get_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
            }
          }

      val is_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "is_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emitting" }
            }
          }

      val restart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method restart" }
            }
          }

      val set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_amount" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
            }
          }

      val set_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
            }
          }

      val set_emission_box_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_box_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_box_extents" }
            }
          }

      val set_emission_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_colors" }
            }
          }

      val set_emission_normals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_normals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_normals" }
            }
          }

      val set_emission_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_points" }
            }
          }

      val set_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
            }
          }

      val set_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
            }
          }

      val set_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emitting" }
            }
          }

      val set_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
            }
          }

      val set_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
            }
          }

      val set_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flatness" }
            }
          }

      val set_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
            }
          }

      val set_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity" }
            }
          }

      val set_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }

      val set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }

      val set_param_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_param_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_curve" }
            }
          }

      val set_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
            }
          }

      val set_particle_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_particle_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particle_flag" }
            }
          }

      val set_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
            }
          }

      val set_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spread" }
            }
          }

      val set_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
            }
          }
    }
  }
}
