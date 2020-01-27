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

open class VScrollBar(
  _handle: COpaquePointer
) : ScrollBar(_handle) {
  companion object {
    fun new(): VScrollBar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VScrollBar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VScrollBar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VScrollBar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VScrollBar = VScrollBar(ptr)
    /**
     * Container for method_bind pointers for VScrollBar
     */
    private object __method_bind
  }
}
