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
  enum class StartMode(
    val value: Int
  ) {
    START_MODE_BEGIN_SEQUENCE(0),

    START_MODE_CONTINUE_SEQUENCE(1),

    START_MODE_RESUME_YIELD(2);
  }

  companion object {
    val START_MODE_BEGIN_SEQUENCE: Int = 0

    val START_MODE_CONTINUE_SEQUENCE: Int = 1

    val START_MODE_RESUME_YIELD: Int = 2

    val STEP_EXIT_FUNCTION_BIT: Int = 134217728

    val STEP_GO_BACK_BIT: Int = 33554432

    val STEP_NO_ADVANCE_BIT: Int = 67108864

    val STEP_PUSH_STACK_BIT: Int = 16777216

    val STEP_YIELD_BIT: Int = 268435456

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
