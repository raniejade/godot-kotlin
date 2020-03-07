// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class VisualShaderNodeGroupBase(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var size: Vector2
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(type)
      _args.add(name)
      __method_bind.addInputPort.call(self._handle, _args, null)
    }
  }

  fun addOutputPort(
    id: Int,
    type: Int,
    name: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(type)
      _args.add(name)
      __method_bind.addOutputPort.call(self._handle, _args, null)
    }
  }

  fun clearInputPorts() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearInputPorts.call(self._handle, emptyList(), null)
    }
  }

  fun clearOutputPorts() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearOutputPorts.call(self._handle, emptyList(), null)
    }
  }

  fun getFreeInputPortId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFreeInputPortId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFreeOutputPortId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFreeOutputPortId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInputPortCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInputPortCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInputs(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getInputs.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getOutputPortCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutputPortCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOutputs(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getOutputs.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasInputPort(id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasInputPort.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun hasOutputPort(id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasOutputPort.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun isValidPortName(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isValidPortName.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun removeInputPort(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeInputPort.call(self._handle, listOf(id), null)
    }
  }

  fun removeOutputPort(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeOutputPort.call(self._handle, listOf(id), null)
    }
  }

  fun setInputPortName(id: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(name)
      __method_bind.setInputPortName.call(self._handle, _args, null)
    }
  }

  fun setInputPortType(id: Int, type: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(type)
      __method_bind.setInputPortType.call(self._handle, _args, null)
    }
  }

  fun setInputs(inputs: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInputs.call(self._handle, listOf(inputs), null)
    }
  }

  fun setOutputPortName(id: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(name)
      __method_bind.setOutputPortName.call(self._handle, _args, null)
    }
  }

  fun setOutputPortType(id: Int, type: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(type)
      __method_bind.setOutputPortType.call(self._handle, _args, null)
    }
  }

  fun setOutputs(outputs: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutputs.call(self._handle, listOf(outputs), null)
    }
  }

  fun setSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(size), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeGroupBase".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeGroupBase" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeGroupBase
     */
    private object __method_bind {
      val addInputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "add_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_input_port" }
            }
          }

      val addOutputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "add_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_output_port" }
            }
          }

      val clearInputPorts: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "clear_input_ports".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_input_ports" }
            }
          }

      val clearOutputPorts: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "clear_output_ports".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_output_ports" }
            }
          }

      val getFreeInputPortId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_free_input_port_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_free_input_port_id" }
            }
          }

      val getFreeOutputPortId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_free_output_port_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_free_output_port_id" }
            }
          }

      val getInputPortCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_input_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_port_count" }
            }
          }

      val getInputs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inputs" }
            }
          }

      val getOutputPortCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_output_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_port_count" }
            }
          }

      val getOutputs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_outputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outputs" }
            }
          }

      val getSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val hasInputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "has_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_input_port" }
            }
          }

      val hasOutputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "has_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_output_port" }
            }
          }

      val isValidPortName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "is_valid_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid_port_name" }
            }
          }

      val removeInputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "remove_input_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_input_port" }
            }
          }

      val removeOutputPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "remove_output_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_output_port" }
            }
          }

      val setInputPortName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_input_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_port_name" }
            }
          }

      val setInputPortType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_input_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_port_type" }
            }
          }

      val setInputs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_inputs" }
            }
          }

      val setOutputPortName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_output_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_port_name" }
            }
          }

      val setOutputPortType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_output_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_port_type" }
            }
          }

      val setOutputs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_outputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outputs" }
            }
          }

      val setSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeGroupBase".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
