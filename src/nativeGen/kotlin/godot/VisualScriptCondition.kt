// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptCondition internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    fun new(): VisualScriptCondition = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptCondition".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptCondition" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptCondition(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptCondition = VisualScriptCondition(ptr)
    /**
     * Container for method_bind pointers for VisualScriptCondition
     */
    private object __method_bind
  }
}
