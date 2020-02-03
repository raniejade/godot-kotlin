// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptBuiltinFunc(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var function: BuiltinFunc
    get() {
       return getFunc() 
    }
    set(value) {
      setFunc(value.value)
    }

  fun getFunc(): BuiltinFunc {
    val _ret = __method_bind.getFunc.call(this._handle)
    return VisualScriptBuiltinFunc.BuiltinFunc.from(_ret.asInt())
  }

  fun setFunc(which: Int) {
    val _arg = Variant.new(which)
    __method_bind.setFunc.call(this._handle, listOf(_arg))
  }

  enum class BuiltinFunc(
    val value: Int
  ) {
    MATH_SIN(0),

    MATH_COS(1),

    MATH_TAN(2),

    MATH_SINH(3),

    MATH_COSH(4),

    MATH_TANH(5),

    MATH_ASIN(6),

    MATH_ACOS(7),

    MATH_ATAN(8),

    MATH_ATAN2(9),

    MATH_SQRT(10),

    MATH_FMOD(11),

    MATH_FPOSMOD(12),

    MATH_FLOOR(13),

    MATH_CEIL(14),

    MATH_ROUND(15),

    MATH_ABS(16),

    MATH_SIGN(17),

    MATH_POW(18),

    MATH_LOG(19),

    MATH_EXP(20),

    MATH_ISNAN(21),

    MATH_ISINF(22),

    MATH_EASE(23),

    MATH_DECIMALS(24),

    MATH_STEPIFY(25),

    MATH_LERP(26),

    MATH_INVERSE_LERP(27),

    MATH_RANGE_LERP(28),

    MATH_MOVE_TOWARD(29),

    MATH_DECTIME(30),

    MATH_RANDOMIZE(31),

    MATH_RAND(32),

    MATH_RANDF(33),

    MATH_RANDOM(34),

    MATH_SEED(35),

    MATH_RANDSEED(36),

    MATH_DEG2RAD(37),

    MATH_RAD2DEG(38),

    MATH_LINEAR2DB(39),

    MATH_DB2LINEAR(40),

    MATH_POLAR2CARTESIAN(41),

    MATH_CARTESIAN2POLAR(42),

    MATH_WRAP(43),

    MATH_WRAPF(44),

    LOGIC_MAX(45),

    LOGIC_MIN(46),

    LOGIC_CLAMP(47),

    LOGIC_NEAREST_PO2(48),

    OBJ_WEAKREF(49),

    FUNC_FUNCREF(50),

    TYPE_CONVERT(51),

    TYPE_OF(52),

    TYPE_EXISTS(53),

    TEXT_CHAR(54),

    TEXT_STR(55),

    TEXT_PRINT(56),

    TEXT_PRINTERR(57),

    TEXT_PRINTRAW(58),

    VAR_TO_STR(59),

    STR_TO_VAR(60),

    VAR_TO_BYTES(61),

    BYTES_TO_VAR(62),

    COLORN(63),

    MATH_SMOOTHSTEP(64),

    MATH_POSMOD(65),

    MATH_LERP_ANGLE(66),

    TEXT_ORD(67),

    FUNC_MAX(68);

    companion object {
      fun from(value: Int): BuiltinFunc {
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
    fun new(): VisualScriptBuiltinFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptBuiltinFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptBuiltinFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptBuiltinFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptBuiltinFunc = VisualScriptBuiltinFunc(ptr)
    /**
     * Container for method_bind pointers for VisualScriptBuiltinFunc
     */
    private object __method_bind {
      val getFunc: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBuiltinFunc".cstr.ptr,
            "get_func".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_func" }
        }
      val setFunc: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBuiltinFunc".cstr.ptr,
            "set_func".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_func" }
        }}
  }
}
