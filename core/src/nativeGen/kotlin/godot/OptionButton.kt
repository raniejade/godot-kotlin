// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OptionButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Button(null) {
  /**
   * OptionButton::item_focused signal
   */
  val signalItemFocused: Signal1<Int> = Signal1("item_focused")

  /**
   * OptionButton::item_selected signal
   */
  val signalItemSelected: Signal1<Int> = Signal1("item_selected")

  constructor() : this(null) {
    _handle = __new()
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(label))
    _args.add(Variant.fromAny(id))
    __method_bind.addIconItem.call(this._handle, _args)
  }

  fun addItem(label: String, id: Int = -1) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(label))
    _args.add(Variant.fromAny(id))
    __method_bind.addItem.call(this._handle, _args)
  }

  fun addSeparator() {
    __method_bind.addSeparator.call(this._handle)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.getItemCount.call(this._handle)
    return _ret.asInt()
  }

  fun getItemIcon(idx: Int): Texture {
    val _arg = Variant(idx)
    val _ret = __method_bind.getItemIcon.call(this._handle, listOf(_arg))
    return _ret.toAny() as Texture
  }

  fun getItemId(idx: Int): Int {
    val _arg = Variant(idx)
    val _ret = __method_bind.getItemId.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getItemIndex(id: Int): Int {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemIndex.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _arg = Variant(idx)
    val _ret = __method_bind.getItemMetadata.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getItemText(idx: Int): String {
    val _arg = Variant(idx)
    val _ret = __method_bind.getItemText.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getPopup(): PopupMenu {
    val _ret = __method_bind.getPopup.call(this._handle)
    return _ret.toAny() as PopupMenu
  }

  fun getSelected(): Int {
    val _ret = __method_bind.getSelected.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectedId(): Int {
    val _ret = __method_bind.getSelectedId.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectedMetadata(): Variant {
    val _ret = __method_bind.getSelectedMetadata.call(this._handle)
    return _ret
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _arg = Variant(idx)
    val _ret = __method_bind.isItemDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeItem(idx: Int) {
    val _arg = Variant(idx)
    __method_bind.removeItem.call(this._handle, listOf(_arg))
  }

  fun select(idx: Int) {
    val _arg = Variant(idx)
    __method_bind.select.call(this._handle, listOf(_arg))
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.setItemDisabled.call(this._handle, _args)
  }

  fun setItemIcon(idx: Int, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(texture))
    __method_bind.setItemIcon.call(this._handle, _args)
  }

  fun setItemId(idx: Int, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(id))
    __method_bind.setItemId.call(this._handle, _args)
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(metadata))
    __method_bind.setItemMetadata.call(this._handle, _args)
  }

  fun setItemText(idx: Int, text: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(text))
    __method_bind.setItemText.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OptionButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OptionButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for OptionButton
     */
    private object __method_bind {
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "add_icon_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_item" }
        }
      val addSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "add_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_separator" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getItemCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_count" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
        }
      val getItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_id" }
        }
      val getItemIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_index" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_text" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val getSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected" }
        }
      val getSelectedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_selected_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_id" }
        }
      val getSelectedMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "get_selected_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_metadata" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "is_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val setItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "set_item_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "set_item_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
        }
      val setItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "set_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_id" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "set_item_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "set_item_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_text" }
        }}
  }
}
