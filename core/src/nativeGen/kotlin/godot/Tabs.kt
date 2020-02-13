// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _on_mouse_exited() {
    TODO()
  }

  open fun _update_hover() {
    TODO()
  }

  fun addTab(title: String = "", icon: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(title)
      _args.add(icon)
      __method_bind.addTab.call(self._handle, _args, null)
    }
  }

  fun ensureTabVisible(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.ensureTabVisible.call(self._handle, listOf(idx), null)
    }
  }

  fun getCurrentTab(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentTab.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDragToRearrangeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDragToRearrangeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOffsetButtonsVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOffsetButtonsVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getScrollingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScrollingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectWithRmb(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectWithRmb.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTabAlign(): TabAlign {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabAlign.call(self._handle, emptyList(), _retPtr)
      Tabs.TabAlign.from(_ret.value)
    }
  }

  fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabCloseDisplayPolicy.call(self._handle, emptyList(), _retPtr)
      Tabs.CloseButtonDisplayPolicy.from(_ret.value)
    }
  }

  fun getTabCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTabDisabled(tabIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabDisabled.call(self._handle, listOf(tabIdx), _retPtr)
      _ret.value
    }
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTabIcon.call(self._handle, listOf(tabIdx), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTabOffset(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTabRect(tabIdx: Int): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getTabRect.call(self._handle, listOf(tabIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTabTitle(tabIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTabTitle.call(self._handle, listOf(tabIdx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTabsRearrangeGroup(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabsRearrangeGroup.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun moveTab(from: Int, to: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.moveTab.call(self._handle, _args, null)
    }
  }

  fun removeTab(tabIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeTab.call(self._handle, listOf(tabIdx), null)
    }
  }

  fun setCurrentTab(tabIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentTab.call(self._handle, listOf(tabIdx), null)
    }
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDragToRearrangeEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setScrollingEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollingEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setSelectWithRmb(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectWithRmb.call(self._handle, listOf(enabled), null)
    }
  }

  fun setTabAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabAlign.call(self._handle, listOf(align), null)
    }
  }

  fun setTabCloseDisplayPolicy(policy: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabCloseDisplayPolicy.call(self._handle, listOf(policy), null)
    }
  }

  fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(tabIdx)
      _args.add(disabled)
      __method_bind.setTabDisabled.call(self._handle, _args, null)
    }
  }

  fun setTabIcon(tabIdx: Int, icon: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(tabIdx)
      _args.add(icon)
      __method_bind.setTabIcon.call(self._handle, _args, null)
    }
  }

  fun setTabTitle(tabIdx: Int, title: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(tabIdx)
      _args.add(title)
      __method_bind.setTabTitle.call(self._handle, _args, null)
    }
  }

  fun setTabsRearrangeGroup(groupId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabsRearrangeGroup.call(self._handle, listOf(groupId), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "add_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tab" }
        }
      val ensureTabVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "ensure_tab_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_tab_visible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled" }
        }
      val getOffsetButtonsVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_offset_buttons_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset_buttons_visible" }
        }
      val getScrollingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_scrolling_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scrolling_enabled" }
        }
      val getSelectWithRmb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_select_with_rmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_with_rmb" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
        }
      val getTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_close_display_policy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_close_display_policy" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
        }
      val getTabOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_offset" }
        }
      val getTabRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_rect" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "get_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
        }
      val moveTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "move_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_tab" }
        }
      val removeTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "remove_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tab" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled" }
        }
      val setScrollingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_scrolling_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scrolling_enabled" }
        }
      val setSelectWithRmb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_select_with_rmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_with_rmb" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
        }
      val setTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_close_display_policy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_close_display_policy" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "set_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
        }}
  }
}
