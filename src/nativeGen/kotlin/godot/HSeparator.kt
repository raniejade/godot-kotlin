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

open class HSeparator internal constructor(
  _handle: COpaquePointer
) : Separator(_handle) {
  companion object {
    fun new(): HSeparator = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HSeparator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HSeparator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HSeparator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HSeparator = HSeparator(ptr)
    /**
     * Container for method_bind pointers for HSeparator
     */
    private object __method_bind
  }
}
