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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class FileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  fun addFilter(filter: String) {
    val _args = VariantArray.new()
    _args.append(filter)
    __method_bind.add_filter.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun clearFilters() {
    __method_bind.clear_filters.call(this.toVariant())
  }

  fun deselectItems() {
    __method_bind.deselect_items.call(this.toVariant())
  }

  fun getAccess(): Access {
    val _ret = __method_bind.get_access.call(this.toVariant())
    return FileDialog.Access.from(_ret.asInt())
  }

  fun getCurrentDir(): String {
    val _ret = __method_bind.get_current_dir.call(this.toVariant())
    return _ret.asString()
  }

  fun getCurrentFile(): String {
    val _ret = __method_bind.get_current_file.call(this.toVariant())
    return _ret.asString()
  }

  fun getCurrentPath(): String {
    val _ret = __method_bind.get_current_path.call(this.toVariant())
    return _ret.asString()
  }

  fun getFilters(): PoolStringArray {
    val _ret = __method_bind.get_filters.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getLineEdit(): LineEdit {
    val _ret = __method_bind.get_line_edit.call(this.toVariant())
    return _ret.asObject(::LineEdit)!!
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this.toVariant())
    return FileDialog.Mode.from(_ret.asInt())
  }

  fun getVbox(): VBoxContainer {
    val _ret = __method_bind.get_vbox.call(this.toVariant())
    return _ret.asObject(::VBoxContainer)!!
  }

  fun invalidate() {
    __method_bind.invalidate.call(this.toVariant())
  }

  fun isModeOverridingTitle(): Boolean {
    val _ret = __method_bind.is_mode_overriding_title.call(this.toVariant())
    return _ret.asBool()
  }

  fun isShowingHiddenFiles(): Boolean {
    val _ret = __method_bind.is_showing_hidden_files.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAccess(access: Int) {
    val _args = VariantArray.new()
    _args.append(access)
    __method_bind.set_access.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCurrentDir(dir: String) {
    val _args = VariantArray.new()
    _args.append(dir)
    __method_bind.set_current_dir.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCurrentFile(file: String) {
    val _args = VariantArray.new()
    _args.append(file)
    __method_bind.set_current_file.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCurrentPath(path: String) {
    val _args = VariantArray.new()
    _args.append(path)
    __method_bind.set_current_path.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFilters(filters: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(filters)
    __method_bind.set_filters.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setModeOverridesTitle(override: Boolean) {
    val _args = VariantArray.new()
    _args.append(override)
    __method_bind.set_mode_overrides_title.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setShowHiddenFiles(show: Boolean) {
    val _args = VariantArray.new()
    _args.append(show)
    __method_bind.set_show_hidden_files.call(this.toVariant(), _args.toVariant(), 1)
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

    val MODE_OPEN_ANY: Int = 3

    val MODE_OPEN_DIR: Int = 2

    val MODE_OPEN_FILE: Int = 0

    val MODE_OPEN_FILES: Int = 1

    val MODE_SAVE_FILE: Int = 4

    fun new(): FileDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton FileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      FileDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): FileDialog = FileDialog(ptr)
    /**
     * Container for method_bind pointers for FileDialog
     */
    private object __method_bind {
      val add_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "add_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_filter" }
            }
          }

      val clear_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "clear_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_filters" }
            }
          }

      val deselect_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "deselect_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect_items" }
            }
          }

      val get_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_access" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_file" }
            }
          }

      val get_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_path" }
            }
          }

      val get_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filters" }
            }
          }

      val get_line_edit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_line_edit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_vbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "get_vbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vbox" }
            }
          }

      val invalidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "invalidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method invalidate" }
            }
          }

      val is_mode_overriding_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_mode_overriding_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_mode_overriding_title" }
            }
          }

      val is_showing_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "is_showing_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_showing_hidden_files" }
            }
          }

      val set_access: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_access".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_access" }
            }
          }

      val set_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_dir" }
            }
          }

      val set_current_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_file" }
            }
          }

      val set_current_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_current_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_path" }
            }
          }

      val set_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filters" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_mode_overrides_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_mode_overrides_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode_overrides_title" }
            }
          }

      val set_show_hidden_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FileDialog".cstr.ptr,
              "set_show_hidden_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_hidden_files" }
            }
          }
    }
  }
}
