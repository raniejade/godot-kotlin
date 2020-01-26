// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class PopupMenu internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  fun addCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    TODO()
  }

  fun addCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    TODO()
  }

  fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    TODO()
  }

  fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    TODO()
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    TODO()
  }

  fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    TODO()
  }

  fun addItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    TODO()
  }

  fun addRadioCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    TODO()
  }

  fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    TODO()
  }

  fun addSeparator(label: String) {
    TODO()
  }

  fun addShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    TODO()
  }

  fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int
  ) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun getAllowSearch(): Boolean {
    TODO()
  }

  fun getItemAccelerator(idx: Int): Int {
    TODO()
  }

  fun getItemCount(): Int {
    TODO()
  }

  fun getItemIcon(idx: Int): Texture {
    TODO()
  }

  fun getItemId(idx: Int): Int {
    TODO()
  }

  fun getItemIndex(id: Int): Int {
    TODO()
  }

  fun getItemMetadata(idx: Int): Variant {
    TODO()
  }

  fun getItemShortcut(idx: Int): ShortCut {
    TODO()
  }

  fun getItemSubmenu(idx: Int): String {
    TODO()
  }

  fun getItemText(idx: Int): String {
    TODO()
  }

  fun getItemTooltip(idx: Int): String {
    TODO()
  }

  fun getSubmenuPopupDelay(): Float {
    TODO()
  }

  fun isHideOnCheckableItemSelection(): Boolean {
    TODO()
  }

  fun isHideOnItemSelection(): Boolean {
    TODO()
  }

  fun isHideOnStateItemSelection(): Boolean {
    TODO()
  }

  fun isHideOnWindowLoseFocus(): Boolean {
    TODO()
  }

  fun isItemCheckable(idx: Int): Boolean {
    TODO()
  }

  fun isItemChecked(idx: Int): Boolean {
    TODO()
  }

  fun isItemDisabled(idx: Int): Boolean {
    TODO()
  }

  fun isItemRadioCheckable(idx: Int): Boolean {
    TODO()
  }

  fun isItemSeparator(idx: Int): Boolean {
    TODO()
  }

  fun isItemShortcutDisabled(idx: Int): Boolean {
    TODO()
  }

  fun removeItem(idx: Int) {
    TODO()
  }

  fun setAllowSearch(allow: Boolean) {
    TODO()
  }

  fun setHideOnCheckableItemSelection(enable: Boolean) {
    TODO()
  }

  fun setHideOnItemSelection(enable: Boolean) {
    TODO()
  }

  fun setHideOnStateItemSelection(enable: Boolean) {
    TODO()
  }

  fun setHideOnWindowLoseFocus(enable: Boolean) {
    TODO()
  }

  fun setItemAccelerator(idx: Int, accel: Int) {
    TODO()
  }

  fun setItemAsCheckable(idx: Int, enable: Boolean) {
    TODO()
  }

  fun setItemAsRadioCheckable(idx: Int, enable: Boolean) {
    TODO()
  }

  fun setItemAsSeparator(idx: Int, enable: Boolean) {
    TODO()
  }

  fun setItemChecked(idx: Int, checked: Boolean) {
    TODO()
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    TODO()
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    TODO()
  }

  fun setItemId(idx: Int, id: Int) {
    TODO()
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    TODO()
  }

  fun setItemMultistate(idx: Int, state: Int) {
    TODO()
  }

  fun setItemShortcut(
    idx: Int,
    shortcut: ShortCut,
    global: Boolean
  ) {
    TODO()
  }

  fun setItemShortcutDisabled(idx: Int, disabled: Boolean) {
    TODO()
  }

  fun setItemSubmenu(idx: Int, submenu: String) {
    TODO()
  }

  fun setItemText(idx: Int, text: String) {
    TODO()
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    TODO()
  }

  fun setSubmenuPopupDelay(seconds: Float) {
    TODO()
  }

  fun toggleItemChecked(idx: Int) {
    TODO()
  }

  fun toggleItemMultistate(idx: Int) {
    TODO()
  }

  companion object {
    fun new(): PopupMenu = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PopupMenu".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PopupMenu" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PopupMenu(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PopupMenu
     */
    private object __method_bind {
      val add_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_check_item" }
            }
          }

      val add_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_check_shortcut" }
            }
          }

      val add_icon_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_check_item" }
            }
          }

      val add_icon_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_check_shortcut" }
            }
          }

      val add_icon_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
            }
          }

      val add_icon_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_shortcut" }
            }
          }

      val add_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_item" }
            }
          }

      val add_radio_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_radio_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_radio_check_item" }
            }
          }

      val add_radio_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_radio_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_radio_check_shortcut" }
            }
          }

      val add_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_separator" }
            }
          }

      val add_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_shortcut" }
            }
          }

      val add_submenu_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_submenu_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_submenu_item" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_allow_search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_allow_search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_search" }
            }
          }

      val get_item_accelerator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_accelerator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_accelerator" }
            }
          }

      val get_item_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_count" }
            }
          }

      val get_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
            }
          }

      val get_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_id" }
            }
          }

      val get_item_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_index" }
            }
          }

      val get_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
            }
          }

      val get_item_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_shortcut" }
            }
          }

      val get_item_submenu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_submenu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_submenu" }
            }
          }

      val get_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_text" }
            }
          }

      val get_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
            }
          }

      val get_submenu_popup_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_submenu_popup_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_submenu_popup_delay" }
            }
          }

      val is_hide_on_checkable_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_checkable_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_hide_on_checkable_item_selection" }
            }
          }

      val is_hide_on_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_item_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hide_on_item_selection" }
            }
          }

      val is_hide_on_state_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_state_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_hide_on_state_item_selection" }
            }
          }

      val is_hide_on_window_lose_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_window_lose_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hide_on_window_lose_focus" }
            }
          }

      val is_item_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_checkable" }
            }
          }

      val is_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_checked" }
            }
          }

      val is_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
            }
          }

      val is_item_radio_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_radio_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_radio_checkable" }
            }
          }

      val is_item_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_separator" }
            }
          }

      val is_item_shortcut_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_shortcut_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_shortcut_disabled" }
            }
          }

      val remove_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val set_allow_search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_allow_search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_search" }
            }
          }

      val set_hide_on_checkable_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_checkable_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_hide_on_checkable_item_selection" }
            }
          }

      val set_hide_on_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_item_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_item_selection" }
            }
          }

      val set_hide_on_state_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_state_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_hide_on_state_item_selection" }
            }
          }

      val set_hide_on_window_lose_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_window_lose_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_window_lose_focus"
              }
            }
          }

      val set_item_accelerator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_accelerator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_accelerator" }
            }
          }

      val set_item_as_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_checkable" }
            }
          }

      val set_item_as_radio_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_radio_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_radio_checkable" }
            }
          }

      val set_item_as_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_separator" }
            }
          }

      val set_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_checked" }
            }
          }

      val set_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
            }
          }

      val set_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
            }
          }

      val set_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_id" }
            }
          }

      val set_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
            }
          }

      val set_item_multistate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_multistate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_multistate" }
            }
          }

      val set_item_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shortcut" }
            }
          }

      val set_item_shortcut_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_shortcut_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shortcut_disabled" }
            }
          }

      val set_item_submenu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_submenu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_submenu" }
            }
          }

      val set_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_text" }
            }
          }

      val set_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
            }
          }

      val set_submenu_popup_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_submenu_popup_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_submenu_popup_delay" }
            }
          }

      val toggle_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "toggle_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method toggle_item_checked" }
            }
          }

      val toggle_item_multistate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "toggle_item_multistate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method toggle_item_multistate" }
            }
          }
    }
  }
}
