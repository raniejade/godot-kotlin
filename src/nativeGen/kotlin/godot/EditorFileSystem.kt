// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun getFileType(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.get_file_type.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFilesystem(): EditorFileSystemDirectory {
    val _ret = __method_bind.get_filesystem.call(this._handle)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getFilesystemPath(path: String): EditorFileSystemDirectory {
    val _arg = Variant.new(path)
    val _ret = __method_bind.get_filesystem_path.call(this._handle, _arg, 1)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getScanningProgress(): Float {
    val _ret = __method_bind.get_scanning_progress.call(this._handle)
    return _ret.asFloat()
  }

  fun isScanning(): Boolean {
    val _ret = __method_bind.is_scanning.call(this._handle)
    return _ret.asBool()
  }

  fun scan() {
    __method_bind.scan.call(this._handle)
  }

  fun scanSources() {
    __method_bind.scan_sources.call(this._handle)
  }

  fun updateFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.update_file.call(this._handle, _arg, 1)
  }

  fun updateScriptClasses() {
    __method_bind.update_script_classes.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystem
     */
    private object __method_bind {
      val get_file_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_file_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_type" }
        }
      val get_filesystem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem" }
        }
      val get_filesystem_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem_path" }
        }
      val get_scanning_progress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_scanning_progress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scanning_progress" }
        }
      val is_scanning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "is_scanning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scanning" }
        }
      val scan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan" }
        }
      val scan_sources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan_sources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan_sources" }
        }
      val update_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_file" }
        }
      val update_script_classes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_script_classes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_script_classes" }
        }}
  }
}
