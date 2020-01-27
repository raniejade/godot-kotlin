// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSceneTree internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptSceneTree = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSceneTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptSceneTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSceneTree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptSceneTree = VisualScriptSceneTree(ptr)
    /**
     * Container for method_bind pointers for VisualScriptSceneTree
     */
    private object __method_bind
  }
}
