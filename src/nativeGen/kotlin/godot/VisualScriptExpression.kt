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

open class VisualScriptExpression(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptExpression = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptExpression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptExpression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptExpression(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptExpression = VisualScriptExpression(ptr)
    /**
     * Container for method_bind pointers for VisualScriptExpression
     */
    private object __method_bind
  }
}
