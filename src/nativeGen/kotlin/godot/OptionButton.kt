// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    __method_bind.add_icon_item.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun addItem(label: String, id: Int) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    __method_bind.add_item.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addSeparator() {
    __method_bind.add_separator.call(this.toVariant())
  }

  fun clear() {
    __method_bind.clear.call(this.toVariant())
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.get_item_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getItemIcon(idx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_icon.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Texture)!!
  }

  fun getItemId(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_id.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asInt()
  }

  fun getItemIndex(id: Int): Int {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_index.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asInt()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_metadata.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun getItemText(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_text.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asString()
  }

  fun getPopup(): PopupMenu {
    val _ret = __method_bind.get_popup.call(this.toVariant())
    return _ret.asObject(::PopupMenu)!!
  }

  fun getSelected(): Int {
    val _ret = __method_bind.get_selected.call(this.toVariant())
    return _ret.asInt()
  }

  fun getSelectedId(): Int {
    val _ret = __method_bind.get_selected_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getSelectedMetadata(): Variant {
    val _ret = __method_bind.get_selected_metadata.call(this.toVariant())
    return _ret
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_disabled.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun removeItem(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    __method_bind.remove_item.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun select(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    __method_bind.select.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    __method_bind.set_item_disabled.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setItemIcon(idx: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(texture)
    __method_bind.set_item_icon.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setItemId(idx: Int, id: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(id)
    __method_bind.set_item_id.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(metadata)
    __method_bind.set_item_metadata.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setItemText(idx: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(text)
    __method_bind.set_item_text.call(this.toVariant(), _args.toVariant(), 2)
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
    fun from(ptr: COpaquePointer): OptionButton = OptionButton(ptr)
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
