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

open class VisualScriptWhile(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptWhile = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptWhile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptWhile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptWhile(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptWhile = VisualScriptWhile(ptr)
    /**
     * Container for method_bind pointers for VisualScriptWhile
     */
    private object __method_bind
  }
}
