// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class EditorVCSInterface(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _commit(msg: String) {
    TODO()
  }

  open fun _get_file_diff(filePath: String): VariantArray {
    TODO()
  }

  open fun _get_modified_files_data(): Dictionary {
    TODO()
  }

  open fun _get_project_name(): String {
    TODO()
  }

  open fun _get_vcs_name(): String {
    TODO()
  }

  open fun _initialize(projectRootPath: String): Boolean {
    TODO()
  }

  open fun _is_vcs_initialized(): Boolean {
    TODO()
  }

  open fun _shut_down(): Boolean {
    TODO()
  }

  open fun _stage_file(filePath: String) {
    TODO()
  }

  open fun _unstage_file(filePath: String) {
    TODO()
  }

  fun commit(msg: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.commit.call(self._handle, listOf(msg), null)
    }
  }

  fun getFileDiff(filePath: String): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getFileDiff.call(self._handle, listOf(filePath), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getModifiedFilesData(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getModifiedFilesData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getProjectName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getProjectName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVcsName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getVcsName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun initialize(projectRootPath: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.initialize.call(self._handle, listOf(projectRootPath), _retPtr)
      _ret.value
    }
  }

  fun isAddonReady(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAddonReady.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVcsInitialized(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVcsInitialized.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun shutDown(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.shutDown.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun stageFile(filePath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stageFile.call(self._handle, listOf(filePath), null)
    }
  }

  fun unstageFile(filePath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unstageFile.call(self._handle, listOf(filePath), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorVCSInterface
     */
    private object __method_bind {
      val commit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "commit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit" }
            }
          }

      val getFileDiff: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "get_file_diff".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_file_diff" }
            }
          }

      val getModifiedFilesData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "get_modified_files_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modified_files_data" }
            }
          }

      val getProjectName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "get_project_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_project_name" }
            }
          }

      val getVcsName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "get_vcs_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vcs_name" }
            }
          }

      val initialize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "initialize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method initialize" }
            }
          }

      val isAddonReady: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "is_addon_ready".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_addon_ready" }
            }
          }

      val isVcsInitialized: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "is_vcs_initialized".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_vcs_initialized" }
            }
          }

      val shutDown: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "shut_down".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shut_down" }
            }
          }

      val stageFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "stage_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stage_file" }
            }
          }

      val unstageFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
              "unstage_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unstage_file" }
            }
          }
    }
  }
}
