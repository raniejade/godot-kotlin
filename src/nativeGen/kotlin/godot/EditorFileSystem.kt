// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorFileSystem internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getFileType(): String {
    TODO()
  }

  fun getFilesystem(): EditorFileSystemDirectory {
    TODO()
  }

  fun getFilesystemPath(): EditorFileSystemDirectory {
    TODO()
  }

  fun getScanningProgress(): Float {
    TODO()
  }

  fun isScanning(): Boolean {
    TODO()
  }

  fun scan() {
    TODO()
  }

  fun scanSources() {
    TODO()
  }

  fun updateFile() {
    TODO()
  }

  fun updateScriptClasses() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystem
     */
    private object __method_bind {
      val get_file_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "get_file_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_type" }
            }
          }

      val get_filesystem: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "get_filesystem".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filesystem" }
            }
          }

      val get_filesystem_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "get_filesystem_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filesystem_path" }
            }
          }

      val get_scanning_progress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "get_scanning_progress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scanning_progress" }
            }
          }

      val is_scanning: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "is_scanning".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_scanning" }
            }
          }

      val scan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "scan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scan" }
            }
          }

      val scan_sources: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "scan_sources".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scan_sources" }
            }
          }

      val update_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "update_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_file" }
            }
          }

      val update_script_classes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
              "update_script_classes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_script_classes" }
            }
          }
    }
  }
}
