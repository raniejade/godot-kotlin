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
import kotlinx.cinterop.CPointer
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

open class VisualShaderNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var defaultInputValues: VariantArray
    get() {
       return getDefaultInputValues() 
    }
    set(value) {
      setDefaultInputValues(value)
    }

  var outputPortForPreview: Int
    get() {
       return getOutputPortForPreview() 
    }
    set(value) {
      setOutputPortForPreview(value)
    }

  /**
   * VisualShaderNode::editor_refresh_request signal
   */
  val signalEditorRefreshRequest: Signal0 = Signal0("editor_refresh_request")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDefaultInputValues(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getDefaultInputValues.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInputPortDefaultValue(port: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getInputPortDefaultValue.call(self._handle, listOf(port), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOutputPortForPreview(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutputPortForPreview.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDefaultInputValues(values: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultInputValues.call(self._handle, listOf(values), null)
    }
  }

  fun setInputPortDefaultValue(port: Int, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(port)
      _args.add(value)
      __method_bind.setInputPortDefaultValue.call(self._handle, _args, null)
    }
  }

  fun setOutputPortForPreview(port: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutputPortForPreview.call(self._handle, listOf(port), null)
    }
  }

  enum class PortType(
    val value: Int
  ) {
    SCALAR(0),

    VECTOR(1),

    BOOLEAN(2),

    TRANSFORM(3),

    SAMPLER(4),

    MAX(5);

    companion object {
      fun from(value: Int): PortType {
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
    /**
     * Container for method_bind pointers for VisualShaderNode
     */
    private object __method_bind {
      val getDefaultInputValues: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_default_input_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_input_values" }
        }
      val getInputPortDefaultValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_port_default_value" }
        }
      val getOutputPortForPreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_output_port_for_preview" }
        }
      val setDefaultInputValues: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_default_input_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_input_values" }
        }
      val setInputPortDefaultValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_port_default_value" }
        }
      val setOutputPortForPreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_port_for_preview" }
        }}
  }
}
