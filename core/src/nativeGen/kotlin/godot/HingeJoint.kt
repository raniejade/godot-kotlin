// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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

open class HingeJoint(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint(null) {
  var angularLimitBias: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var angularLimitEnable: Boolean
    get() {
       return getFlag(0) 
    }
    set(value) {
      setFlag(0, value)
    }

  var angularLimitRelaxation: Float
    get() {
       return getParam(5) 
    }
    set(value) {
      setParam(5, value)
    }

  var angularLimitSoftness: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var motorEnable: Boolean
    get() {
       return getFlag(1) 
    }
    set(value) {
      setFlag(1, value)
    }

  var motorMaxImpulse: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
    }

  var motorTargetVelocity: Float
    get() {
       return getParam(6) 
    }
    set(value) {
      setParam(6, value)
    }

  var paramsBias: Float
    get() {
       return getParam(0) 
    }
    set(value) {
      setParam(0, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getFlag.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant(param)
    val _ret = __method_bind.getParam.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun setFlag(flag: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setFlag.call(this._handle, _args)
  }

  fun setParam(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParam.call(this._handle, _args)
  }

  enum class Param(
    val value: Int
  ) {
    BIAS(0),

    LIMIT_UPPER(1),

    LIMIT_LOWER(2),

    LIMIT_BIAS(3),

    LIMIT_SOFTNESS(4),

    LIMIT_RELAXATION(5),

    MOTOR_TARGET_VELOCITY(6),

    MOTOR_MAX_IMPULSE(7),

    MAX(8);

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
    USE_LIMIT(0),

    ENABLE_MOTOR(1),

    MAX(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HingeJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HingeJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HingeJoint
     */
    private object __method_bind {
      val getFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }}
  }
}
