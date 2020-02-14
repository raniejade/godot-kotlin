// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class ParticlesMaterial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Material(null) {
  var angle: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
    }

  var angleCurve: Texture
    get() {
       return getParamTexture(7) 
    }
    set(value) {
      setParamTexture(7, value)
    }

  var angleRandom: Float
    get() {
       return getParamRandomness(7) 
    }
    set(value) {
      setParamRandomness(7, value)
    }

  var angularVelocity: Float
    get() {
       return getParam(1) 
    }
    set(value) {
      setParam(1, value)
    }

  var angularVelocityCurve: Texture
    get() {
       return getParamTexture(1) 
    }
    set(value) {
      setParamTexture(1, value)
    }

  var angularVelocityRandom: Float
    get() {
       return getParamRandomness(1) 
    }
    set(value) {
      setParamRandomness(1, value)
    }

  var animOffset: Float
    get() {
       return getParam(11) 
    }
    set(value) {
      setParam(11, value)
    }

  var animOffsetCurve: Texture
    get() {
       return getParamTexture(11) 
    }
    set(value) {
      setParamTexture(11, value)
    }

  var animOffsetRandom: Float
    get() {
       return getParamRandomness(11) 
    }
    set(value) {
      setParamRandomness(11, value)
    }

  var animSpeed: Float
    get() {
       return getParam(10) 
    }
    set(value) {
      setParam(10, value)
    }

  var animSpeedCurve: Texture
    get() {
       return getParamTexture(10) 
    }
    set(value) {
      setParamTexture(10, value)
    }

  var animSpeedRandom: Float
    get() {
       return getParamRandomness(10) 
    }
    set(value) {
      setParamRandomness(10, value)
    }

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

  var damping: Float
    get() {
       return getParam(6) 
    }
    set(value) {
      setParam(6, value)
    }

  var dampingCurve: Texture
    get() {
       return getParamTexture(6) 
    }
    set(value) {
      setParamTexture(6, value)
    }

  var dampingRandom: Float
    get() {
       return getParamRandomness(6) 
    }
    set(value) {
      setParamRandomness(6, value)
    }

  var direction: Vector3
    get() {
       return getDirection() 
    }
    set(value) {
      setDirection(value)
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

  var flagAlignY: Boolean
    get() {
       return getFlag(0) 
    }
    set(value) {
      setFlag(0, value)
    }

  var flagDisableZ: Boolean
    get() {
       return getFlag(2) 
    }
    set(value) {
      setFlag(2, value)
    }

  var flagRotateY: Boolean
    get() {
       return getFlag(1) 
    }
    set(value) {
      setFlag(1, value)
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

  var hueVariation: Float
    get() {
       return getParam(9) 
    }
    set(value) {
      setParam(9, value)
    }

  var hueVariationCurve: Texture
    get() {
       return getParamTexture(9) 
    }
    set(value) {
      setParamTexture(9, value)
    }

  var hueVariationRandom: Float
    get() {
       return getParamRandomness(9) 
    }
    set(value) {
      setParamRandomness(9, value)
    }

  var initialVelocity: Float
    get() {
       return getParam(0) 
    }
    set(value) {
      setParam(0, value)
    }

  var initialVelocityRandom: Float
    get() {
       return getParamRandomness(0) 
    }
    set(value) {
      setParamRandomness(0, value)
    }

  var lifetimeRandomness: Float
    get() {
       return getLifetimeRandomness() 
    }
    set(value) {
      setLifetimeRandomness(value)
    }

  var linearAccel: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var linearAccelCurve: Texture
    get() {
       return getParamTexture(3) 
    }
    set(value) {
      setParamTexture(3, value)
    }

  var linearAccelRandom: Float
    get() {
       return getParamRandomness(3) 
    }
    set(value) {
      setParamRandomness(3, value)
    }

  var orbitVelocity: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var orbitVelocityCurve: Texture
    get() {
       return getParamTexture(2) 
    }
    set(value) {
      setParamTexture(2, value)
    }

  var orbitVelocityRandom: Float
    get() {
       return getParamRandomness(2) 
    }
    set(value) {
      setParamRandomness(2, value)
    }

  var radialAccel: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var radialAccelCurve: Texture
    get() {
       return getParamTexture(4) 
    }
    set(value) {
      setParamTexture(4, value)
    }

  var radialAccelRandom: Float
    get() {
       return getParamRandomness(4) 
    }
    set(value) {
      setParamRandomness(4, value)
    }

  var scale: Float
    get() {
       return getParam(8) 
    }
    set(value) {
      setParam(8, value)
    }

  var scaleCurve: Texture
    get() {
       return getParamTexture(8) 
    }
    set(value) {
      setParamTexture(8, value)
    }

  var scaleRandom: Float
    get() {
       return getParamRandomness(8) 
    }
    set(value) {
      setParamRandomness(8, value)
    }

  var spread: Float
    get() {
       return getSpread() 
    }
    set(value) {
      setSpread(value)
    }

  var tangentialAccel: Float
    get() {
       return getParam(5) 
    }
    set(value) {
      setParam(5, value)
    }

  var tangentialAccelCurve: Texture
    get() {
       return getParamTexture(5) 
    }
    set(value) {
      setParamTexture(5, value)
    }

  var tangentialAccelRandom: Float
    get() {
       return getParamRandomness(5) 
    }
    set(value) {
      setParamRandomness(5, value)
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  /**
   * Specialized setter for direction
   */
  fun direction(cb: Vector3.() -> Unit) {
    val _p = direction
    cb(_p)
    direction = _p
  }

  /**
   * Specialized setter for emissionBoxExtents
   */
  fun emissionBoxExtents(cb: Vector3.() -> Unit) {
    val _p = emissionBoxExtents
    cb(_p)
    emissionBoxExtents = _p
  }

  /**
   * Specialized setter for gravity
   */
  fun gravity(cb: Vector3.() -> Unit) {
    val _p = gravity
    cb(_p)
    gravity = _p
  }

  fun getColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColorRamp(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getColorRamp.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getDirection(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getDirection.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionBoxExtents(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmissionBoxExtents.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionColorTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEmissionColorTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getEmissionNormalTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEmissionNormalTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getEmissionPointCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionPointCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEmissionPointTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEmissionPointTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getEmissionShape(): EmissionShape {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionShape.call(self._handle, emptyList(), _retPtr)
      ParticlesMaterial.EmissionShape.from(_ret.value)
    }
  }

  fun getEmissionSphereRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionSphereRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFlag(flag: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlag.call(self._handle, listOf(flag), _retPtr)
      _ret.value
    }
  }

  fun getFlatness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlatness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGravity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getGravity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLifetimeRandomness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLifetimeRandomness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParam(param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParam.call(self._handle, listOf(param), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParamRandomness(param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParamRandomness.call(self._handle, listOf(param), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParamTexture(param: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParamTexture.call(self._handle, listOf(param), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getSpread(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpread.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTrailColorModifier(): GradientTexture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: GradientTexture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTrailColorModifier.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<GradientTexture>(_tmp.value!!)
      _ret
    }
  }

  fun getTrailDivisor(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTrailDivisor.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTrailSizeModifier(): CurveTexture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: CurveTexture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTrailSizeModifier.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<CurveTexture>(_tmp.value!!)
      _ret
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setColorRamp(ramp: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColorRamp.call(self._handle, listOf(ramp), null)
    }
  }

  fun setDirection(degrees: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDirection.call(self._handle, listOf(degrees), null)
    }
  }

  fun setEmissionBoxExtents(extents: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionBoxExtents.call(self._handle, listOf(extents), null)
    }
  }

  fun setEmissionColorTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionColorTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setEmissionNormalTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionNormalTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setEmissionPointCount(pointCount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionPointCount.call(self._handle, listOf(pointCount), null)
    }
  }

  fun setEmissionPointTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionPointTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setEmissionShape(shape: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionShape.call(self._handle, listOf(shape), null)
    }
  }

  fun setEmissionSphereRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionSphereRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(flag)
      _args.add(enable)
      __method_bind.setFlag.call(self._handle, _args, null)
    }
  }

  fun setFlatness(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlatness.call(self._handle, listOf(amount), null)
    }
  }

  fun setGravity(accelVec: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravity.call(self._handle, listOf(accelVec), null)
    }
  }

  fun setLifetimeRandomness(randomness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLifetimeRandomness.call(self._handle, listOf(randomness), null)
    }
  }

  fun setParam(param: Int, value: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(value)
      __method_bind.setParam.call(self._handle, _args, null)
    }
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(randomness)
      __method_bind.setParamRandomness.call(self._handle, _args, null)
    }
  }

  fun setParamTexture(param: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(texture)
      __method_bind.setParamTexture.call(self._handle, _args, null)
    }
  }

  fun setSpread(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpread.call(self._handle, listOf(degrees), null)
    }
  }

  fun setTrailColorModifier(texture: GradientTexture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTrailColorModifier.call(self._handle, listOf(texture), null)
    }
  }

  fun setTrailDivisor(divisor: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTrailDivisor.call(self._handle, listOf(divisor), null)
    }
  }

  fun setTrailSizeModifier(texture: CurveTexture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTrailSizeModifier.call(self._handle, listOf(texture), null)
    }
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
    POINT(0),

    SPHERE(1),

    BOX(2),

    POINTS(3),

    DIRECTED_POINTS(4),

    MAX(5);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParticlesMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ParticlesMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ParticlesMaterial
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorRamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
        }
      val getDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direction" }
        }
      val getEmissionBoxExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_box_extents" }
        }
      val getEmissionColorTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_color_texture" }
        }
      val getEmissionNormalTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_normal_texture" }
        }
      val getEmissionPointCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_count" }
        }
      val getEmissionPointTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_point_texture" }
        }
      val getEmissionShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
        }
      val getEmissionSphereRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val getFlatness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flatness" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getLifetimeRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime_randomness" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val getParamRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
        }
      val getParamTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_texture" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val getTrailColorModifier: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_color_modifier" }
        }
      val getTrailDivisor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_divisor" }
        }
      val getTrailSizeModifier: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "get_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trail_size_modifier" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setColorRamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
        }
      val setDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_direction" }
        }
      val setEmissionBoxExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_box_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_box_extents" }
        }
      val setEmissionColorTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_color_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_color_texture" }
        }
      val setEmissionNormalTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_normal_texture" }
        }
      val setEmissionPointCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_count" }
        }
      val setEmissionPointTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_point_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_point_texture" }
        }
      val setEmissionShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
        }
      val setEmissionSphereRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val setFlatness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_flatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flatness" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setLifetimeRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime_randomness" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val setParamRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
        }
      val setParamTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_param_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_texture" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val setTrailColorModifier: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_color_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_color_modifier" }
        }
      val setTrailDivisor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_divisor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_divisor" }
        }
      val setTrailSizeModifier: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParticlesMaterial".cstr.ptr,
            "set_trail_size_modifier".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trail_size_modifier" }
        }}
  }
}
