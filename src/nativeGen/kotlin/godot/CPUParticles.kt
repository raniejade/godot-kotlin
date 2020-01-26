// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector3Array
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
  fun updateRenderThread() {
    TODO()
  }

  fun convertFromParticles() {
    TODO()
  }

  fun getAmount(): Int {
    TODO()
  }

  fun getColor(): Color {
    TODO()
  }

  fun getColorRamp(): Gradient {
    TODO()
  }

  fun getDrawOrder(): CPUParticles.DrawOrder {
    TODO()
  }

  fun getEmissionBoxExtents(): Vector3 {
    TODO()
  }

  fun getEmissionColors(): PoolColorArray {
    TODO()
  }

  fun getEmissionNormals(): PoolVector3Array {
    TODO()
  }

  fun getEmissionPoints(): PoolVector3Array {
    TODO()
  }

  fun getEmissionShape(): CPUParticles.EmissionShape {
    TODO()
  }

  fun getEmissionSphereRadius(): Float {
    TODO()
  }

  fun getExplosivenessRatio(): Float {
    TODO()
  }

  fun getFixedFps(): Int {
    TODO()
  }

  fun getFlatness(): Float {
    TODO()
  }

  fun getFractionalDelta(): Boolean {
    TODO()
  }

  fun getGravity(): Vector3 {
    TODO()
  }

  fun getLifetime(): Float {
    TODO()
  }

  fun getMesh(): Mesh {
    TODO()
  }

  fun getOneShot(): Boolean {
    TODO()
  }

  fun getParam(): Float {
    TODO()
  }

  fun getParamCurve(): Curve {
    TODO()
  }

  fun getParamRandomness(): Float {
    TODO()
  }

  fun getParticleFlag(): Boolean {
    TODO()
  }

  fun getPreProcessTime(): Float {
    TODO()
  }

  fun getRandomnessRatio(): Float {
    TODO()
  }

  fun getSpeedScale(): Float {
    TODO()
  }

  fun getSpread(): Float {
    TODO()
  }

  fun getUseLocalCoordinates(): Boolean {
    TODO()
  }

  fun isEmitting(): Boolean {
    TODO()
  }

  fun restart() {
    TODO()
  }

  fun setAmount() {
    TODO()
  }

  fun setColor() {
    TODO()
  }

  fun setColorRamp() {
    TODO()
  }

  fun setDrawOrder() {
    TODO()
  }

  fun setEmissionBoxExtents() {
    TODO()
  }

  fun setEmissionColors() {
    TODO()
  }

  fun setEmissionNormals() {
    TODO()
  }

  fun setEmissionPoints() {
    TODO()
  }

  fun setEmissionShape() {
    TODO()
  }

  fun setEmissionSphereRadius() {
    TODO()
  }

  fun setEmitting() {
    TODO()
  }

  fun setExplosivenessRatio() {
    TODO()
  }

  fun setFixedFps() {
    TODO()
  }

  fun setFlatness() {
    TODO()
  }

  fun setFractionalDelta() {
    TODO()
  }

  fun setGravity() {
    TODO()
  }

  fun setLifetime() {
    TODO()
  }

  fun setMesh() {
    TODO()
  }

  fun setOneShot() {
    TODO()
  }

  fun setParam() {
    TODO()
  }

  fun setParamCurve() {
    TODO()
  }

  fun setParamRandomness() {
    TODO()
  }

  fun setParticleFlag() {
    TODO()
  }

  fun setPreProcessTime() {
    TODO()
  }

  fun setRandomnessRatio() {
    TODO()
  }

  fun setSpeedScale() {
    TODO()
  }

  fun setSpread() {
    TODO()
  }

  fun setUseLocalCoordinates() {
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_ALIGN_Y_TO_VELOCITY(0),

    FLAG_ROTATE_Y(1),

    FLAG_DISABLE_Z(2),

    FLAG_MAX(3);
  }

  enum class EmissionShape(
    val value: Int
  ) {
    EMISSION_SHAPE_POINT(0),

    EMISSION_SHAPE_SPHERE(1),

    EMISSION_SHAPE_BOX(2),

    EMISSION_SHAPE_POINTS(3),

    EMISSION_SHAPE_DIRECTED_POINTS(4);
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
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);
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
    /**
     * Container for method_bind pointers for CPUParticles
     */
    private object __method_bind {
      val _update_render_thread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
              "_update_render_thread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_render_thread" }
            }
          }

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
