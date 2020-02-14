// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class VisualShaderNodeCustom(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_category(): String {
    TODO()
  }

  open fun _get_code(
    inputVars: VariantArray,
    outputVars: VariantArray,
    mode: Int,
    type: Int
  ): String {
    TODO()
  }

  open fun _get_description(): String {
    TODO()
  }

  open fun _get_global_code(mode: Int): String {
    TODO()
  }

  open fun _get_input_port_count(): Int {
    TODO()
  }

  open fun _get_input_port_name(port: Int): String {
    TODO()
  }

  open fun _get_input_port_type(port: Int): Int {
    TODO()
  }

  open fun _get_name(): String {
    TODO()
  }

  open fun _get_output_port_count(): Int {
    TODO()
  }

  open fun _get_output_port_name(port: Int): String {
    TODO()
  }

  open fun _get_output_port_type(port: Int): Int {
    TODO()
  }

  open fun _get_return_icon_type(): Int {
    TODO()
  }

  open fun _get_subcategory(): String {
    TODO()
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCustom".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeCustom" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeCustom
     */
    private object __method_bind
  }
}
