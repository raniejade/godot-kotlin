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

open class EditorResourcePreview internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun previewReady() {
    TODO()
  }

  fun addPreviewGenerator() {
    TODO()
  }

  fun checkForInvalidation() {
    TODO()
  }

  fun queueEditedResourcePreview() {
    TODO()
  }

  fun queueResourcePreview() {
    TODO()
  }

  fun removePreviewGenerator() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorResourcePreview
     */
    private object __method_bind {
      val _preview_ready: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "_preview_ready".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _preview_ready" }
            }
          }

      val add_preview_generator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "add_preview_generator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_preview_generator" }
            }
          }

      val check_for_invalidation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "check_for_invalidation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method check_for_invalidation" }
            }
          }

      val queue_edited_resource_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "queue_edited_resource_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_edited_resource_preview"
              }
            }
          }

      val queue_resource_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "queue_resource_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_resource_preview" }
            }
          }

      val remove_preview_generator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
              "remove_preview_generator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_preview_generator" }
            }
          }
    }
  }
}
