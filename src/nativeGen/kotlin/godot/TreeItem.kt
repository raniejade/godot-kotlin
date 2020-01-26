// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
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

open class TreeItem internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addButton(
    column: Int,
    button: Texture,
    button_idx: Int,
    disabled: Boolean,
    tooltip: String
  ) {
    TODO()
  }

  fun clearCustomBgColor(column: Int) {
    TODO()
  }

  fun clearCustomColor(column: Int) {
    TODO()
  }

  fun deselect(column: Int) {
    TODO()
  }

  fun eraseButton(column: Int, button_idx: Int) {
    TODO()
  }

  fun getButton(column: Int, button_idx: Int): Texture {
    TODO()
  }

  fun getButtonCount(column: Int): Int {
    TODO()
  }

  fun getCellMode(column: Int): TreeCellMode {
    TODO()
  }

  fun getChildren(): TreeItem {
    TODO()
  }

  fun getCustomBgColor(column: Int): Color {
    TODO()
  }

  fun getCustomMinimumHeight(): Int {
    TODO()
  }

  fun getExpandRight(column: Int): Boolean {
    TODO()
  }

  fun getIcon(column: Int): Texture {
    TODO()
  }

  fun getIconMaxWidth(column: Int): Int {
    TODO()
  }

  fun getIconRegion(column: Int): Rect2 {
    TODO()
  }

  fun getMetadata(column: Int): Variant {
    TODO()
  }

  fun getNext(): TreeItem {
    TODO()
  }

  fun getNextVisible(wrap: Boolean): TreeItem {
    TODO()
  }

  fun getParent(): TreeItem {
    TODO()
  }

  fun getPrev(): TreeItem {
    TODO()
  }

  fun getPrevVisible(wrap: Boolean): TreeItem {
    TODO()
  }

  fun getRange(column: Int): Float {
    TODO()
  }

  fun getRangeConfig(column: Int): Dictionary {
    TODO()
  }

  fun getText(column: Int): String {
    TODO()
  }

  fun getTextAlign(column: Int): TextAlign {
    TODO()
  }

  fun getTooltip(column: Int): String {
    TODO()
  }

  fun isButtonDisabled(column: Int, button_idx: Int): Boolean {
    TODO()
  }

  fun isChecked(column: Int): Boolean {
    TODO()
  }

  fun isCollapsed(): Boolean {
    TODO()
  }

  fun isCustomSetAsButton(column: Int): Boolean {
    TODO()
  }

  fun isEditable(column: Int): Boolean {
    TODO()
  }

  fun isFoldingDisabled(): Boolean {
    TODO()
  }

  fun isSelectable(column: Int): Boolean {
    TODO()
  }

  fun isSelected(column: Int): Boolean {
    TODO()
  }

  fun moveToBottom() {
    TODO()
  }

  fun moveToTop() {
    TODO()
  }

  fun removeChild(child: Object) {
    TODO()
  }

  fun select(column: Int) {
    TODO()
  }

  fun setButton(
    column: Int,
    button_idx: Int,
    button: Texture
  ) {
    TODO()
  }

  fun setCellMode(column: Int, mode: Int) {
    TODO()
  }

  fun setChecked(column: Int, checked: Boolean) {
    TODO()
  }

  fun setCollapsed(enable: Boolean) {
    TODO()
  }

  fun setCustomAsButton(column: Int, enable: Boolean) {
    TODO()
  }

  fun setCustomBgColor(
    column: Int,
    color: Color,
    just_outline: Boolean
  ) {
    TODO()
  }

  fun setCustomColor(column: Int, color: Color) {
    TODO()
  }

  fun setCustomDraw(
    column: Int,
    `object`: Object,
    callback: String
  ) {
    TODO()
  }

  fun setCustomMinimumHeight(height: Int) {
    TODO()
  }

  fun setDisableFolding(disable: Boolean) {
    TODO()
  }

  fun setEditable(column: Int, enabled: Boolean) {
    TODO()
  }

  fun setExpandRight(column: Int, enable: Boolean) {
    TODO()
  }

  fun setIcon(column: Int, texture: Texture) {
    TODO()
  }

  fun setIconMaxWidth(column: Int, width: Int) {
    TODO()
  }

  fun setIconRegion(column: Int, region: Rect2) {
    TODO()
  }

  fun setMetadata(column: Int, meta: Variant) {
    TODO()
  }

  fun setRange(column: Int, value: Float) {
    TODO()
  }

  fun setRangeConfig(
    column: Int,
    min: Float,
    max: Float,
    step: Float,
    expr: Boolean
  ) {
    TODO()
  }

  fun setSelectable(column: Int, selectable: Boolean) {
    TODO()
  }

  fun setText(column: Int, text: String) {
    TODO()
  }

  fun setTextAlign(column: Int, text_align: Int) {
    TODO()
  }

  fun setTooltip(column: Int, tooltip: String) {
    TODO()
  }

  enum class TreeCellMode(
    val value: Int
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val CELL_MODE_CHECK: Int = 1

    val CELL_MODE_CUSTOM: Int = 4

    val CELL_MODE_ICON: Int = 3

    val CELL_MODE_RANGE: Int = 2

    val CELL_MODE_STRING: Int = 0

    /**
     * Container for method_bind pointers for TreeItem
     */
    private object __method_bind {
      val add_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "add_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_button" }
            }
          }

      val clear_custom_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "clear_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_custom_bg_color" }
            }
          }

      val clear_custom_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "clear_custom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_custom_color" }
            }
          }

      val deselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "deselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect" }
            }
          }

      val erase_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "erase_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_button" }
            }
          }

      val get_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button" }
            }
          }

      val get_button_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_button_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_count" }
            }
          }

      val get_cell_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_cell_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_mode" }
            }
          }

      val get_children: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_children".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_children" }
            }
          }

      val get_custom_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_bg_color" }
            }
          }

      val get_custom_minimum_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_custom_minimum_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_height" }
            }
          }

      val get_expand_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_expand_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_right" }
            }
          }

      val get_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon" }
            }
          }

      val get_icon_max_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon_max_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_max_width" }
            }
          }

      val get_icon_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_region" }
            }
          }

      val get_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_metadata" }
            }
          }

      val get_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next" }
            }
          }

      val get_next_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_next_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next_visible" }
            }
          }

      val get_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent" }
            }
          }

      val get_prev: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_prev".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_prev" }
            }
          }

      val get_prev_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_prev_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_prev_visible" }
            }
          }

      val get_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range" }
            }
          }

      val get_range_config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_range_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_config" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_text_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text_align" }
            }
          }

      val get_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
            }
          }

      val is_button_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_button_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_button_disabled" }
            }
          }

      val is_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checked" }
            }
          }

      val is_collapsed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
            }
          }

      val is_custom_set_as_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_custom_set_as_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_custom_set_as_button" }
            }
          }

      val is_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val is_folding_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_folding_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_folding_disabled" }
            }
          }

      val is_selectable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selectable" }
            }
          }

      val is_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selected" }
            }
          }

      val move_to_bottom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "move_to_bottom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_to_bottom" }
            }
          }

      val move_to_top: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "move_to_top".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_to_top" }
            }
          }

      val remove_child: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "remove_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_child" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val set_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button" }
            }
          }

      val set_cell_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_cell_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_mode" }
            }
          }

      val set_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checked" }
            }
          }

      val set_collapsed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
            }
          }

      val set_custom_as_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_as_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_as_button" }
            }
          }

      val set_custom_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_bg_color" }
            }
          }

      val set_custom_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_color" }
            }
          }

      val set_custom_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_draw" }
            }
          }

      val set_custom_minimum_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_minimum_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_height" }
            }
          }

      val set_disable_folding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_disable_folding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_folding" }
            }
          }

      val set_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val set_expand_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_expand_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_right" }
            }
          }

      val set_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon" }
            }
          }

      val set_icon_max_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon_max_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_max_width" }
            }
          }

      val set_icon_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_region" }
            }
          }

      val set_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_metadata" }
            }
          }

      val set_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range" }
            }
          }

      val set_range_config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_range_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_config" }
            }
          }

      val set_selectable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selectable" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_text_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text_align" }
            }
          }

      val set_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
            }
          }
    }
  }
}
