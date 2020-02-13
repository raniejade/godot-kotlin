// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

  open fun _update_render_thread() {
    TODO()
  }

  fun convertFromParticles(particles: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.convertFromParticles.call(self._handle, listOf(particles), null)
    }
  }

  fun getAmount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
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

  fun getColorRamp(): Gradient {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Gradient
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getColorRamp.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Gradient>(_tmp.value!!)
      _ret
    }
  }

  fun getDirection(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getDirection.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDrawOrder(): DrawOrder {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrawOrder.call(self._handle, emptyList(), _retPtr)
      CPUParticles2D.DrawOrder.from(_ret.value)
    }
  }

  fun getEmissionColors(): PoolColorArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolColorArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmissionColors.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionNormals(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmissionNormals.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionPoints(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmissionPoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionRectExtents(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmissionRectExtents.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionShape(): EmissionShape {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionShape.call(self._handle, emptyList(), _retPtr)
      CPUParticles2D.EmissionShape.from(_ret.value)
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

  fun getExplosivenessRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExplosivenessRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFixedFps(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFixedFps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFractionalDelta(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFractionalDelta.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getGravity(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGravity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLifetime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLifetime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getNormalmap(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNormalmap.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getOneShot(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOneShot.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getParamCurve(param: Int): Curve {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Curve
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParamCurve.call(self._handle, listOf(param), _retPtr)
      _ret = objectToType<Curve>(_tmp.value!!)
      _ret
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

  fun getParticleFlag(flag: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticleFlag.call(self._handle, listOf(flag), _retPtr)
      _ret.value
    }
  }

  fun getPreProcessTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPreProcessTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRandomnessRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRandomnessRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpeedScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeedScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getUseLocalCoordinates(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseLocalCoordinates.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEmitting(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEmitting.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun restart() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.restart.call(self._handle, emptyList(), null)
    }
  }

  fun setAmount(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAmount.call(self._handle, listOf(amount), null)
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setColorRamp(ramp: Gradient) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColorRamp.call(self._handle, listOf(ramp), null)
    }
  }

  fun setDirection(direction: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDirection.call(self._handle, listOf(direction), null)
    }
  }

  fun setDrawOrder(order: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawOrder.call(self._handle, listOf(order), null)
    }
  }

  fun setEmissionColors(array: PoolColorArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionColors.call(self._handle, listOf(array), null)
    }
  }

  fun setEmissionNormals(array: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionNormals.call(self._handle, listOf(array), null)
    }
  }

  fun setEmissionPoints(array: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionPoints.call(self._handle, listOf(array), null)
    }
  }

  fun setEmissionRectExtents(extents: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionRectExtents.call(self._handle, listOf(extents), null)
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

  fun setEmitting(emitting: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmitting.call(self._handle, listOf(emitting), null)
    }
  }

  fun setExplosivenessRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExplosivenessRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setFixedFps(fps: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFixedFps.call(self._handle, listOf(fps), null)
    }
  }

  fun setFractionalDelta(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFractionalDelta.call(self._handle, listOf(enable), null)
    }
  }

  fun setGravity(accelVec: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravity.call(self._handle, listOf(accelVec), null)
    }
  }

  fun setLifetime(secs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLifetime.call(self._handle, listOf(secs), null)
    }
  }

  fun setLifetimeRandomness(random: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLifetimeRandomness.call(self._handle, listOf(random), null)
    }
  }

  fun setNormalmap(normalmap: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalmap.call(self._handle, listOf(normalmap), null)
    }
  }

  fun setOneShot(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneShot.call(self._handle, listOf(enable), null)
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

  fun setParamCurve(param: Int, curve: Curve) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(curve)
      __method_bind.setParamCurve.call(self._handle, _args, null)
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

  fun setParticleFlag(flag: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(flag)
      _args.add(enable)
      __method_bind.setParticleFlag.call(self._handle, _args, null)
    }
  }

  fun setPreProcessTime(secs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPreProcessTime.call(self._handle, listOf(secs), null)
    }
  }

  fun setRandomnessRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRandomnessRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setSpeedScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeedScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setSpread(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpread.call(self._handle, listOf(degrees), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseLocalCoordinates.call(self._handle, listOf(enable), null)
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "convert_from_particles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convert_from_particles" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_amount" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorRamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_ramp" }
        }
      val getDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direction" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
        }
      val getEmissionColors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_colors" }
        }
      val getEmissionNormals: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_normals" }
        }
      val getEmissionPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_points" }
        }
      val getEmissionRectExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_rect_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_rect_extents" }
        }
      val getEmissionShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_shape" }
        }
      val getEmissionSphereRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_sphere_radius" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
        }
      val getLifetimeRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime_randomness" }
        }
      val getNormalmap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normalmap" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val getParamCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_curve" }
        }
      val getParamRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_randomness" }
        }
      val getParticleFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_particle_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particle_flag" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "get_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "is_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_amount" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setColorRamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_color_ramp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_ramp" }
        }
      val setDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_direction" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
        }
      val setEmissionColors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_colors" }
        }
      val setEmissionNormals: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_normals" }
        }
      val setEmissionPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_points" }
        }
      val setEmissionRectExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_rect_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_rect_extents" }
        }
      val setEmissionShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_shape" }
        }
      val setEmissionSphereRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emission_sphere_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_sphere_radius" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
        }
      val setLifetimeRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_lifetime_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime_randomness" }
        }
      val setNormalmap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normalmap" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val setParamCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_curve" }
        }
      val setParamRandomness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_param_randomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_randomness" }
        }
      val setParticleFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_particle_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particle_flag" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles2D".cstr.ptr,
            "set_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
        }}
  }
}
