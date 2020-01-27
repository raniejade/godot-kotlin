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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScript(
  _handle: COpaquePointer
) : Script(_handle) {
  fun addCustomSignal(name: String) {
    val _arg = Variant.new(name)
    __method_bind.add_custom_signal.call(this._handle, _arg, 1)
  }

  fun addFunction(name: String) {
    val _arg = Variant.new(name)
    __method_bind.add_function.call(this._handle, _arg, 1)
  }

  fun addNode(
    func: String,
    id: Int,
    node: VisualScriptNode,
    position: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    _args.append(node)
    _args.append(position)
    __method_bind.add_node.call(this._handle, _args.toVariant(), 4)
  }

  fun addVariable(
    name: String,
    defaultValue: Variant,
    export: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(defaultValue)
    _args.append(export)
    __method_bind.add_variable.call(this._handle, _args.toVariant(), 3)
  }

  fun customSignalAddArgument(
    name: String,
    type: Int,
    argname: String,
    index: Int
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(argname)
    _args.append(index)
    __method_bind.custom_signal_add_argument.call(this._handle, _args.toVariant(), 4)
  }

  fun customSignalGetArgumentCount(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.custom_signal_get_argument_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun customSignalGetArgumentName(name: String, argidx: Int): String {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    val _ret = __method_bind.custom_signal_get_argument_name.call(this._handle, _args.toVariant(),
        2)
    return _ret.asString()
  }

  fun customSignalGetArgumentType(name: String, argidx: Int): Variant.Type {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    val _ret = __method_bind.custom_signal_get_argument_type.call(this._handle, _args.toVariant(),
        2)
    return Variant.Type.from(_ret.asInt())
  }

  fun customSignalRemoveArgument(name: String, argidx: Int) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    __method_bind.custom_signal_remove_argument.call(this._handle, _args.toVariant(), 2)
  }

  fun customSignalSetArgumentName(
    name: String,
    argidx: Int,
    argname: String
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    _args.append(argname)
    __method_bind.custom_signal_set_argument_name.call(this._handle, _args.toVariant(), 3)
  }

  fun customSignalSetArgumentType(
    name: String,
    argidx: Int,
    type: Int
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    _args.append(type)
    __method_bind.custom_signal_set_argument_type.call(this._handle, _args.toVariant(), 3)
  }

  fun customSignalSwapArgument(
    name: String,
    argidx: Int,
    withidx: Int
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(argidx)
    _args.append(withidx)
    __method_bind.custom_signal_swap_argument.call(this._handle, _args.toVariant(), 3)
  }

  fun dataConnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    __method_bind.data_connect.call(this._handle, _args.toVariant(), 5)
  }

  fun dataDisconnect(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    __method_bind.data_disconnect.call(this._handle, _args.toVariant(), 5)
  }

  fun getFunctionNodeId(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_function_node_id.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getFunctionScroll(name: String): Vector2 {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_function_scroll.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getNode(func: String, id: Int): VisualScriptNode {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    val _ret = __method_bind.get_node.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::VisualScriptNode)!!
  }

  fun getNodePosition(func: String, id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    val _ret = __method_bind.get_node_position.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getVariableDefaultValue(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_variable_default_value.call(this._handle, _arg, 1)
    return _ret
  }

  fun getVariableExport(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_variable_export.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getVariableInfo(name: String): Dictionary {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_variable_info.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun hasCustomSignal(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_custom_signal.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun hasDataConnection(
    func: String,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    val _ret = __method_bind.has_data_connection.call(this._handle, _args.toVariant(), 5)
    return _ret.asBool()
  }

  fun hasFunction(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_function.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun hasNode(func: String, id: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    val _ret = __method_bind.has_node.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun hasSequenceConnection(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromOutput)
    _args.append(toNode)
    val _ret = __method_bind.has_sequence_connection.call(this._handle, _args.toVariant(), 4)
    return _ret.asBool()
  }

  fun hasVariable(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_variable.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun removeCustomSignal(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_custom_signal.call(this._handle, _arg, 1)
  }

  fun removeFunction(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_function.call(this._handle, _arg, 1)
  }

  fun removeNode(func: String, id: Int) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    __method_bind.remove_node.call(this._handle, _args.toVariant(), 2)
  }

  fun removeVariable(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_variable.call(this._handle, _arg, 1)
  }

  fun renameCustomSignal(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.rename_custom_signal.call(this._handle, _args.toVariant(), 2)
  }

  fun renameFunction(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.rename_function.call(this._handle, _args.toVariant(), 2)
  }

  fun renameVariable(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.rename_variable.call(this._handle, _args.toVariant(), 2)
  }

  fun sequenceConnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromOutput)
    _args.append(toNode)
    __method_bind.sequence_connect.call(this._handle, _args.toVariant(), 4)
  }

  fun sequenceDisconnect(
    func: String,
    fromNode: Int,
    fromOutput: Int,
    toNode: Int
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(fromNode)
    _args.append(fromOutput)
    _args.append(toNode)
    __method_bind.sequence_disconnect.call(this._handle, _args.toVariant(), 4)
  }

  fun setFunctionScroll(name: String, ofs: Vector2) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(ofs)
    __method_bind.set_function_scroll.call(this._handle, _args.toVariant(), 2)
  }

  fun setInstanceBaseType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.set_instance_base_type.call(this._handle, _arg, 1)
  }

  fun setNodePosition(
    func: String,
    id: Int,
    position: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(func)
    _args.append(id)
    _args.append(position)
    __method_bind.set_node_position.call(this._handle, _args.toVariant(), 3)
  }

  fun setVariableDefaultValue(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_variable_default_value.call(this._handle, _args.toVariant(), 2)
  }

  fun setVariableExport(name: String, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(enable)
    __method_bind.set_variable_export.call(this._handle, _args.toVariant(), 2)
  }

  fun setVariableInfo(name: String, value: Dictionary) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_variable_info.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): VisualScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScript(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScript = VisualScript(ptr)
    /**
     * Container for method_bind pointers for VisualScript
     */
    private object __method_bind {
      val add_custom_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_signal" }
        }
      val add_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_function" }
        }
      val add_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val add_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "add_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_variable" }
        }
      val custom_signal_add_argument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_add_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_add_argument" }
        }
      val custom_signal_get_argument_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_count" }
        }
      val custom_signal_get_argument_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_name" }
        }
      val custom_signal_get_argument_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_get_argument_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_get_argument_type" }
        }
      val custom_signal_remove_argument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_remove_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_remove_argument" }
        }
      val custom_signal_set_argument_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_set_argument_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_set_argument_name" }
        }
      val custom_signal_set_argument_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_set_argument_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_set_argument_type" }
        }
      val custom_signal_swap_argument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "custom_signal_swap_argument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method custom_signal_swap_argument" }
        }
      val data_connect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "data_connect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method data_connect" }
        }
      val data_disconnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "data_disconnect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method data_disconnect" }
        }
      val get_function_node_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_function_node_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function_node_id" }
        }
      val get_function_scroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_function_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function_scroll" }
        }
      val get_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val get_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val get_variable_default_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_default_value" }
        }
      val get_variable_export: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_export".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_export" }
        }
      val get_variable_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "get_variable_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable_info" }
        }
      val has_custom_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_custom_signal" }
        }
      val has_data_connection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_data_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_data_connection" }
        }
      val has_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_function" }
        }
      val has_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node" }
        }
      val has_sequence_connection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_sequence_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_sequence_connection" }
        }
      val has_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "has_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_variable" }
        }
      val remove_custom_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_signal" }
        }
      val remove_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_function" }
        }
      val remove_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val remove_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "remove_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_variable" }
        }
      val rename_custom_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_custom_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_custom_signal" }
        }
      val rename_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_function" }
        }
      val rename_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "rename_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_variable" }
        }
      val sequence_connect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "sequence_connect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sequence_connect" }
        }
      val sequence_disconnect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "sequence_disconnect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sequence_disconnect" }
        }
      val set_function_scroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_function_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function_scroll" }
        }
      val set_instance_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_instance_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_base_type" }
        }
      val set_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }
      val set_variable_default_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_default_value" }
        }
      val set_variable_export: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_export".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_export" }
        }
      val set_variable_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
            "set_variable_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable_info" }
        }}
  }
}
