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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CPUParticles2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var amount: Int
    get() {
       return getAmount() 
    }
    set(value) {
      setAmount(value)
    }

  var angle: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
    }

  var angleCurve: Curve
    get() {
       return getParamCurve(7) 
    }
    set(value) {
      setParamCurve(7, value)
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

  var angularVelocityCurve: Curve
    get() {
       return getParamCurve(1) 
    }
    set(value) {
      setParamCurve(1, value)
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

  var animOffsetCurve: Curve
    get() {
       return getParamCurve(11) 
    }
    set(value) {
      setParamCurve(11, value)
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

  var animSpeedCurve: Curve
    get() {
       return getParamCurve(10) 
    }
    set(value) {
      setParamCurve(10, value)
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

  var colorRamp: Gradient
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

  var dampingCurve: Curve
    get() {
       return getParamCurve(6) 
    }
    set(value) {
      setParamCurve(6, value)
    }

  var dampingRandom: Float
    get() {
       return getParamRandomness(6) 
    }
    set(value) {
      setParamRandomness(6, value)
    }

  var direction: Vector2
    get() {
       return getDirection() 
    }
    set(value) {
      setDirection(value)
    }

  var drawOrder: DrawOrder
    get() {
       return getDrawOrder() 
    }
    set(value) {
      setDrawOrder(value.value)
    }

  var emissionColors: PoolColorArray
    get() {
       return getEmissionColors() 
    }
    set(value) {
      setEmissionColors(value)
    }

  var emissionNormals: PoolVector2Array
    get() {
       return getEmissionNormals() 
    }
    set(value) {
      setEmissionNormals(value)
    }

  var emissionPoints: PoolVector2Array
    get() {
       return getEmissionPoints() 
    }
    set(value) {
      setEmissionPoints(value)
    }

  var emissionRectExtents: Vector2
    get() {
       return getEmissionRectExtents() 
    }
    set(value) {
      setEmissionRectExtents(value)
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

  var emitting: Boolean
    get() {
       return isEmitting() 
    }
    set(value) {
      setEmitting(value)
    }

  var explosiveness: Float
    get() {
       return getExplosivenessRatio() 
    }
    set(value) {
      setExplosivenessRatio(value)
    }

  var fixedFps: Int
    get() {
       return getFixedFps() 
    }
    set(value) {
      setFixedFps(value)
    }

  var flagAlignY: Boolean
    get() {
       return getParticleFlag(0) 
    }
    set(value) {
      setParticleFlag(0, value)
    }

  var fractDelta: Boolean
    get() {
       return getFractionalDelta() 
    }
    set(value) {
      setFractionalDelta(value)
    }

  var gravity: Vector2
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

  var hueVariationCurve: Curve
    get() {
       return getParamCurve(9) 
    }
    set(value) {
      setParamCurve(9, value)
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

  var lifetime: Float
    get() {
       return getLifetime() 
    }
    set(value) {
      setLifetime(value)
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

  var linearAccelCurve: Curve
    get() {
       return getParamCurve(3) 
    }
    set(value) {
      setParamCurve(3, value)
    }

  var linearAccelRandom: Float
    get() {
       return getParamRandomness(3) 
    }
    set(value) {
      setParamRandomness(3, value)
    }

  var localCoords: Boolean
    get() {
       return getUseLocalCoordinates() 
    }
    set(value) {
      setUseLocalCoordinates(value)
    }

  var normalmap: Texture
    get() {
       return getNormalmap() 
    }
    set(value) {
      setNormalmap(value)
    }

  var oneShot: Boolean
    get() {
       return getOneShot() 
    }
    set(value) {
      setOneShot(value)
    }

  var orbitVelocity: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var orbitVelocityCurve: Curve
    get() {
       return getParamCurve(2) 
    }
    set(value) {
      setParamCurve(2, value)
    }

  var orbitVelocityRandom: Float
    get() {
       return getParamRandomness(2) 
    }
    set(value) {
      setParamRandomness(2, value)
    }

  var preprocess: Float
    get() {
       return getPreProcessTime() 
    }
    set(value) {
      setPreProcessTime(value)
    }

  var radialAccel: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var radialAccelCurve: Curve
    get() {
       return getParamCurve(4) 
    }
    set(value) {
      setParamCurve(4, value)
    }

  var radialAccelRandom: Float
    get() {
       return getParamRandomness(4) 
    }
    set(value) {
      setParamRandomness(4, value)
    }

  var randomness: Float
    get() {
       return getRandomnessRatio() 
    }
    set(value) {
      setRandomnessRatio(value)
    }

  var scaleAmount: Float
    get() {
       return getParam(8) 
    }
    set(value) {
      setParam(8, value)
    }

  var scaleAmountCurve: Curve
    get() {
       return getParamCurve(8) 
    }
    set(value) {
      setParamCurve(8, value)
    }

  var scaleAmountRandom: Float
    get() {
       return getParamRandomness(8) 
    }
    set(value) {
      setParamRandomness(8, value)
    }

  var speedScale: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
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

  var tangentialAccelCurve: Curve
    get() {
       return getParamCurve(5) 
    }
    set(value) {
      setParamCurve(5, value)
    }

  var tangentialAccelRandom: Float
    get() {
       return getParamRandomness(5) 
    }
    set(value) {
      setParamRandomness(5, value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  constructor() : this(null) {
    _handle = __new()
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
  fun direction(cb: Vector2.() -> Unit) {
    val _p = direction
    cb(_p)
    direction = _p
  }

  /**
   * Specialized setter for emissionColors
   */
  fun emissionColors(cb: PoolColorArray.() -> Unit) {
    val _p = emissionColors
    cb(_p)
    emissionColors = _p
  }

  /**
   * Specialized setter for emissionNormals
   */
  fun emissionNormals(cb: PoolVector2Array.() -> Unit) {
    val _p = emissionNormals
    cb(_p)
    emissionNormals = _p
  }

  /**
   * Specialized setter for emissionPoints
   */
  fun emissionPoints(cb: PoolVector2Array.() -> Unit) {
    val _p = emissionPoints
    cb(_p)
    emissionPoints = _p
  }

  /**
   * Specialized setter for emissionRectExtents
   */
  fun emissionRectExtents(cb: Vector2.() -> Unit) {
    val _p = emissionRectExtents
    cb(_p)
    emissionRectExtents = _p
  }

  /**
   * Specialized setter for gravity
   */
  fun gravity(cb: Vector2.() -> Unit) {
    val _p = gravity
    cb(_p)
    gravity = _p
  }

  fun convertFromParticles(particles: Node) {
    val _arg = Variant.new(particles)
    __method_bind.convertFromParticles.call(this._handle, listOf(_arg))
  }

  fun getAmount(): Int {
    val _ret = __method_bind.getAmount.call(this._handle)
    return _ret.asInt()
  }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getColorRamp(): Gradient {
    val _ret = __method_bind.getColorRamp.call(this._handle)
    return _ret.asObject(::Gradient)!!
  }

  fun getDirection(): Vector2 {
    val _ret = __method_bind.getDirection.call(this._handle)
    return _ret.asVector2()
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.getDrawOrder.call(this._handle)
    return CPUParticles2D.DrawOrder.from(_ret.asInt())
  }

  fun getEmissionColors(): PoolColorArray {
    val _ret = __method_bind.getEmissionColors.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun getEmissionNormals(): PoolVector2Array {
    val _ret = __method_bind.getEmissionNormals.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getEmissionPoints(): PoolVector2Array {
    val _ret = __method_bind.getEmissionPoints.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getEmissionRectExtents(): Vector2 {
    val _ret = __method_bind.getEmissionRectExtents.call(this._handle)
    return _ret.asVector2()
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.getEmissionShape.call(this._handle)
    return CPUParticles2D.EmissionShape.from(_ret.asInt())
  }

  fun getEmissionSphereRadius(): Float {
    val _ret = __method_bind.getEmissionSphereRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getExplosivenessRatio(): Float {
    val _ret = __method_bind.getExplosivenessRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getFixedFps(): Int {
    val _ret = __method_bind.getFixedFps.call(this._handle)
    return _ret.asInt()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.getFractionalDelta.call(this._handle)
    return _ret.asBoolean()
  }

  fun getGravity(): Vector2 {
    val _ret = __method_bind.getGravity.call(this._handle)
    return _ret.asVector2()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.getLifetime.call(this._handle)
    return _ret.asFloat()
  }

  fun getLifetimeRandomness(): Float {
    val _ret = __method_bind.getLifetimeRandomness.call(this._handle)
    return _ret.asFloat()
  }

  fun getNormalmap(): Texture {
    val _ret = __method_bind.getNormalmap.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.getOneShot.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getParamCurve(param: Int): Curve {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamCurve.call(this._handle, listOf(_arg))
    return _ret.asObject(::Curve)!!
  }

  fun getParamRandomness(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamRandomness.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getParticleFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getParticleFlag.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getPreProcessTime(): Float {
    val _ret = __method_bind.getPreProcessTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getRandomnessRatio(): Float {
    val _ret = __method_bind.getRandomnessRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.getSpeedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpread(): Float {
    val _ret = __method_bind.getSpread.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.getUseLocalCoordinates.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEmitting(): Boolean {
    val _ret = __method_bind.isEmitting.call(this._handle)
    return _ret.asBoolean()
  }

  fun restart() {
    __method_bind.restart.call(this._handle)
  }

  fun setAmount(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setAmount.call(this._handle, listOf(_arg))
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setColorRamp(ramp: Gradient) {
    val _arg = Variant.new(ramp)
    __method_bind.setColorRamp.call(this._handle, listOf(_arg))
  }

  fun setDirection(direction: Vector2) {
    val _arg = Variant.new(direction)
    __method_bind.setDirection.call(this._handle, listOf(_arg))
  }

  fun setDrawOrder(order: Int) {
    val _arg = Variant.new(order)
    __method_bind.setDrawOrder.call(this._handle, listOf(_arg))
  }

  fun setEmissionColors(array: PoolColorArray) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionColors.call(this._handle, listOf(_arg))
  }

  fun setEmissionNormals(array: PoolVector2Array) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionNormals.call(this._handle, listOf(_arg))
  }

  fun setEmissionPoints(array: PoolVector2Array) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionPoints.call(this._handle, listOf(_arg))
  }

  fun setEmissionRectExtents(extents: Vector2) {
    val _arg = Variant.new(extents)
    __method_bind.setEmissionRectExtents.call(this._handle, listOf(_arg))
  }

  fun setEmissionShape(shape: Int) {
    val _arg = Variant.new(shape)
    __method_bind.setEmissionShape.call(this._handle, listOf(_arg))
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setEmissionSphereRadius.call(this._handle, listOf(_arg))
  }

  fun setEmitting(emitting: Boolean) {
    val _arg = Variant.new(emitting)
    __method_bind.setEmitting.call(this._handle, listOf(_arg))
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setExplosivenessRatio.call(this._handle, listOf(_arg))
  }

  fun setFixedFps(fps: Int) {
    val _arg = Variant.new(fps)
    __method_bind.setFixedFps.call(this._handle, listOf(_arg))
  }

  fun setFractionalDelta(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFractionalDelta.call(this._handle, listOf(_arg))
  }

  fun setGravity(accelVec: Vector2) {
    val _arg = Variant.new(accelVec)
    __method_bind.setGravity.call(this._handle, listOf(_arg))
  }

  fun setLifetime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setLifetime.call(this._handle, listOf(_arg))
  }

  fun setLifetimeRandomness(random: Float) {
    val _arg = Variant.new(random)
    __method_bind.setLifetimeRandomness.call(this._handle, listOf(_arg))
  }

  fun setNormalmap(normalmap: Texture) {
    val _arg = Variant.new(normalmap)
    __method_bind.setNormalmap.call(this._handle, listOf(_arg))
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setOneShot.call(this._handle, listOf(_arg))
  }

  fun setParam(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParam.call(this._handle, _args)
  }

  fun setParamCurve(param: Int, curve: Curve) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(curve))
    __method_bind.setParamCurve.call(this._handle, _args)
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(randomness))
    __method_bind.setParamRandomness.call(this._handle, _args)
  }

  fun setParticleFlag(flag: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enable))
    __method_bind.setParticleFlag.call(this._handle, _args)
  }

  fun setPreProcessTime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setPreProcessTime.call(this._handle, listOf(_arg))
  }

  fun setRandomnessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setRandomnessRatio.call(this._handle, listOf(_arg))
  }

  fun setSpeedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setSpeedScale.call(this._handle, listOf(_arg))
  }

  fun setSpread(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSpread.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseLocalCoordinates.call(this._handle, listOf(_arg))
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

    RECTANGLE(2),

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

  enum class DrawOrder(
    val value: Int
  ) {
    INDEX(0),

    LIFETIME(1);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CPUParticles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CPUParticles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CPUParticles2D
     */
    private object __method_bind {
      val convertFromParticles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "convert_from_particles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convert_from_particles" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_amount" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
        }
      val getDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direction" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
        }
      val getEmissionColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_colors" }
        }
      val getEmissionNormals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_normals" }
        }
      val getEmissionPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_points" }
        }
      val getEmissionRectExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_rect_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_rect_extents" }
        }
      val getEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
        }
      val getEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
        }
      val getLifetimeRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime_randomness" }
        }
      val getNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normalmap" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val getParamCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_curve" }
        }
      val getParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
        }
      val getParticleFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_particle_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particle_flag" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "is_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_amount" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
        }
      val setDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_direction" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
        }
      val setEmissionColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_colors" }
        }
      val setEmissionNormals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_normals" }
        }
      val setEmissionPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_points" }
        }
      val setEmissionRectExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_rect_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_rect_extents" }
        }
      val setEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
        }
      val setEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
        }
      val setLifetimeRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime_randomness" }
        }
      val setNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normalmap" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val setParamCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_curve" }
        }
      val setParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
        }
      val setParticleFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_particle_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particle_flag" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
        }}
  }
}
