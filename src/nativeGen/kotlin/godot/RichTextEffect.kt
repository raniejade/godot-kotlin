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

open class RichTextEffect(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): RichTextEffect = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RichTextEffect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RichTextEffect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RichTextEffect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RichTextEffect = RichTextEffect(ptr)
    /**
     * Container for method_bind pointers for RichTextEffect
     */
    private object __method_bind
  }
}
