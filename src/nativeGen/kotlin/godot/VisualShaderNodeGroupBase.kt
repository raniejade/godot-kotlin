// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
  fun addInputPort() {
    TODO()
  }

  fun addOutputPort() {
    TODO()
  }

  fun clearInputPorts() {
    TODO()
  }

  fun clearOutputPorts() {
    TODO()
  }

  fun getControl(): Control {
    TODO()
  }

  fun getFreeInputPortId(): Int {
    TODO()
  }

  fun getFreeOutputPortId(): Int {
    TODO()
  }

  fun getInputPortCount(): Int {
    TODO()
  }

  fun getInputs(): String {
    TODO()
  }

  fun getOutputPortCount(): Int {
    TODO()
  }

  fun getOutputs(): String {
    TODO()
  }

  fun getSize(): Vector2 {
    TODO()
  }

  fun hasInputPort(): Boolean {
    TODO()
  }

  fun hasOutputPort(): Boolean {
    TODO()
  }

  fun removeInputPort() {
    TODO()
  }

  fun removeOutputPort() {
    TODO()
  }

  fun setControl() {
    TODO()
  }

  fun setInputPortName() {
    TODO()
  }

  fun setInputPortType() {
    TODO()
  }

  fun setInputs() {
    TODO()
  }

  fun setOutputPortName() {
    TODO()
  }

  fun setOutputPortType() {
    TODO()
  }

  fun setOutputs() {
    TODO()
  }

  fun setSize() {
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
