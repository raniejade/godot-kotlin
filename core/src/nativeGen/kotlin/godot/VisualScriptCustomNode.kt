// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptCustomNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  enum class StartMode(
    val value: Int
  ) {
    BEGIN_SEQUENCE(0),

    CONTINUE_SEQUENCE(1),

    RESUME_YIELD(2);

    companion object {
      fun from(value: Int): StartMode {
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
    val STEP_EXIT_FUNCTION_BIT: Int = 134217728

    val STEP_GO_BACK_BIT: Int = 33554432

    val STEP_NO_ADVANCE_BIT: Int = 67108864

    val STEP_PUSH_STACK_BIT: Int = 16777216

    val STEP_YIELD_BIT: Int = 268435456

    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptCustomNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptCustomNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptCustomNode
     */
    private object __method_bind
  }
}
