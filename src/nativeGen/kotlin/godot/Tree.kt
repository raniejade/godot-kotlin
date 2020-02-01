// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tree(
  _handle: COpaquePointer
) : Control(_handle) {
  var allowReselect: Boolean
    get() {
       return getAllowReselect() 
    }
    set(value) {
      setAllowReselect(value)
    }

  var allowRmbSelect: Boolean
    get() {
       return getAllowRmbSelect() 
    }
    set(value) {
      setAllowRmbSelect(value)
    }

  var columns: Int
    get() {
       return getColumns() 
    }
    set(value) {
      setColumns(value)
    }

  var dropModeFlags: Int
    get() {
       return getDropModeFlags() 
    }
    set(value) {
      setDropModeFlags(value)
    }

  var hideFolding: Boolean
    get() {
       return isFoldingHidden() 
    }
    set(value) {
      setHideFolding(value)
    }

  var hideRoot: Boolean
    get() {
       return isRootHidden() 
    }
    set(value) {
      setHideRoot(value)
    }

  var selectMode: SelectMode
    get() {
       return getSelectMode() 
    }
    set(value) {
      setSelectMode(value.value)
    }

  fun areColumnTitlesVisible(): Boolean {
    val _ret = __method_bind.areColumnTitlesVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createItem(parent: Object, idx: Int = -1): TreeItem {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(parent))
    _args.add(Variant.fromAny(idx))
    val _ret = __method_bind.createItem.call(this._handle, _args)
    return _ret.asObject(::TreeItem)!!
  }

  fun ensureCursorIsVisible() {
    __method_bind.ensureCursorIsVisible.call(this._handle)
  }

  fun getAllowReselect(): Boolean {
    val _ret = __method_bind.getAllowReselect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getAllowRmbSelect(): Boolean {
    val _ret = __method_bind.getAllowRmbSelect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getColumnAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getColumnAtPosition.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getColumnTitle(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getColumnTitle.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getColumnWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getColumnWidth.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getColumns(): Int {
    val _ret = __method_bind.getColumns.call(this._handle)
    return _ret.asInt()
  }

  fun getCustomPopupRect(): Rect2 {
    val _ret = __method_bind.getCustomPopupRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getDropModeFlags(): Int {
    val _ret = __method_bind.getDropModeFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getDropSectionAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getDropSectionAtPosition.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getEdited(): TreeItem {
    val _ret = __method_bind.getEdited.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getEditedColumn(): Int {
    val _ret = __method_bind.getEditedColumn.call(this._handle)
    return _ret.asInt()
  }

  fun getItemAreaRect(item: Object, column: Int = -1): Rect2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(column))
    val _ret = __method_bind.getItemAreaRect.call(this._handle, _args)
    return _ret.asRect2()
  }

  fun getItemAtPosition(position: Vector2): TreeItem {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getItemAtPosition.call(this._handle, listOf(_arg))
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextSelected(from: Object): TreeItem {
    val _arg = Variant.new(from)
    val _ret = __method_bind.getNextSelected.call(this._handle, listOf(_arg))
    return _ret.asObject(::TreeItem)!!
  }

  fun getPressedButton(): Int {
    val _ret = __method_bind.getPressedButton.call(this._handle)
    return _ret.asInt()
  }

  fun getRoot(): TreeItem {
    val _ret = __method_bind.getRoot.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getScroll(): Vector2 {
    val _ret = __method_bind.getScroll.call(this._handle)
    return _ret.asVector2()
  }

  fun getSelectMode(): SelectMode {
    val _ret = __method_bind.getSelectMode.call(this._handle)
    return Tree.SelectMode.from(_ret.asInt())
  }

  fun getSelected(): TreeItem {
    val _ret = __method_bind.getSelected.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getSelectedColumn(): Int {
    val _ret = __method_bind.getSelectedColumn.call(this._handle)
    return _ret.asInt()
  }

  fun isFoldingHidden(): Boolean {
    val _ret = __method_bind.isFoldingHidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRootHidden(): Boolean {
    val _ret = __method_bind.isRootHidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowReselect.call(this._handle, listOf(_arg))
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowRmbSelect.call(this._handle, listOf(_arg))
  }

  fun setColumnExpand(column: Int, expand: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(expand))
    __method_bind.setColumnExpand.call(this._handle, _args)
  }

  fun setColumnMinWidth(column: Int, minWidth: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(minWidth))
    __method_bind.setColumnMinWidth.call(this._handle, _args)
  }

  fun setColumnTitle(column: Int, title: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(title))
    __method_bind.setColumnTitle.call(this._handle, _args)
  }

  fun setColumnTitlesVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setColumnTitlesVisible.call(this._handle, listOf(_arg))
  }

  fun setColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setColumns.call(this._handle, listOf(_arg))
  }

  fun setDropModeFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.setDropModeFlags.call(this._handle, listOf(_arg))
  }

  fun setHideFolding(hide: Boolean) {
    val _arg = Variant.new(hide)
    __method_bind.setHideFolding.call(this._handle, listOf(_arg))
  }

  fun setHideRoot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideRoot.call(this._handle, listOf(_arg))
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSelectMode.call(this._handle, listOf(_arg))
  }

  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_ROW(1),

    SELECT_MULTI(2);

    companion object {
      fun from(value: Int): SelectMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DropModeFlags(
    val value: Int
  ) {
    DROP_MODE_DISABLED(0),

    DROP_MODE_ON_ITEM(1),

    DROP_MODE_INBETWEEN(2);

    companion object {
      fun from(value: Int): DropModeFlags {
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
    val DROP_MODE_DISABLED: Int = 0

    val DROP_MODE_INBETWEEN: Int = 2

    val DROP_MODE_ON_ITEM: Int = 1

    val SELECT_MULTI: Int = 2

    val SELECT_ROW: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): Tree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tree = Tree(ptr)
    /**
     * Container for method_bind pointers for Tree
     */
    private object __method_bind {
      val areColumnTitlesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "are_column_titles_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_column_titles_visible" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "create_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_item" }
        }
      val ensureCursorIsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "ensure_cursor_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_cursor_is_visible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val getColumnAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_at_position" }
        }
      val getColumnTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_title" }
        }
      val getColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_width" }
        }
      val getColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_columns" }
        }
      val getCustomPopupRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_custom_popup_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_popup_rect" }
        }
      val getDropModeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_mode_flags" }
        }
      val getDropSectionAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_section_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_section_at_position" }
        }
      val getEdited: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited" }
        }
      val getEditedColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_column" }
        }
      val getItemAreaRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_area_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_area_rect" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val getNextSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_next_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_selected" }
        }
      val getPressedButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_pressed_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val getScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val getSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected" }
        }
      val getSelectedColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_column" }
        }
      val isFoldingHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_folding_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folding_hidden" }
        }
      val isRootHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_root_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_root_hidden" }
        }
      val setAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val setColumnExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_expand" }
        }
      val setColumnMinWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_min_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_min_width" }
        }
      val setColumnTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_title" }
        }
      val setColumnTitlesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_titles_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_titles_visible" }
        }
      val setColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_columns" }
        }
      val setDropModeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drop_mode_flags" }
        }
      val setHideFolding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_folding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_folding" }
        }
      val setHideRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_root" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }}
  }
}
