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

open class VisualShaderNodeGroupBase(
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

  fun getControl(index: Int): Control {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getControl.call(this._handle, _arg, 1)
    return _ret.asObject(::Control)!!
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

  fun removeInputPort(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeInputPort.call(this._handle, _arg, 1)
  }

  fun removeOutputPort(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeOutputPort.call(this._handle, _arg, 1)
  }

  fun setControl(control: Control, index: Int) {
    val _args = VariantArray.new()
    _args.append(control)
    _args.append(index)
    __method_bind.setControl.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputPortName(arg0: Int, arg1: String) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    __method_bind.setInputPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputPortType(arg0: Int, arg1: Int) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    __method_bind.setInputPortType.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputs(inputs: String) {
    val _arg = Variant.new(inputs)
    __method_bind.setInputs.call(this._handle, _arg, 1)
  }

  fun setOutputPortName(arg0: Int, arg1: String) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
    __method_bind.setOutputPortName.call(this._handle, _args.toVariant(), 2)
  }

  fun setOutputPortType(arg0: Int, arg1: Int) {
    val _args = VariantArray.new()
    _args.append(arg0)
    _args.append(arg1)
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
            "addInputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addInputPort" }
        }
      val addOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "addOutputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addOutputPort" }
        }
      val clearInputPorts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "clearInputPorts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearInputPorts" }
        }
      val clearOutputPorts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "clearOutputPorts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearOutputPorts" }
        }
      val getControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControl" }
        }
      val getFreeInputPortId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getFreeInputPortId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFreeInputPortId" }
        }
      val getFreeOutputPortId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getFreeOutputPortId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFreeOutputPortId" }
        }
      val getInputPortCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getInputPortCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInputPortCount" }
        }
      val getInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getInputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInputs" }
        }
      val getOutputPortCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getOutputPortCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutputPortCount" }
        }
      val getOutputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getOutputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutputs" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val hasInputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "hasInputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasInputPort" }
        }
      val hasOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "hasOutputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasOutputPort" }
        }
      val removeInputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "removeInputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeInputPort" }
        }
      val removeOutputPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "removeOutputPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeOutputPort" }
        }
      val setControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setControl" }
        }
      val setInputPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setInputPortName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInputPortName" }
        }
      val setInputPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setInputPortType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInputPortType" }
        }
      val setInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setInputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInputs" }
        }
      val setOutputPortName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setOutputPortName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOutputPortName" }
        }
      val setOutputPortType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setOutputPortType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOutputPortType" }
        }
      val setOutputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setOutputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOutputs" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }}
  }
}
