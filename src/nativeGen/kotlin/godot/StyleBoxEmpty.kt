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

open class StyleBoxEmpty internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  companion object {
    fun new(): StyleBoxEmpty = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxEmpty".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StyleBoxEmpty" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxEmpty(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxEmpty = StyleBoxEmpty(ptr)
    /**
     * Container for method_bind pointers for StyleBoxEmpty
     */
    private object __method_bind
  }
}
