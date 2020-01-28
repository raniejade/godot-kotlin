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

  var iconMode: Int
    get() {
       return ItemList.IconMode.from(getIconMode()) 
    }
    set(value) {
      setIconMode(ItemList.IconMode.from(value))
    }

  var iconScale: Float
    get() {
       return getIconScale() 
    }
    set(value) {
      setIconScale(value)
    }

  var items: VariantArray
    get() {
       return _getItems() 
    }
    set(value) {
      _setItems(value)
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

  var selectMode: Int
    get() {
       return ItemList.SelectMode.from(getSelectMode()) 
    }
    set(value) {
      setSelectMode(ItemList.SelectMode.from(value))
    }

  fun addIconItem(icon: Texture, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(icon)
    _args.append(selectable)
    __method_bind.addIconItem.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.addItem.call(this._handle, _args.toVariant(), 3)
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

  fun getItemAtPosition(position: Vector2, exact: Boolean): Int {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(exact)
    val _ret = __method_bind.getItemAtPosition.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.getItemCount.call(this._handle)
    return _ret.asInt()
  }

  fun getItemCustomBgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemCustomBgColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemCustomFgColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemCustomFgColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemIcon(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIcon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getItemIconModulate(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIconModulate.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getItemIconRegion(idx: Int): Rect2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIconRegion.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemMetadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getItemText(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemText.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getItemTooltip(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemTooltip.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.isItemDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemIconTransposed(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemIconTransposed.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemSelectable(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemSelectable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemTooltipEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemTooltipEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isSameColumnWidth(): Boolean {
    val _ret = __method_bind.isSameColumnWidth.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelected(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isSelected.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun moveItem(fromIdx: Int, toIdx: Int) {
    val _args = VariantArray.new()
    _args.append(fromIdx)
    _args.append(toIdx)
    __method_bind.moveItem.call(this._handle, _args.toVariant(), 2)
  }

  fun removeItem(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeItem.call(this._handle, _arg, 1)
  }

  fun select(idx: Int, single: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(single)
    __method_bind.select.call(this._handle, _args.toVariant(), 2)
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowReselect.call(this._handle, _arg, 1)
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowRmbSelect.call(this._handle, _arg, 1)
  }

  fun setAutoHeight(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoHeight.call(this._handle, _arg, 1)
  }

  fun setFixedColumnWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.setFixedColumnWidth.call(this._handle, _arg, 1)
  }

  fun setFixedIconSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setFixedIconSize.call(this._handle, _arg, 1)
  }

  fun setIconMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setIconMode.call(this._handle, _arg, 1)
  }

  fun setIconScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setIconScale.call(this._handle, _arg, 1)
  }

  fun setItemCustomBgColor(idx: Int, customBgColor: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(customBgColor)
    __method_bind.setItemCustomBgColor.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemCustomFgColor(idx: Int, customFgColor: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(customFgColor)
    __method_bind.setItemCustomFgColor.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    __method_bind.setItemDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(icon)
    __method_bind.setItemIcon.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconModulate(idx: Int, modulate: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(modulate)
    __method_bind.setItemIconModulate.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconRegion(idx: Int, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(rect)
    __method_bind.setItemIconRegion.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIconTransposed(idx: Int, rect: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(rect)
    __method_bind.setItemIconTransposed.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(metadata)
    __method_bind.setItemMetadata.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemSelectable(idx: Int, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(selectable)
    __method_bind.setItemSelectable.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemText(idx: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(text)
    __method_bind.setItemText.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tooltip)
    __method_bind.setItemTooltip.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemTooltipEnabled(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    __method_bind.setItemTooltipEnabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setMaxColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setMaxColumns.call(this._handle, _arg, 1)
  }

  fun setMaxTextLines(lines: Int) {
    val _arg = Variant.new(lines)
    __method_bind.setMaxTextLines.call(this._handle, _arg, 1)
  }

  fun setSameColumnWidth(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSameColumnWidth.call(this._handle, _arg, 1)
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSelectMode.call(this._handle, _arg, 1)
  }

  fun sortItemsByText() {
    __method_bind.sortItemsByText.call(this._handle)
  }

  fun unselect(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.unselect.call(this._handle, _arg, 1)
  }

  fun unselectAll() {
    __method_bind.unselectAll.call(this._handle)
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
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "addIconItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconItem" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "addItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addItem" }
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
            "ensureCurrentIsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensureCurrentIsVisible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getAllowReselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAllowReselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getAllowRmbSelect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAllowRmbSelect" }
        }
      val getFixedColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getFixedColumnWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFixedColumnWidth" }
        }
      val getFixedIconSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getFixedIconSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFixedIconSize" }
        }
      val getIconMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getIconMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIconMode" }
        }
      val getIconScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getIconScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIconScale" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemAtPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemAtPosition" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCount" }
        }
      val getItemCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemCustomBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCustomBgColor" }
        }
      val getItemCustomFgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemCustomFgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCustomFgColor" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIcon" }
        }
      val getItemIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemIconModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIconModulate" }
        }
      val getItemIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemIconRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIconRegion" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemMetadata" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemText" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getItemTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemTooltip" }
        }
      val getMaxColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getMaxColumns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxColumns" }
        }
      val getMaxTextLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getMaxTextLines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxTextLines" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getSelectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectMode" }
        }
      val getSelectedItems: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getSelectedItems".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedItems" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "getVScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVScroll" }
        }
      val hasAutoHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "hasAutoHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAutoHeight" }
        }
      val isAnythingSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isAnythingSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAnythingSelected" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemDisabled" }
        }
      val isItemIconTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isItemIconTransposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemIconTransposed" }
        }
      val isItemSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isItemSelectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemSelectable" }
        }
      val isItemTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isItemTooltipEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemTooltipEnabled" }
        }
      val isSameColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isSameColumnWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSameColumnWidth" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "isSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelected" }
        }
      val moveItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "moveItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveItem" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "removeItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeItem" }
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
            "setAllowReselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowReselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setAllowRmbSelect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowRmbSelect" }
        }
      val setAutoHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setAutoHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoHeight" }
        }
      val setFixedColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setFixedColumnWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFixedColumnWidth" }
        }
      val setFixedIconSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setFixedIconSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFixedIconSize" }
        }
      val setIconMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setIconMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIconMode" }
        }
      val setIconScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setIconScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIconScale" }
        }
      val setItemCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemCustomBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemCustomBgColor" }
        }
      val setItemCustomFgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemCustomFgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemCustomFgColor" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemDisabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIcon" }
        }
      val setItemIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemIconModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIconModulate" }
        }
      val setItemIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemIconRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIconRegion" }
        }
      val setItemIconTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemIconTransposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIconTransposed" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemMetadata" }
        }
      val setItemSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemSelectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemSelectable" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemText" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemTooltip" }
        }
      val setItemTooltipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setItemTooltipEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemTooltipEnabled" }
        }
      val setMaxColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setMaxColumns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxColumns" }
        }
      val setMaxTextLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setMaxTextLines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxTextLines" }
        }
      val setSameColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setSameColumnWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSameColumnWidth" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "setSelectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelectMode" }
        }
      val sortItemsByText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "sortItemsByText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sortItemsByText" }
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
            "unselectAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselectAll" }
        }}
  }
}
