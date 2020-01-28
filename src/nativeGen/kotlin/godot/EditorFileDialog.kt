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

open class EditorFileDialog(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  var access: Int
    get() {
       return EditorFileDialog.Access.from(getAccess()) 
    }
    set(value) {
      setAccess(EditorFileDialog.Access.from(value))
    }

  var currentDir: String
    get() {
       return getCurrentDir() 
    }
    set(value) {
      setCurrentDir(value)
    }

  var currentFile: String
    get() {
       return getCurrentFile() 
    }
    set(value) {
      setCurrentFile(value)
    }

  var currentPath: String
    get() {
       return getCurrentPath() 
    }
    set(value) {
      setCurrentPath(value)
    }

  var disableOverwriteWarning: Boolean
    get() {
       return isOverwriteWarningDisabled() 
    }
    set(value) {
      setDisableOverwriteWarning(value)
    }

  var displayMode: Int
    get() {
       return EditorFileDialog.DisplayMode.from(getDisplayMode()) 
    }
    set(value) {
      setDisplayMode(EditorFileDialog.DisplayMode.from(value))
    }

  var mode: Int
    get() {
       return EditorFileDialog.Mode.from(getMode()) 
    }
    set(value) {
      setMode(EditorFileDialog.Mode.from(value))
    }

  var showHiddenFiles: Boolean
    get() {
       return isShowingHiddenFiles() 
    }
    set(value) {
      setShowHiddenFiles(value)
    }

  fun addFilter(filter: String) {
    val _arg = Variant.new(filter)
    __method_bind.addFilter.call(this._handle, _arg, 1)
  }

  fun clearFilters() {
    __method_bind.clearFilters.call(this._handle)
  }

  fun getAccess(): Access {
    val _ret = __method_bind.getAccess.call(this._handle)
    return EditorFileDialog.Access.from(_ret.asInt())
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.getCurrentDir.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentFile(): String {
    val _ret = __method_bind.getCurrentFile.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentPath(): String {
    val _ret = __method_bind.getCurrentPath.call(this._handle)
    return _ret.asString()
  }

  fun getDisplayMode(): DisplayMode {
    val _ret = __method_bind.getDisplayMode.call(this._handle)
    return EditorFileDialog.DisplayMode.from(_ret.asInt())
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return EditorFileDialog.Mode.from(_ret.asInt())
  }

  fun getVbox(): VBoxContainer {
    val _ret = __method_bind.getVbox.call(this._handle)
    return _ret.asObject(::VBoxContainer)!!
  }

  fun invalidate() {
    __method_bind.invalidate.call(this._handle)
  }

  fun isOverwriteWarningDisabled(): Boolean {
    val _ret = __method_bind.isOverwriteWarningDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShowingHiddenFiles(): Boolean {
    val _ret = __method_bind.isShowingHiddenFiles.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAccess(access: Int) {
    val _arg = Variant.new(access)
    __method_bind.setAccess.call(this._handle, _arg, 1)
  }

  fun setCurrentDir(dir: String) {
    val _arg = Variant.new(dir)
    __method_bind.setCurrentDir.call(this._handle, _arg, 1)
  }

  fun setCurrentFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.setCurrentFile.call(this._handle, _arg, 1)
  }

  fun setCurrentPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setCurrentPath.call(this._handle, _arg, 1)
  }

  fun setDisableOverwriteWarning(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableOverwriteWarning.call(this._handle, _arg, 1)
  }

  fun setDisplayMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDisplayMode.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, _arg, 1)
  }

  fun setShowHiddenFiles(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setShowHiddenFiles.call(this._handle, _arg, 1)
  }

  enum class DisplayMode(
    val value: Int
  ) {
    DISPLAY_THUMBNAILS(0),

    DISPLAY_LIST(1);

    companion object {
      fun from(value: Int): DisplayMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);

    companion object {
      fun from(value: Int): Mode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Access(
    val value: Int
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);

    companion object {
      fun from(value: Int): Access {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val ACCESS_FILESYSTEM: Int = 2

    val ACCESS_RESOURCES: Int = 0

    val ACCESS_USERDATA: Int = 1

    val DISPLAY_LIST: Int = 1

    val DISPLAY_THUMBNAILS: Int = 0

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    fun new(): EditorFileDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorFileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFileDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorFileDialog = EditorFileDialog(ptr)
    /**
     * Container for method_bind pointers for EditorFileDialog
     */
    private object __method_bind {
      val addFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "addFilter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addFilter" }
        }
      val clearFilters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "clearFilters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearFilters" }
        }
      val getAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getAccess".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAccess" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getCurrentDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentDir" }
        }
      val getCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getCurrentFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentFile" }
        }
      val getCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getCurrentPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentPath" }
        }
      val getDisplayMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getDisplayMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDisplayMode" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getVbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "getVbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVbox" }
        }
      val invalidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "invalidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method invalidate" }
        }
      val isOverwriteWarningDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "isOverwriteWarningDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOverwriteWarningDisabled" }
        }
      val isShowingHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "isShowingHiddenFiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShowingHiddenFiles" }
        }
      val setAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setAccess".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAccess" }
        }
      val setCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setCurrentDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentDir" }
        }
      val setCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setCurrentFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentFile" }
        }
      val setCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setCurrentPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentPath" }
        }
      val setDisableOverwriteWarning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setDisableOverwriteWarning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisableOverwriteWarning" }
        }
      val setDisplayMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setDisplayMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisplayMode" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setShowHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFileDialog".cstr.ptr,
            "setShowHiddenFiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShowHiddenFiles" }
        }}
  }
}
