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

open class TextFile internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): TextFile = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextFile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TextFile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextFile(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TextFile
     */
    private object __method_bind
  }
}
