// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptResourcePath internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getResourcePath(): String {
    TODO()
  }

  fun setResourcePath(path: String) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptResourcePath = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptResourcePath".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptResourcePath" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptResourcePath(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptResourcePath
     */
    private object __method_bind {
      val get_resource_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptResourcePath".cstr.ptr,
              "get_resource_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_path" }
            }
          }

      val set_resource_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptResourcePath".cstr.ptr,
              "set_resource_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resource_path" }
            }
          }
    }
  }
}
