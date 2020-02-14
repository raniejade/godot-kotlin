// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class VisualScriptEditorInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * VisualScriptEditor::custom_nodes_updated signal
   */
  val signalCustomNodesUpdated: Signal0 = Signal0("custom_nodes_updated")

  fun addCustomNode(
    name: String,
    category: String,
    script: Script
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(category)
      _args.add(script)
      __method_bind.addCustomNode.call(self._handle, _args, null)
    }
  }

  fun removeCustomNode(name: String, category: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(category)
      __method_bind.removeCustomNode.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptEditor
     */
    private object __method_bind {
      val addCustomNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
            "add_custom_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_node" }
        }
      val removeCustomNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
            "remove_custom_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_custom_node" }
        }}
  }
}

object VisualScriptEditor : VisualScriptEditorInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("VisualScriptEditor".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton VisualScriptEditor" }
      _handle = handle
    }
  }
}
