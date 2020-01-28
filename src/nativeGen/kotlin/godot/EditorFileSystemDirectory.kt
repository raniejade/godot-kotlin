// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class EditorFileSystemDirectory(
  _handle: COpaquePointer
) : Object(_handle) {
  fun findDirIndex(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findDirIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun findFileIndex(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findFileIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getFile(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFile.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFileCount(): Int {
    val _ret = __method_bind.getFileCount.call(this._handle)
    return _ret.asInt()
  }

  fun getFileImportIsValid(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFileImportIsValid.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getFilePath(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFilePath.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFileScriptClassExtends(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFileScriptClassExtends.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFileScriptClassName(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFileScriptClassName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getFileType(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFileType.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getParent(): EditorFileSystemDirectory {
    val _ret = __method_bind.getParent.call(this._handle)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getPath(): String {
    val _ret = __method_bind.getPath.call(this._handle)
    return _ret.asString()
  }

  fun getSubdir(idx: Int): EditorFileSystemDirectory {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSubdir.call(this._handle, _arg, 1)
    return _ret.asObject(::EditorFileSystemDirectory)!!
  }

  fun getSubdirCount(): Int {
    val _ret = __method_bind.getSubdirCount.call(this._handle)
    return _ret.asInt()
  }

  companion object {
    fun new(): EditorFileSystemDirectory = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFileSystemDirectory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorFileSystemDirectory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFileSystemDirectory(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorFileSystemDirectory = EditorFileSystemDirectory(ptr)
    /**
     * Container for method_bind pointers for EditorFileSystemDirectory
     */
    private object __method_bind {
      val findDirIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "findDirIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findDirIndex" }
        }
      val findFileIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "findFileIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findFileIndex" }
        }
      val getFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFile" }
        }
      val getFileCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFileCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileCount" }
        }
      val getFileImportIsValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFileImportIsValid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileImportIsValid" }
        }
      val getFilePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFilePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilePath" }
        }
      val getFileScriptClassExtends: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFileScriptClassExtends".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileScriptClassExtends" }
        }
      val getFileScriptClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFileScriptClassName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileScriptClassName" }
        }
      val getFileType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getFileType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFileType" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getName" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPath" }
        }
      val getSubdir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getSubdir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdir" }
        }
      val getSubdirCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileSystemDirectory".cstr.ptr,
            "getSubdirCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdirCount" }
        }}
  }
}
