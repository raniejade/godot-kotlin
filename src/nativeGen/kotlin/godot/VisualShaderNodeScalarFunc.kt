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

open class VisualShaderNodeScalarFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val FuncAbs: Int = 12

    val FuncAcos: Int = 4

    val FuncAcosh: Int = 20

    val FuncAsin: Int = 3

    val FuncAsinh: Int = 21

    val FuncAtan: Int = 5

    val FuncAtanh: Int = 22

    val FuncCeil: Int = 16

    val FuncCos: Int = 1

    val FuncCosh: Int = 7

    val FuncDegrees: Int = 23

    val FuncExp: Int = 10

    val FuncExp2: Int = 24

    val FuncFloor: Int = 14

    val FuncFrac: Int = 17

    val FuncInverseSqrt: Int = 25

    val FuncLog: Int = 9

    val FuncLog2: Int = 26

    val FuncNegate: Int = 19

    val FuncOneminus: Int = 31

    val FuncRadians: Int = 27

    val FuncReciprocal: Int = 28

    val FuncRound: Int = 15

    val FuncRoundeven: Int = 29

    val FuncSaturate: Int = 18

    val FuncSign: Int = 13

    val FuncSin: Int = 0

    val FuncSinh: Int = 6

    val FuncSqrt: Int = 11

    val FuncTan: Int = 2

    val FuncTanh: Int = 8

    val FuncTrunc: Int = 30

    fun new(): VisualShaderNodeScalarFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeScalarFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeScalarFunc(
        fn()
      )
    }}
}
