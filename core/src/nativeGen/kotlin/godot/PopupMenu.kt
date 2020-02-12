// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class PopupMenu(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Popup(null) {
  var allowSearch: Boolean
    get() {
       return getAllowSearch() 
    }
    set(value) {
      setAllowSearch(value)
    }

  var hideOnCheckableItemSelection: Boolean
    get() {
       return isHideOnCheckableItemSelection() 
    }
    set(value) {
      setHideOnCheckableItemSelection(value)
    }

  var hideOnItemSelection: Boolean
    get() {
       return isHideOnItemSelection() 
    }
    set(value) {
      setHideOnItemSelection(value)
    }

  var hideOnStateItemSelection: Boolean
    get() {
       return isHideOnStateItemSelection() 
    }
    set(value) {
      setHideOnStateItemSelection(value)
    }

  var submenuPopupDelay: Float
    get() {
       return getSubmenuPopupDelay() 
    }
    set(value) {
      setSubmenuPopupDelay(value)
    }

  /**
   * PopupMenu::id_focused signal
   */
  val signalIdFocused: Signal1<Int> = Signal1("id_focused")

  /**
   * PopupMenu::id_pressed signal
   */
  val signalIdPressed: Signal1<Int> = Signal1("id_pressed")

  /**
   * PopupMenu::index_pressed signal
   */
  val signalIndexPressed: Signal1<Int> = Signal1("index_pressed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addCheckItem(
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addCheckItem.call(self._handle, _args, null)
    }
  }

  fun addCheckShortcut(
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addCheckShortcut.call(self._handle, _args, null)
    }
  }

  fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addIconCheckItem.call(self._handle, _args, null)
    }
  }

  fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addIconCheckShortcut.call(self._handle, _args, null)
    }
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addIconItem.call(self._handle, _args, null)
    }
  }

  fun addIconRadioCheckItem(
    texture: Texture,
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addIconRadioCheckItem.call(self._handle, _args, null)
    }
  }

  fun addIconRadioCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addIconRadioCheckShortcut.call(self._handle, _args, null)
    }
  }

  fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addIconShortcut.call(self._handle, _args, null)
    }
  }

  fun addItem(
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addItem.call(self._handle, _args, null)
    }
  }

  fun addMultistateItem(
    label: String,
    maxStates: Int,
    defaultState: Int = 0,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(maxStates)
      _args.add(defaultState)
      _args.add(id)
      _args.add(accel)
      __method_bind.addMultistateItem.call(self._handle, _args, null)
    }
  }

  fun addRadioCheckItem(
    label: String,
    id: Int = -1,
    accel: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(id)
      _args.add(accel)
      __method_bind.addRadioCheckItem.call(self._handle, _args, null)
    }
  }

  fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addRadioCheckShortcut.call(self._handle, _args, null)
    }
  }

  fun addSeparator(label: String = "") {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSeparator.call(self._handle, listOf(label), null)
    }
  }

  fun addShortcut(
    shortcut: ShortCut,
    id: Int = -1,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(shortcut)
      _args.add(id)
      _args.add(global)
      __method_bind.addShortcut.call(self._handle, _args, null)
    }
  }

  fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(submenu)
      _args.add(id)
      __method_bind.addSubmenuItem.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun getAllowSearch(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAllowSearch.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getItemAccelerator(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemAccelerator.call(self._handle, listOf(idx), _retPtr)
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

  fun getItemId(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemId.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getItemIndex(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemIndex.call(self._handle, listOf(id), _retPtr)
      _ret.value
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

  fun getItemShortcut(idx: Int): ShortCut {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ShortCut
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemShortcut.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<ShortCut>(_tmp.value!!)
      _ret
    }
  }

  fun getItemSubmenu(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getItemSubmenu.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
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

  fun getSubmenuPopupDelay(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubmenuPopupDelay.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isHideOnCheckableItemSelection(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHideOnCheckableItemSelection.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHideOnItemSelection(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHideOnItemSelection.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHideOnStateItemSelection(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHideOnStateItemSelection.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHideOnWindowLoseFocus(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHideOnWindowLoseFocus.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isItemCheckable(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemCheckable.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemChecked(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemChecked.call(self._handle, listOf(idx), _retPtr)
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

  fun isItemRadioCheckable(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemRadioCheckable.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemSeparator(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemSeparator.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isItemShortcutDisabled(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isItemShortcutDisabled.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun removeItem(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeItem.call(self._handle, listOf(idx), null)
    }
  }

  fun setAllowSearch(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowSearch.call(self._handle, listOf(allow), null)
    }
  }

  fun setHideOnCheckableItemSelection(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideOnCheckableItemSelection.call(self._handle, listOf(enable), null)
    }
  }

  fun setHideOnItemSelection(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideOnItemSelection.call(self._handle, listOf(enable), null)
    }
  }

  fun setHideOnStateItemSelection(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideOnStateItemSelection.call(self._handle, listOf(enable), null)
    }
  }

  fun setHideOnWindowLoseFocus(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideOnWindowLoseFocus.call(self._handle, listOf(enable), null)
    }
  }

  fun setItemAccelerator(idx: Int, accel: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(accel)
      __method_bind.setItemAccelerator.call(self._handle, _args, null)
    }
  }

  fun setItemAsCheckable(idx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enable)
      __method_bind.setItemAsCheckable.call(self._handle, _args, null)
    }
  }

  fun setItemAsRadioCheckable(idx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enable)
      __method_bind.setItemAsRadioCheckable.call(self._handle, _args, null)
    }
  }

  fun setItemAsSeparator(idx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enable)
      __method_bind.setItemAsSeparator.call(self._handle, _args, null)
    }
  }

  fun setItemChecked(idx: Int, checked: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(checked)
      __method_bind.setItemChecked.call(self._handle, _args, null)
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

  fun setItemId(idx: Int, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(id)
      __method_bind.setItemId.call(self._handle, _args, null)
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

  fun setItemMultistate(idx: Int, state: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(state)
      __method_bind.setItemMultistate.call(self._handle, _args, null)
    }
  }

  fun setItemShortcut(
    idx: Int,
    shortcut: ShortCut,
    global: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(shortcut)
      _args.add(global)
      __method_bind.setItemShortcut.call(self._handle, _args, null)
    }
  }

  fun setItemShortcutDisabled(idx: Int, disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(disabled)
      __method_bind.setItemShortcutDisabled.call(self._handle, _args, null)
    }
  }

  fun setItemSubmenu(idx: Int, submenu: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(submenu)
      __method_bind.setItemSubmenu.call(self._handle, _args, null)
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

  fun setSubmenuPopupDelay(seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubmenuPopupDelay.call(self._handle, listOf(seconds), null)
    }
  }

  fun toggleItemChecked(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.toggleItemChecked.call(self._handle, listOf(idx), null)
    }
  }

  fun toggleItemMultistate(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.toggleItemMultistate.call(self._handle, listOf(idx), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PopupMenu".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PopupMenu" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PopupMenu
     */
    private object __method_bind {
      val addCheckItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_check_item" }
        }
      val addCheckShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_check_shortcut" }
        }
      val addIconCheckItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_check_item" }
        }
      val addIconCheckShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_check_shortcut" }
        }
      val addIconItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val addIconRadioCheckItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_radio_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_radio_check_item" }
        }
      val addIconRadioCheckShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_radio_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_radio_check_shortcut" }
        }
      val addIconShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_shortcut" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_item" }
        }
      val addMultistateItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_multistate_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_multistate_item" }
        }
      val addRadioCheckItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_radio_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_radio_check_item" }
        }
      val addRadioCheckShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_radio_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_radio_check_shortcut" }
        }
      val addSeparator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_separator" }
        }
      val addShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shortcut" }
        }
      val addSubmenuItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_submenu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_submenu_item" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getAllowSearch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_allow_search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_search" }
        }
      val getItemAccelerator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_accelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_accelerator" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val getItemId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_id" }
        }
      val getItemIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_index" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val getItemShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_shortcut" }
        }
      val getItemSubmenu: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_submenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_submenu" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
        }
      val getSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_submenu_popup_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_submenu_popup_delay" }
        }
      val isHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_checkable_item_selection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_hide_on_checkable_item_selection" }
        }
      val isHideOnItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_item_selection" }
        }
      val isHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_state_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_state_item_selection" }
        }
      val isHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_window_lose_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_window_lose_focus" }
        }
      val isItemCheckable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_checkable" }
        }
      val isItemChecked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_checked" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val isItemRadioCheckable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_radio_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_radio_checkable" }
        }
      val isItemSeparator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_separator" }
        }
      val isItemShortcutDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_shortcut_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_shortcut_disabled" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val setAllowSearch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_allow_search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_search" }
        }
      val setHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_checkable_item_selection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_hide_on_checkable_item_selection" }
        }
      val setHideOnItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_item_selection" }
        }
      val setHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_state_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_state_item_selection" }
        }
      val setHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_window_lose_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_window_lose_focus" }
        }
      val setItemAccelerator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_accelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_accelerator" }
        }
      val setItemAsCheckable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_checkable" }
        }
      val setItemAsRadioCheckable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_radio_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_radio_checkable" }
        }
      val setItemAsSeparator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_separator" }
        }
      val setItemChecked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_checked" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val setItemId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_id" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val setItemMultistate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_multistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_multistate" }
        }
      val setItemShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shortcut" }
        }
      val setItemShortcutDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_shortcut_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shortcut_disabled" }
        }
      val setItemSubmenu: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_submenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_submenu" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
        }
      val setSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_submenu_popup_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_submenu_popup_delay" }
        }
      val toggleItemChecked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggle_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_item_checked" }
        }
      val toggleItemMultistate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggle_item_multistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_item_multistate" }
        }}
  }
}
