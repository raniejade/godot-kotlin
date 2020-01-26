// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.Variant
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

open class ItemList internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addIconItem() {
    TODO()
  }

  fun addItem() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun ensureCurrentIsVisible() {
    TODO()
  }

  fun getAllowReselect(): Boolean {
    TODO()
  }

  fun getAllowRmbSelect(): Boolean {
    TODO()
  }

  fun getFixedColumnWidth(): Int {
    TODO()
  }

  fun getFixedIconSize(): Vector2 {
    TODO()
  }

  fun getIconMode(): IconMode {
    TODO()
  }

  fun getIconScale(): Float {
    TODO()
  }

  fun getItemAtPosition(): Int {
    TODO()
  }

  fun getItemCount(): Int {
    TODO()
  }

  fun getItemCustomBgColor(): Color {
    TODO()
  }

  fun getItemCustomFgColor(): Color {
    TODO()
  }

  fun getItemIcon(): Texture {
    TODO()
  }

  fun getItemIconModulate(): Color {
    TODO()
  }

  fun getItemIconRegion(): Rect2 {
    TODO()
  }

  fun getItemMetadata(): Variant {
    TODO()
  }

  fun getItemText(): String {
    TODO()
  }

  fun getItemTooltip(): String {
    TODO()
  }

  fun getMaxColumns(): Int {
    TODO()
  }

  fun getMaxTextLines(): Int {
    TODO()
  }

  fun getSelectMode(): SelectMode {
    TODO()
  }

  fun getSelectedItems(): PoolIntArray {
    TODO()
  }

  fun getVScroll(): VScrollBar {
    TODO()
  }

  fun hasAutoHeight(): Boolean {
    TODO()
  }

  fun isAnythingSelected(): Boolean {
    TODO()
  }

  fun isItemDisabled(): Boolean {
    TODO()
  }

  fun isItemIconTransposed(): Boolean {
    TODO()
  }

  fun isItemSelectable(): Boolean {
    TODO()
  }

  fun isItemTooltipEnabled(): Boolean {
    TODO()
  }

  fun isSameColumnWidth(): Boolean {
    TODO()
  }

  fun isSelected(): Boolean {
    TODO()
  }

  fun moveItem() {
    TODO()
  }

  fun removeItem() {
    TODO()
  }

  fun select() {
    TODO()
  }

  fun setAllowReselect() {
    TODO()
  }

  fun setAllowRmbSelect() {
    TODO()
  }

  fun setAutoHeight() {
    TODO()
  }

  fun setFixedColumnWidth() {
    TODO()
  }

  fun setFixedIconSize() {
    TODO()
  }

  fun setIconMode() {
    TODO()
  }

  fun setIconScale() {
    TODO()
  }

  fun setItemCustomBgColor() {
    TODO()
  }

  fun setItemCustomFgColor() {
    TODO()
  }

  fun setItemDisabled() {
    TODO()
  }

  fun setItemIcon() {
    TODO()
  }

  fun setItemIconModulate() {
    TODO()
  }

  fun setItemIconRegion() {
    TODO()
  }

  fun setItemIconTransposed() {
    TODO()
  }

  fun setItemMetadata() {
    TODO()
  }

  fun setItemSelectable() {
    TODO()
  }

  fun setItemText() {
    TODO()
  }

  fun setItemTooltip() {
    TODO()
  }

  fun setItemTooltipEnabled() {
    TODO()
  }

  fun setMaxColumns() {
    TODO()
  }

  fun setMaxTextLines() {
    TODO()
  }

  fun setSameColumnWidth() {
    TODO()
  }

  fun setSelectMode() {
    TODO()
  }

  fun sortItemsByText() {
    TODO()
  }

  fun unselect() {
    TODO()
  }

  fun unselectAll() {
    TODO()
  }

  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_MULTI(1);
  }

  enum class IconMode(
    val value: Int
  ) {
    ICON_MODE_TOP(0),

    ICON_MODE_LEFT(1);
  }

  companion object {
    val ICON_MODE_LEFT: Int = 1

    val ICON_MODE_TOP: Int = 0

    val SELECT_MULTI: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): ItemList = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ItemList".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ItemList" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ItemList(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ItemList
     */
    private object __method_bind {
      val add_icon_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "add_icon_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
            }
          }

      val add_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "add_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_item" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val ensure_current_is_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "ensure_current_is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ensure_current_is_visible" }
            }
          }

      val get_allow_reselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_allow_reselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
            }
          }

      val get_allow_rmb_select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_allow_rmb_select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
            }
          }

      val get_fixed_column_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_fixed_column_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_column_width" }
            }
          }

      val get_fixed_icon_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_fixed_icon_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_icon_size" }
            }
          }

      val get_icon_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_icon_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_mode" }
            }
          }

      val get_icon_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_icon_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_scale" }
            }
          }

      val get_item_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_at_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
            }
          }

      val get_item_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_count" }
            }
          }

      val get_item_custom_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_custom_bg_color" }
            }
          }

      val get_item_custom_fg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_custom_fg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_custom_fg_color" }
            }
          }

      val get_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
            }
          }

      val get_item_icon_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_icon_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon_modulate" }
            }
          }

      val get_item_icon_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon_region" }
            }
          }

      val get_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
            }
          }

      val get_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_text" }
            }
          }

      val get_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
            }
          }

      val get_max_columns: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_max_columns".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_columns" }
            }
          }

      val get_max_text_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_max_text_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_text_lines" }
            }
          }

      val get_select_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_select_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
            }
          }

      val get_selected_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_selected_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_items" }
            }
          }

      val get_v_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "get_v_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
            }
          }

      val has_auto_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "has_auto_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_auto_height" }
            }
          }

      val is_anything_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_anything_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_anything_selected" }
            }
          }

      val is_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
            }
          }

      val is_item_icon_transposed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_item_icon_transposed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_icon_transposed" }
            }
          }

      val is_item_selectable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_item_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_selectable" }
            }
          }

      val is_item_tooltip_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_item_tooltip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_tooltip_enabled" }
            }
          }

      val is_same_column_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_same_column_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_same_column_width" }
            }
          }

      val is_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "is_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selected" }
            }
          }

      val move_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "move_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_item" }
            }
          }

      val remove_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val set_allow_reselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_allow_reselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
            }
          }

      val set_allow_rmb_select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_allow_rmb_select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
            }
          }

      val set_auto_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_auto_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_height" }
            }
          }

      val set_fixed_column_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_fixed_column_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_column_width" }
            }
          }

      val set_fixed_icon_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_fixed_icon_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_icon_size" }
            }
          }

      val set_icon_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_icon_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_mode" }
            }
          }

      val set_icon_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_icon_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_scale" }
            }
          }

      val set_item_custom_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_custom_bg_color" }
            }
          }

      val set_item_custom_fg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_custom_fg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_custom_fg_color" }
            }
          }

      val set_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
            }
          }

      val set_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
            }
          }

      val set_item_icon_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_icon_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon_modulate" }
            }
          }

      val set_item_icon_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon_region" }
            }
          }

      val set_item_icon_transposed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_icon_transposed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon_transposed" }
            }
          }

      val set_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
            }
          }

      val set_item_selectable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_selectable" }
            }
          }

      val set_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_text" }
            }
          }

      val set_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
            }
          }

      val set_item_tooltip_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_item_tooltip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_tooltip_enabled" }
            }
          }

      val set_max_columns: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_max_columns".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_columns" }
            }
          }

      val set_max_text_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_max_text_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_text_lines" }
            }
          }

      val set_same_column_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_same_column_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_same_column_width" }
            }
          }

      val set_select_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "set_select_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
            }
          }

      val sort_items_by_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "sort_items_by_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sort_items_by_text" }
            }
          }

      val unselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "unselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unselect" }
            }
          }

      val unselect_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
              "unselect_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unselect_all" }
            }
          }
    }
  }
}
