// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.find_dir_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun findFileIndex(name: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.find_file_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFile(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFileCount(): Int {
    val _ret = __method_bind.get_file_count.call(this.toVariant())
    TODO()
  }

  fun getFileImportIsValid(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file_import_is_valid.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFilePath(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFileScriptClassExtends(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file_script_class_extends.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun getFileScriptClassName(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file_script_class_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFileType(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_file_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getName(): String {
    val _ret = __method_bind.get_name.call(this.toVariant())
    TODO()
  }

  fun getParent(): EditorFileSystemDirectory {
    val _ret = __method_bind.get_parent.call(this.toVariant())
    TODO()
  }

  fun getPath(): String {
    val _ret = __method_bind.get_path.call(this.toVariant())
    TODO()
  }

  fun getSubdir(idx: Int): EditorFileSystemDirectory {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_subdir.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getSubdirCount(): Int {
    val _ret = __method_bind.get_subdir_count.call(this.toVariant())
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
