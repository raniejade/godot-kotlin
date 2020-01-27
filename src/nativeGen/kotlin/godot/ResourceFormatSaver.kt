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

open class ResourceFormatSaver internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): ResourceFormatSaver = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourceFormatSaver".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ResourceFormatSaver" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourceFormatSaver(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ResourceFormatSaver = ResourceFormatSaver(ptr)
    /**
     * Container for method_bind pointers for ResourceFormatSaver
     */
    private object __method_bind
  }
}
