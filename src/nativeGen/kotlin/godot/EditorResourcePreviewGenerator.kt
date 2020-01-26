// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorResourcePreviewGenerator internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun canGenerateSmallPreview(): Boolean {
    TODO()
  }

  fun generate(): Texture {
    TODO()
  }

  fun generateFromPath(): Texture {
    TODO()
  }

  fun generateSmallPreviewAutomatically(): Boolean {
    TODO()
  }

  fun handles(): Boolean {
    TODO()
  }

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
    private object __method_bind {
      val can_generate_small_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreviewGenerator".cstr.ptr,
              "can_generate_small_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_generate_small_preview" }
            }
          }

      val generate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreviewGenerator".cstr.ptr,
              "generate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate" }
            }
          }

      val generate_from_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreviewGenerator".cstr.ptr,
              "generate_from_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_from_path" }
            }
          }

      val generate_small_preview_automatically: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreviewGenerator".cstr.ptr,
              "generate_small_preview_automatically".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method generate_small_preview_automatically" }
            }
          }

      val handles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreviewGenerator".cstr.ptr,
              "handles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method handles" }
            }
          }
    }
  }
}
