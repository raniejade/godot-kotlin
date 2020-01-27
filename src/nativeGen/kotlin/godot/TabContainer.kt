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

open class TabContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  fun areTabsVisible(): Boolean {
    val _ret = __method_bind.are_tabs_visible.call(this._handle)
    return _ret.asBool()
  }

  fun getCurrentTab(): Int {
    val _ret = __method_bind.get_current_tab.call(this._handle)
    return _ret.asInt()
  }

  fun getCurrentTabControl(): Control {
    val _ret = __method_bind.get_current_tab_control.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getDragToRearrangeEnabled(): Boolean {
    val _ret = __method_bind.get_drag_to_rearrange_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun getPopup(): Popup {
    val _ret = __method_bind.get_popup.call(this._handle)
    return _ret.asObject(::Popup)!!
  }

  fun getPreviousTab(): Int {
    val _ret = __method_bind.get_previous_tab.call(this._handle)
    return _ret.asInt()
  }

  fun getTabAlign(): TabAlign {
    val _ret = __method_bind.get_tab_align.call(this._handle)
    return TabContainer.TabAlign.from(_ret.asInt())
  }

  fun getTabControl(idx: Int): Control {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_tab_control.call(this._handle, _arg, 1)
    return _ret.asObject(::Control)!!
  }

  fun getTabCount(): Int {
    val _ret = __method_bind.get_tab_count.call(this._handle)
    return _ret.asInt()
  }

  fun getTabDisabled(tabIdx: Int): Boolean {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.get_tab_disabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.get_tab_icon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTabTitle(tabIdx: Int): String {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.get_tab_title.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.get_tabs_rearrange_group.call(this._handle)
    return _ret.asInt()
  }

  fun setCurrentTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.set_current_tab.call(this._handle, _arg, 1)
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_drag_to_rearrange_enabled.call(this._handle, _arg, 1)
  }

  fun setPopup(popup: Node) {
    val _arg = Variant.new(popup)
    __method_bind.set_popup.call(this._handle, _arg, 1)
  }

  fun setTabAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.set_tab_align.call(this._handle, _arg, 1)
  }

  fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(disabled)
    __method_bind.set_tab_disabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabIcon(tabIdx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(icon)
    __method_bind.set_tab_icon.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabTitle(tabIdx: Int, title: String) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(title)
    __method_bind.set_tab_title.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabsRearrangeGroup(groupId: Int) {
    val _arg = Variant.new(groupId)
    __method_bind.set_tabs_rearrange_group.call(this._handle, _arg, 1)
  }

  fun setTabsVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.set_tabs_visible.call(this._handle, _arg, 1)
  }

  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

    companion object {
      fun from(value: Int): TabAlign {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    fun new(): TabContainer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TabContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TabContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TabContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TabContainer = TabContainer(ptr)
    /**
     * Container for method_bind pointers for TabContainer
     */
    private object __method_bind {
      val are_tabs_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "are_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_tabs_visible" }
        }
      val get_current_tab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
        }
      val get_current_tab_control: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab_control" }
        }
      val get_drag_to_rearrange_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled" }
        }
      val get_popup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val get_previous_tab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_previous_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_previous_tab" }
        }
      val get_tab_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
        }
      val get_tab_control: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_control" }
        }
      val get_tab_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
        }
      val get_tab_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
        }
      val get_tab_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
        }
      val get_tab_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
        }
      val get_tabs_rearrange_group: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
        }
      val set_current_tab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
        }
      val set_drag_to_rearrange_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled" }
        }
      val set_popup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_popup" }
        }
      val set_tab_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
        }
      val set_tab_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
        }
      val set_tab_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
        }
      val set_tab_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
        }
      val set_tabs_rearrange_group: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
        }
      val set_tabs_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_visible" }
        }}
  }
}
