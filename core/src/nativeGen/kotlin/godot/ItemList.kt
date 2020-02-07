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

open class ItemList(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  var autoHeight: Boolean
    get() {
       return hasAutoHeight() 
    }
    set(value) {
      setAutoHeight(value)
    }

  var fixedColumnWidth: Int
    get() {
       return getFixedColumnWidth() 
    }
    set(value) {
      setFixedColumnWidth(value)
    }

  var fixedIconSize: Vector2
    get() {
       return getFixedIconSize() 
    }
    set(value) {
      setFixedIconSize(value)
    }

  var iconMode: IconMode
    get() {
       return getIconMode() 
    }
    set(value) {
      setIconMode(value.value)
    }

  var iconScale: Float
    get() {
       return getIconScale() 
    }
    set(value) {
      setIconScale(value)
    }

  var maxColumns: Int
    get() {
       return getMaxColumns() 
    }
    set(value) {
      setMaxColumns(value)
    }

  var maxTextLines: Int
    get() {
       return getMaxTextLines() 
    }
    set(value) {
      setMaxTextLines(value)
    }

  var sameColumnWidth: Boolean
    get() {
       return isSameColumnWidth() 
    }
    set(value) {
      setSameColumnWidth(value)
    }

  var selectMode: SelectMode
    get() {
       return getSelectMode() 
    }
    set(value) {
      setSelectMode(value.value)
    }

  /**
   * ItemList::item_activated signal
   */
  val signalItemActivated: Signal1<Int> = Signal1("item_activated")

  /**
   * ItemList::item_rmb_selected signal
   */
  val signalItemRmbSelected: Signal2<Int, Vector2> = Signal2("item_rmb_selected")

  /**
   * ItemList::item_selected signal
   */
  val signalItemSelected: Signal1<Int> = Signal1("item_selected")

  /**
   * ItemList::multi_selected signal
   */
  val signalMultiSelected: Signal2<Int, Boolean> = Signal2("multi_selected")

  /**
   * ItemList::nothing_selected signal
   */
  val signalNothingSelected: Signal0 = Signal0("nothing_selected")

  /**
   * ItemList::rmb_clicked signal
   */
  val signalRmbClicked: Signal1<Vector2> = Signal1("rmb_clicked")

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for fixedIconSize
   */
  fun fixedIconSize(cb: Vector2.() -> Unit) {
    val _p = fixedIconSize
    cb(_p)
    fixedIconSize = _p
  }

  fun addIconItem(icon: Texture, selectable: Boolean = true) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(icon))
    _args.add(Variant.fromAny(selectable))
    __method_bind.addIconItem.call(this._handle, _args)
  }

  fun addItem(
    text: String,
    icon: Texture,
    selectable: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(text))
    _args.add(Variant.fromAny(icon))
    _args.add(Variant.fromAny(selectable))
    __method_bind.addItem.call(this._handle, _args)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun ensureCurrentIsVisible() {
    __method_bind.ensureCurrentIsVisible.call(this._handle)
  }

  fun getAllowReselect(): Boolean {
    val _ret = __method_bind.getAllowReselect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getAllowRmbSelect(): Boolean {
    val _ret = __method_bind.getAllowRmbSelect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFixedColumnWidth(): Int {
    val _ret = __method_bind.getFixedColumnWidth.call(this._handle)
    return _ret.asInt()
  }

  fun getFixedIconSize(): Vector2 {
    val _ret = __method_bind.getFixedIconSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getIconMode(): IconMode {
    val _ret = __method_bind.getIconMode.call(this._handle)
    return ItemList.IconMode.from(_ret.asInt())
  }

  fun getIconScale(): Float {
    val _ret = __method_bind.getIconScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getItemAtPosition(position: Vector2, exact: Boolean = false): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(exact))
    val _ret = __method_bind.getItemAtPosition.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.getItemCount.call(this._handle)
    return _ret.asInt()
  }

  fun getItemCustomBgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemCustomBgColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getItemCustomFgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemCustomFgColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getItemIcon(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIcon.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getItemIconModulate(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIconModulate.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getItemIconRegion(idx: Int): Rect2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIconRegion.call(this._handle, listOf(_arg))
    return _ret.asRect2()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemMetadata.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getItemText(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemText.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getItemTooltip(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemTooltip.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getMaxColumns(): Int {
    val _ret = __method_bind.getMaxColumns.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxTextLines(): Int {
    val _ret = __method_bind.getMaxTextLines.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectMode(): SelectMode {
    val _ret = __method_bind.getSelectMode.call(this._handle)
    return ItemList.SelectMode.from(_ret.asInt())
  }

  fun getSelectedItems(): PoolIntArray {
    val _ret = __method_bind.getSelectedItems.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getVScroll(): VScrollBar {
    val _ret = __method_bind.getVScroll.call(this._handle)
    return _ret.asObject(::VScrollBar)!!
  }

  fun hasAutoHeight(): Boolean {
    val _ret = __method_bind.hasAutoHeight.call(this._handle)
    return _ret.asBoolean()
  }

  fun isAnythingSelected(): Boolean {
    val _ret = __method_bind.isAnythingSelected.call(this._handle)
    return _ret.asBoolean()
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isItemIconTransposed(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemIconTransposed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isItemSelectable(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemSelectable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isItemTooltipEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemTooltipEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isSameColumnWidth(): Boolean {
    val _ret = __method_bind.isSameColumnWidth.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelected(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isSelected.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun moveItem(fromIdx: Int, toIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromIdx))
    _args.add(Variant.fromAny(toIdx))
    __method_bind.moveItem.call(this._handle, _args)
  }

  fun removeItem(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeItem.call(this._handle, listOf(_arg))
  }

  fun select(idx: Int, single: Boolean = true) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(single))
    __method_bind.select.call(this._handle, _args)
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowReselect.call(this._handle, listOf(_arg))
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowRmbSelect.call(this._handle, listOf(_arg))
  }

  fun setAutoHeight(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoHeight.call(this._handle, listOf(_arg))
  }

  fun setFixedColumnWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.setFixedColumnWidth.call(this._handle, listOf(_arg))
  }

  fun setFixedIconSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setFixedIconSize.call(this._handle, listOf(_arg))
  }

  fun setIconMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setIconMode.call(this._handle, listOf(_arg))
  }

  fun setIconScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setIconScale.call(this._handle, listOf(_arg))
  }

  fun setItemCustomBgColor(idx: Int, customBgColor: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(customBgColor))
    __method_bind.setItemCustomBgColor.call(this._handle, _args)
  }

  fun setItemCustomFgColor(idx: Int, customFgColor: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(customFgColor))
    __method_bind.setItemCustomFgColor.call(this._handle, _args)
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.setItemDisabled.call(this._handle, _args)
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(icon))
    __method_bind.setItemIcon.call(this._handle, _args)
  }

  fun setItemIconModulate(idx: Int, modulate: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(modulate))
    __method_bind.setItemIconModulate.call(this._handle, _args)
  }

  fun setItemIconRegion(idx: Int, rect: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(rect))
    __method_bind.setItemIconRegion.call(this._handle, _args)
  }

  fun setItemIconTransposed(idx: Int, transposed: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(transposed))
    __method_bind.setItemIconTransposed.call(this._handle, _args)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(metadata))
    __method_bind.setItemMetadata.call(this._handle, _args)
  }

  fun setItemSelectable(idx: Int, selectable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(selectable))
    __method_bind.setItemSelectable.call(this._handle, _args)
  }

  fun setItemText(idx: Int, text: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(text))
    __method_bind.setItemText.call(this._handle, _args)
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(tooltip))
    __method_bind.setItemTooltip.call(this._handle, _args)
  }

  fun setItemTooltipEnabled(idx: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(enable))
    __method_bind.setItemTooltipEnabled.call(this._handle, _args)
  }

  fun setMaxColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setMaxColumns.call(this._handle, listOf(_arg))
  }

  fun setMaxTextLines(lines: Int) {
    val _arg = Variant.new(lines)
    __method_bind.setMaxTextLines.call(this._handle, listOf(_arg))
  }

  fun setSameColumnWidth(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSameColumnWidth.call(this._handle, listOf(_arg))
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSelectMode.call(this._handle, listOf(_arg))
  }

  fun sortItemsByText() {
    __method_bind.sortItemsByText.call(this._handle)
  }

  fun unselect(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.unselect.call(this._handle, listOf(_arg))
  }

  fun unselectAll() {
    __method_bind.unselectAll.call(this._handle)
  }

  enum class SelectMode(
    val value: Int
  ) {
    SINGLE(0),

    MULTI(1);

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
    TOP(0),

    LEFT(1);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ItemList".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ItemList" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ItemList
     */
    private object __method_bind {
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val addItem: CPointer<godot_method_bind>
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
      val ensureCurrentIsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "ensure_current_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_current_is_visible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val getFixedColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_column_width" }
        }
      val getFixedIconSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_icon_size" }
        }
      val getIconMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_mode" }
        }
      val getIconScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_scale" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val getItemCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_bg_color" }
        }
      val getItemCustomFgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_fg_color" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val getItemIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_modulate" }
        }
      val getItemIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_region" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
        }
      val getMaxColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_columns" }
        }
      val getMaxTextLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_text_lines" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val getSelectedItems: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_selected_items".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_items" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val hasAutoHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "has_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_auto_height" }
        }
      val isAnythingSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_anything_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_anything_selected" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val isItemIconTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_icon_transposed" }
        }
      val isItemSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_selectable" }
        }
      val isItemTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_tooltip_enabled" }
        }
      val isSameColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_same_column_width" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val moveItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "move_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_item" }
        }
      val removeItem: CPointer<godot_method_bind>
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
      val setAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val setAutoHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_height" }
        }
      val setFixedColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_column_width" }
        }
      val setFixedIconSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_icon_size" }
        }
      val setIconMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_mode" }
        }
      val setIconScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_scale" }
        }
      val setItemCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_bg_color" }
        }
      val setItemCustomFgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_fg_color" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val setItemIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_modulate" }
        }
      val setItemIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_region" }
        }
      val setItemIconTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_transposed" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val setItemSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_selectable" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
        }
      val setItemTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip_enabled" }
        }
      val setMaxColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_columns" }
        }
      val setMaxTextLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_text_lines" }
        }
      val setSameColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_same_column_width" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }
      val sortItemsByText: CPointer<godot_method_bind>
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
      val unselectAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "unselect_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselect_all" }
        }}
  }
}
