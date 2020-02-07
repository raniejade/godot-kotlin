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

open class TabContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var currentTab: Int
    get() {
       return getCurrentTab() 
    }
    set(value) {
      setCurrentTab(value)
    }

  var dragToRearrangeEnabled: Boolean
    get() {
       return getDragToRearrangeEnabled() 
    }
    set(value) {
      setDragToRearrangeEnabled(value)
    }

  var tabAlign: TabAlign
    get() {
       return getTabAlign() 
    }
    set(value) {
      setTabAlign(value.value)
    }

  var tabsVisible: Boolean
    get() {
       return areTabsVisible() 
    }
    set(value) {
      setTabsVisible(value)
    }

  var useHiddenTabsForMinSize: Boolean
    get() {
       return getUseHiddenTabsForMinSize() 
    }
    set(value) {
      setUseHiddenTabsForMinSize(value)
    }

  /**
   * TabContainer::pre_popup_pressed signal
   */
  val signalPrePopupPressed: Signal0 = Signal0("pre_popup_pressed")

  /**
   * TabContainer::tab_changed signal
   */
  val signalTabChanged: Signal1<Int> = Signal1("tab_changed")

  /**
   * TabContainer::tab_selected signal
   */
  val signalTabSelected: Signal1<Int> = Signal1("tab_selected")

  constructor() : this(null) {
    _handle = __new()
  }

  fun areTabsVisible(): Boolean {
    val _ret = __method_bind.areTabsVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCurrentTab(): Int {
    val _ret = __method_bind.getCurrentTab.call(this._handle)
    return _ret.asInt()
  }

  fun getCurrentTabControl(): Control {
    val _ret = __method_bind.getCurrentTabControl.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getDragToRearrangeEnabled(): Boolean {
    val _ret = __method_bind.getDragToRearrangeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getPopup(): Popup {
    val _ret = __method_bind.getPopup.call(this._handle)
    return _ret.asObject(::Popup)!!
  }

  fun getPreviousTab(): Int {
    val _ret = __method_bind.getPreviousTab.call(this._handle)
    return _ret.asInt()
  }

  fun getTabAlign(): TabAlign {
    val _ret = __method_bind.getTabAlign.call(this._handle)
    return TabContainer.TabAlign.from(_ret.asInt())
  }

  fun getTabControl(idx: Int): Control {
    val _arg = Variant(idx)
    val _ret = __method_bind.getTabControl.call(this._handle, listOf(_arg))
    return _ret.asObject(::Control)!!
  }

  fun getTabCount(): Int {
    val _ret = __method_bind.getTabCount.call(this._handle)
    return _ret.asInt()
  }

  fun getTabDisabled(tabIdx: Int): Boolean {
    val _arg = Variant(tabIdx)
    val _ret = __method_bind.getTabDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val _arg = Variant(tabIdx)
    val _ret = __method_bind.getTabIcon.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getTabTitle(tabIdx: Int): String {
    val _arg = Variant(tabIdx)
    val _ret = __method_bind.getTabTitle.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.getTabsRearrangeGroup.call(this._handle)
    return _ret.asInt()
  }

  fun getUseHiddenTabsForMinSize(): Boolean {
    val _ret = __method_bind.getUseHiddenTabsForMinSize.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCurrentTab(tabIdx: Int) {
    val _arg = Variant(tabIdx)
    __method_bind.setCurrentTab.call(this._handle, listOf(_arg))
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setDragToRearrangeEnabled.call(this._handle, listOf(_arg))
  }

  fun setPopup(popup: Node) {
    val _arg = Variant(popup)
    __method_bind.setPopup.call(this._handle, listOf(_arg))
  }

  fun setTabAlign(align: Int) {
    val _arg = Variant(align)
    __method_bind.setTabAlign.call(this._handle, listOf(_arg))
  }

  fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(tabIdx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.setTabDisabled.call(this._handle, _args)
  }

  fun setTabIcon(tabIdx: Int, icon: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(tabIdx))
    _args.add(Variant.fromAny(icon))
    __method_bind.setTabIcon.call(this._handle, _args)
  }

  fun setTabTitle(tabIdx: Int, title: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(tabIdx))
    _args.add(Variant.fromAny(title))
    __method_bind.setTabTitle.call(this._handle, _args)
  }

  fun setTabsRearrangeGroup(groupId: Int) {
    val _arg = Variant(groupId)
    __method_bind.setTabsRearrangeGroup.call(this._handle, listOf(_arg))
  }

  fun setTabsVisible(visible: Boolean) {
    val _arg = Variant(visible)
    __method_bind.setTabsVisible.call(this._handle, listOf(_arg))
  }

  fun setUseHiddenTabsForMinSize(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setUseHiddenTabsForMinSize.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TabContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TabContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TabContainer
     */
    private object __method_bind {
      val areTabsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "are_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_tabs_visible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
        }
      val getCurrentTabControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab_control" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val getPreviousTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_previous_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_previous_tab" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
        }
      val getTabControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_control" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
        }
      val getUseHiddenTabsForMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_use_hidden_tabs_for_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_hidden_tabs_for_min_size" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled" }
        }
      val setPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_popup" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
        }
      val setTabsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_visible" }
        }
      val setUseHiddenTabsForMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_use_hidden_tabs_for_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_hidden_tabs_for_min_size" }
        }}
  }
}
