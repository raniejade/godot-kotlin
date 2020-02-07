// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class _Directory(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun changeDir(todir: String): GDError {
    val _arg = Variant(todir)
    val _ret = __method_bind.changeDir.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun copy(from: String, to: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.copy.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun currentIsDir(): Boolean {
    val _ret = __method_bind.currentIsDir.call(this._handle)
    return _ret.asBoolean()
  }

  fun dirExists(path: String): Boolean {
    val _arg = Variant(path)
    val _ret = __method_bind.dirExists.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun fileExists(path: String): Boolean {
    val _arg = Variant(path)
    val _ret = __method_bind.fileExists.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.getCurrentDir.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentDrive(): Int {
    val _ret = __method_bind.getCurrentDrive.call(this._handle)
    return _ret.asInt()
  }

  fun getDrive(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getDrive.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getDriveCount(): Int {
    val _ret = __method_bind.getDriveCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNext(): String {
    val _ret = __method_bind.getNext.call(this._handle)
    return _ret.asString()
  }

  fun getSpaceLeft(): Int {
    val _ret = __method_bind.getSpaceLeft.call(this._handle)
    return _ret.asInt()
  }

  fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skipNavigational))
    _args.add(Variant.fromAny(skipHidden))
    val _ret = __method_bind.listDirBegin.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun listDirEnd() {
    __method_bind.listDirEnd.call(this._handle)
  }

  fun makeDir(path: String): GDError {
    val _arg = Variant(path)
    val _ret = __method_bind.makeDir.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun makeDirRecursive(path: String): GDError {
    val _arg = Variant(path)
    val _ret = __method_bind.makeDirRecursive.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun open(path: String): GDError {
    val _arg = Variant(path)
    val _ret = __method_bind.open.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun remove(path: String): GDError {
    val _arg = Variant(path)
    val _ret = __method_bind.remove.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun rename(from: String, to: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.rename.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Directory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _Directory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for _Directory
     */
    private object __method_bind {
      val changeDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "change_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method change_dir" }
        }
      val copy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "copy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy" }
        }
      val currentIsDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "current_is_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method current_is_dir" }
        }
      val dirExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "dir_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dir_exists" }
        }
      val fileExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "file_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method file_exists" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val getCurrentDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_drive" }
        }
      val getDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val getDriveCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive_count" }
        }
      val getNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next" }
        }
      val getSpaceLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_space_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_left" }
        }
      val listDirBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_begin" }
        }
      val listDirEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_end" }
        }
      val makeDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "make_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_dir" }
        }
      val makeDirRecursive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "make_dir_recursive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_dir_recursive" }
        }
      val open: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open" }
        }
      val remove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove" }
        }
      val rename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "rename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename" }
        }}
  }
}
