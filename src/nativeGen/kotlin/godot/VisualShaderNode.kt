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
  fun getDefaultInputValues(): VariantArray {
    TODO()
  }

  fun setDefaultInputValues() {
    TODO()
  }

  fun getInputPortDefaultValue(): Variant {
    TODO()
  }

  fun getOutputPortForPreview(): Int {
    TODO()
  }

  fun setInputPortDefaultValue() {
    TODO()
  }

  fun setOutputPortForPreview() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualShaderNode
     */
    private object __method_bind {
      val _get_default_input_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "_get_default_input_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_default_input_values" }
            }
          }

      val _set_default_input_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "_set_default_input_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_default_input_values" }
            }
          }

      val get_input_port_default_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "get_input_port_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_port_default_value" }
            }
          }

      val get_output_port_for_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "get_output_port_for_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_port_for_preview" }
            }
          }

      val set_input_port_default_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "set_input_port_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_port_default_value" }
            }
          }

      val set_output_port_for_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNode".cstr.ptr,
              "set_output_port_for_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_port_for_preview" }
            }
          }
    }
  }
}
