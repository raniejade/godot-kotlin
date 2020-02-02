// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNode(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun getDefaultInputValues(): VariantArray {
    val _ret = __method_bind.getDefaultInputValues.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getInputPortDefaultValue(port: Int): Variant {
    val _arg = Variant.new(port)
    val _ret = __method_bind.getInputPortDefaultValue.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getOutputPortForPreview(): Int {
    val _ret = __method_bind.getOutputPortForPreview.call(this._handle)
    return _ret.asInt()
  }

  fun setDefaultInputValues(values: VariantArray) {
    val _arg = Variant.new(values)
    __method_bind.setDefaultInputValues.call(this._handle, listOf(_arg))
  }

  fun setInputPortDefaultValue(port: Int, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(value))
    __method_bind.setInputPortDefaultValue.call(this._handle, _args)
  }

  fun setOutputPortForPreview(port: Int) {
    val _arg = Variant.new(port)
    __method_bind.setOutputPortForPreview.call(this._handle, listOf(_arg))
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_default_input_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_input_values" }
        }
      val getInputPortDefaultValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_port_default_value" }
        }
      val getOutputPortForPreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_output_port_for_preview" }
        }
      val setDefaultInputValues: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_default_input_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_input_values" }
        }
      val setInputPortDefaultValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_port_default_value" }
        }
      val setOutputPortForPreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_port_for_preview" }
        }}
  }
}
