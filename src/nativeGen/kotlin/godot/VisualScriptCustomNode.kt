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

open class VisualScriptCustomNode internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val StartModeBeginSequence: Int = 0

    val StartModeContinueSequence: Int = 1

    val StartModeResumeYield: Int = 2

    val StepExitFunctionBit: Int = 134217728

    val StepGoBackBit: Int = 33554432

    val StepNoAdvanceBit: Int = 67108864

    val StepPushStackBit: Int = 16777216

    val StepYieldBit: Int = 268435456

    fun new(): VisualScriptCustomNode = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptCustomNode".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptCustomNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualScriptCustomNode(
        fn()
      )
    }}
}
