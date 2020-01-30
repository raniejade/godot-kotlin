// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptLists(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun addInputDataPort(
    type: Int,
    name: String,
    index: Int
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(name)
    _args.append(index)
    __method_bind.addInputDataPort.call(this._handle, _args.toVariant(), 3)
  }

  fun addOutputDataPort(
    type: Int,
    name: String,
    index: Int
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(name)
    _args.append(index)
    __method_bind.addOutputDataPort.call(this._handle, _args.toVariant(), 3)
  }

  fun removeInputDataPort(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removeInputDataPort.call(this._handle, _arg, 1)
  }

  fun removeOutputDataPort(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removeOutputDataPort.call(this._handle, _arg, 1)
  }

  fun setInputDataPortName(index: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(name)
    __method_bind.setInputDataPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputDataPortType(index: Int, type: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(type)
    __method_bind.setInputDataPortType.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputDataPortName(index: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(name)
    __method_bind.setOutputDataPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputDataPortType(index: Int, type: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(type)
    __method_bind.setOutputDataPortType.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptLists
     */
    private object __method_bind {
      val addInputDataPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "add_input_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_input_data_port" }
        }
      val addOutputDataPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "add_output_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_output_data_port" }
        }
      val removeInputDataPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "remove_input_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_input_data_port" }
        }
      val removeOutputDataPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "remove_output_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_output_data_port" }
        }
      val setInputDataPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_input_data_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_data_port_name" }
        }
      val setInputDataPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_input_data_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_data_port_type" }
        }
      val setOutputDataPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_output_data_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_data_port_name" }
        }
      val setOutputDataPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_output_data_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_data_port_type" }
        }}
  }
}
