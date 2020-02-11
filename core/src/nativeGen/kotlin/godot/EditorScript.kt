// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class EditorScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addRootNode(node: Node) {
    val _arg = Variant(node)
    __method_bind.addRootNode.call(this._handle, listOf(_arg))
  }

  fun getEditorInterface(): EditorInterface {
    val _ret = __method_bind.getEditorInterface.call(this._handle)
    return _ret.toAny() as EditorInterface
  }

  fun getScene(): Node {
    val _ret = __method_bind.getScene.call(this._handle)
    return _ret.toAny() as Node
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorScript
     */
    private object __method_bind {
      val addRootNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
            "add_root_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_root_node" }
        }
      val getEditorInterface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
            "get_editor_interface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_interface" }
        }
      val getScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
            "get_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scene" }
        }}
  }
}
