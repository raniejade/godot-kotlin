// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptBuiltinFunc internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getFunc(): BuiltinFunc {
    val _ret = __method_bind.get_func.call(this.toVariant())
    return VisualScriptBuiltinFunc.BuiltinFunc.from(_ret.asInt())
  }

  fun setFunc(which: Int) {
    val _arg = Variant.new(which)
    __method_bind.set_func.call(this.toVariant(), _arg, 1)
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

    FUNC_MAX(65);

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
    val BYTES_TO_VAR: Int = 62

    val COLORN: Int = 63

    val FUNC_FUNCREF: Int = 50

    val FUNC_MAX: Int = 65

    val LOGIC_CLAMP: Int = 47

    val LOGIC_MAX: Int = 45

    val LOGIC_MIN: Int = 46

    val LOGIC_NEAREST_PO2: Int = 48

    val MATH_ABS: Int = 16

    val MATH_ACOS: Int = 7

    val MATH_ASIN: Int = 6

    val MATH_ATAN: Int = 8

    val MATH_ATAN2: Int = 9

    val MATH_CARTESIAN2POLAR: Int = 42

    val MATH_CEIL: Int = 14

    val MATH_COS: Int = 1

    val MATH_COSH: Int = 4

    val MATH_DB2LINEAR: Int = 40

    val MATH_DECIMALS: Int = 24

    val MATH_DECTIME: Int = 30

    val MATH_DEG2RAD: Int = 37

    val MATH_EASE: Int = 23

    val MATH_EXP: Int = 20

    val MATH_FLOOR: Int = 13

    val MATH_FMOD: Int = 11

    val MATH_FPOSMOD: Int = 12

    val MATH_INVERSE_LERP: Int = 27

    val MATH_ISINF: Int = 22

    val MATH_ISNAN: Int = 21

    val MATH_LERP: Int = 26

    val MATH_LINEAR2DB: Int = 39

    val MATH_LOG: Int = 19

    val MATH_MOVE_TOWARD: Int = 29

    val MATH_POLAR2CARTESIAN: Int = 41

    val MATH_POW: Int = 18

    val MATH_RAD2DEG: Int = 38

    val MATH_RAND: Int = 32

    val MATH_RANDF: Int = 33

    val MATH_RANDOM: Int = 34

    val MATH_RANDOMIZE: Int = 31

    val MATH_RANDSEED: Int = 36

    val MATH_RANGE_LERP: Int = 28

    val MATH_ROUND: Int = 15

    val MATH_SEED: Int = 35

    val MATH_SIGN: Int = 17

    val MATH_SIN: Int = 0

    val MATH_SINH: Int = 3

    val MATH_SMOOTHSTEP: Int = 64

    val MATH_SQRT: Int = 10

    val MATH_STEPIFY: Int = 25

    val MATH_TAN: Int = 2

    val MATH_TANH: Int = 5

    val MATH_WRAP: Int = 43

    val MATH_WRAPF: Int = 44

    val OBJ_WEAKREF: Int = 49

    val STR_TO_VAR: Int = 60

    val TEXT_CHAR: Int = 54

    val TEXT_PRINT: Int = 56

    val TEXT_PRINTERR: Int = 57

    val TEXT_PRINTRAW: Int = 58

    val TEXT_STR: Int = 55

    val TYPE_CONVERT: Int = 51

    val TYPE_EXISTS: Int = 53

    val TYPE_OF: Int = 52

    val VAR_TO_BYTES: Int = 61

    val VAR_TO_STR: Int = 59

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
      val get_func: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBuiltinFunc".cstr.ptr,
              "get_func".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_func" }
            }
          }

      val set_func: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBuiltinFunc".cstr.ptr,
              "set_func".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_func" }
            }
          }
    }
  }
}
