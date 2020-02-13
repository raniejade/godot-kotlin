// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualScriptCustomNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_caption(): String {
    TODO()
  }

  open fun _get_category(): String {
    TODO()
  }

  open fun _get_input_value_port_count(): Int {
    TODO()
  }

  open fun _get_input_value_port_name(idx: Int): String {
    TODO()
  }

  open fun _get_input_value_port_type(idx: Int): Int {
    TODO()
  }

  open fun _get_output_sequence_port_count(): Int {
    TODO()
  }

  open fun _get_output_sequence_port_text(idx: Int): String {
    TODO()
  }

  open fun _get_output_value_port_count(): Int {
    TODO()
  }

  open fun _get_output_value_port_name(idx: Int): String {
    TODO()
  }

  open fun _get_output_value_port_type(idx: Int): Int {
    TODO()
  }

  open fun _get_text(): String {
    TODO()
  }

  open fun _get_working_memory_size(): Int {
    TODO()
  }

  open fun _has_input_sequence_port(): Boolean {
    TODO()
  }

  open fun _script_changed() {
    TODO()
  }

  open fun _step(
    inputs: VariantArray,
    outputs: VariantArray,
    startMode: Int,
    workingMem: VariantArray
  ): Variant {
    TODO()
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

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
