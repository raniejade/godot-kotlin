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

open class VisualShaderNodeScalarOp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val OpAdd: Int = 0

    val OpAtan2: Int = 8

    val OpDiv: Int = 3

    val OpMax: Int = 6

    val OpMin: Int = 7

    val OpMod: Int = 4

    val OpMul: Int = 2

    val OpPow: Int = 5

    val OpStep: Int = 9

    val OpSub: Int = 1

    fun new(): VisualShaderNodeScalarOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarOp".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeScalarOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarOp(
        fn()
      )
    }}
}
