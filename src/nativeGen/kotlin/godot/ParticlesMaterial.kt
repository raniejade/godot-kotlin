// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParticlesMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
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

  companion object {
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

    fun new(): ParticlesMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParticlesMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ParticlesMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParticlesMaterial(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ParticlesMaterial
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
            }
          }

      val get_emission_box_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_box_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_box_extents" }
            }
          }

      val get_emission_color_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_color_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_color_texture" }
            }
          }

      val get_emission_normal_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_normal_texture" }
            }
          }

      val get_emission_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_point_count" }
            }
          }

      val get_emission_point_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_point_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_point_texture" }
            }
          }

      val get_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
            }
          }

      val get_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
            }
          }

      val get_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag" }
            }
          }

      val get_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flatness" }
            }
          }

      val get_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val get_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
            }
          }

      val get_param_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_param_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_texture" }
            }
          }

      val get_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spread" }
            }
          }

      val get_trail_color_modifier: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_trail_color_modifier".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_trail_color_modifier" }
            }
          }

      val get_trail_divisor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_trail_divisor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_trail_divisor" }
            }
          }

      val get_trail_size_modifier: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "get_trail_size_modifier".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_trail_size_modifier" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_color_ramp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_color_ramp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
            }
          }

      val set_emission_box_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_box_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_box_extents" }
            }
          }

      val set_emission_color_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_color_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_color_texture" }
            }
          }

      val set_emission_normal_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_normal_texture" }
            }
          }

      val set_emission_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_point_count" }
            }
          }

      val set_emission_point_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_point_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_point_texture" }
            }
          }

      val set_emission_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
            }
          }

      val set_emission_sphere_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_emission_sphere_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
            }
          }

      val set_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag" }
            }
          }

      val set_flatness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_flatness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flatness" }
            }
          }

      val set_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }

      val set_param_randomness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_param_randomness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
            }
          }

      val set_param_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_param_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_texture" }
            }
          }

      val set_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spread" }
            }
          }

      val set_trail_color_modifier: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_trail_color_modifier".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_trail_color_modifier" }
            }
          }

      val set_trail_divisor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_trail_divisor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_trail_divisor" }
            }
          }

      val set_trail_size_modifier: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
              "set_trail_size_modifier".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_trail_size_modifier" }
            }
          }
    }
  }
}
