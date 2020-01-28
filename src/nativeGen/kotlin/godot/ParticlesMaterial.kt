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

open class ParticlesMaterial(
  _handle: COpaquePointer
) : Material(_handle) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var colorRamp: Texture
    get() {
       return getColorRamp() 
    }
    set(value) {
      setColorRamp(value)
    }

  var emissionBoxExtents: Vector3
    get() {
       return getEmissionBoxExtents() 
    }
    set(value) {
      setEmissionBoxExtents(value)
    }

  var emissionColorTexture: Texture
    get() {
       return getEmissionColorTexture() 
    }
    set(value) {
      setEmissionColorTexture(value)
    }

  var emissionNormalTexture: Texture
    get() {
       return getEmissionNormalTexture() 
    }
    set(value) {
      setEmissionNormalTexture(value)
    }

  var emissionPointCount: Int
    get() {
       return getEmissionPointCount() 
    }
    set(value) {
      setEmissionPointCount(value)
    }

  var emissionPointTexture: Texture
    get() {
       return getEmissionPointTexture() 
    }
    set(value) {
      setEmissionPointTexture(value)
    }

  var emissionShape: EmissionShape
    get() {
       return getEmissionShape() 
    }
    set(value) {
      setEmissionShape(value.value)
    }

  var emissionSphereRadius: Float
    get() {
       return getEmissionSphereRadius() 
    }
    set(value) {
      setEmissionSphereRadius(value)
    }

  var flatness: Float
    get() {
       return getFlatness() 
    }
    set(value) {
      setFlatness(value)
    }

  var gravity: Vector3
    get() {
       return getGravity() 
    }
    set(value) {
      setGravity(value)
    }

  var spread: Float
    get() {
       return getSpread() 
    }
    set(value) {
      setSpread(value)
    }

  var trailColorModifier: GradientTexture
    get() {
       return getTrailColorModifier() 
    }
    set(value) {
      setTrailColorModifier(value)
    }

  var trailDivisor: Int
    get() {
       return getTrailDivisor() 
    }
    set(value) {
      setTrailDivisor(value)
    }

  var trailSizeModifier: CurveTexture
    get() {
       return getTrailSizeModifier() 
    }
    set(value) {
      setTrailSizeModifier(value)
    }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getColorRamp(): Texture {
    val _ret = __method_bind.getColorRamp.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionBoxExtents(): Vector3 {
    val _ret = __method_bind.getEmissionBoxExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun getEmissionColorTexture(): Texture {
    val _ret = __method_bind.getEmissionColorTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionNormalTexture(): Texture {
    val _ret = __method_bind.getEmissionNormalTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionPointCount(): Int {
    val _ret = __method_bind.getEmissionPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getEmissionPointTexture(): Texture {
    val _ret = __method_bind.getEmissionPointTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.getEmissionShape.call(this._handle)
    return ParticlesMaterial.EmissionShape.from(_ret.asInt())
  }

  fun getEmissionSphereRadius(): Float {
    val _ret = __method_bind.getEmissionSphereRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getFlag.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getFlatness(): Float {
    val _ret = __method_bind.getFlatness.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravity(): Vector3 {
    val _ret = __method_bind.getGravity.call(this._handle)
    return _ret.asVector3()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getParamRandomness(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamRandomness.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getParamTexture(param: Int): Texture {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getSpread(): Float {
    val _ret = __method_bind.getSpread.call(this._handle)
    return _ret.asFloat()
  }

  fun getTrailColorModifier(): GradientTexture {
    val _ret = __method_bind.getTrailColorModifier.call(this._handle)
    return _ret.asObject(::GradientTexture)!!
  }

  fun getTrailDivisor(): Int {
    val _ret = __method_bind.getTrailDivisor.call(this._handle)
    return _ret.asInt()
  }

  fun getTrailSizeModifier(): CurveTexture {
    val _ret = __method_bind.getTrailSizeModifier.call(this._handle)
    return _ret.asObject(::CurveTexture)!!
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setColorRamp(ramp: Texture) {
    val _arg = Variant.new(ramp)
    __method_bind.setColorRamp.call(this._handle, _arg, 1)
  }

  fun setEmissionBoxExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.setEmissionBoxExtents.call(this._handle, _arg, 1)
  }

  fun setEmissionColorTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setEmissionColorTexture.call(this._handle, _arg, 1)
  }

  fun setEmissionNormalTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setEmissionNormalTexture.call(this._handle, _arg, 1)
  }

  fun setEmissionPointCount(pointCount: Int) {
    val _arg = Variant.new(pointCount)
    __method_bind.setEmissionPointCount.call(this._handle, _arg, 1)
  }

  fun setEmissionPointTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setEmissionPointTexture.call(this._handle, _arg, 1)
  }

  fun setEmissionShape(shape: Int) {
    val _arg = Variant.new(shape)
    __method_bind.setEmissionShape.call(this._handle, _arg, 1)
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setEmissionSphereRadius.call(this._handle, _arg, 1)
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.setFlag.call(this._handle, _args.toVariant(), 2)
  }

  fun setFlatness(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFlatness.call(this._handle, _arg, 1)
  }

  fun setGravity(accelVec: Vector3) {
    val _arg = Variant.new(accelVec)
    __method_bind.setGravity.call(this._handle, _arg, 1)
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.setParam.call(this._handle, _args.toVariant(), 2)
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(randomness)
    __method_bind.setParamRandomness.call(this._handle, _args.toVariant(), 2)
  }

  fun setParamTexture(param: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(texture)
    __method_bind.setParamTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun setSpread(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSpread.call(this._handle, _arg, 1)
  }

  fun setTrailColorModifier(texture: GradientTexture) {
    val _arg = Variant.new(texture)
    __method_bind.setTrailColorModifier.call(this._handle, _arg, 1)
  }

  fun setTrailDivisor(divisor: Int) {
    val _arg = Variant.new(divisor)
    __method_bind.setTrailDivisor.call(this._handle, _arg, 1)
  }

  fun setTrailSizeModifier(texture: CurveTexture) {
    val _arg = Variant.new(texture)
    __method_bind.setTrailSizeModifier.call(this._handle, _arg, 1)
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
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
        }
      val getEmissionBoxExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_box_extents" }
        }
      val getEmissionColorTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_color_texture" }
        }
      val getEmissionNormalTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_normal_texture" }
        }
      val getEmissionPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_count" }
        }
      val getEmissionPointTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_texture" }
        }
      val getEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
        }
      val getEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val getFlatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flatness" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val getParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
        }
      val getParamTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_texture" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val getTrailColorModifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_color_modifier" }
        }
      val getTrailDivisor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_divisor" }
        }
      val getTrailSizeModifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_size_modifier" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
        }
      val setEmissionBoxExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_box_extents" }
        }
      val setEmissionColorTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_color_texture" }
        }
      val setEmissionNormalTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_normal_texture" }
        }
      val setEmissionPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_count" }
        }
      val setEmissionPointTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_texture" }
        }
      val setEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
        }
      val setEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val setFlatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flatness" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val setParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
        }
      val setParamTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_texture" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val setTrailColorModifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_color_modifier" }
        }
      val setTrailDivisor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_divisor" }
        }
      val setTrailSizeModifier: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_size_modifier" }
        }}
  }
}
