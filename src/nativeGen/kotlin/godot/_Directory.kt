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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Directory(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun changeDir(todir: String): GDError {
    val _arg = Variant.new(todir)
    val _ret = __method_bind.change_dir.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun copy(from: String, to: String): GDError {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.copy.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun currentIsDir(): Boolean {
    val _ret = __method_bind.current_is_dir.call(this._handle)
    return _ret.asBool()
  }

  fun dirExists(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.dir_exists.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun fileExists(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.file_exists.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.get_current_dir.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentDrive(): Int {
    val _ret = __method_bind.get_current_drive.call(this._handle)
    return _ret.asInt()
  }

  fun getDrive(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_drive.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getDriveCount(): Int {
    val _ret = __method_bind.get_drive_count.call(this._handle)
    return _ret.asInt()
  }

  fun getNext(): String {
    val _ret = __method_bind.get_next.call(this._handle)
    return _ret.asString()
  }

  fun getSpaceLeft(): Int {
    val _ret = __method_bind.get_space_left.call(this._handle)
    return _ret.asInt()
  }

  fun listDirBegin(skipNavigational: Boolean, skipHidden: Boolean): GDError {
    val _args = VariantArray.new()
    _args.append(skipNavigational)
    _args.append(skipHidden)
    val _ret = __method_bind.list_dir_begin.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun listDirEnd() {
    __method_bind.list_dir_end.call(this._handle)
  }

  fun makeDir(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.make_dir.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun makeDirRecursive(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.make_dir_recursive.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun open(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.open.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun remove(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.remove.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun rename(from: String, to: String): GDError {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.rename.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): _Directory = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Directory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _Directory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Directory(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _Directory = _Directory(ptr)
    /**
     * Container for method_bind pointers for _Directory
     */
    private object __method_bind {
      val change_dir: CPointer<godot_method_bind>
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
      val current_is_dir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "current_is_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method current_is_dir" }
        }
      val dir_exists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "dir_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dir_exists" }
        }
      val file_exists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "file_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method file_exists" }
        }
      val get_current_dir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val get_current_drive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_current_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_drive" }
        }
      val get_drive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val get_drive_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_drive_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive_count" }
        }
      val get_next: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next" }
        }
      val get_space_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "get_space_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_left" }
        }
      val list_dir_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_begin" }
        }
      val list_dir_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "list_dir_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method list_dir_end" }
        }
      val make_dir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "make_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_dir" }
        }
      val make_dir_recursive: CPointer<godot_method_bind>
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
