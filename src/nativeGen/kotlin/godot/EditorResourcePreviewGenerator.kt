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

open class EditorResourcePreviewGenerator internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): EditorResourcePreviewGenerator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorResourcePreviewGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorResourcePreviewGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorResourcePreviewGenerator(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorResourcePreviewGenerator
     */
    private object __method_bind
  }
}
