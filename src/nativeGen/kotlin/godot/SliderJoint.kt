// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SliderJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.get_param.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.set_param.call(this._handle, _args.toVariant(), 2)
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_LINEAR_LIMIT_UPPER(0),

    PARAM_LINEAR_LIMIT_LOWER(1),

    PARAM_LINEAR_LIMIT_SOFTNESS(2),

    PARAM_LINEAR_LIMIT_RESTITUTION(3),

    PARAM_LINEAR_LIMIT_DAMPING(4),

    PARAM_LINEAR_MOTION_SOFTNESS(5),

    PARAM_LINEAR_MOTION_RESTITUTION(6),

    PARAM_LINEAR_MOTION_DAMPING(7),

    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),

    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),

    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),

    PARAM_ANGULAR_LIMIT_UPPER(11),

    PARAM_ANGULAR_LIMIT_LOWER(12),

    PARAM_ANGULAR_LIMIT_SOFTNESS(13),

    PARAM_ANGULAR_LIMIT_RESTITUTION(14),

    PARAM_ANGULAR_LIMIT_DAMPING(15),

    PARAM_ANGULAR_MOTION_SOFTNESS(16),

    PARAM_ANGULAR_MOTION_RESTITUTION(17),

    PARAM_ANGULAR_MOTION_DAMPING(18),

    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),

    PARAM_MAX(22);

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
      val get_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val set_param: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }}
  }
}
