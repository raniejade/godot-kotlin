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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _child_renamed_callback() {
    TODO()
  }

  open fun _on_mouse_exited() {
    TODO()
  }

  open fun _on_theme_changed() {
    TODO()
  }

  open fun _update_current_tab() {
    TODO()
  }

  fun areTabsVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.areTabsVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getCurrentTabControl(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurrentTabControl.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
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

  fun getPopup(): Popup {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Popup
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPopup.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Popup>(_tmp.value!!)
      _ret
    }
  }

  fun getPreviousTab(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPreviousTab.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTabAlign(): TabAlign {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabAlign.call(self._handle, emptyList(), _retPtr)
      TabContainer.TabAlign.from(_ret.value)
    }
  }

  fun getTabControl(idx: Int): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTabControl.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
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

  fun getUseHiddenTabsForMinSize(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseHiddenTabsForMinSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun setPopup(popup: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPopup.call(self._handle, listOf(popup), null)
    }
  }

  fun setTabAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabAlign.call(self._handle, listOf(align), null)
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

  fun setTabsVisible(visible: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabsVisible.call(self._handle, listOf(visible), null)
    }
  }

  fun setUseHiddenTabsForMinSize(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseHiddenTabsForMinSize.call(self._handle, listOf(enabled), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "are_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_tabs_visible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
        }
      val getCurrentTabControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_current_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_tab_control" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val getPreviousTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_previous_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_previous_tab" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
        }
      val getTabControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_control" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
        }
      val getUseHiddenTabsForMinSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "get_use_hidden_tabs_for_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_hidden_tabs_for_min_size" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_current_tab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_drag_to_rearrange_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled" }
        }
      val setPopup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_popup" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tab_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_rearrange_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
        }
      val setTabsVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_tabs_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tabs_visible" }
        }
      val setUseHiddenTabsForMinSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "set_use_hidden_tabs_for_min_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_hidden_tabs_for_min_size" }
        }}
  }
}
