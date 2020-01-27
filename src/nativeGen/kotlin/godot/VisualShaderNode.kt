// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNode internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getInputPortDefaultValue(port: Int): Variant {
    val _arg = Variant.new(port)
    val _ret = __method_bind.get_input_port_default_value.call(this._handle, _arg, 1)
    return _ret
  }

  fun getOutputPortForPreview(): Int {
    val _ret = __method_bind.get_output_port_for_preview.call(this._handle)
    return _ret.asInt()
  }

  fun setInputPortDefaultValue(port: Int, value: Variant) {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(value)
    __method_bind.set_input_port_default_value.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputPortForPreview(port: Int) {
    val _arg = Variant.new(port)
    __method_bind.set_output_port_for_preview.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualShaderNode
     */
    private object __method_bind {
      val get_input_port_default_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_port_default_value" }
        }
      val get_output_port_for_preview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "get_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_output_port_for_preview" }
        }
      val set_input_port_default_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_input_port_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_port_default_value" }
        }
      val set_output_port_for_preview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
            "set_output_port_for_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_port_for_preview" }
        }}
  }
}
