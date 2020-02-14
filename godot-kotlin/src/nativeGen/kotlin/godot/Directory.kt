// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
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

open class Directory(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun changeDir(todir: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.changeDir.call(self._handle, listOf(todir), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun copy(from: String, to: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.copy.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun currentIsDir(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.currentIsDir.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun dirExists(path: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.dirExists.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun fileExists(path: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.fileExists.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun getCurrentDir(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentDir.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCurrentDrive(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentDrive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDrive(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getDrive.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getDriveCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDriveCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNext(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNext.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSpaceLeft(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpaceLeft.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(skipNavigational)
      _args.add(skipHidden)
      __method_bind.listDirBegin.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun listDirEnd() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.listDirEnd.call(self._handle, emptyList(), null)
    }
  }

  fun makeDir(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.makeDir.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun makeDirRecursive(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.makeDirRecursive.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun open(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.open.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun remove(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.remove.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun rename(from: String, to: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.rename.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Directory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Directory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Directory
     */
    private object __method_bind {
      val changeDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "change_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method change_dir" }
        }
      val copy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "copy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy" }
        }
      val currentIsDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "current_is_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method current_is_dir" }
        }
      val dirExists: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "dir_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dir_exists" }
        }
      val fileExists: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "file_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method file_exists" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val getCurrentDrive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_drive" }
        }
      val getDrive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val getDriveCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive_count" }
        }
      val getNext: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next" }
        }
      val getSpaceLeft: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_space_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_left" }
        }
      val listDirBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_begin" }
        }
      val listDirEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_end" }
        }
      val makeDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "make_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_dir" }
        }
      val makeDirRecursive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "make_dir_recursive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_dir_recursive" }
        }
      val open: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open" }
        }
      val remove: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove" }
        }
      val rename: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "rename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename" }
        }}
  }
}
