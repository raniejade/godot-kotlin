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
  fun areColumnTitlesVisible(): Boolean {
    val _ret = __method_bind.are_column_titles_visible.call(this._handle)
    return _ret.asBoolean()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createItem(parent: Object, idx: Int): TreeItem {
    val _args = VariantArray.new()
    _args.append(parent)
    _args.append(idx)
    val _ret = __method_bind.create_item.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::TreeItem)!!
  }

  fun ensureCursorIsVisible() {
    __method_bind.ensure_cursor_is_visible.call(this._handle)
  }

  fun getAllowReselect(): Boolean {
    val _ret = __method_bind.get_allow_reselect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getAllowRmbSelect(): Boolean {
    val _ret = __method_bind.get_allow_rmb_select.call(this._handle)
    return _ret.asBoolean()
  }

  fun getColumnAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.get_column_at_position.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getColumnTitle(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_column_title.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getColumnWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_column_width.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getColumns(): Int {
    val _ret = __method_bind.get_columns.call(this._handle)
    return _ret.asInt()
  }

  fun getCustomPopupRect(): Rect2 {
    val _ret = __method_bind.get_custom_popup_rect.call(this._handle)
    return _ret.asRect2()
  }

  fun getDropModeFlags(): Int {
    val _ret = __method_bind.get_drop_mode_flags.call(this._handle)
    return _ret.asInt()
  }

  fun getDropSectionAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.get_drop_section_at_position.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getEdited(): TreeItem {
    val _ret = __method_bind.get_edited.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getEditedColumn(): Int {
    val _ret = __method_bind.get_edited_column.call(this._handle)
    return _ret.asInt()
  }

  fun getItemAreaRect(item: Object, column: Int): Rect2 {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(column)
    val _ret = __method_bind.get_item_area_rect.call(this._handle, _args.toVariant(), 2)
    return _ret.asRect2()
  }

  fun getItemAtPosition(position: Vector2): TreeItem {
    val _arg = Variant.new(position)
    val _ret = __method_bind.get_item_at_position.call(this._handle, _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextSelected(from: Object): TreeItem {
    val _arg = Variant.new(from)
    val _ret = __method_bind.get_next_selected.call(this._handle, _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getPressedButton(): Int {
    val _ret = __method_bind.get_pressed_button.call(this._handle)
    return _ret.asInt()
  }

  fun getRoot(): TreeItem {
    val _ret = __method_bind.get_root.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getScroll(): Vector2 {
    val _ret = __method_bind.get_scroll.call(this._handle)
    return _ret.asVector2()
  }

  fun getSelectMode(): SelectMode {
    val _ret = __method_bind.get_select_mode.call(this._handle)
    return Tree.SelectMode.from(_ret.asInt())
  }

  fun getSelected(): TreeItem {
    val _ret = __method_bind.get_selected.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getSelectedColumn(): Int {
    val _ret = __method_bind.get_selected_column.call(this._handle)
    return _ret.asInt()
  }

  fun isFoldingHidden(): Boolean {
    val _ret = __method_bind.is_folding_hidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRootHidden(): Boolean {
    val _ret = __method_bind.is_root_hidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_reselect.call(this._handle, _arg, 1)
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_rmb_select.call(this._handle, _arg, 1)
  }

  fun setColumnExpand(column: Int, expand: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(expand)
    __method_bind.set_column_expand.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnMinWidth(column: Int, minWidth: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(minWidth)
    __method_bind.set_column_min_width.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnTitle(column: Int, title: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(title)
    __method_bind.set_column_title.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnTitlesVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.set_column_titles_visible.call(this._handle, _arg, 1)
  }

  fun setColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.set_columns.call(this._handle, _arg, 1)
  }

  fun setDropModeFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.set_drop_mode_flags.call(this._handle, _arg, 1)
  }

  fun setHideFolding(hide: Boolean) {
    val _arg = Variant.new(hide)
    __method_bind.set_hide_folding.call(this._handle, _arg, 1)
  }

  fun setHideRoot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_hide_root.call(this._handle, _arg, 1)
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_select_mode.call(this._handle, _arg, 1)
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
      val are_column_titles_visible: CPointer<godot_method_bind>
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
      val create_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "create_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_item" }
        }
      val ensure_cursor_is_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "ensure_cursor_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_cursor_is_visible" }
        }
      val get_allow_reselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val get_allow_rmb_select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val get_column_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_at_position" }
        }
      val get_column_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_title" }
        }
      val get_column_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_width" }
        }
      val get_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_columns" }
        }
      val get_custom_popup_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_custom_popup_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_popup_rect" }
        }
      val get_drop_mode_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_mode_flags" }
        }
      val get_drop_section_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_section_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_section_at_position" }
        }
      val get_edited: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited" }
        }
      val get_edited_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_column" }
        }
      val get_item_area_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_area_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_area_rect" }
        }
      val get_item_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val get_next_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_next_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_selected" }
        }
      val get_pressed_button: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_pressed_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
        }
      val get_root: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val get_scroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll" }
        }
      val get_select_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val get_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected" }
        }
      val get_selected_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_column" }
        }
      val is_folding_hidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_folding_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folding_hidden" }
        }
      val is_root_hidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_root_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_root_hidden" }
        }
      val set_allow_reselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val set_allow_rmb_select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val set_column_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_expand" }
        }
      val set_column_min_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_min_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_min_width" }
        }
      val set_column_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_title" }
        }
      val set_column_titles_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_titles_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_titles_visible" }
        }
      val set_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_columns" }
        }
      val set_drop_mode_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drop_mode_flags" }
        }
      val set_hide_folding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_folding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_folding" }
        }
      val set_hide_root: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_root" }
        }
      val set_select_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }}
  }
}
