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

open class ResourceInteractiveLoader internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for ResourceInteractiveLoader
     */
    private object __method_bind {
      val get_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
              "get_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource" }
            }
          }

      val get_stage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
              "get_stage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stage" }
            }
          }

      val get_stage_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
              "get_stage_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stage_count" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val wait: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
              "wait".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method wait" }
            }
          }
    }
  }
}
