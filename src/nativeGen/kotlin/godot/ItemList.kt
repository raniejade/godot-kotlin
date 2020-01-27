// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ItemList(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addIconItem(icon: Texture, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(icon)
    _args.append(selectable)
    __method_bind.add_icon_item.call(this._handle, _args.toVariant(), 2)
  }

  fun addItem(
    text: String,
    icon: Texture,
    selectable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(text)
    _args.append(icon)
    _args.append(selectable)
    __method_bind.add_item.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun ensureCurrentIsVisible() {
    __method_bind.ensure_current_is_visible.call(this._handle)
  }

  fun getAllowReselect(): Boolean {
    val _ret = __method_bind.get_allow_reselect.call(this._handle)
    return _ret.asBool()
  }

  fun getAllowRmbSelect(): Boolean {
    val _ret = __method_bind.get_allow_rmb_select.call(this._handle)
    return _ret.asBool()
  }

  fun getFixedColumnWidth(): Int {
    val _ret = __method_bind.get_fixed_column_width.call(this._handle)
    return _ret.asInt()
  }

  fun getFixedIconSize(): Vector2 {
    val _ret = __method_bind.get_fixed_icon_size.call(this._handle)
    return _ret.asVector2()
  }

  fun getIconMode(): IconMode {
    val _ret = __method_bind.get_icon_mode.call(this._handle)
    return ItemList.IconMode.from(_ret.asInt())
  }

  fun getIconScale(): Float {
    val _ret = __method_bind.get_icon_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun getItemAtPosition(position: Vector2, exact: Boolean): Int {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(exact)
    val _ret = __method_bind.get_item_at_position.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.get_item_count.call(this._handle)
    return _ret.asInt()
  }

  fun getItemCustomBgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_custom_bg_color.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemCustomFgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_custom_fg_color.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemIcon(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_icon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getItemIconModulate(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_icon_modulate.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemIconRegion(idx: Int): Rect2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_icon_region.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_metadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getItemText(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_text.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getItemTooltip(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_item_tooltip.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getMaxColumns(): Int {
    val _ret = __method_bind.get_max_columns.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxTextLines(): Int {
    val _ret = __method_bind.get_max_text_lines.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectMode(): SelectMode {
    val _ret = __method_bind.get_select_mode.call(this._handle)
    return ItemList.SelectMode.from(_ret.asInt())
  }

  fun getSelectedItems(): PoolIntArray {
    val _ret = __method_bind.get_selected_items.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getVScroll(): VScrollBar {
    val _ret = __method_bind.get_v_scroll.call(this._handle)
    return _ret.asObject(::VScrollBar)!!
  }

  fun hasAutoHeight(): Boolean {
    val _ret = __method_bind.has_auto_height.call(this._handle)
    return _ret.asBool()
  }

  fun isAnythingSelected(): Boolean {
    val _ret = __method_bind.is_anything_selected.call(this._handle)
    return _ret.asBool()
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_item_disabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isItemIconTransposed(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_item_icon_transposed.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isItemSelectable(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_item_selectable.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isItemTooltipEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_item_tooltip_enabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isSameColumnWidth(): Boolean {
    val _ret = __method_bind.is_same_column_width.call(this._handle)
    return _ret.asBool()
  }

  fun isSelected(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_selected.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun moveItem(fromIdx: Int, toIdx: Int) {
    val _args = VariantArray.new()
    _args.append(fromIdx)
    _args.append(toIdx)
    __method_bind.move_item.call(this._handle, _args.toVariant(), 2)
  }

  fun removeItem(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.remove_item.call(this._handle, _arg, 1)
  }

  fun select(idx: Int, single: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(single)
    __method_bind.select.call(this._handle, _args.toVariant(), 2)
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_reselect.call(this._handle, _arg, 1)
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_rmb_select.call(this._handle, _arg, 1)
  }

  fun setAutoHeight(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_auto_height.call(this._handle, _arg, 1)
  }

  fun setFixedColumnWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.set_fixed_column_width.call(this._handle, _arg, 1)
  }

  fun setFixedIconSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.set_fixed_icon_size.call(this._handle, _arg, 1)
  }

  fun setIconMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_icon_mode.call(this._handle, _arg, 1)
  }

  fun setIconScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.set_icon_scale.call(this._handle, _arg, 1)
  }

  fun setItemCustomBgColor(idx: Int, customBgColor: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(customBgColor)
    __method_bind.set_item_custom_bg_color.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemCustomFgColor(idx: Int, customFgColor: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(customFgColor)
    __method_bind.set_item_custom_fg_color.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    __method_bind.set_item_disabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(icon)
    __method_bind.set_item_icon.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconModulate(idx: Int, modulate: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(modulate)
    __method_bind.set_item_icon_modulate.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconRegion(idx: Int, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(rect)
    __method_bind.set_item_icon_region.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconTransposed(idx: Int, rect: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(rect)
    __method_bind.set_item_icon_transposed.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(metadata)
    __method_bind.set_item_metadata.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemSelectable(idx: Int, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(selectable)
    __method_bind.set_item_selectable.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemText(idx: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(text)
    __method_bind.set_item_text.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tooltip)
    __method_bind.set_item_tooltip.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemTooltipEnabled(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    __method_bind.set_item_tooltip_enabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setMaxColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.set_max_columns.call(this._handle, _arg, 1)
  }

  fun setMaxTextLines(lines: Int) {
    val _arg = Variant.new(lines)
    __method_bind.set_max_text_lines.call(this._handle, _arg, 1)
  }

  fun setSameColumnWidth(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_same_column_width.call(this._handle, _arg, 1)
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_select_mode.call(this._handle, _arg, 1)
  }

  fun sortItemsByText() {
    __method_bind.sort_items_by_text.call(this._handle)
  }

  fun unselect(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.unselect.call(this._handle, _arg, 1)
  }

  fun unselectAll() {
    __method_bind.unselect_all.call(this._handle)
  }

  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_MULTI(1);

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

  enum class IconMode(
    val value: Int
  ) {
    ICON_MODE_TOP(0),

    ICON_MODE_LEFT(1);

    companion object {
      fun from(value: Int): IconMode {
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
    val ICON_MODE_LEFT: Int = 1

    val ICON_MODE_TOP: Int = 0

    val SELECT_MULTI: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): ItemList = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ItemList".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ItemList" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ItemList(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ItemList = ItemList(ptr)
    /**
     * Container for method_bind pointers for ItemList
     */
    private object __method_bind {
      val add_icon_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val add_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_item" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val ensure_current_is_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "ensure_current_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_current_is_visible" }
        }
      val get_allow_reselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val get_allow_rmb_select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val get_fixed_column_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_column_width" }
        }
      val get_fixed_icon_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_icon_size" }
        }
      val get_icon_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_mode" }
        }
      val get_icon_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_scale" }
        }
      val get_item_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val get_item_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val get_item_custom_bg_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_bg_color" }
        }
      val get_item_custom_fg_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_fg_color" }
        }
      val get_item_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val get_item_icon_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_modulate" }
        }
      val get_item_icon_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_region" }
        }
      val get_item_metadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val get_item_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val get_item_tooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
        }
      val get_max_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_columns" }
        }
      val get_max_text_lines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_text_lines" }
        }
      val get_select_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val get_selected_items: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_selected_items".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_items" }
        }
      val get_v_scroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val has_auto_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "has_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_auto_height" }
        }
      val is_anything_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_anything_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_anything_selected" }
        }
      val is_item_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val is_item_icon_transposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_icon_transposed" }
        }
      val is_item_selectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_selectable" }
        }
      val is_item_tooltip_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_tooltip_enabled" }
        }
      val is_same_column_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_same_column_width" }
        }
      val is_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val move_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "move_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_item" }
        }
      val remove_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val set_allow_reselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val set_allow_rmb_select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val set_auto_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_height" }
        }
      val set_fixed_column_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_column_width" }
        }
      val set_fixed_icon_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_icon_size" }
        }
      val set_icon_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_mode" }
        }
      val set_icon_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_scale" }
        }
      val set_item_custom_bg_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_bg_color" }
        }
      val set_item_custom_fg_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_fg_color" }
        }
      val set_item_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val set_item_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val set_item_icon_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_modulate" }
        }
      val set_item_icon_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_region" }
        }
      val set_item_icon_transposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_transposed" }
        }
      val set_item_metadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val set_item_selectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_selectable" }
        }
      val set_item_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }
      val set_item_tooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
        }
      val set_item_tooltip_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip_enabled" }
        }
      val set_max_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_columns" }
        }
      val set_max_text_lines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_text_lines" }
        }
      val set_same_column_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_same_column_width" }
        }
      val set_select_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }
      val sort_items_by_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "sort_items_by_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sort_items_by_text" }
        }
      val unselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "unselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselect" }
        }
      val unselect_all: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "unselect_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselect_all" }
        }}
  }
}
