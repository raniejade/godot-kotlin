// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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
    buttonIdx: Int,
    disabled: Boolean,
    tooltip: String
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(button)
    _args.append(buttonIdx)
    _args.append(disabled)
    _args.append(tooltip)
    __method_bind.add_button.call(this.toVariant(), _args.toVariant(), 5)
  }

  fun clearCustomBgColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clear_custom_bg_color.call(this.toVariant(), _arg, 1)
  }

  fun clearCustomColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clear_custom_color.call(this.toVariant(), _arg, 1)
  }

  fun deselect(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.deselect.call(this.toVariant(), _arg, 1)
  }

  fun eraseButton(column: Int, buttonIdx: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    __method_bind.erase_button.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun getButton(column: Int, buttonIdx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    val _ret = __method_bind.get_button.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getButtonCount(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_button_count.call(this.toVariant(), _arg, 1)
    return _ret.asInt()
  }

  fun getCellMode(column: Int): TreeCellMode {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_cell_mode.call(this.toVariant(), _arg, 1)
    return TreeItem.TreeCellMode.from(_ret.asInt())
  }

  fun getChildren(): TreeItem {
    val _ret = __method_bind.get_children.call(this.toVariant())
    return _ret.asObject(::TreeItem)!!
  }

  fun getCustomBgColor(column: Int): Color {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_custom_bg_color.call(this.toVariant(), _arg, 1)
    return _ret.asColor()
  }

  fun getCustomMinimumHeight(): Int {
    val _ret = __method_bind.get_custom_minimum_height.call(this.toVariant())
    return _ret.asInt()
  }

  fun getExpandRight(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_expand_right.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getIcon(column: Int): Texture {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_icon.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getIconMaxWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_icon_max_width.call(this.toVariant(), _arg, 1)
    return _ret.asInt()
  }

  fun getIconRegion(column: Int): Rect2 {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_icon_region.call(this.toVariant(), _arg, 1)
    return _ret.asRect2()
  }

  fun getMetadata(column: Int): Variant {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_metadata.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun getNext(): TreeItem {
    val _ret = __method_bind.get_next.call(this.toVariant())
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextVisible(wrap: Boolean): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.get_next_visible.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getParent(): TreeItem {
    val _ret = __method_bind.get_parent.call(this.toVariant())
    return _ret.asObject(::TreeItem)!!
  }

  fun getPrev(): TreeItem {
    val _ret = __method_bind.get_prev.call(this.toVariant())
    return _ret.asObject(::TreeItem)!!
  }

  fun getPrevVisible(wrap: Boolean): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.get_prev_visible.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getRange(column: Int): Float {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_range.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getRangeConfig(column: Int): Dictionary {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_range_config.call(this.toVariant(), _arg, 1)
    return _ret.asDictionary()
  }

  fun getText(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_text.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getTextAlign(column: Int): TextAlign {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_text_align.call(this.toVariant(), _arg, 1)
    return TreeItem.TextAlign.from(_ret.asInt())
  }

  fun getTooltip(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.get_tooltip.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun isButtonDisabled(column: Int, buttonIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    val _ret = __method_bind.is_button_disabled.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun isChecked(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.is_checked.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isCollapsed(): Boolean {
    val _ret = __method_bind.is_collapsed.call(this.toVariant())
    return _ret.asBool()
  }

  fun isCustomSetAsButton(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.is_custom_set_as_button.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isEditable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.is_editable.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isFoldingDisabled(): Boolean {
    val _ret = __method_bind.is_folding_disabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSelectable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.is_selectable.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isSelected(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.is_selected.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun moveToBottom() {
    __method_bind.move_to_bottom.call(this.toVariant())
  }

  fun moveToTop() {
    __method_bind.move_to_top.call(this.toVariant())
  }

  fun removeChild(child: Object) {
    val _arg = Variant.new(child)
    __method_bind.remove_child.call(this.toVariant(), _arg, 1)
  }

  fun select(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.select.call(this.toVariant(), _arg, 1)
  }

  fun setButton(
    column: Int,
    buttonIdx: Int,
    button: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    _args.append(button)
    __method_bind.set_button.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setCellMode(column: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(mode)
    __method_bind.set_cell_mode.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setChecked(column: Int, checked: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(checked)
    __method_bind.set_checked.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCollapsed(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_collapsed.call(this.toVariant(), _arg, 1)
  }

  fun setCustomAsButton(column: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enable)
    __method_bind.set_custom_as_button.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(color)
    _args.append(justOutline)
    __method_bind.set_custom_bg_color.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setCustomColor(column: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(color)
    __method_bind.set_custom_color.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCustomDraw(
    column: Int,
    `object`: Object,
    callback: String
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(`object`)
    _args.append(callback)
    __method_bind.set_custom_draw.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setCustomMinimumHeight(height: Int) {
    val _arg = Variant.new(height)
    __method_bind.set_custom_minimum_height.call(this.toVariant(), _arg, 1)
  }

  fun setDisableFolding(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.set_disable_folding.call(this.toVariant(), _arg, 1)
  }

  fun setEditable(column: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enabled)
    __method_bind.set_editable.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setExpandRight(column: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enable)
    __method_bind.set_expand_right.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setIcon(column: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(texture)
    __method_bind.set_icon.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setIconMaxWidth(column: Int, width: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(width)
    __method_bind.set_icon_max_width.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setIconRegion(column: Int, region: Rect2) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(region)
    __method_bind.set_icon_region.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setMetadata(column: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(meta)
    __method_bind.set_metadata.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setRange(column: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(value)
    __method_bind.set_range.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setRangeConfig(
    column: Int,
    min: Float,
    max: Float,
    step: Float,
    expr: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(min)
    _args.append(max)
    _args.append(step)
    _args.append(expr)
    __method_bind.set_range_config.call(this.toVariant(), _args.toVariant(), 5)
  }

  fun setSelectable(column: Int, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(selectable)
    __method_bind.set_selectable.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setText(column: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(text)
    __method_bind.set_text.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setTextAlign(column: Int, textAlign: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(textAlign)
    __method_bind.set_text_align.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setTooltip(column: Int, tooltip: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(tooltip)
    __method_bind.set_tooltip.call(this.toVariant(), _args.toVariant(), 2)
  }

  enum class TreeCellMode(
    val value: Int
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);

    companion object {
      fun from(value: Int): TreeCellMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

    companion object {
      fun from(value: Int): TextAlign {
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
