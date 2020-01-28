// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class PopupMenu(
  _handle: COpaquePointer
) : Popup(_handle) {
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

  fun addCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    __method_bind.addCheckItem.call(this._handle, _args.toVariant(), 3)
  }

  fun addCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    __method_bind.addCheckShortcut.call(this._handle, _args.toVariant(), 3)
  }

  fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    __method_bind.addIconCheckItem.call(this._handle, _args.toVariant(), 4)
  }

  fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    __method_bind.addIconCheckShortcut.call(this._handle, _args.toVariant(), 4)
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    __method_bind.addIconItem.call(this._handle, _args.toVariant(), 4)
  }

  fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    __method_bind.addIconShortcut.call(this._handle, _args.toVariant(), 4)
  }

  fun addItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    __method_bind.addItem.call(this._handle, _args.toVariant(), 3)
  }

  fun addRadioCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    __method_bind.addRadioCheckItem.call(this._handle, _args.toVariant(), 3)
  }

  fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    __method_bind.addRadioCheckShortcut.call(this._handle, _args.toVariant(), 3)
  }

  fun addSeparator(label: String) {
    val _arg = Variant.new(label)
    __method_bind.addSeparator.call(this._handle, _arg, 1)
  }

  fun addShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    __method_bind.addShortcut.call(this._handle, _args.toVariant(), 3)
  }

  fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(submenu)
    _args.append(id)
    __method_bind.addSubmenuItem.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getAllowSearch(): Boolean {
    val _ret = __method_bind.getAllowSearch.call(this._handle)
    return _ret.asBoolean()
  }

  fun getItemAccelerator(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemAccelerator.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.getItemCount.call(this._handle)
    return _ret.asInt()
  }

  fun getItemIcon(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemIcon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getItemId(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getItemIndex(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemMetadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getItemShortcut(idx: Int): ShortCut {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemShortcut.call(this._handle, _arg, 1)
    return _ret.asObject(::ShortCut)!!
  }

  fun getItemSubmenu(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemSubmenu.call(this._handle, _arg, 1)
    return _ret.asString()
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

  fun getSubmenuPopupDelay(): Float {
    val _ret = __method_bind.getSubmenuPopupDelay.call(this._handle)
    return _ret.asFloat()
  }

  fun isHideOnCheckableItemSelection(): Boolean {
    val _ret = __method_bind.isHideOnCheckableItemSelection.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHideOnItemSelection(): Boolean {
    val _ret = __method_bind.isHideOnItemSelection.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHideOnStateItemSelection(): Boolean {
    val _ret = __method_bind.isHideOnStateItemSelection.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHideOnWindowLoseFocus(): Boolean {
    val _ret = __method_bind.isHideOnWindowLoseFocus.call(this._handle)
    return _ret.asBoolean()
  }

  fun isItemCheckable(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemCheckable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemChecked(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemChecked.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemRadioCheckable(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemRadioCheckable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemSeparator(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemSeparator.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isItemShortcutDisabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemShortcutDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeItem(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeItem.call(this._handle, _arg, 1)
  }

  fun setAllowSearch(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowSearch.call(this._handle, _arg, 1)
  }

  fun setHideOnCheckableItemSelection(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideOnCheckableItemSelection.call(this._handle, _arg, 1)
  }

  fun setHideOnItemSelection(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideOnItemSelection.call(this._handle, _arg, 1)
  }

  fun setHideOnStateItemSelection(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideOnStateItemSelection.call(this._handle, _arg, 1)
  }

  fun setHideOnWindowLoseFocus(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideOnWindowLoseFocus.call(this._handle, _arg, 1)
  }

  fun setItemAccelerator(idx: Int, accel: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(accel)
    __method_bind.setItemAccelerator.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemAsCheckable(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    __method_bind.setItemAsCheckable.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemAsRadioCheckable(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    __method_bind.setItemAsRadioCheckable.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemAsSeparator(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    __method_bind.setItemAsSeparator.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemChecked(idx: Int, checked: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(checked)
    __method_bind.setItemChecked.call(this._handle, _args.toVariant(), 2)
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

  fun setItemId(idx: Int, id: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(id)
    __method_bind.setItemId.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(metadata)
    __method_bind.setItemMetadata.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemMultistate(idx: Int, state: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(state)
    __method_bind.setItemMultistate.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemShortcut(
    idx: Int,
    shortcut: ShortCut,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(shortcut)
    _args.append(global)
    __method_bind.setItemShortcut.call(this._handle, _args.toVariant(), 3)
  }

  fun setItemShortcutDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    __method_bind.setItemShortcutDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemSubmenu(idx: Int, submenu: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(submenu)
    __method_bind.setItemSubmenu.call(this._handle, _args.toVariant(), 2)
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

  fun setSubmenuPopupDelay(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.setSubmenuPopupDelay.call(this._handle, _arg, 1)
  }

  fun toggleItemChecked(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.toggleItemChecked.call(this._handle, _arg, 1)
  }

  fun toggleItemMultistate(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.toggleItemMultistate.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PopupMenu = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PopupMenu".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PopupMenu" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PopupMenu(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PopupMenu = PopupMenu(ptr)
    /**
     * Container for method_bind pointers for PopupMenu
     */
    private object __method_bind {
      val addCheckItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_check_item" }
        }
      val addCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_check_shortcut" }
        }
      val addIconCheckItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_check_item" }
        }
      val addIconCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_check_shortcut" }
        }
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val addIconShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_icon_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_shortcut" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_item" }
        }
      val addRadioCheckItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_radio_check_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_radio_check_item" }
        }
      val addRadioCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_radio_check_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_radio_check_shortcut" }
        }
      val addSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_separator" }
        }
      val addShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shortcut" }
        }
      val addSubmenuItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "add_submenu_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_submenu_item" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getAllowSearch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_allow_search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_search" }
        }
      val getItemAccelerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_accelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_accelerator" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val getItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_id" }
        }
      val getItemIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_index" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val getItemShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_shortcut" }
        }
      val getItemSubmenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_submenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_submenu" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
        }
      val getSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "get_submenu_popup_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_submenu_popup_delay" }
        }
      val isHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_checkable_item_selection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_hide_on_checkable_item_selection" }
        }
      val isHideOnItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_item_selection" }
        }
      val isHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_state_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_state_item_selection" }
        }
      val isHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_hide_on_window_lose_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hide_on_window_lose_focus" }
        }
      val isItemCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_checkable" }
        }
      val isItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_checked" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val isItemRadioCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_radio_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_radio_checkable" }
        }
      val isItemSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_separator" }
        }
      val isItemShortcutDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "is_item_shortcut_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_shortcut_disabled" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val setAllowSearch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_allow_search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_search" }
        }
      val setHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_checkable_item_selection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_hide_on_checkable_item_selection" }
        }
      val setHideOnItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_item_selection" }
        }
      val setHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_state_item_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_state_item_selection" }
        }
      val setHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_hide_on_window_lose_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_window_lose_focus" }
        }
      val setItemAccelerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_accelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_accelerator" }
        }
      val setItemAsCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_checkable" }
        }
      val setItemAsRadioCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_radio_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_radio_checkable" }
        }
      val setItemAsSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_as_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_as_separator" }
        }
      val setItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_checked" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val setItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_id" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val setItemMultistate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_multistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_multistate" }
        }
      val setItemShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shortcut" }
        }
      val setItemShortcutDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_shortcut_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shortcut_disabled" }
        }
      val setItemSubmenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_submenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_submenu" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_item_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
        }
      val setSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "set_submenu_popup_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_submenu_popup_delay" }
        }
      val toggleItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggle_item_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_item_checked" }
        }
      val toggleItemMultistate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggle_item_multistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_item_multistate" }
        }}
  }
}
