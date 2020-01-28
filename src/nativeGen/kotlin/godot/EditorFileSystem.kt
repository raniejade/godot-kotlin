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

open class EditorFileSystem(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getFileType(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getFileType.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFilesystem(): EditorFileSystemDirectory {
    val _ret = __method_bind.getFilesystem.call(this._handle)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getFilesystemPath(path: String): EditorFileSystemDirectory {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getFilesystemPath.call(this._handle, _arg, 1)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getScanningProgress(): Float {
    val _ret = __method_bind.getScanningProgress.call(this._handle)
    return _ret.asFloat()
  }

  fun isScanning(): Boolean {
    val _ret = __method_bind.isScanning.call(this._handle)
    return _ret.asBoolean()
  }

  fun scan() {
    __method_bind.scan.call(this._handle)
  }

  fun scanSources() {
    __method_bind.scanSources.call(this._handle)
  }

  fun updateFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.updateFile.call(this._handle, _arg, 1)
  }

  fun updateScriptClasses() {
    __method_bind.updateScriptClasses.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystem
     */
    private object __method_bind {
      val getFileType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "getFileType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileType" }
        }
      val getFilesystem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "getFilesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilesystem" }
        }
      val getFilesystemPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "getFilesystemPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilesystemPath" }
        }
      val getScanningProgress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "getScanningProgress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScanningProgress" }
        }
      val isScanning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "isScanning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScanning" }
        }
      val scan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan" }
        }
      val scanSources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scanSources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scanSources" }
        }
      val updateFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "updateFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateFile" }
        }
      val updateScriptClasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "updateScriptClasses".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateScriptClasses" }
        }}
  }
}
