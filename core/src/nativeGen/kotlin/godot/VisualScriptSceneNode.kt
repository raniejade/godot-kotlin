// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSceneNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var nodePath: NodePath
    get() {
       return getNodePath() 
    }
    set(value) {
      setNodePath(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for nodePath
   */
  fun nodePath(cb: NodePath.() -> Unit) {
    val _p = nodePath
    cb(_p)
    nodePath = _p
  }

  fun getNodePath(): NodePath {
    val _ret = __method_bind.getNodePath.call(this._handle)
    return _ret.asNodePath()
  }

  fun setNodePath(path: NodePath) {
    val _arg = Variant(path)
    __method_bind.setNodePath.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSceneNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptSceneNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptSceneNode
     */
    private object __method_bind {
      val getNodePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
            "get_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_path" }
        }
      val setNodePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
            "set_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_path" }
        }}
  }
}
