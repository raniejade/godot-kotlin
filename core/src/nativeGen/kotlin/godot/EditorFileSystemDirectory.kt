// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorFileSystemDirectory(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun findDirIndex(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.findDirIndex.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun findFileIndex(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.findFileIndex.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getFile(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFile.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getFileCount(): Int {
    val _ret = __method_bind.getFileCount.call(this._handle)
    return _ret.asInt()
  }

  fun getFileImportIsValid(idx: Int): Boolean {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFileImportIsValid.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getFilePath(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFilePath.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getFileScriptClassExtends(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFileScriptClassExtends.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getFileScriptClassName(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFileScriptClassName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getFileType(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFileType.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getParent(): EditorFileSystemDirectory {
    val _ret = __method_bind.getParent.call(this._handle)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getPath(): String {
    val _ret = __method_bind.getPath.call(this._handle)
    return _ret.asString()
  }

  fun getSubdir(idx: Int): EditorFileSystemDirectory {
    val _arg = Variant(idx)
    val _ret = __method_bind.getSubdir.call(this._handle, listOf(_arg))
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getSubdirCount(): Int {
    val _ret = __method_bind.getSubdirCount.call(this._handle)
    return _ret.asInt()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystemDirectory
     */
    private object __method_bind {
      val findDirIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "find_dir_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_dir_index" }
        }
      val findFileIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "find_file_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_file_index" }
        }
      val getFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file" }
        }
      val getFileCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_count" }
        }
      val getFileImportIsValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_import_is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_import_is_valid" }
        }
      val getFilePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_path" }
        }
      val getFileScriptClassExtends: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_script_class_extends".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_script_class_extends" }
        }
      val getFileScriptClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_script_class_name" }
        }
      val getFileType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_type" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getSubdir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_subdir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdir" }
        }
      val getSubdirCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_subdir_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdir_count" }
        }}
  }
}
