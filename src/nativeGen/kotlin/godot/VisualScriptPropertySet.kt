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

open class VisualScriptPropertySet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val AssignOpAdd: Int = 1

    val AssignOpBitAnd: Int = 8

    val AssignOpBitOr: Int = 9

    val AssignOpBitXor: Int = 10

    val AssignOpDiv: Int = 4

    val AssignOpMod: Int = 5

    val AssignOpMul: Int = 3

    val AssignOpNone: Int = 0

    val AssignOpShiftLeft: Int = 6

    val AssignOpShiftRight: Int = 7

    val AssignOpSub: Int = 2

    val CallModeBasicType: Int = 3

    val CallModeInstance: Int = 2

    val CallModeNodePath: Int = 1

    val CallModeSelf: Int = 0

    fun new(): VisualScriptPropertySet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPropertySet".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptPropertySet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPropertySet(
        fn()
      )
    }}
}
