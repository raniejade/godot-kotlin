// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSelection internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.add_node.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getSelectedNodes(): VariantArray {
    val _ret = __method_bind.get_selected_nodes.call(this._handle)
    return _ret.asArray()
  }

  fun getTransformableSelectedNodes(): VariantArray {
    val _ret = __method_bind.get_transformable_selected_nodes.call(this._handle)
    return _ret.asArray()
  }

  fun removeNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.remove_node.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): EditorSelection = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSelection".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorSelection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSelection(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorSelection = EditorSelection(ptr)
    /**
     * Container for method_bind pointers for EditorSelection
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val get_selected_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "get_selected_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_nodes" }
        }
      val get_transformable_selected_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "get_transformable_selected_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transformable_selected_nodes" }
        }
      val remove_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }}
  }
}
