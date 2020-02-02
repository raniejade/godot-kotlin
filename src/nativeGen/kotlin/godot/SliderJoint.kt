// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SliderJoint(
  _handle: COpaquePointer
) : Joint(_handle) {
  var angularLimitDamping: Float
    get() {
       return getParam(15) 
    }
    set(value) {
      setParam(15, value)
    }

  var angularLimitRestitution: Float
    get() {
       return getParam(14) 
    }
    set(value) {
      setParam(14, value)
    }

  var angularLimitSoftness: Float
    get() {
       return getParam(13) 
    }
    set(value) {
      setParam(13, value)
    }

  var angularMotionDamping: Float
    get() {
       return getParam(18) 
    }
    set(value) {
      setParam(18, value)
    }

  var angularMotionRestitution: Float
    get() {
       return getParam(17) 
    }
    set(value) {
      setParam(17, value)
    }

  var angularMotionSoftness: Float
    get() {
       return getParam(16) 
    }
    set(value) {
      setParam(16, value)
    }

  var angularOrthoDamping: Float
    get() {
       return getParam(21) 
    }
    set(value) {
      setParam(21, value)
    }

  var angularOrthoRestitution: Float
    get() {
       return getParam(20) 
    }
    set(value) {
      setParam(20, value)
    }

  var angularOrthoSoftness: Float
    get() {
       return getParam(19) 
    }
    set(value) {
      setParam(19, value)
    }

  var linearLimitDamping: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var linearLimitLowerDistance: Float
    get() {
       return getParam(1) 
    }
    set(value) {
      setParam(1, value)
    }

  var linearLimitRestitution: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var linearLimitSoftness: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var linearLimitUpperDistance: Float
    get() {
       return getParam(0) 
    }
    set(value) {
      setParam(0, value)
    }

  var linearMotionDamping: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
    }

  var linearMotionRestitution: Float
    get() {
       return getParam(6) 
    }
    set(value) {
      setParam(6, value)
    }

  var linearMotionSoftness: Float
    get() {
       return getParam(5) 
    }
    set(value) {
      setParam(5, value)
    }

  var linearOrthoDamping: Float
    get() {
       return getParam(10) 
    }
    set(value) {
      setParam(10, value)
    }

  var linearOrthoRestitution: Float
    get() {
       return getParam(9) 
    }
    set(value) {
      setParam(9, value)
    }

  var linearOrthoSoftness: Float
    get() {
       return getParam(8) 
    }
    set(value) {
      setParam(8, value)
    }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, listOf(_arg))
    return _ret.asFloat()
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
    LINEAR_LIMIT_UPPER(0),

    LINEAR_LIMIT_LOWER(1),

    LINEAR_LIMIT_SOFTNESS(2),

    LINEAR_LIMIT_RESTITUTION(3),

    LINEAR_LIMIT_DAMPING(4),

    LINEAR_MOTION_SOFTNESS(5),

    LINEAR_MOTION_RESTITUTION(6),

    LINEAR_MOTION_DAMPING(7),

    LINEAR_ORTHOGONAL_SOFTNESS(8),

    LINEAR_ORTHOGONAL_RESTITUTION(9),

    LINEAR_ORTHOGONAL_DAMPING(10),

    ANGULAR_LIMIT_UPPER(11),

    ANGULAR_LIMIT_LOWER(12),

    ANGULAR_LIMIT_SOFTNESS(13),

    ANGULAR_LIMIT_RESTITUTION(14),

    ANGULAR_LIMIT_DAMPING(15),

    ANGULAR_MOTION_SOFTNESS(16),

    ANGULAR_MOTION_RESTITUTION(17),

    ANGULAR_MOTION_DAMPING(18),

    ANGULAR_ORTHOGONAL_SOFTNESS(19),

    ANGULAR_ORTHOGONAL_RESTITUTION(20),

    ANGULAR_ORTHOGONAL_DAMPING(21),

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

  companion object {
    val PARAM_ANGULAR_LIMIT_DAMPING: Int = 15

    val PARAM_ANGULAR_LIMIT_LOWER: Int = 12

    val PARAM_ANGULAR_LIMIT_RESTITUTION: Int = 14

    val PARAM_ANGULAR_LIMIT_SOFTNESS: Int = 13

    val PARAM_ANGULAR_LIMIT_UPPER: Int = 11

    val PARAM_ANGULAR_MOTION_DAMPING: Int = 18

    val PARAM_ANGULAR_MOTION_RESTITUTION: Int = 17

    val PARAM_ANGULAR_MOTION_SOFTNESS: Int = 16

    val PARAM_ANGULAR_ORTHOGONAL_DAMPING: Int = 21

    val PARAM_ANGULAR_ORTHOGONAL_RESTITUTION: Int = 20

    val PARAM_ANGULAR_ORTHOGONAL_SOFTNESS: Int = 19

    val PARAM_LINEAR_LIMIT_DAMPING: Int = 4

    val PARAM_LINEAR_LIMIT_LOWER: Int = 1

    val PARAM_LINEAR_LIMIT_RESTITUTION: Int = 3

    val PARAM_LINEAR_LIMIT_SOFTNESS: Int = 2

    val PARAM_LINEAR_LIMIT_UPPER: Int = 0

    val PARAM_LINEAR_MOTION_DAMPING: Int = 7

    val PARAM_LINEAR_MOTION_RESTITUTION: Int = 6

    val PARAM_LINEAR_MOTION_SOFTNESS: Int = 5

    val PARAM_LINEAR_ORTHOGONAL_DAMPING: Int = 10

    val PARAM_LINEAR_ORTHOGONAL_RESTITUTION: Int = 9

    val PARAM_LINEAR_ORTHOGONAL_SOFTNESS: Int = 8

    val PARAM_MAX: Int = 22

    fun new(): SliderJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SliderJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SliderJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SliderJoint(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SliderJoint = SliderJoint(ptr)
    /**
     * Container for method_bind pointers for SliderJoint
     */
    private object __method_bind {
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }}
  }
}
