// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFileType(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFileType.call(self._handle, listOf(path), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFilesystem(): EditorFileSystemDirectory {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorFileSystemDirectory
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFilesystem.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorFileSystemDirectory>(_tmp.value!!)
      _ret
    }
  }

  fun getFilesystemPath(path: String): EditorFileSystemDirectory {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorFileSystemDirectory
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFilesystemPath.call(self._handle, listOf(path), _retPtr)
      _ret = objectToType<EditorFileSystemDirectory>(_tmp.value!!)
      _ret
    }
  }

  fun getScanningProgress(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScanningProgress.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isScanning(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScanning.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun scan() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.scan.call(self._handle, emptyList(), null)
    }
  }

  fun scanSources() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.scanSources.call(self._handle, emptyList(), null)
    }
  }

  fun updateFile(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateFile.call(self._handle, listOf(path), null)
    }
  }

  fun updateScriptClasses() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateScriptClasses.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystem
     */
    private object __method_bind {
      val getFileType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_file_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_type" }
        }
      val getFilesystem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem" }
        }
      val getFilesystemPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_filesystem_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filesystem_path" }
        }
      val getScanningProgress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "get_scanning_progress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scanning_progress" }
        }
      val isScanning: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "is_scanning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scanning" }
        }
      val scan: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan" }
        }
      val scanSources: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "scan_sources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scan_sources" }
        }
      val updateFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_file" }
        }
      val updateScriptClasses: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystem".cstr.ptr,
            "update_script_classes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_script_classes" }
        }}
  }
}
