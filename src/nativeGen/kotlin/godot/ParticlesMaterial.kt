// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
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

open class ParticlesMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getColorRamp(): Texture {
    val _ret = __method_bind.get_color_ramp.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionBoxExtents(): Vector3 {
    val _ret = __method_bind.get_emission_box_extents.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getEmissionColorTexture(): Texture {
    val _ret = __method_bind.get_emission_color_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionNormalTexture(): Texture {
    val _ret = __method_bind.get_emission_normal_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionPointCount(): Int {
    val _ret = __method_bind.get_emission_point_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getEmissionPointTexture(): Texture {
    val _ret = __method_bind.get_emission_point_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.get_emission_shape.call(this.toVariant())
    return ParticlesMaterial.EmissionShape.from(_ret.asInt())
  }

  fun getEmissionSphereRadius(): Float {
    val _ret = __method_bind.get_emission_sphere_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.get_flag.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getFlatness(): Float {
    val _ret = __method_bind.get_flatness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGravity(): Vector3 {
    val _ret = __method_bind.get_gravity.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.get_param.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getParamRandomness(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.get_param_randomness.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getParamTexture(param: Int): Texture {
    val _arg = Variant.new(param)
    val _ret = __method_bind.get_param_texture.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getSpread(): Float {
    val _ret = __method_bind.get_spread.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTrailColorModifier(): GradientTexture {
    val _ret = __method_bind.get_trail_color_modifier.call(this.toVariant())
    return _ret.asObject(::GradientTexture)!!
  }

  fun getTrailDivisor(): Int {
    val _ret = __method_bind.get_trail_divisor.call(this.toVariant())
    return _ret.asInt()
  }

  fun getTrailSizeModifier(): CurveTexture {
    val _ret = __method_bind.get_trail_size_modifier.call(this.toVariant())
    return _ret.asObject(::CurveTexture)!!
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_color.call(this.toVariant(), _arg, 1)
  }

  fun setColorRamp(ramp: Texture) {
    val _arg = Variant.new(ramp)
    __method_bind.set_color_ramp.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionBoxExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.set_emission_box_extents.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionColorTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_emission_color_texture.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionNormalTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_emission_normal_texture.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionPointCount(pointCount: Int) {
    val _arg = Variant.new(pointCount)
    __method_bind.set_emission_point_count.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionPointTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_emission_point_texture.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionShape(shape: Int) {
    val _arg = Variant.new(shape)
    __method_bind.set_emission_shape.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_emission_sphere_radius.call(this.toVariant(), _arg, 1)
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.set_flag.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setFlatness(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_flatness.call(this.toVariant(), _arg, 1)
  }

  fun setGravity(accelVec: Vector3) {
    val _arg = Variant.new(accelVec)
    __method_bind.set_gravity.call(this.toVariant(), _arg, 1)
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.set_param.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(randomness)
    __method_bind.set_param_randomness.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParamTexture(param: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(texture)
    __method_bind.set_param_texture.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setSpread(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_spread.call(this.toVariant(), _arg, 1)
  }

  fun setTrailColorModifier(texture: GradientTexture) {
    val _arg = Variant.new(texture)
    __method_bind.set_trail_color_modifier.call(this.toVariant(), _arg, 1)
  }

  fun setTrailDivisor(divisor: Int) {
    val _arg = Variant.new(divisor)
    __method_bind.set_trail_divisor.call(this.toVariant(), _arg, 1)
  }

  fun setTrailSizeModifier(texture: CurveTexture) {
    val _arg = Variant.new(texture)
    __method_bind.set_trail_size_modifier.call(this.toVariant(), _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for ParticlesMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParticlesMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ParticlesMaterial = ParticlesMaterial(ptr)
    /**
     * Container for method_bind pointers for ParticlesMaterial
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val get_color_ramp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
        }
      val get_emission_box_extents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_box_extents" }
        }
      val get_emission_color_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_color_texture" }
        }
      val get_emission_normal_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_normal_texture" }
        }
      val get_emission_point_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_count" }
        }
      val get_emission_point_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_texture" }
        }
      val get_emission_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
        }
      val get_emission_sphere_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
        }
      val get_flag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val get_flatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flatness" }
        }
      val get_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val get_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val get_param_randomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
        }
      val get_param_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_texture" }
        }
      val get_spread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val get_trail_color_modifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_color_modifier" }
        }
      val get_trail_divisor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_divisor" }
        }
      val get_trail_size_modifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_size_modifier" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_color_ramp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
        }
      val set_emission_box_extents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_box_extents" }
        }
      val set_emission_color_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_color_texture" }
        }
      val set_emission_normal_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_normal_texture" }
        }
      val set_emission_point_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_count" }
        }
      val set_emission_point_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_texture" }
        }
      val set_emission_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
        }
      val set_emission_sphere_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
        }
      val set_flag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val set_flatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flatness" }
        }
      val set_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val set_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val set_param_randomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
        }
      val set_param_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_texture" }
        }
      val set_spread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val set_trail_color_modifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_color_modifier" }
        }
      val set_trail_divisor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_divisor" }
        }
      val set_trail_size_modifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_size_modifier" }
        }}
  }
}
