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

open class EditorResourceConversionPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): EditorResourceConversionPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorResourceConversionPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorResourceConversionPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorResourceConversionPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorResourceConversionPlugin =
        EditorResourceConversionPlugin(ptr)
    /**
     * Container for method_bind pointers for EditorResourceConversionPlugin
     */
    private object __method_bind
  }
}
