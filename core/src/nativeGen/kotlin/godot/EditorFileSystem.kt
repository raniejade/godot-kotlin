// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class EditorFileSystem(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  /**
   * EditorFileSystem::filesystem_changed signal
   */
  val signalFilesystemChanged: Signal0 = Signal0("filesystem_changed")

  /**
   * EditorFileSystem::resources_reimported signal
   */
  val signalResourcesReimported: Signal1<PoolStringArray> = Signal1("resources_reimported")

  /**
   * EditorFileSystem::resources_reload signal
   */
  val signalResourcesReload: Signal1<PoolStringArray> = Signal1("resources_reload")

  /**
   * EditorFileSystem::sources_changed signal
   */
  val signalSourcesChanged: Signal1<Boolean> = Signal1("sources_changed")

  constructor() : this(null) {
    _handle = __new()
  }

  fun getFileType(path: String): String {
    val _arg = Variant(path)
    val _ret = __method_bind.getFileType.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getFilesystem(): EditorFileSystemDirectory {
    val _ret = __method_bind.getFilesystem.call(this._handle)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getFilesystemPath(path: String): EditorFileSystemDirectory {
    val _arg = Variant(path)
    val _ret = __method_bind.getFilesystemPath.call(this._handle, listOf(_arg))
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
    val _arg = Variant(path)
    __method_bind.updateFile.call(this._handle, listOf(_arg))
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
            "get_file_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_type" }
        }
      val getFilesystem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem" }
        }
      val getFilesystemPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem_path" }
        }
      val getScanningProgress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_scanning_progress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scanning_progress" }
        }
      val isScanning: CPointer<godot_method_bind>
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
      val scanSources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan_sources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan_sources" }
        }
      val updateFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_file" }
        }
      val updateScriptClasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_script_classes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_script_classes" }
        }}
  }
}
