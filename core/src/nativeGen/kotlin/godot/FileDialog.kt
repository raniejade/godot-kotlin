// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for filters
   */
  fun filters(cb: PoolStringArray.() -> Unit) {
    val _p = filters
    cb(_p)
    filters = _p
  }

  open fun _action_pressed() {
    TODO()
  }

  open fun _cancel_pressed() {
    TODO()
  }

  open fun _dir_entered(arg0: String) {
    TODO()
  }

  open fun _file_entered(arg0: String) {
    TODO()
  }

  open fun _filter_selected(arg0: Int) {
    TODO()
  }

  open fun _go_up() {
    TODO()
  }

  open fun _make_dir() {
    TODO()
  }

  open fun _make_dir_confirm() {
    TODO()
  }

  open fun _save_confirm_pressed() {
    TODO()
  }

  open fun _select_drive(arg0: Int) {
    TODO()
  }

  open fun _tree_item_activated() {
    TODO()
  }

  open fun _tree_multi_selected(
    arg0: Object,
    arg1: Int,
    arg2: Boolean
  ) {
    TODO()
  }

  open fun _tree_selected() {
    TODO()
  }

  open fun _update_dir() {
    TODO()
  }

  open fun _update_file_list() {
    TODO()
  }

  open fun _update_file_name() {
    TODO()
  }

  fun addFilter(filter: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addFilter.call(self._handle, listOf(filter), null)
    }
  }

  fun clearFilters() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearFilters.call(self._handle, emptyList(), null)
    }
  }

  fun deselectItems() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.deselectItems.call(self._handle, emptyList(), null)
    }
  }

  fun getAccess(): Access {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAccess.call(self._handle, emptyList(), _retPtr)
      FileDialog.Access.from(_ret.value)
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

  fun getCurrentFile(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentFile.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCurrentPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFilters(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getFilters.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLineEdit(): LineEdit {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: LineEdit
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLineEdit.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<LineEdit>(_tmp.value!!)
      _ret
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      FileDialog.Mode.from(_ret.value)
    }
  }

  fun getVbox(): VBoxContainer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VBoxContainer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVbox.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VBoxContainer>(_tmp.value!!)
      _ret
    }
  }

  fun invalidate() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.invalidate.call(self._handle, emptyList(), null)
    }
  }

  fun isModeOverridingTitle(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isModeOverridingTitle.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShowingHiddenFiles(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShowingHiddenFiles.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAccess(access: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAccess.call(self._handle, listOf(access), null)
    }
  }

  fun setCurrentDir(dir: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentDir.call(self._handle, listOf(dir), null)
    }
  }

  fun setCurrentFile(file: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentFile.call(self._handle, listOf(file), null)
    }
  }

  fun setCurrentPath(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentPath.call(self._handle, listOf(path), null)
    }
  }

  fun setFilters(filters: PoolStringArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilters.call(self._handle, listOf(filters), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setModeOverridesTitle(override: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setModeOverridesTitle.call(self._handle, listOf(override), null)
    }
  }

  fun setShowHiddenFiles(show: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShowHiddenFiles.call(self._handle, listOf(show), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "add_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_filter" }
        }
      val clearFilters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "clear_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_filters" }
        }
      val deselectItems: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "deselect_items".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect_items" }
        }
      val getAccess: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_access" }
        }
      val getCurrentDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
        }
      val getCurrentFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_file" }
        }
      val getCurrentPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_path" }
        }
      val getFilters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filters" }
        }
      val getLineEdit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_line_edit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getVbox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "get_vbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vbox" }
        }
      val invalidate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "invalidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method invalidate" }
        }
      val isModeOverridingTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "is_mode_overriding_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_mode_overriding_title" }
        }
      val isShowingHiddenFiles: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "is_showing_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
        }
      val setAccess: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_access".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_access" }
        }
      val setCurrentDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
        }
      val setCurrentFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_file" }
        }
      val setCurrentPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_current_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_path" }
        }
      val setFilters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_filters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filters" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setModeOverridesTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_mode_overrides_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode_overrides_title" }
        }
      val setShowHiddenFiles: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
            "set_show_hidden_files".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
        }}
  }
}
