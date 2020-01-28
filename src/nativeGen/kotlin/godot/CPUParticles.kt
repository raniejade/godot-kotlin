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

open class CPUParticles(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var amount: Int
    get() {
       return getAmount() 
    }
    set(value) {
      setAmount(value)
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

  var drawOrder: Int
    get() {
       return CPUParticles.DrawOrder.from(getDrawOrder()) 
    }
    set(value) {
      setDrawOrder(CPUParticles.DrawOrder.from(value))
    }

  var emissionBoxExtents: Vector3
    get() {
       return getEmissionBoxExtents() 
    }
    set(value) {
      setEmissionBoxExtents(value)
    }

  var emissionColors: PoolColorArray
    get() {
       return getEmissionColors() 
    }
    set(value) {
      setEmissionColors(value)
    }

  var emissionNormals: PoolVector3Array
    get() {
       return getEmissionNormals() 
    }
    set(value) {
      setEmissionNormals(value)
    }

  var emissionPoints: PoolVector3Array
    get() {
       return getEmissionPoints() 
    }
    set(value) {
      setEmissionPoints(value)
    }

  var emissionShape: Int
    get() {
       return CPUParticles.EmissionShape.from(getEmissionShape()) 
    }
    set(value) {
      setEmissionShape(CPUParticles.EmissionShape.from(value))
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

  var flatness: Float
    get() {
       return getFlatness() 
    }
    set(value) {
      setFlatness(value)
    }

  var fractDelta: Boolean
    get() {
       return getFractionalDelta() 
    }
    set(value) {
      setFractionalDelta(value)
    }

  var gravity: Vector3
    get() {
       return getGravity() 
    }
    set(value) {
      setGravity(value)
    }

  var lifetime: Float
    get() {
       return getLifetime() 
    }
    set(value) {
      setLifetime(value)
    }

  var localCoords: Boolean
    get() {
       return getUseLocalCoordinates() 
    }
    set(value) {
      setUseLocalCoordinates(value)
    }

  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  var oneShot: Boolean
    get() {
       return getOneShot() 
    }
    set(value) {
      setOneShot(value)
    }

  var preprocess: Float
    get() {
       return getPreProcessTime() 
    }
    set(value) {
      setPreProcessTime(value)
    }

  var randomness: Float
    get() {
       return getRandomnessRatio() 
    }
    set(value) {
      setRandomnessRatio(value)
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

  fun convertFromParticles(particles: Node) {
    val _arg = Variant.new(particles)
    __method_bind.convertFromParticles.call(this._handle, _arg, 1)
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

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.getDrawOrder.call(this._handle)
    return CPUParticles.DrawOrder.from(_ret.asInt())
  }

  fun getEmissionBoxExtents(): Vector3 {
    val _ret = __method_bind.getEmissionBoxExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun getEmissionColors(): PoolColorArray {
    val _ret = __method_bind.getEmissionColors.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun getEmissionNormals(): PoolVector3Array {
    val _ret = __method_bind.getEmissionNormals.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getEmissionPoints(): PoolVector3Array {
    val _ret = __method_bind.getEmissionPoints.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getEmissionShape(): EmissionShape {
    val _ret = __method_bind.getEmissionShape.call(this._handle)
    return CPUParticles.EmissionShape.from(_ret.asInt())
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

  fun getFlatness(): Float {
    val _ret = __method_bind.getFlatness.call(this._handle)
    return _ret.asFloat()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.getFractionalDelta.call(this._handle)
    return _ret.asBoolean()
  }

  fun getGravity(): Vector3 {
    val _ret = __method_bind.getGravity.call(this._handle)
    return _ret.asVector3()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.getLifetime.call(this._handle)
    return _ret.asFloat()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.getOneShot.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getParamCurve(param: Int): Curve {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamCurve.call(this._handle, _arg, 1)
    return _ret.asObject(::Curve)!!
  }

  fun getParamRandomness(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParamRandomness.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getParticleFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getParticleFlag.call(this._handle, _arg, 1)
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
    __method_bind.setAmount.call(this._handle, _arg, 1)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setColorRamp(ramp: Gradient) {
    val _arg = Variant.new(ramp)
    __method_bind.setColorRamp.call(this._handle, _arg, 1)
  }

  fun setDrawOrder(order: Int) {
    val _arg = Variant.new(order)
    __method_bind.setDrawOrder.call(this._handle, _arg, 1)
  }

  fun setEmissionBoxExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.setEmissionBoxExtents.call(this._handle, _arg, 1)
  }

  fun setEmissionColors(array: PoolColorArray) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionColors.call(this._handle, _arg, 1)
  }

  fun setEmissionNormals(array: PoolVector3Array) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionNormals.call(this._handle, _arg, 1)
  }

  fun setEmissionPoints(array: PoolVector3Array) {
    val _arg = Variant.new(array)
    __method_bind.setEmissionPoints.call(this._handle, _arg, 1)
  }

  fun setEmissionShape(shape: Int) {
    val _arg = Variant.new(shape)
    __method_bind.setEmissionShape.call(this._handle, _arg, 1)
  }

  fun setEmissionSphereRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setEmissionSphereRadius.call(this._handle, _arg, 1)
  }

  fun setEmitting(emitting: Boolean) {
    val _arg = Variant.new(emitting)
    __method_bind.setEmitting.call(this._handle, _arg, 1)
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setExplosivenessRatio.call(this._handle, _arg, 1)
  }

  fun setFixedFps(fps: Int) {
    val _arg = Variant.new(fps)
    __method_bind.setFixedFps.call(this._handle, _arg, 1)
  }

  fun setFlatness(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFlatness.call(this._handle, _arg, 1)
  }

  fun setFractionalDelta(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFractionalDelta.call(this._handle, _arg, 1)
  }

  fun setGravity(accelVec: Vector3) {
    val _arg = Variant.new(accelVec)
    __method_bind.setGravity.call(this._handle, _arg, 1)
  }

  fun setLifetime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setLifetime.call(this._handle, _arg, 1)
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.setMesh.call(this._handle, _arg, 1)
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setOneShot.call(this._handle, _arg, 1)
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.setParam.call(this._handle, _args.toVariant(), 2)
  }

  fun setParamCurve(param: Int, curve: Curve) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(curve)
    __method_bind.setParamCurve.call(this._handle, _args.toVariant(), 2)
  }

  fun setParamRandomness(param: Int, randomness: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(randomness)
    __method_bind.setParamRandomness.call(this._handle, _args.toVariant(), 2)
  }

  fun setParticleFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.setParticleFlag.call(this._handle, _args.toVariant(), 2)
  }

  fun setPreProcessTime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setPreProcessTime.call(this._handle, _arg, 1)
  }

  fun setRandomnessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setRandomnessRatio.call(this._handle, _arg, 1)
  }

  fun setSpeedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setSpeedScale.call(this._handle, _arg, 1)
  }

  fun setSpread(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSpread.call(this._handle, _arg, 1)
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseLocalCoordinates.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for CPUParticles" }
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
      val convertFromParticles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "convertFromParticles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convertFromParticles" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmount" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getColorRamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColorRamp" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawOrder" }
        }
      val getEmissionBoxExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionBoxExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionBoxExtents" }
        }
      val getEmissionColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionColors" }
        }
      val getEmissionNormals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionNormals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionNormals" }
        }
      val getEmissionPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionPoints" }
        }
      val getEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionShape" }
        }
      val getEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getEmissionSphereRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionSphereRadius" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExplosivenessRatio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFixedFps" }
        }
      val getFlatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getFlatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFlatness" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFractionalDelta" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getGravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravity" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLifetime" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOneShot" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParam" }
        }
      val getParamCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getParamCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParamCurve" }
        }
      val getParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getParamRandomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParamRandomness" }
        }
      val getParticleFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getParticleFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParticleFlag" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPreProcessTime" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRandomnessRatio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeedScale" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getSpread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpread" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "getUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUseLocalCoordinates" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "isEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEmitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmount" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setColorRamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setColorRamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColorRamp" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawOrder" }
        }
      val setEmissionBoxExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionBoxExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionBoxExtents" }
        }
      val setEmissionColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionColors" }
        }
      val setEmissionNormals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionNormals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionNormals" }
        }
      val setEmissionPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionPoints" }
        }
      val setEmissionShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionShape" }
        }
      val setEmissionSphereRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmissionSphereRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionSphereRadius" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExplosivenessRatio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFixedFps" }
        }
      val setFlatness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setFlatness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlatness" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFractionalDelta" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setGravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravity" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLifetime" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMesh" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOneShot" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParam" }
        }
      val setParamCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setParamCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParamCurve" }
        }
      val setParamRandomness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setParamRandomness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParamRandomness" }
        }
      val setParticleFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setParticleFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParticleFlag" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPreProcessTime" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRandomnessRatio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeedScale" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setSpread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpread" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CPUParticles".cstr.ptr,
            "setUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseLocalCoordinates" }
        }}
  }
}
