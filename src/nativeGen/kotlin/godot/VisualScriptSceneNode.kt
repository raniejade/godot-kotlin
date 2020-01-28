// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSceneNode(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var nodePath: NodePath
    get() {
       return getNodePath() 
    }
    set(value) {
      setNodePath(value)
    }

  fun getNodePath(): NodePath {
    val _ret = __method_bind.getNodePath.call(this._handle)
    return _ret.asNodePath()
  }

  fun setNodePath(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setNodePath.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptSceneNode = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSceneNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptSceneNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSceneNode(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptSceneNode = VisualScriptSceneNode(ptr)
    /**
     * Container for method_bind pointers for VisualScriptSceneNode
     */
    private object __method_bind {
      val getNodePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
            "get_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_path" }
        }
      val setNodePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
            "set_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_path" }
        }}
  }
}
