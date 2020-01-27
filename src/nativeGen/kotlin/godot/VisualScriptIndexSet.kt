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

open class VisualScriptIndexSet(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptIndexSet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptIndexSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptIndexSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptIndexSet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptIndexSet = VisualScriptIndexSet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptIndexSet
     */
    private object __method_bind
  }
}
