// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorVCSInterface(
  _handle: COpaquePointer
) : Object(_handle) {
  fun commit(msg: String) {
    val _arg = Variant.new(msg)
    __method_bind.commit.call(this._handle, listOf(_arg))
  }

  fun getFileDiff(filePath: String): VariantArray {
    val _arg = Variant.new(filePath)
    val _ret = __method_bind.getFileDiff.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getModifiedFilesData(): Dictionary {
    val _ret = __method_bind.getModifiedFilesData.call(this._handle)
    return _ret.asDictionary()
  }

  fun getProjectName(): String {
    val _ret = __method_bind.getProjectName.call(this._handle)
    return _ret.asString()
  }

  fun getVcsName(): String {
    val _ret = __method_bind.getVcsName.call(this._handle)
    return _ret.asString()
  }

  fun initialize(projectRootPath: String): Boolean {
    val _arg = Variant.new(projectRootPath)
    val _ret = __method_bind.initialize.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isAddonReady(): Boolean {
    val _ret = __method_bind.isAddonReady.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVcsInitialized(): Boolean {
    val _ret = __method_bind.isVcsInitialized.call(this._handle)
    return _ret.asBoolean()
  }

  fun shutDown(): Boolean {
    val _ret = __method_bind.shutDown.call(this._handle)
    return _ret.asBoolean()
  }

  fun stageFile(filePath: String) {
    val _arg = Variant.new(filePath)
    __method_bind.stageFile.call(this._handle, listOf(_arg))
  }

  fun unstageFile(filePath: String) {
    val _arg = Variant.new(filePath)
    __method_bind.unstageFile.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorVCSInterface
     */
    private object __method_bind {
      val commit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "commit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit" }
        }
      val getFileDiff: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "get_file_diff".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_file_diff" }
        }
      val getModifiedFilesData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "get_modified_files_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modified_files_data" }
        }
      val getProjectName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "get_project_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_project_name" }
        }
      val getVcsName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "get_vcs_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vcs_name" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val isAddonReady: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "is_addon_ready".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_addon_ready" }
        }
      val isVcsInitialized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "is_vcs_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vcs_initialized" }
        }
      val shutDown: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "shut_down".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shut_down" }
        }
      val stageFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "stage_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stage_file" }
        }
      val unstageFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorVCSInterface".cstr.ptr,
            "unstage_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unstage_file" }
        }}
  }
}
