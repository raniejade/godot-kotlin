// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class VisualScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Script(null) {
  /**
   * VisualScript::node_ports_changed signal
   */
  val signalNodePortsChanged: Signal2<String, Int> = Signal2("node_ports_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_data(): Dictionary {
    TODO()
  }

  open fun _node_ports_changed(arg0: Int) {
    TODO()
  }

  open fun _set_data(data: Dictionary) {
    TODO()
  }

  fun addCustomSignal(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCustomSignal.call(self._handle, listOf(name), null)
    }
  }

  fun addFunction(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addFunction.call(self._handle, listOf(name), null)
    }
  }

  fun addNode(
    func: String,
    id: Int,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0, 0)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      _args.add(node)
      _args.add(position)
      __method_bind.addNode.call(self._handle, _args, null)
    }
  }

  fun addVariable(
    name: String,
    defaultValue: Variant,
    export: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(defaultValue)
      _args.add(export)
      __method_bind.addVariable.call(self._handle, _args, null)
    }
  }

  fun customSignalAddArgument(
    name: String,
    type: Int,
    argname: String,
    index: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(argname)
      _args.add(index)
      __method_bind.customSignalAddArgument.call(self._handle, _args, null)
    }
  }

  fun customSignalGetArgumentCount(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.customSignalGetArgumentCount.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun customSignalGetArgumentName(name: String, argidx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      __method_bind.customSignalGetArgumentName.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun customSignalGetArgumentType(name: String, argidx: Int): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      __method_bind.customSignalGetArgumentType.call(self._handle, _args, _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun customSignalRemoveArgument(name: String, argidx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      __method_bind.customSignalRemoveArgument.call(self._handle, _args, null)
    }
  }

  fun customSignalSetArgumentName(
    name: String,
    argidx: Int,
    argname: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      _args.add(argname)
      __method_bind.customSignalSetArgumentName.call(self._handle, _args, null)
    }
  }

  fun customSignalSetArgumentType(
    name: String,
    argidx: Int,
    type: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      _args.add(type)
      __method_bind.customSignalSetArgumentType.call(self._handle, _args, null)
    }
  }

  fun customSignalSwapArgument(
    name: String,
    argidx: Int,
    withidx: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(argidx)
      _args.add(withidx)
      __method_bind.customSignalSwapArgument.call(self._handle, _args, null)
    }
  }

  fun dataConnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.dataConnect.call(self._handle, _args, null)
    }
  }

  fun dataDisconnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.dataDisconnect.call(self._handle, _args, null)
    }
  }

  fun getFunctionNodeId(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFunctionNodeId.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getFunctionScroll(name: String): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getFunctionScroll.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNode(func: String, id: Int): VisualScriptNode {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VisualScriptNode
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      __method_bind.getNode.call(self._handle, _args, _retPtr)
      _ret = objectToType<VisualScriptNode>(_tmp.value!!)
      _ret
    }
  }

  fun getNodePosition(func: String, id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      __method_bind.getNodePosition.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVariableDefaultValue(name: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getVariableDefaultValue.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVariableExport(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVariableExport.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getVariableInfo(name: String): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getVariableInfo.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasCustomSignal(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasCustomSignal.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasDataConnection(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.hasDataConnection.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasFunction(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasFunction.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasNode(func: String, id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      __method_bind.hasNode.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasSequenceConnection(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromOutput)
      _args.add(toNode)
      __method_bind.hasSequenceConnection.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasVariable(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasVariable.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun removeCustomSignal(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeCustomSignal.call(self._handle, listOf(name), null)
    }
  }

  fun removeFunction(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeFunction.call(self._handle, listOf(name), null)
    }
  }

  fun removeNode(func: String, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      __method_bind.removeNode.call(self._handle, _args, null)
    }
  }

  fun removeVariable(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeVariable.call(self._handle, listOf(name), null)
    }
  }

  fun renameCustomSignal(name: String, newName: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newName)
      __method_bind.renameCustomSignal.call(self._handle, _args, null)
    }
  }

  fun renameFunction(name: String, newName: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newName)
      __method_bind.renameFunction.call(self._handle, _args, null)
    }
  }

  fun renameVariable(name: String, newName: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newName)
      __method_bind.renameVariable.call(self._handle, _args, null)
    }
  }

  fun sequenceConnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromOutput)
      _args.add(toNode)
      __method_bind.sequenceConnect.call(self._handle, _args, null)
    }
  }

  fun sequenceDisconnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(fromNode)
      _args.add(fromOutput)
      _args.add(toNode)
      __method_bind.sequenceDisconnect.call(self._handle, _args, null)
    }
  }

  fun setFunctionScroll(name: String, ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(ofs)
      __method_bind.setFunctionScroll.call(self._handle, _args, null)
    }
  }

  fun setInstanceBaseType(type: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInstanceBaseType.call(self._handle, listOf(type), null)
    }
  }

  fun setNodePosition(
    func: String,
    id: Int,
    position: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(func)
      _args.add(id)
      _args.add(position)
      __method_bind.setNodePosition.call(self._handle, _args, null)
    }
  }

  fun setVariableDefaultValue(name: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      __method_bind.setVariableDefaultValue.call(self._handle, _args, null)
    }
  }

  fun setVariableExport(name: String, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(enable)
      __method_bind.setVariableExport.call(self._handle, _args, null)
    }
  }

  fun setVariableInfo(name: String, value: Dictionary) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      __method_bind.setVariableInfo.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScript
     */
    private object __method_bind {
      val addCustomSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_signal" }
            }
          }

      val addFunction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_function" }
            }
          }

      val addNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val addVariable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_variable" }
            }
          }

      val customSignalAddArgument: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_add_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_add_argument" }
            }
          }

      val customSignalGetArgumentCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_count" }
            }
          }

      val customSignalGetArgumentName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_name".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_name" }
            }
          }

      val customSignalGetArgumentType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_type" }
            }
          }

      val customSignalRemoveArgument: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_remove_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_remove_argument"
              }
            }
          }

      val customSignalSetArgumentName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_set_argument_name".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_set_argument_name" }
            }
          }

      val customSignalSetArgumentType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_set_argument_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_set_argument_type" }
            }
          }

      val customSignalSwapArgument: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_swap_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_swap_argument" }
            }
          }

      val dataConnect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "data_connect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method data_connect" }
            }
          }

      val dataDisconnect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "data_disconnect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method data_disconnect" }
            }
          }

      val getFunctionNodeId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_function_node_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function_node_id" }
            }
          }

      val getFunctionScroll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_function_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function_scroll" }
            }
          }

      val getNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val getNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val getVariableDefaultValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_default_value" }
            }
          }

      val getVariableExport: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_export".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_export" }
            }
          }

      val getVariableInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_info" }
            }
          }

      val hasCustomSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_custom_signal" }
            }
          }

      val hasDataConnection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_data_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_data_connection" }
            }
          }

      val hasFunction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_function" }
            }
          }

      val hasNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val hasSequenceConnection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_sequence_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_sequence_connection" }
            }
          }

      val hasVariable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_variable" }
            }
          }

      val removeCustomSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_custom_signal" }
            }
          }

      val removeFunction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_function" }
            }
          }

      val removeNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val removeVariable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_variable" }
            }
          }

      val renameCustomSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_custom_signal" }
            }
          }

      val renameFunction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_function" }
            }
          }

      val renameVariable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_variable" }
            }
          }

      val sequenceConnect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "sequence_connect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sequence_connect" }
            }
          }

      val sequenceDisconnect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "sequence_disconnect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sequence_disconnect" }
            }
          }

      val setFunctionScroll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_function_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function_scroll" }
            }
          }

      val setInstanceBaseType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_instance_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_base_type" }
            }
          }

      val setNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }

      val setVariableDefaultValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_default_value" }
            }
          }

      val setVariableExport: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_export".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_export" }
            }
          }

      val setVariableInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_info" }
            }
          }
    }
  }
}
