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

  var items: VariantArray
    get() {
       return _getItems() 
    }
    set(value) {
      _setItems(value)
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
            "addCheckItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCheckItem" }
        }
      val addCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addCheckShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCheckShortcut" }
        }
      val addIconCheckItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addIconCheckItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconCheckItem" }
        }
      val addIconCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addIconCheckShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconCheckShortcut" }
        }
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addIconItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconItem" }
        }
      val addIconShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addIconShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconShortcut" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addItem" }
        }
      val addRadioCheckItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addRadioCheckItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addRadioCheckItem" }
        }
      val addRadioCheckShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addRadioCheckShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addRadioCheckShortcut" }
        }
      val addSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addSeparator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSeparator" }
        }
      val addShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addShortcut" }
        }
      val addSubmenuItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "addSubmenuItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSubmenuItem" }
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
            "getAllowSearch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAllowSearch" }
        }
      val getItemAccelerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemAccelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemAccelerator" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCount" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIcon" }
        }
      val getItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemId" }
        }
      val getItemIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIndex" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemMetadata" }
        }
      val getItemShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemShortcut" }
        }
      val getItemSubmenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemSubmenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemSubmenu" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemText" }
        }
      val getItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getItemTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemTooltip" }
        }
      val getSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "getSubmenuPopupDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubmenuPopupDelay" }
        }
      val isHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isHideOnCheckableItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHideOnCheckableItemSelection" }
        }
      val isHideOnItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isHideOnItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHideOnItemSelection" }
        }
      val isHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isHideOnStateItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHideOnStateItemSelection" }
        }
      val isHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isHideOnWindowLoseFocus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHideOnWindowLoseFocus" }
        }
      val isItemCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemCheckable" }
        }
      val isItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemChecked" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemDisabled" }
        }
      val isItemRadioCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemRadioCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemRadioCheckable" }
        }
      val isItemSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemSeparator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemSeparator" }
        }
      val isItemShortcutDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "isItemShortcutDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemShortcutDisabled" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "removeItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeItem" }
        }
      val setAllowSearch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setAllowSearch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowSearch" }
        }
      val setHideOnCheckableItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setHideOnCheckableItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideOnCheckableItemSelection" }
        }
      val setHideOnItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setHideOnItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideOnItemSelection" }
        }
      val setHideOnStateItemSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setHideOnStateItemSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideOnStateItemSelection" }
        }
      val setHideOnWindowLoseFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setHideOnWindowLoseFocus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideOnWindowLoseFocus" }
        }
      val setItemAccelerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemAccelerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemAccelerator" }
        }
      val setItemAsCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemAsCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemAsCheckable" }
        }
      val setItemAsRadioCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemAsRadioCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemAsRadioCheckable" }
        }
      val setItemAsSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemAsSeparator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemAsSeparator" }
        }
      val setItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemChecked" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemDisabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIcon" }
        }
      val setItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemId" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemMetadata" }
        }
      val setItemMultistate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemMultistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemMultistate" }
        }
      val setItemShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemShortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemShortcut" }
        }
      val setItemShortcutDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemShortcutDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemShortcutDisabled" }
        }
      val setItemSubmenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemSubmenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemSubmenu" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemText" }
        }
      val setItemTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setItemTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemTooltip" }
        }
      val setSubmenuPopupDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "setSubmenuPopupDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubmenuPopupDelay" }
        }
      val toggleItemChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggleItemChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggleItemChecked" }
        }
      val toggleItemMultistate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
            "toggleItemMultistate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggleItemMultistate" }
        }}
  }
}
