// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
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

open class VisualScript internal constructor(
  _handle: COpaquePointer
) : Script(_handle) {
  fun getData(): Dictionary {
    TODO()
  }

  fun nodePortsChanged() {
    TODO()
  }

  fun setData() {
    TODO()
  }

  fun addCustomSignal() {
    TODO()
  }

  fun addFunction() {
    TODO()
  }

  fun addNode() {
    TODO()
  }

  fun addVariable() {
    TODO()
  }

  fun customSignalAddArgument() {
    TODO()
  }

  fun customSignalGetArgumentCount(): Int {
    TODO()
  }

  fun customSignalGetArgumentName(): String {
    TODO()
  }

  fun customSignalGetArgumentType(): Variant.Type {
    TODO()
  }

  fun customSignalRemoveArgument() {
    TODO()
  }

  fun customSignalSetArgumentName() {
    TODO()
  }

  fun customSignalSetArgumentType() {
    TODO()
  }

  fun customSignalSwapArgument() {
    TODO()
  }

  fun dataConnect() {
    TODO()
  }

  fun dataDisconnect() {
    TODO()
  }

  fun getFunctionNodeId(): Int {
    TODO()
  }

  fun getFunctionScroll(): Vector2 {
    TODO()
  }

  fun getNode(): VisualScriptNode {
    TODO()
  }

  fun getNodePosition(): Vector2 {
    TODO()
  }

  fun getVariableDefaultValue(): Variant {
    TODO()
  }

  fun getVariableExport(): Boolean {
    TODO()
  }

  fun getVariableInfo(): Dictionary {
    TODO()
  }

  fun hasCustomSignal(): Boolean {
    TODO()
  }

  fun hasDataConnection(): Boolean {
    TODO()
  }

  fun hasFunction(): Boolean {
    TODO()
  }

  fun hasNode(): Boolean {
    TODO()
  }

  fun hasSequenceConnection(): Boolean {
    TODO()
  }

  fun hasVariable(): Boolean {
    TODO()
  }

  fun removeCustomSignal() {
    TODO()
  }

  fun removeFunction() {
    TODO()
  }

  fun removeNode() {
    TODO()
  }

  fun removeVariable() {
    TODO()
  }

  fun renameCustomSignal() {
    TODO()
  }

  fun renameFunction() {
    TODO()
  }

  fun renameVariable() {
    TODO()
  }

  fun sequenceConnect() {
    TODO()
  }

  fun sequenceDisconnect() {
    TODO()
  }

  fun setFunctionScroll() {
    TODO()
  }

  fun setInstanceBaseType() {
    TODO()
  }

  fun setNodePosition() {
    TODO()
  }

  fun setVariableDefaultValue() {
    TODO()
  }

  fun setVariableExport() {
    TODO()
  }

  fun setVariableInfo() {
    TODO()
  }

  companion object {
    fun new(): VisualScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScript(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScript
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _node_ports_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "_node_ports_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _node_ports_changed" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

      val add_custom_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_signal" }
            }
          }

      val add_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_function" }
            }
          }

      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val add_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "add_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_variable" }
            }
          }

      val custom_signal_add_argument: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_add_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_add_argument" }
            }
          }

      val custom_signal_get_argument_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_count" }
            }
          }

      val custom_signal_get_argument_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_name".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_name" }
            }
          }

      val custom_signal_get_argument_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_get_argument_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_get_argument_type" }
            }
          }

      val custom_signal_remove_argument: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_remove_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_remove_argument"
              }
            }
          }

      val custom_signal_set_argument_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_set_argument_name".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_set_argument_name" }
            }
          }

      val custom_signal_set_argument_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_set_argument_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method custom_signal_set_argument_type" }
            }
          }

      val custom_signal_swap_argument: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "custom_signal_swap_argument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method custom_signal_swap_argument" }
            }
          }

      val data_connect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "data_connect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method data_connect" }
            }
          }

      val data_disconnect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "data_disconnect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method data_disconnect" }
            }
          }

      val get_function_node_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_function_node_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function_node_id" }
            }
          }

      val get_function_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_function_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function_scroll" }
            }
          }

      val get_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val get_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val get_variable_default_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_default_value" }
            }
          }

      val get_variable_export: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_export".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_export" }
            }
          }

      val get_variable_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "get_variable_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_variable_info" }
            }
          }

      val has_custom_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_custom_signal" }
            }
          }

      val has_data_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_data_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_data_connection" }
            }
          }

      val has_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_function" }
            }
          }

      val has_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val has_sequence_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_sequence_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_sequence_connection" }
            }
          }

      val has_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "has_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_variable" }
            }
          }

      val remove_custom_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_custom_signal" }
            }
          }

      val remove_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_function" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val remove_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "remove_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_variable" }
            }
          }

      val rename_custom_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_custom_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_custom_signal" }
            }
          }

      val rename_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_function" }
            }
          }

      val rename_variable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "rename_variable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_variable" }
            }
          }

      val sequence_connect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "sequence_connect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sequence_connect" }
            }
          }

      val sequence_disconnect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "sequence_disconnect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sequence_disconnect" }
            }
          }

      val set_function_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_function_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function_scroll" }
            }
          }

      val set_instance_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_instance_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_base_type" }
            }
          }

      val set_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }

      val set_variable_default_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_default_value" }
            }
          }

      val set_variable_export: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_export".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_export" }
            }
          }

      val set_variable_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScript".cstr.ptr,
              "set_variable_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_variable_info" }
            }
          }
    }
  }
}
