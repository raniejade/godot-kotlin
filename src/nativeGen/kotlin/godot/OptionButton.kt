// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OptionButton internal constructor(
  _handle: COpaquePointer
) : Button(_handle) {
  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int
  ) {
    TODO()
  }

  fun addItem(label: String, id: Int) {
    TODO()
  }

  fun addSeparator() {
    TODO()
  }

  fun clear() {
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

  fun getItemText(idx: Int): String {
    TODO()
  }

  fun getPopup(): PopupMenu {
    TODO()
  }

  fun getSelected(): Int {
    TODO()
  }

  fun getSelectedId(): Int {
    TODO()
  }

  fun getSelectedMetadata(): Variant {
    TODO()
  }

  fun isItemDisabled(idx: Int): Boolean {
    TODO()
  }

  fun removeItem(idx: Int) {
    TODO()
  }

  fun select(idx: Int) {
    TODO()
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    TODO()
  }

  fun setItemIcon(idx: Int, texture: Texture) {
    TODO()
  }

  fun setItemId(idx: Int, id: Int) {
    TODO()
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    TODO()
  }

  fun setItemText(idx: Int, text: String) {
    TODO()
  }

  companion object {
    fun new(): OptionButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OptionButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton OptionButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OptionButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for OptionButton
     */
    private object __method_bind {
      val add_icon_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_icon_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
            }
          }

      val add_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_item" }
            }
          }

      val add_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_separator" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_item_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_count" }
            }
          }

      val get_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
            }
          }

      val get_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_id" }
            }
          }

      val get_item_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_index" }
            }
          }

      val get_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
            }
          }

      val get_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_text" }
            }
          }

      val get_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val get_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected" }
            }
          }

      val get_selected_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_id" }
            }
          }

      val get_selected_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_metadata" }
            }
          }

      val is_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "is_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
            }
          }

      val remove_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val set_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
            }
          }

      val set_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
            }
          }

      val set_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_id" }
            }
          }

      val set_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
            }
          }

      val set_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_text" }
            }
          }
    }
  }
}
