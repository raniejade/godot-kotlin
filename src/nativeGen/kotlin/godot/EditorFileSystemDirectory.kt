// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorFileSystemDirectory internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun findDirIndex(name: String): Int {
    TODO()
  }

  fun findFileIndex(name: String): Int {
    TODO()
  }

  fun getFile(idx: Int): String {
    TODO()
  }

  fun getFileCount(): Int {
    TODO()
  }

  fun getFileImportIsValid(idx: Int): Boolean {
    TODO()
  }

  fun getFilePath(idx: Int): String {
    TODO()
  }

  fun getFileScriptClassExtends(idx: Int): String {
    TODO()
  }

  fun getFileScriptClassName(idx: Int): String {
    TODO()
  }

  fun getFileType(idx: Int): String {
    TODO()
  }

  fun getName(): String {
    TODO()
  }

  fun getParent(): EditorFileSystemDirectory {
    TODO()
  }

  fun getPath(): String {
    TODO()
  }

  fun getSubdir(idx: Int): EditorFileSystemDirectory {
    TODO()
  }

  fun getSubdirCount(): Int {
    TODO()
  }

  companion object {
    fun new(): EditorFileSystemDirectory = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFileSystemDirectory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorFileSystemDirectory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFileSystemDirectory(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorFileSystemDirectory = EditorFileSystemDirectory(ptr)
    /**
     * Container for method_bind pointers for EditorFileSystemDirectory
     */
    private object __method_bind {
      val find_dir_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "find_dir_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_dir_index" }
            }
          }

      val find_file_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "find_file_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_file_index" }
            }
          }

      val get_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file" }
            }
          }

      val get_file_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_count" }
            }
          }

      val get_file_import_is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_import_is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_import_is_valid" }
            }
          }

      val get_file_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_path" }
            }
          }

      val get_file_script_class_extends: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_script_class_extends".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_script_class_extends"
              }
            }
          }

      val get_file_script_class_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_script_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_script_class_name" }
            }
          }

      val get_file_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_file_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_type" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent" }
            }
          }

      val get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path" }
            }
          }

      val get_subdir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_subdir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdir" }
            }
          }

      val get_subdir_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
              "get_subdir_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdir_count" }
            }
          }
    }
  }
}
