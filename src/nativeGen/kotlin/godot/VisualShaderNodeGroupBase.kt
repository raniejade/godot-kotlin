// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeGroupBase internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun addInputPort(
    id: Int,
    type: Int,
    name: String
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(type)
    _args.append(name)
    val _ret = __method_bind.add_input_port.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addOutputPort(
    id: Int,
    type: Int,
    name: String
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(type)
    _args.append(name)
    val _ret = __method_bind.add_output_port.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun clearInputPorts() {
    val _ret = __method_bind.clear_input_ports.call(this.toVariant())
    TODO()
  }

  fun clearOutputPorts() {
    val _ret = __method_bind.clear_output_ports.call(this.toVariant())
    TODO()
  }

  fun getControl(index: Int): Control {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.get_control.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFreeInputPortId(): Int {
    val _ret = __method_bind.get_free_input_port_id.call(this.toVariant())
    TODO()
  }

  fun getFreeOutputPortId(): Int {
    val _ret = __method_bind.get_free_output_port_id.call(this.toVariant())
    TODO()
  }

  fun getInputPortCount(): Int {
    val _ret = __method_bind.get_input_port_count.call(this.toVariant())
    TODO()
  }

  fun getInputs(): String {
    val _ret = __method_bind.get_inputs.call(this.toVariant())
    TODO()
  }

  fun getOutputPortCount(): Int {
    val _ret = __method_bind.get_output_port_count.call(this.toVariant())
    TODO()
  }

  fun getOutputs(): String {
    val _ret = __method_bind.get_outputs.call(this.toVariant())
    TODO()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.get_size.call(this.toVariant())
    TODO()
  }

  fun hasInputPort(id: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.has_input_port.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun hasOutputPort(id: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.has_output_port.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeInputPort(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.remove_input_port.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeOutputPort(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.remove_output_port.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setControl(control: Control, index: Int) {
    val _args = VariantArray.new()
    _args.append(control)
    _args.append(index)
    val _ret = __method_bind.set_control.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setInputPortName(arg0: Int, arg1: String) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    val _ret = __method_bind.set_input_port_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setInputPortType(arg0: Int, arg1: Int) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    val _ret = __method_bind.set_input_port_type.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setInputs(inputs: String) {
    val _args = VariantArray.new()
    _args.append(inputs)
    val _ret = __method_bind.set_inputs.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOutputPortName(arg0: Int, arg1: String) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    val _ret = __method_bind.set_output_port_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setOutputPortType(arg0: Int, arg1: Int) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    val _ret = __method_bind.set_output_port_type.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setOutputs(outputs: String) {
    val _args = VariantArray.new()
    _args.append(outputs)
    val _ret = __method_bind.set_outputs.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSize(size: Vector2) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): VisualShaderNodeGroupBase = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeGroupBase".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeGroupBase" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeGroupBase(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeGroupBase = VisualShaderNodeGroupBase(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeGroupBase
     */
    private object __method_bind {
      val add_input_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "add_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_input_port" }
            }
          }

      val add_output_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "add_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_output_port" }
            }
          }

      val clear_input_ports: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "clear_input_ports".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_input_ports" }
            }
          }

      val clear_output_ports: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "clear_output_ports".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_output_ports" }
            }
          }

      val get_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_control" }
            }
          }

      val get_free_input_port_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_free_input_port_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_free_input_port_id" }
            }
          }

      val get_free_output_port_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_free_output_port_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_free_output_port_id" }
            }
          }

      val get_input_port_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_input_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_port_count" }
            }
          }

      val get_inputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inputs" }
            }
          }

      val get_output_port_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_output_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_port_count" }
            }
          }

      val get_outputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_outputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outputs" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val has_input_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "has_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_input_port" }
            }
          }

      val has_output_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "has_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_output_port" }
            }
          }

      val remove_input_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "remove_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_input_port" }
            }
          }

      val remove_output_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "remove_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_output_port" }
            }
          }

      val set_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_control" }
            }
          }

      val set_input_port_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_input_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_port_name" }
            }
          }

      val set_input_port_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_input_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_port_type" }
            }
          }

      val set_inputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_inputs" }
            }
          }

      val set_output_port_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_output_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_port_name" }
            }
          }

      val set_output_port_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_output_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_port_type" }
            }
          }

      val set_outputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_outputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outputs" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
