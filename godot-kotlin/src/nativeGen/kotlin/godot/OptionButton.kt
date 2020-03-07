// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _focused(arg0: Int) {
    TODO()
  }

  open fun _get_items(): VariantArray {
    TODO()
  }

  open fun _select_int(arg0: Int) {
    TODO()
  }

  open fun _selected(arg0: Int) {
    TODO()
  }

  open fun _set_items(arg0: VariantArray) {
    TODO()
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(label)
      _args.add(id)
      __method_bind.addIconItem.call(self._handle, _args, null)
    }
  }

  fun addItem(label: String, id: Int = -1) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(id)
      __method_bind.addItem.call(self._handle, _args, null)
    }
  }

  fun addSeparator() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSeparator.call(self._handle, emptyList(), null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
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

  fun getPopup(): PopupMenu {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PopupMenu
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPopup.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PopupMenu>(_tmp.value!!)
      _ret
    }
  }

  fun getSelected(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelected.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectedId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectedId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectedMetadata(): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getSelectedMetadata.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
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

  fun removeItem(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeItem.call(self._handle, listOf(idx), null)
    }
  }

  fun select(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.select.call(self._handle, listOf(idx), null)
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

  fun setItemIcon(idx: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(texture)
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

  fun setItemText(idx: Int, text: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(text)
      __method_bind.setItemText.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OptionButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OptionButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for OptionButton
     */
    private object __method_bind {
      val addIconItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_icon_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
            }
          }

      val addItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_item" }
            }
          }

      val addSeparator: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "add_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_separator" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val getItemCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_count" }
            }
          }

      val getItemIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
            }
          }

      val getItemId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_id" }
            }
          }

      val getItemIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_index" }
            }
          }

      val getItemMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
            }
          }

      val getItemText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_text" }
            }
          }

      val getPopup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val getSelected: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected" }
            }
          }

      val getSelectedId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_id" }
            }
          }

      val getSelectedMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "get_selected_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_metadata" }
            }
          }

      val isItemDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "is_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
            }
          }

      val removeItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val setItemDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
            }
          }

      val setItemIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
            }
          }

      val setItemId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_id" }
            }
          }

      val setItemMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
            }
          }

      val setItemText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OptionButton".cstr.ptr,
              "set_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_text" }
            }
          }
    }
  }
}
