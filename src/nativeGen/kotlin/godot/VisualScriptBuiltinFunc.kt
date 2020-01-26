// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptBuiltinFunc internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val BytesToVar: Int = 62

    val Colorn: Int = 63

    val FuncFuncref: Int = 50

    val FuncMax: Int = 65

    val LogicClamp: Int = 47

    val LogicMax: Int = 45

    val LogicMin: Int = 46

    val LogicNearestPo2: Int = 48

    val MathAbs: Int = 16

    val MathAcos: Int = 7

    val MathAsin: Int = 6

    val MathAtan: Int = 8

    val MathAtan2: Int = 9

    val MathCartesian2polar: Int = 42

    val MathCeil: Int = 14

    val MathCos: Int = 1

    val MathCosh: Int = 4

    val MathDb2linear: Int = 40

    val MathDecimals: Int = 24

    val MathDectime: Int = 30

    val MathDeg2rad: Int = 37

    val MathEase: Int = 23

    val MathExp: Int = 20

    val MathFloor: Int = 13

    val MathFmod: Int = 11

    val MathFposmod: Int = 12

    val MathInverseLerp: Int = 27

    val MathIsinf: Int = 22

    val MathIsnan: Int = 21

    val MathLerp: Int = 26

    val MathLinear2db: Int = 39

    val MathLog: Int = 19

    val MathMoveToward: Int = 29

    val MathPolar2cartesian: Int = 41

    val MathPow: Int = 18

    val MathRad2deg: Int = 38

    val MathRand: Int = 32

    val MathRandf: Int = 33

    val MathRandom: Int = 34

    val MathRandomize: Int = 31

    val MathRandseed: Int = 36

    val MathRangeLerp: Int = 28

    val MathRound: Int = 15

    val MathSeed: Int = 35

    val MathSign: Int = 17

    val MathSin: Int = 0

    val MathSinh: Int = 3

    val MathSmoothstep: Int = 64

    val MathSqrt: Int = 10

    val MathStepify: Int = 25

    val MathTan: Int = 2

    val MathTanh: Int = 5

    val MathWrap: Int = 43

    val MathWrapf: Int = 44

    val ObjWeakref: Int = 49

    val StrToVar: Int = 60

    val TextChar: Int = 54

    val TextPrint: Int = 56

    val TextPrinterr: Int = 57

    val TextPrintraw: Int = 58

    val TextStr: Int = 55

    val TypeConvert: Int = 51

    val TypeExists: Int = 53

    val TypeOf: Int = 52

    val VarToBytes: Int = 61

    val VarToStr: Int = 59

    fun new(): VisualScriptBuiltinFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptBuiltinFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptBuiltinFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptBuiltinFunc(
        fn()
      )
    }}
}
