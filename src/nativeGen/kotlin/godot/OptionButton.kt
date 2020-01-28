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

open class OptionButton(
  _handle: COpaquePointer
) : Button(_handle) {
  var items: VariantArray
    get() {
       return _getItems() 
    }
    set(value) {
      _setItems(value)
    }

  var selected: Int
    get() {
       return getSelected() 
    }
    set(value) {
      _selectInt(value)
    }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    __method_bind.addIconItem.call(this._handle, _args.toVariant(), 3)
  }

  fun addItem(label: String, id: Int) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    __method_bind.addItem.call(this._handle, _args.toVariant(), 2)
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

  fun getItemText(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getItemText.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getPopup(): PopupMenu {
    val _ret = __method_bind.getPopup.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
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
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isItemDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeItem(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeItem.call(this._handle, _arg, 1)
  }

  fun select(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.select.call(this._handle, _arg, 1)
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    __method_bind.setItemDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemIcon(idx: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(texture)
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

  fun setItemText(idx: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(text)
    __method_bind.setItemText.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): OptionButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OptionButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OptionButton" }
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
      val addIconItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "addIconItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIconItem" }
        }
      val addItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "addItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addItem" }
        }
      val addSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "addSeparator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSeparator" }
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
            "getItemCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCount" }
        }
      val getItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIcon" }
        }
      val getItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getItemId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemId" }
        }
      val getItemIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getItemIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemIndex" }
        }
      val getItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemMetadata" }
        }
      val getItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemText" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getPopup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPopup" }
        }
      val getSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelected" }
        }
      val getSelectedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getSelectedId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedId" }
        }
      val getSelectedMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "getSelectedMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedMetadata" }
        }
      val isItemDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "isItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isItemDisabled" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "removeItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeItem" }
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
            "setItemDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemDisabled" }
        }
      val setItemIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "setItemIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemIcon" }
        }
      val setItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "setItemId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemId" }
        }
      val setItemMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "setItemMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemMetadata" }
        }
      val setItemText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
            "setItemText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemText" }
        }}
  }
}
