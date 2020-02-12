// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(icon)
      _args.add(selectable)
      __method_bind.addIconItem.call(self._handle, _args, null)
    }
  }

  fun addItem(
    text: String,
    icon: Texture,
    selectable: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(text)
      _args.add(icon)
      _args.add(selectable)
      __method_bind.addItem.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun ensureCurrentIsVisible() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.ensureCurrentIsVisible.call(self._handle, emptyList(), null)
    }
  }

  fun getAllowReselect(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAllowReselect.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAllowRmbSelect(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAllowRmbSelect.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFixedColumnWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFixedColumnWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFixedIconSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getFixedIconSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIconMode(): IconMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIconMode.call(self._handle, emptyList(), _retPtr)
      ItemList.IconMode.from(_ret.value)
    }
  }

  fun getIconScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIconScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getItemAtPosition(position: Vector2, exact: Boolean = false): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(exact)
      __method_bind.getItemAtPosition.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getItemCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getItemCustomBgColor(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemCustomBgColor.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemCustomFgColor(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemCustomFgColor.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemIcon(idx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemIcon.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getItemIconModulate(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemIconModulate.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemIconRegion(idx: Int): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemIconRegion.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemMetadata(idx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemMetadata.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemText(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getItemText.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getItemTooltip(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getItemTooltip.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMaxColumns(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxColumns.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxTextLines(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxTextLines.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectMode(): SelectMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectMode.call(self._handle, emptyList(), _retPtr)
      ItemList.SelectMode.from(_ret.value)
    }
  }

  fun getSelectedItems(): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getSelectedItems.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVScroll(): VScrollBar {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VScrollBar
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVScroll.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VScrollBar>(_tmp.value!!)
      _ret
    }
  }

  fun hasAutoHeight(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutoHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAnythingSelected(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAnythingSelected.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isItemDisabled(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemDisabled.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemIconTransposed(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemIconTransposed.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemSelectable(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemSelectable.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemTooltipEnabled(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemTooltipEnabled.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isSameColumnWidth(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSameColumnWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelected(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelected.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun moveItem(fromIdx: Int, toIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fromIdx)
      _args.add(toIdx)
      __method_bind.moveItem.call(self._handle, _args, null)
    }
  }

  fun removeItem(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeItem.call(self._handle, listOf(idx), null)
    }
  }

  fun select(idx: Int, single: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(single)
      __method_bind.select.call(self._handle, _args, null)
    }
  }

  fun setAllowReselect(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowReselect.call(self._handle, listOf(allow), null)
    }
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowRmbSelect.call(self._handle, listOf(allow), null)
    }
  }

  fun setAutoHeight(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoHeight.call(self._handle, listOf(enable), null)
    }
  }

  fun setFixedColumnWidth(width: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFixedColumnWidth.call(self._handle, listOf(width), null)
    }
  }

  fun setFixedIconSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFixedIconSize.call(self._handle, listOf(size), null)
    }
  }

  fun setIconMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIconMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setIconScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIconScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setItemCustomBgColor(idx: Int, customBgColor: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(customBgColor)
      __method_bind.setItemCustomBgColor.call(self._handle, _args, null)
    }
  }

  fun setItemCustomFgColor(idx: Int, customFgColor: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(customFgColor)
      __method_bind.setItemCustomFgColor.call(self._handle, _args, null)
    }
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(disabled)
      __method_bind.setItemDisabled.call(self._handle, _args, null)
    }
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(icon)
      __method_bind.setItemIcon.call(self._handle, _args, null)
    }
  }

  fun setItemIconModulate(idx: Int, modulate: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(modulate)
      __method_bind.setItemIconModulate.call(self._handle, _args, null)
    }
  }

  fun setItemIconRegion(idx: Int, rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(rect)
      __method_bind.setItemIconRegion.call(self._handle, _args, null)
    }
  }

  fun setItemIconTransposed(idx: Int, transposed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(transposed)
      __method_bind.setItemIconTransposed.call(self._handle, _args, null)
    }
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(metadata)
      __method_bind.setItemMetadata.call(self._handle, _args, null)
    }
  }

  fun setItemSelectable(idx: Int, selectable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(selectable)
      __method_bind.setItemSelectable.call(self._handle, _args, null)
    }
  }

  fun setItemText(idx: Int, text: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(text)
      __method_bind.setItemText.call(self._handle, _args, null)
    }
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(tooltip)
      __method_bind.setItemTooltip.call(self._handle, _args, null)
    }
  }

  fun setItemTooltipEnabled(idx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enable)
      __method_bind.setItemTooltipEnabled.call(self._handle, _args, null)
    }
  }

  fun setMaxColumns(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxColumns.call(self._handle, listOf(amount), null)
    }
  }

  fun setMaxTextLines(lines: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxTextLines.call(self._handle, listOf(lines), null)
    }
  }

  fun setSameColumnWidth(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSameColumnWidth.call(self._handle, listOf(enable), null)
    }
  }

  fun setSelectMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectMode.call(self._handle, listOf(mode), null)
    }
  }

  fun sortItemsByText() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.sortItemsByText.call(self._handle, emptyList(), null)
    }
  }

  fun unselect(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unselect.call(self._handle, listOf(idx), null)
    }
  }

  fun unselectAll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unselectAll.call(self._handle, emptyList(), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_item" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val ensureCurrentIsVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "ensure_current_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_current_is_visible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val getFixedColumnWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_column_width" }
        }
      val getFixedIconSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_icon_size" }
        }
      val getIconMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_mode" }
        }
      val getIconScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_scale" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val getItemCustomBgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_bg_color" }
        }
      val getItemCustomFgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_custom_fg_color" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val getItemIconModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_modulate" }
        }
      val getItemIconRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon_region" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
        }
      val getMaxColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_columns" }
        }
      val getMaxTextLines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_text_lines" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val getSelectedItems: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_selected_items".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_items" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val hasAutoHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "has_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_auto_height" }
        }
      val isAnythingSelected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_anything_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_anything_selected" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val isItemIconTransposed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_icon_transposed" }
        }
      val isItemSelectable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_selectable" }
        }
      val isItemTooltipEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_tooltip_enabled" }
        }
      val isSameColumnWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_same_column_width" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val moveItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "move_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_item" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val select: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val setAllowReselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val setAutoHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_auto_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_height" }
        }
      val setFixedColumnWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_column_width" }
        }
      val setFixedIconSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_fixed_icon_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_icon_size" }
        }
      val setIconMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_mode" }
        }
      val setIconScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_icon_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_scale" }
        }
      val setItemCustomBgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_bg_color" }
        }
      val setItemCustomFgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_custom_fg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_custom_fg_color" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val setItemIconModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_modulate" }
        }
      val setItemIconRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_region" }
        }
      val setItemIconTransposed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_icon_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon_transposed" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val setItemSelectable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_selectable" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
        }
      val setItemTooltipEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_item_tooltip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip_enabled" }
        }
      val setMaxColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_columns" }
        }
      val setMaxTextLines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_max_text_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_text_lines" }
        }
      val setSameColumnWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_same_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_same_column_width" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }
      val sortItemsByText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "sort_items_by_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sort_items_by_text" }
        }
      val unselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "unselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselect" }
        }
      val unselectAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ItemList".cstr.ptr,
            "unselect_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unselect_all" }
        }}
  }
}
