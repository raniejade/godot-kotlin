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

open class PopupMenu internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  fun getItems(): VariantArray {
    TODO()
  }

  fun guiInput() {
    TODO()
  }

  fun setItems() {
    TODO()
  }

  fun submenuTimeout() {
    TODO()
  }

  fun addCheckItem() {
    TODO()
  }

  fun addCheckShortcut() {
    TODO()
  }

  fun addIconCheckItem() {
    TODO()
  }

  fun addIconCheckShortcut() {
    TODO()
  }

  fun addIconItem() {
    TODO()
  }

  fun addIconShortcut() {
    TODO()
  }

  fun addItem() {
    TODO()
  }

  fun addRadioCheckItem() {
    TODO()
  }

  fun addRadioCheckShortcut() {
    TODO()
  }

  fun addSeparator() {
    TODO()
  }

  fun addShortcut() {
    TODO()
  }

  fun addSubmenuItem() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun getAllowSearch(): Boolean {
    TODO()
  }

  fun getItemAccelerator(): Int {
    TODO()
  }

  fun getItemCount(): Int {
    TODO()
  }

  fun getItemIcon(): Texture {
    TODO()
  }

  fun getItemId(): Int {
    TODO()
  }

  fun getItemIndex(): Int {
    TODO()
  }

  fun getItemMetadata(): Variant {
    TODO()
  }

  fun getItemShortcut(): ShortCut {
    TODO()
  }

  fun getItemSubmenu(): String {
    TODO()
  }

  fun getItemText(): String {
    TODO()
  }

  fun getItemTooltip(): String {
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

  fun isItemCheckable(): Boolean {
    TODO()
  }

  fun isItemChecked(): Boolean {
    TODO()
  }

  fun isItemDisabled(): Boolean {
    TODO()
  }

  fun isItemRadioCheckable(): Boolean {
    TODO()
  }

  fun isItemSeparator(): Boolean {
    TODO()
  }

  fun isItemShortcutDisabled(): Boolean {
    TODO()
  }

  fun removeItem() {
    TODO()
  }

  fun setAllowSearch() {
    TODO()
  }

  fun setHideOnCheckableItemSelection() {
    TODO()
  }

  fun setHideOnItemSelection() {
    TODO()
  }

  fun setHideOnStateItemSelection() {
    TODO()
  }

  fun setHideOnWindowLoseFocus() {
    TODO()
  }

  fun setItemAccelerator() {
    TODO()
  }

  fun setItemAsCheckable() {
    TODO()
  }

  fun setItemAsRadioCheckable() {
    TODO()
  }

  fun setItemAsSeparator() {
    TODO()
  }

  fun setItemChecked() {
    TODO()
  }

  fun setItemDisabled() {
    TODO()
  }

  fun setItemIcon() {
    TODO()
  }

  fun setItemId() {
    TODO()
  }

  fun setItemMetadata() {
    TODO()
  }

  fun setItemMultistate() {
    TODO()
  }

  fun setItemShortcut() {
    TODO()
  }

  fun setItemShortcutDisabled() {
    TODO()
  }

  fun setItemSubmenu() {
    TODO()
  }

  fun setItemText() {
    TODO()
  }

  fun setItemTooltip() {
    TODO()
  }

  fun setSubmenuPopupDelay() {
    TODO()
  }

  fun toggleItemChecked() {
    TODO()
  }

  fun toggleItemMultistate() {
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
      val _get_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "_get_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_items" }
            }
          }

      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val _set_items: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "_set_items".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_items" }
            }
          }

      val _submenu_timeout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "_submenu_timeout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _submenu_timeout" }
            }
          }

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
