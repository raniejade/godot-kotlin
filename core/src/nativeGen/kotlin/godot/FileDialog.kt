// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class FileDialog(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : ConfirmationDialog(null) {
  var access: Access
    get() {
       return getAccess() 
    }
    set(value) {
      setAccess(value.value)
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

  var filters: PoolStringArray
    get() {
       return getFilters() 
    }
    set(value) {
      setFilters(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var modeOverridesTitle: Boolean
    get() {
       return isModeOverridingTitle() 
    }
    set(value) {
      setModeOverridesTitle(value)
    }

  var showHiddenFiles: Boolean
    get() {
       return isShowingHiddenFiles() 
    }
    set(value) {
      setShowHiddenFiles(value)
    }

  /**
   * FileDialog::dir_selected signal
   */
  val signalDirSelected: Signal1<String> = Signal1("dir_selected")

  /**
   * FileDialog::file_selected signal
   */
  val signalFileSelected: Signal1<String> = Signal1("file_selected")

  /**
   * FileDialog::files_selected signal
   */
  val signalFilesSelected: Signal1<PoolStringArray> = Signal1("files_selected")

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for filters
   */
  fun filters(cb: PoolStringArray.() -> Unit) {
    val _p = filters
    cb(_p)
    filters = _p
  }

  fun addFilter(filter: String) {
    val _arg = Variant.new(filter)
    __method_bind.addFilter.call(this._handle, listOf(_arg))
  }

  fun clearFilters() {
    __method_bind.clearFilters.call(this._handle)
  }

  fun deselectItems() {
    __method_bind.deselectItems.call(this._handle)
  }

  fun getAccess(): Access {
    val _ret = __method_bind.getAccess.call(this._handle)
    return FileDialog.Access.from(_ret.asInt())
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

  fun getFilters(): PoolStringArray {
    val _ret = __method_bind.getFilters.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getLineEdit(): LineEdit {
    val _ret = __method_bind.getLineEdit.call(this._handle)
    return _ret.asObject(::LineEdit)!!
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return FileDialog.Mode.from(_ret.asInt())
  }

  fun getVbox(): VBoxContainer {
    val _ret = __method_bind.getVbox.call(this._handle)
    return _ret.asObject(::VBoxContainer)!!
  }

  fun invalidate() {
    __method_bind.invalidate.call(this._handle)
  }

  fun isModeOverridingTitle(): Boolean {
    val _ret = __method_bind.isModeOverridingTitle.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShowingHiddenFiles(): Boolean {
    val _ret = __method_bind.isShowingHiddenFiles.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAccess(access: Int) {
    val _arg = Variant.new(access)
    __method_bind.setAccess.call(this._handle, listOf(_arg))
  }

  fun setCurrentDir(dir: String) {
    val _arg = Variant.new(dir)
    __method_bind.setCurrentDir.call(this._handle, listOf(_arg))
  }

  fun setCurrentFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.setCurrentFile.call(this._handle, listOf(_arg))
  }

  fun setCurrentPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setCurrentPath.call(this._handle, listOf(_arg))
  }

  fun setFilters(filters: PoolStringArray) {
    val _arg = Variant.new(filters)
    __method_bind.setFilters.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setModeOverridesTitle(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.setModeOverridesTitle.call(this._handle, listOf(_arg))
  }

  fun setShowHiddenFiles(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setShowHiddenFiles.call(this._handle, listOf(_arg))
  }

  enum class Mode(
    val value: Int
  ) {
    OPEN_FILE(0),

    OPEN_FILES(1),

    OPEN_DIR(2),

    OPEN_ANY(3),

    SAVE_FILE(4);

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
    RESOURCES(0),

    USERDATA(1),

    FILESYSTEM(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for FileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for FileDialog
     */
    private object __method_bind {
      val addFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "add_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_filter" }
        }
      val clearFilters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "clear_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_filters" }
        }
      val deselectItems: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "deselect_items".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect_items" }
        }
      val getAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_access" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val getCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_file" }
        }
      val getCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_path" }
        }
      val getFilters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filters" }
        }
      val getLineEdit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_line_edit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getVbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_vbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vbox" }
        }
      val invalidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "invalidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method invalidate" }
        }
      val isModeOverridingTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "is_mode_overriding_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_mode_overriding_title" }
        }
      val isShowingHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "is_showing_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
        }
      val setAccess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_access" }
        }
      val setCurrentDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
        }
      val setCurrentFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_file" }
        }
      val setCurrentPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_path" }
        }
      val setFilters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filters" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setModeOverridesTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_mode_overrides_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode_overrides_title" }
        }
      val setShowHiddenFiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_show_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
        }}
  }
}
