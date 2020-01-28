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
    val _ret = __method_bind.changeDir.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.currentIsDir.call(this._handle)
    return _ret.asBoolean()
  }

  fun dirExists(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.dirExists.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun fileExists(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.fileExists.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getDrive.call(this._handle, _arg, 1)
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

  fun listDirBegin(skipNavigational: Boolean, skipHidden: Boolean): GDError {
    val _args = VariantArray.new()
    _args.append(skipNavigational)
    _args.append(skipHidden)
    val _ret = __method_bind.listDirBegin.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun listDirEnd() {
    __method_bind.listDirEnd.call(this._handle)
  }

  fun makeDir(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.makeDir.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun makeDirRecursive(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.makeDirRecursive.call(this._handle, _arg, 1)
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
      val changeDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "changeDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method changeDir" }
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
            "currentIsDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method currentIsDir" }
        }
      val dirExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "dirExists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dirExists" }
        }
      val fileExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "fileExists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fileExists" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getCurrentDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentDir" }
        }
      val getCurrentDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getCurrentDrive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentDrive" }
        }
      val getDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getDrive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrive" }
        }
      val getDriveCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getDriveCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDriveCount" }
        }
      val getNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getNext".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNext" }
        }
      val getSpaceLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "getSpaceLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpaceLeft" }
        }
      val listDirBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "listDirBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listDirBegin" }
        }
      val listDirEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "listDirEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listDirEnd" }
        }
      val makeDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "makeDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeDir" }
        }
      val makeDirRecursive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
            "makeDirRecursive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeDirRecursive" }
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
