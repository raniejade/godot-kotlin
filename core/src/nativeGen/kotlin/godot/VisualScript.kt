// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Script(null) {
  /**
   * VisualScript::node_ports_changed signal
   */
  val signalNodePortsChanged: Signal2<String, Int> = Signal2("node_ports_changed")

  constructor() : this(null) {
    _handle = __new()
  }

  fun addCustomSignal(name: String) {
    val _arg = Variant(name)
    __method_bind.addCustomSignal.call(this._handle, listOf(_arg))
  }

  fun addFunction(name: String) {
    val _arg = Variant(name)
    __method_bind.addFunction.call(this._handle, listOf(_arg))
  }

  fun addNode(
    func: String,
    id: Int,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0, 0)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(node))
    _args.add(Variant.fromAny(position))
    __method_bind.addNode.call(this._handle, _args)
  }

  fun addVariable(
    name: String,
    defaultValue: Variant,
    export: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(defaultValue))
    _args.add(Variant.fromAny(export))
    __method_bind.addVariable.call(this._handle, _args)
  }

  fun customSignalAddArgument(
    name: String,
    type: Int,
    argname: String,
    index: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(argname))
    _args.add(Variant.fromAny(index))
    __method_bind.customSignalAddArgument.call(this._handle, _args)
  }

  fun customSignalGetArgumentCount(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.customSignalGetArgumentCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun customSignalGetArgumentName(name: String, argidx: Int): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    val _ret = __method_bind.customSignalGetArgumentName.call(this._handle, _args)
    return _ret.asString()
  }

  fun customSignalGetArgumentType(name: String, argidx: Int): Variant.Type {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    val _ret = __method_bind.customSignalGetArgumentType.call(this._handle, _args)
    return Variant.Type.from(_ret.asInt())
  }

  fun customSignalRemoveArgument(name: String, argidx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    __method_bind.customSignalRemoveArgument.call(this._handle, _args)
  }

  fun customSignalSetArgumentName(
    name: String,
    argidx: Int,
    argname: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    _args.add(Variant.fromAny(argname))
    __method_bind.customSignalSetArgumentName.call(this._handle, _args)
  }

  fun customSignalSetArgumentType(
    name: String,
    argidx: Int,
    type: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    _args.add(Variant.fromAny(type))
    __method_bind.customSignalSetArgumentType.call(this._handle, _args)
  }

  fun customSignalSwapArgument(
    name: String,
    argidx: Int,
    withidx: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(argidx))
    _args.add(Variant.fromAny(withidx))
    __method_bind.customSignalSwapArgument.call(this._handle, _args)
  }

  fun dataConnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    __method_bind.dataConnect.call(this._handle, _args)
  }

  fun dataDisconnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    __method_bind.dataDisconnect.call(this._handle, _args)
  }

  fun getFunctionNodeId(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.getFunctionNodeId.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getFunctionScroll(name: String): Vector2 {
    val _arg = Variant(name)
    val _ret = __method_bind.getFunctionScroll.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getNode(func: String, id: Int): VisualScriptNode {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.getNode.call(this._handle, _args)
    return _ret.toAny() as VisualScriptNode
  }

  fun getNodePosition(func: String, id: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.getNodePosition.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getVariableDefaultValue(name: String): Variant {
    val _arg = Variant(name)
    val _ret = __method_bind.getVariableDefaultValue.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getVariableExport(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.getVariableExport.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getVariableInfo(name: String): Dictionary {
    val _arg = Variant(name)
    val _ret = __method_bind.getVariableInfo.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun hasCustomSignal(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasCustomSignal.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasDataConnection(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    val _ret = __method_bind.hasDataConnection.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasFunction(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasFunction.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasNode(func: String, id: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.hasNode.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasSequenceConnection(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromOutput))
    _args.add(Variant.fromAny(toNode))
    val _ret = __method_bind.hasSequenceConnection.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasVariable(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasVariable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeCustomSignal(name: String) {
    val _arg = Variant(name)
    __method_bind.removeCustomSignal.call(this._handle, listOf(_arg))
  }

  fun removeFunction(name: String) {
    val _arg = Variant(name)
    __method_bind.removeFunction.call(this._handle, listOf(_arg))
  }

  fun removeNode(func: String, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    __method_bind.removeNode.call(this._handle, _args)
  }

  fun removeVariable(name: String) {
    val _arg = Variant(name)
    __method_bind.removeVariable.call(this._handle, listOf(_arg))
  }

  fun renameCustomSignal(name: String, newName: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(newName))
    __method_bind.renameCustomSignal.call(this._handle, _args)
  }

  fun renameFunction(name: String, newName: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(newName))
    __method_bind.renameFunction.call(this._handle, _args)
  }

  fun renameVariable(name: String, newName: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(newName))
    __method_bind.renameVariable.call(this._handle, _args)
  }

  fun sequenceConnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromOutput))
    _args.add(Variant.fromAny(toNode))
    __method_bind.sequenceConnect.call(this._handle, _args)
  }

  fun sequenceDisconnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromOutput))
    _args.add(Variant.fromAny(toNode))
    __method_bind.sequenceDisconnect.call(this._handle, _args)
  }

  fun setFunctionScroll(name: String, ofs: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(ofs))
    __method_bind.setFunctionScroll.call(this._handle, _args)
  }

  fun setInstanceBaseType(type: String) {
    val _arg = Variant(type)
    __method_bind.setInstanceBaseType.call(this._handle, listOf(_arg))
  }

  fun setNodePosition(
    func: String,
    id: Int,
    position: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(func))
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(position))
    __method_bind.setNodePosition.call(this._handle, _args)
  }

  fun setVariableDefaultValue(name: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    __method_bind.setVariableDefaultValue.call(this._handle, _args)
  }

  fun setVariableExport(name: String, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(enable))
    __method_bind.setVariableExport.call(this._handle, _args)
  }

  fun setVariableInfo(name: String, value: Dictionary) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    __method_bind.setVariableInfo.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScript
     */
    private object __method_bind {
      val addCustomSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_signal" }
        }
      val addFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_function" }
        }
      val addNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val addVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_variable" }
        }
      val customSignalAddArgument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_add_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_add_argument" }
        }
      val customSignalGetArgumentCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_count" }
        }
      val customSignalGetArgumentName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_name" }
        }
      val customSignalGetArgumentType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_type" }
        }
      val customSignalRemoveArgument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_remove_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_remove_argument" }
        }
      val customSignalSetArgumentName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_set_argument_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_set_argument_name" }
        }
      val customSignalSetArgumentType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_set_argument_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_set_argument_type" }
        }
      val customSignalSwapArgument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_swap_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_swap_argument" }
        }
      val dataConnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "data_connect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method data_connect" }
        }
      val dataDisconnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "data_disconnect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method data_disconnect" }
        }
      val getFunctionNodeId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_function_node_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function_node_id" }
        }
      val getFunctionScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_function_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function_scroll" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val getNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val getVariableDefaultValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_default_value" }
        }
      val getVariableExport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_export".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_export" }
        }
      val getVariableInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_info" }
        }
      val hasCustomSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_custom_signal" }
        }
      val hasDataConnection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_data_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_data_connection" }
        }
      val hasFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_function" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node" }
        }
      val hasSequenceConnection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_sequence_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_sequence_connection" }
        }
      val hasVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_variable" }
        }
      val removeCustomSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_signal" }
        }
      val removeFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_function" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val removeVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_variable" }
        }
      val renameCustomSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_custom_signal" }
        }
      val renameFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_function" }
        }
      val renameVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_variable" }
        }
      val sequenceConnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "sequence_connect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sequence_connect" }
        }
      val sequenceDisconnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "sequence_disconnect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sequence_disconnect" }
        }
      val setFunctionScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_function_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function_scroll" }
        }
      val setInstanceBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_instance_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_base_type" }
        }
      val setNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }
      val setVariableDefaultValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_default_value" }
        }
      val setVariableExport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_export".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_export" }
        }
      val setVariableInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_info" }
        }}
  }
}
