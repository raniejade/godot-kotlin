// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
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

open class EditorFileSystemDirectory(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun findDirIndex(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findDirIndex.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun findFileIndex(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findFileIndex.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getFile(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFile.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFileCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFileCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFileImportIsValid(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFileImportIsValid.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getFilePath(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFilePath.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFileScriptClassExtends(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFileScriptClassExtends.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFileScriptClassName(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFileScriptClassName.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFileType(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFileType.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getParent(): EditorFileSystemDirectory {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorFileSystemDirectory
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParent.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorFileSystemDirectory>(_tmp.value!!)
      _ret
    }
  }

  fun getPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSubdir(idx: Int): EditorFileSystemDirectory {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorFileSystemDirectory
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSubdir.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<EditorFileSystemDirectory>(_tmp.value!!)
      _ret
    }
  }

  fun getSubdirCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubdirCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorFileSystemDirectory
     */
    private object __method_bind {
      val findDirIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "find_dir_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_dir_index" }
        }
      val findFileIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "find_file_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_file_index" }
        }
      val getFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file" }
        }
      val getFileCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_count" }
        }
      val getFileImportIsValid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_import_is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_import_is_valid" }
        }
      val getFilePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_path" }
        }
      val getFileScriptClassExtends: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_script_class_extends".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_script_class_extends" }
        }
      val getFileScriptClassName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_script_class_name" }
        }
      val getFileType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_file_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_type" }
        }
      val getName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getSubdir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_subdir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdir" }
        }
      val getSubdirCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "get_subdir_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdir_count" }
        }}
  }
}
