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

open class EditorSelection(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.addNode.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getSelectedNodes(): VariantArray {
    val _ret = __method_bind.getSelectedNodes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getTransformableSelectedNodes(): VariantArray {
    val _ret = __method_bind.getTransformableSelectedNodes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun removeNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.removeNode.call(this._handle, _arg, 1)
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
      val addNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "addNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addNode" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getSelectedNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "getSelectedNodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedNodes" }
        }
      val getTransformableSelectedNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "getTransformableSelectedNodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransformableSelectedNodes" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
            "removeNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeNode" }
        }}
  }
}
