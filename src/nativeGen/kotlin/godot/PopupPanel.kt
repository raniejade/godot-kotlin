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

open class PopupPanel internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  companion object {
    fun new(): PopupPanel = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PopupPanel".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PopupPanel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PopupPanel(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PopupPanel = PopupPanel(ptr)
    /**
     * Container for method_bind pointers for PopupPanel
     */
    private object __method_bind
  }
}
