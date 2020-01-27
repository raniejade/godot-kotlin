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

open class HScrollBar internal constructor(
  _handle: COpaquePointer
) : ScrollBar(_handle) {
  companion object {
    fun new(): HScrollBar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HScrollBar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HScrollBar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HScrollBar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HScrollBar = HScrollBar(ptr)
    /**
     * Container for method_bind pointers for HScrollBar
     */
    private object __method_bind
  }
}
