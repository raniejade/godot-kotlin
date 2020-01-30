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
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeGroupBase(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var size: Vector2
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  /**
   * Specialized setter for size
   */
  fun size(cb: Vector2.() -> Unit) {
    val _p = size
    cb(_p)
    size = _p
  }

  fun addInputPort(
    id: Int,
    type: Int,
    name: String
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(type)
    _args.append(name)
    __method_bind.addInputPort.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.addOutputPort.call(this._handle, _args.toVariant(), 3)
  }

  fun clearInputPorts() {
    __method_bind.clearInputPorts.call(this._handle)
  }

  fun clearOutputPorts() {
    __method_bind.clearOutputPorts.call(this._handle)
  }

  fun getFreeInputPortId(): Int {
    val _ret = __method_bind.getFreeInputPortId.call(this._handle)
    return _ret.asInt()
  }

  fun getFreeOutputPortId(): Int {
    val _ret = __method_bind.getFreeOutputPortId.call(this._handle)
    return _ret.asInt()
  }

  fun getInputPortCount(): Int {
    val _ret = __method_bind.getInputPortCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInputs(): String {
    val _ret = __method_bind.getInputs.call(this._handle)
    return _ret.asString()
  }

  fun getOutputPortCount(): Int {
    val _ret = __method_bind.getOutputPortCount.call(this._handle)
    return _ret.asInt()
  }

  fun getOutputs(): String {
    val _ret = __method_bind.getOutputs.call(this._handle)
    return _ret.asString()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun hasInputPort(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasInputPort.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasOutputPort(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasOutputPort.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isValidPortName(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.isValidPortName.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeInputPort(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeInputPort.call(this._handle, _arg, 1)
  }

  fun removeOutputPort(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeOutputPort.call(this._handle, _arg, 1)
  }

  fun setInputPortName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    __method_bind.setInputPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputPortType(id: Int, type: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(type)
    __method_bind.setInputPortType.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputs(inputs: String) {
    val _arg = Variant.new(inputs)
    __method_bind.setInputs.call(this._handle, _arg, 1)
  }

  fun setOutputPortName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    __method_bind.setOutputPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputPortType(id: Int, type: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(type)
    __method_bind.setOutputPortType.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputs(outputs: String) {
    val _arg = Variant.new(outputs)
    __method_bind.setOutputs.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualShaderNodeGroupBase = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeGroupBase".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeGroupBase" }
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
      val addInputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "add_input_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_input_port" }
        }
      val addOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "add_output_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_output_port" }
        }
      val clearInputPorts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "clear_input_ports".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_input_ports" }
        }
      val clearOutputPorts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "clear_output_ports".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_output_ports" }
        }
      val getFreeInputPortId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_free_input_port_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_free_input_port_id" }
        }
      val getFreeOutputPortId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_free_output_port_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_free_output_port_id" }
        }
      val getInputPortCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_input_port_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_port_count" }
        }
      val getInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inputs" }
        }
      val getOutputPortCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_output_port_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_output_port_count" }
        }
      val getOutputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_outputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outputs" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val hasInputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "has_input_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_input_port" }
        }
      val hasOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "has_output_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_output_port" }
        }
      val isValidPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "is_valid_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_port_name" }
        }
      val removeInputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "remove_input_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_input_port" }
        }
      val removeOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "remove_output_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_output_port" }
        }
      val setInputPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_input_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_port_name" }
        }
      val setInputPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_input_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_port_type" }
        }
      val setInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_inputs" }
        }
      val setOutputPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_output_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_port_name" }
        }
      val setOutputPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_output_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_port_type" }
        }
      val setOutputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_outputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outputs" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }}
  }
}
