// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Generic6DOFJoint(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint(null) {
  var angularLimitXDamping: Float
    get() {
       return getParamX(13) 
    }
    set(value) {
      setParamX(13, value)
    }

  var angularLimitXEnabled: Boolean
    get() {
       return getFlagX(1) 
    }
    set(value) {
      setFlagX(1, value)
    }

  var angularLimitXErp: Float
    get() {
       return getParamX(16) 
    }
    set(value) {
      setParamX(16, value)
    }

  var angularLimitXForceLimit: Float
    get() {
       return getParamX(15) 
    }
    set(value) {
      setParamX(15, value)
    }

  var angularLimitXRestitution: Float
    get() {
       return getParamX(14) 
    }
    set(value) {
      setParamX(14, value)
    }

  var angularLimitXSoftness: Float
    get() {
       return getParamX(12) 
    }
    set(value) {
      setParamX(12, value)
    }

  var angularLimitYDamping: Float
    get() {
       return getParamY(13) 
    }
    set(value) {
      setParamY(13, value)
    }

  var angularLimitYEnabled: Boolean
    get() {
       return getFlagY(1) 
    }
    set(value) {
      setFlagY(1, value)
    }

  var angularLimitYErp: Float
    get() {
       return getParamY(16) 
    }
    set(value) {
      setParamY(16, value)
    }

  var angularLimitYForceLimit: Float
    get() {
       return getParamY(15) 
    }
    set(value) {
      setParamY(15, value)
    }

  var angularLimitYRestitution: Float
    get() {
       return getParamY(14) 
    }
    set(value) {
      setParamY(14, value)
    }

  var angularLimitYSoftness: Float
    get() {
       return getParamY(12) 
    }
    set(value) {
      setParamY(12, value)
    }

  var angularLimitZDamping: Float
    get() {
       return getParamZ(13) 
    }
    set(value) {
      setParamZ(13, value)
    }

  var angularLimitZEnabled: Boolean
    get() {
       return getFlagZ(1) 
    }
    set(value) {
      setFlagZ(1, value)
    }

  var angularLimitZErp: Float
    get() {
       return getParamZ(16) 
    }
    set(value) {
      setParamZ(16, value)
    }

  var angularLimitZForceLimit: Float
    get() {
       return getParamZ(15) 
    }
    set(value) {
      setParamZ(15, value)
    }

  var angularLimitZRestitution: Float
    get() {
       return getParamZ(14) 
    }
    set(value) {
      setParamZ(14, value)
    }

  var angularLimitZSoftness: Float
    get() {
       return getParamZ(12) 
    }
    set(value) {
      setParamZ(12, value)
    }

  var angularMotorXEnabled: Boolean
    get() {
       return getFlagX(4) 
    }
    set(value) {
      setFlagX(4, value)
    }

  var angularMotorXForceLimit: Float
    get() {
       return getParamX(18) 
    }
    set(value) {
      setParamX(18, value)
    }

  var angularMotorXTargetVelocity: Float
    get() {
       return getParamX(17) 
    }
    set(value) {
      setParamX(17, value)
    }

  var angularMotorYEnabled: Boolean
    get() {
       return getFlagY(4) 
    }
    set(value) {
      setFlagY(4, value)
    }

  var angularMotorYForceLimit: Float
    get() {
       return getParamY(18) 
    }
    set(value) {
      setParamY(18, value)
    }

  var angularMotorYTargetVelocity: Float
    get() {
       return getParamY(17) 
    }
    set(value) {
      setParamY(17, value)
    }

  var angularMotorZEnabled: Boolean
    get() {
       return getFlagZ(4) 
    }
    set(value) {
      setFlagZ(4, value)
    }

  var angularMotorZForceLimit: Float
    get() {
       return getParamZ(18) 
    }
    set(value) {
      setParamZ(18, value)
    }

  var angularMotorZTargetVelocity: Float
    get() {
       return getParamZ(17) 
    }
    set(value) {
      setParamZ(17, value)
    }

  var angularSpringXDamping: Float
    get() {
       return getParamX(20) 
    }
    set(value) {
      setParamX(20, value)
    }

  var angularSpringXEnabled: Boolean
    get() {
       return getFlagX(2) 
    }
    set(value) {
      setFlagX(2, value)
    }

  var angularSpringXEquilibriumPoint: Float
    get() {
       return getParamX(21) 
    }
    set(value) {
      setParamX(21, value)
    }

  var angularSpringXStiffness: Float
    get() {
       return getParamX(19) 
    }
    set(value) {
      setParamX(19, value)
    }

  var angularSpringYDamping: Float
    get() {
       return getParamY(20) 
    }
    set(value) {
      setParamY(20, value)
    }

  var angularSpringYEnabled: Boolean
    get() {
       return getFlagY(2) 
    }
    set(value) {
      setFlagY(2, value)
    }

  var angularSpringYEquilibriumPoint: Float
    get() {
       return getParamY(21) 
    }
    set(value) {
      setParamY(21, value)
    }

  var angularSpringYStiffness: Float
    get() {
       return getParamY(19) 
    }
    set(value) {
      setParamY(19, value)
    }

  var angularSpringZDamping: Float
    get() {
       return getParamZ(20) 
    }
    set(value) {
      setParamZ(20, value)
    }

  var angularSpringZEnabled: Boolean
    get() {
       return getFlagZ(2) 
    }
    set(value) {
      setFlagZ(2, value)
    }

  var angularSpringZEquilibriumPoint: Float
    get() {
       return getParamZ(21) 
    }
    set(value) {
      setParamZ(21, value)
    }

  var angularSpringZStiffness: Float
    get() {
       return getParamZ(19) 
    }
    set(value) {
      setParamZ(19, value)
    }

  var linearLimitXDamping: Float
    get() {
       return getParamX(4) 
    }
    set(value) {
      setParamX(4, value)
    }

  var linearLimitXEnabled: Boolean
    get() {
       return getFlagX(0) 
    }
    set(value) {
      setFlagX(0, value)
    }

  var linearLimitXLowerDistance: Float
    get() {
       return getParamX(0) 
    }
    set(value) {
      setParamX(0, value)
    }

  var linearLimitXRestitution: Float
    get() {
       return getParamX(3) 
    }
    set(value) {
      setParamX(3, value)
    }

  var linearLimitXSoftness: Float
    get() {
       return getParamX(2) 
    }
    set(value) {
      setParamX(2, value)
    }

  var linearLimitXUpperDistance: Float
    get() {
       return getParamX(1) 
    }
    set(value) {
      setParamX(1, value)
    }

  var linearLimitYDamping: Float
    get() {
       return getParamY(4) 
    }
    set(value) {
      setParamY(4, value)
    }

  var linearLimitYEnabled: Boolean
    get() {
       return getFlagY(0) 
    }
    set(value) {
      setFlagY(0, value)
    }

  var linearLimitYLowerDistance: Float
    get() {
       return getParamY(0) 
    }
    set(value) {
      setParamY(0, value)
    }

  var linearLimitYRestitution: Float
    get() {
       return getParamY(3) 
    }
    set(value) {
      setParamY(3, value)
    }

  var linearLimitYSoftness: Float
    get() {
       return getParamY(2) 
    }
    set(value) {
      setParamY(2, value)
    }

  var linearLimitYUpperDistance: Float
    get() {
       return getParamY(1) 
    }
    set(value) {
      setParamY(1, value)
    }

  var linearLimitZDamping: Float
    get() {
       return getParamZ(4) 
    }
    set(value) {
      setParamZ(4, value)
    }

  var linearLimitZEnabled: Boolean
    get() {
       return getFlagZ(0) 
    }
    set(value) {
      setFlagZ(0, value)
    }

  var linearLimitZLowerDistance: Float
    get() {
       return getParamZ(0) 
    }
    set(value) {
      setParamZ(0, value)
    }

  var linearLimitZRestitution: Float
    get() {
       return getParamZ(3) 
    }
    set(value) {
      setParamZ(3, value)
    }

  var linearLimitZSoftness: Float
    get() {
       return getParamZ(2) 
    }
    set(value) {
      setParamZ(2, value)
    }

  var linearLimitZUpperDistance: Float
    get() {
       return getParamZ(1) 
    }
    set(value) {
      setParamZ(1, value)
    }

  var linearMotorXEnabled: Boolean
    get() {
       return getFlagX(5) 
    }
    set(value) {
      setFlagX(5, value)
    }

  var linearMotorXForceLimit: Float
    get() {
       return getParamX(6) 
    }
    set(value) {
      setParamX(6, value)
    }

  var linearMotorXTargetVelocity: Float
    get() {
       return getParamX(5) 
    }
    set(value) {
      setParamX(5, value)
    }

  var linearMotorYEnabled: Boolean
    get() {
       return getFlagY(5) 
    }
    set(value) {
      setFlagY(5, value)
    }

  var linearMotorYForceLimit: Float
    get() {
       return getParamY(6) 
    }
    set(value) {
      setParamY(6, value)
    }

  var linearMotorYTargetVelocity: Float
    get() {
       return getParamY(5) 
    }
    set(value) {
      setParamY(5, value)
    }

  var linearMotorZEnabled: Boolean
    get() {
       return getFlagZ(5) 
    }
    set(value) {
      setFlagZ(5, value)
    }

  var linearMotorZForceLimit: Float
    get() {
       return getParamZ(6) 
    }
    set(value) {
      setParamZ(6, value)
    }

  var linearMotorZTargetVelocity: Float
    get() {
       return getParamZ(5) 
    }
    set(value) {
      setParamZ(5, value)
    }

  var linearSpringXDamping: Float
    get() {
       return getParamX(8) 
    }
    set(value) {
      setParamX(8, value)
    }

  var linearSpringXEnabled: Boolean
    get() {
       return getFlagX(3) 
    }
    set(value) {
      setFlagX(3, value)
    }

  var linearSpringXEquilibriumPoint: Float
    get() {
       return getParamX(9) 
    }
    set(value) {
      setParamX(9, value)
    }

  var linearSpringXStiffness: Float
    get() {
       return getParamX(7) 
    }
    set(value) {
      setParamX(7, value)
    }

  var linearSpringYDamping: Float
    get() {
       return getParamY(8) 
    }
    set(value) {
      setParamY(8, value)
    }

  var linearSpringYEnabled: Boolean
    get() {
       return getFlagY(3) 
    }
    set(value) {
      setFlagY(3, value)
    }

  var linearSpringYEquilibriumPoint: Float
    get() {
       return getParamY(9) 
    }
    set(value) {
      setParamY(9, value)
    }

  var linearSpringYStiffness: Float
    get() {
       return getParamY(7) 
    }
    set(value) {
      setParamY(7, value)
    }

  var linearSpringZDamping: Float
    get() {
       return getParamZ(8) 
    }
    set(value) {
      setParamZ(8, value)
    }

  var linearSpringZEnabled: Boolean
    get() {
       return getFlagZ(3) 
    }
    set(value) {
      setFlagZ(3, value)
    }

  var linearSpringZEquilibriumPoint: Float
    get() {
       return getParamZ(9) 
    }
    set(value) {
      setParamZ(9, value)
    }

  var linearSpringZStiffness: Float
    get() {
       return getParamZ(7) 
    }
    set(value) {
      setParamZ(7, value)
    }

  var precision: Int
    get() {
       return getPrecision() 
    }
    set(value) {
      setPrecision(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getFlagX(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getFlagX.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getFlagY(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getFlagY.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getFlagZ(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getFlagZ.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getParamX(param: Int): Float {
    val _arg = Variant(param)
    val _ret = __method_bind.getParamX.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getParamY(param: Int): Float {
    val _arg = Variant(param)
    val _ret = __method_bind.getParamY.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getParamZ(param: Int): Float {
    val _arg = Variant(param)
    val _ret = __method_bind.getParamZ.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getPrecision(): Int {
    val _ret = __method_bind.getPrecision.call(this._handle)
    return _ret.asInt()
  }

  fun setFlagX(flag: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(value))
    __method_bind.setFlagX.call(this._handle, _args)
  }

  fun setFlagY(flag: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(value))
    __method_bind.setFlagY.call(this._handle, _args)
  }

  fun setFlagZ(flag: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(value))
    __method_bind.setFlagZ.call(this._handle, _args)
  }

  fun setParamX(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParamX.call(this._handle, _args)
  }

  fun setParamY(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParamY.call(this._handle, _args)
  }

  fun setParamZ(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParamZ.call(this._handle, _args)
  }

  fun setPrecision(precision: Int) {
    val _arg = Variant(precision)
    __method_bind.setPrecision.call(this._handle, listOf(_arg))
  }

  enum class Param(
    val value: Int
  ) {
    LINEAR_LOWER_LIMIT(0),

    LINEAR_UPPER_LIMIT(1),

    LINEAR_LIMIT_SOFTNESS(2),

    LINEAR_RESTITUTION(3),

    LINEAR_DAMPING(4),

    LINEAR_MOTOR_TARGET_VELOCITY(5),

    LINEAR_MOTOR_FORCE_LIMIT(6),

    ANGULAR_LOWER_LIMIT(10),

    ANGULAR_UPPER_LIMIT(11),

    ANGULAR_LIMIT_SOFTNESS(12),

    ANGULAR_DAMPING(13),

    ANGULAR_RESTITUTION(14),

    ANGULAR_FORCE_LIMIT(15),

    ANGULAR_ERP(16),

    ANGULAR_MOTOR_TARGET_VELOCITY(17),

    ANGULAR_MOTOR_FORCE_LIMIT(18),

    MAX(22);

    companion object {
      fun from(value: Int): Param {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Flag(
    val value: Int
  ) {
    ENABLE_LINEAR_LIMIT(0),

    ENABLE_ANGULAR_LIMIT(1),

    ENABLE_ANGULAR_SPRING(2),

    ENABLE_LINEAR_SPRING(3),

    ENABLE_MOTOR(4),

    ENABLE_LINEAR_MOTOR(5),

    MAX(6);

    companion object {
      fun from(value: Int): Flag {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Generic6DOFJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Generic6DOFJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Generic6DOFJoint
     */
    private object __method_bind {
      val getFlagX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_flag_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag_x" }
        }
      val getFlagY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_flag_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag_y" }
        }
      val getFlagZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_flag_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag_z" }
        }
      val getParamX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_param_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_x" }
        }
      val getParamY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_param_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_y" }
        }
      val getParamZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_param_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param_z" }
        }
      val getPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "get_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_precision" }
        }
      val setFlagX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_flag_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag_x" }
        }
      val setFlagY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_flag_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag_y" }
        }
      val setFlagZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_flag_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag_z" }
        }
      val setParamX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_param_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_x" }
        }
      val setParamY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_param_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_y" }
        }
      val setParamZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_param_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param_z" }
        }
      val setPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
            "set_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_precision" }
        }}
  }
}
