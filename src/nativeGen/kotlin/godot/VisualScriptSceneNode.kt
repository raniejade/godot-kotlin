// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSceneNode internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getNodePath(): NodePath {
    TODO()
  }

  fun setNodePath() {
    TODO()
  }

  companion object {
    fun new(): VisualScriptSceneNode = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSceneNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptSceneNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSceneNode(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptSceneNode
     */
    private object __method_bind {
      val get_node_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
              "get_node_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_path" }
            }
          }

      val set_node_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSceneNode".cstr.ptr,
              "set_node_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_path" }
            }
          }
    }
  }
}
