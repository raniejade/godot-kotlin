// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInspector internal constructor(
  _handle: COpaquePointer
) : ScrollContainer(_handle) {
  fun refresh() {
    TODO()
  }

  companion object {
    fun new(): EditorInspector = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorInspector".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorInspector" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorInspector(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorInspector
     */
    private object __method_bind {
      val refresh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "refresh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method refresh" }
            }
          }
    }
  }
}
