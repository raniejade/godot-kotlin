// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
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

open class Tabs(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  var scrollingEnabled: Boolean
    get() {
       return getScrollingEnabled() 
    }
    set(value) {
      setScrollingEnabled(value)
    }

  var tabAlign: TabAlign
    get() {
       return getTabAlign() 
    }
    set(value) {
      setTabAlign(value.value)
    }

  var tabCloseDisplayPolicy: CloseButtonDisplayPolicy
    get() {
       return getTabCloseDisplayPolicy() 
    }
    set(value) {
      setTabCloseDisplayPolicy(value.value)
    }

  /**
   * Tabs::reposition_active_tab_request signal
   */
  val signalRepositionActiveTabRequest: Signal1<Int> = Signal1("reposition_active_tab_request")

  /**
   * Tabs::right_button_pressed signal
   */
  val signalRightButtonPressed: Signal1<Int> = Signal1("right_button_pressed")

  /**
   * Tabs::tab_changed signal
   */
  val signalTabChanged: Signal1<Int> = Signal1("tab_changed")

  /**
   * Tabs::tab_clicked signal
   */
  val signalTabClicked: Signal1<Int> = Signal1("tab_clicked")

  /**
   * Tabs::tab_close signal
   */
  val signalTabClose: Signal1<Int> = Signal1("tab_close")

  /**
   * Tabs::tab_hover signal
   */
  val signalTabHover: Signal1<Int> = Signal1("tab_hover")

  constructor() : this(null) {
    _handle = __new()
  }

  fun addTab(title: String = "", icon: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(title))
    _args.add(Variant.fromAny(icon))
    __method_bind.addTab.call(this._handle, _args)
  }

  fun ensureTabVisible(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.ensureTabVisible.call(this._handle, listOf(_arg))
  }

  fun getCurrentTab(): Int {
    val _ret = __method_bind.getCurrentTab.call(this._handle)
    return _ret.asInt()
  }

  fun getDragToRearrangeEnabled(): Boolean {
    val _ret = __method_bind.getDragToRearrangeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getOffsetButtonsVisible(): Boolean {
    val _ret = __method_bind.getOffsetButtonsVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun getScrollingEnabled(): Boolean {
    val _ret = __method_bind.getScrollingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getSelectWithRmb(): Boolean {
    val _ret = __method_bind.getSelectWithRmb.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTabAlign(): TabAlign {
    val _ret = __method_bind.getTabAlign.call(this._handle)
    return Tabs.TabAlign.from(_ret.asInt())
  }

  fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    val _ret = __method_bind.getTabCloseDisplayPolicy.call(this._handle)
    return Tabs.CloseButtonDisplayPolicy.from(_ret.asInt())
  }

  fun getTabCount(): Int {
    val _ret = __method_bind.getTabCount.call(this._handle)
    return _ret.asInt()
  }

  fun getTabDisabled(tabIdx: Int): Boolean {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabIcon.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getTabOffset(): Int {
    val _ret = __method_bind.getTabOffset.call(this._handle)
    return _ret.asInt()
  }

  fun getTabRect(tabIdx: Int): Rect2 {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabRect.call(this._handle, listOf(_arg))
    return _ret.asRect2()
  }

  fun getTabTitle(tabIdx: Int): String {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabTitle.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.getTabsRearrangeGroup.call(this._handle)
    return _ret.asInt()
  }

  fun moveTab(from: Int, to: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    __method_bind.moveTab.call(this._handle, _args)
  }

  fun removeTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.removeTab.call(this._handle, listOf(_arg))
  }

  fun setCurrentTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.setCurrentTab.call(this._handle, listOf(_arg))
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDragToRearrangeEnabled.call(this._handle, listOf(_arg))
  }

  fun setScrollingEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setScrollingEnabled.call(this._handle, listOf(_arg))
  }

  fun setSelectWithRmb(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSelectWithRmb.call(this._handle, listOf(_arg))
  }

  fun setTabAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setTabAlign.call(this._handle, listOf(_arg))
  }

  fun setTabCloseDisplayPolicy(policy: Int) {
    val _arg = Variant.new(policy)
    __method_bind.setTabCloseDisplayPolicy.call(this._handle, listOf(_arg))
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
    val _arg = Variant.new(groupId)
    __method_bind.setTabsRearrangeGroup.call(this._handle, listOf(_arg))
  }

  enum class CloseButtonDisplayPolicy(
    val value: Int
  ) {
    SHOW_NEVER(0),

    SHOW_ACTIVE_ONLY(1),

    SHOW_ALWAYS(2),

    MAX(3);

    companion object {
      fun from(value: Int): CloseButtonDisplayPolicy {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_MAX(3);

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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tabs".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tabs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Tabs
     */
    private object __method_bind {
      val addTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "add_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tab" }
        }
      val ensureTabVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "ensure_tab_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_tab_visible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled" }
        }
      val getOffsetButtonsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_offset_buttons_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset_buttons_visible" }
        }
      val getScrollingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_scrolling_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scrolling_enabled" }
        }
      val getSelectWithRmb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_select_with_rmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_with_rmb" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
        }
      val getTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_close_display_policy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_close_display_policy" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
        }
      val getTabOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_offset" }
        }
      val getTabRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_rect" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
        }
      val moveTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "move_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_tab" }
        }
      val removeTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "remove_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tab" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled" }
        }
      val setScrollingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_scrolling_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scrolling_enabled" }
        }
      val setSelectWithRmb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_select_with_rmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_with_rmb" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
        }
      val setTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_close_display_policy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_close_display_policy" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
        }}
  }
}
