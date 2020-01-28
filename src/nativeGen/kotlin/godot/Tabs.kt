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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tabs(
  _handle: COpaquePointer
) : Control(_handle) {
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

  var tabAlign: Int
    get() {
       return Tabs.TabAlign.from(getTabAlign()) 
    }
    set(value) {
      setTabAlign(Tabs.TabAlign.from(value))
    }

  var tabCloseDisplayPolicy: Int
    get() {
       return Tabs.CloseButtonDisplayPolicy.from(getTabCloseDisplayPolicy()) 
    }
    set(value) {
      setTabCloseDisplayPolicy(Tabs.CloseButtonDisplayPolicy.from(value))
    }

  fun addTab(title: String, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(title)
    _args.append(icon)
    __method_bind.addTab.call(this._handle, _args.toVariant(), 2)
  }

  fun ensureTabVisible(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.ensureTabVisible.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.getTabDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabIcon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTabOffset(): Int {
    val _ret = __method_bind.getTabOffset.call(this._handle)
    return _ret.asInt()
  }

  fun getTabRect(tabIdx: Int): Rect2 {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabRect.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun getTabTitle(tabIdx: Int): String {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabTitle.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.getTabsRearrangeGroup.call(this._handle)
    return _ret.asInt()
  }

  fun moveTab(from: Int, to: Int) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    __method_bind.moveTab.call(this._handle, _args.toVariant(), 2)
  }

  fun removeTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.removeTab.call(this._handle, _arg, 1)
  }

  fun setCurrentTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.setCurrentTab.call(this._handle, _arg, 1)
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDragToRearrangeEnabled.call(this._handle, _arg, 1)
  }

  fun setScrollingEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setScrollingEnabled.call(this._handle, _arg, 1)
  }

  fun setSelectWithRmb(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSelectWithRmb.call(this._handle, _arg, 1)
  }

  fun setTabAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setTabAlign.call(this._handle, _arg, 1)
  }

  fun setTabCloseDisplayPolicy(policy: Int) {
    val _arg = Variant.new(policy)
    __method_bind.setTabCloseDisplayPolicy.call(this._handle, _arg, 1)
  }

  fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(disabled)
    __method_bind.setTabDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabIcon(tabIdx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(icon)
    __method_bind.setTabIcon.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabTitle(tabIdx: Int, title: String) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(title)
    __method_bind.setTabTitle.call(this._handle, _args.toVariant(), 2)
  }

  fun setTabsRearrangeGroup(groupId: Int) {
    val _arg = Variant.new(groupId)
    __method_bind.setTabsRearrangeGroup.call(this._handle, _arg, 1)
  }

  enum class CloseButtonDisplayPolicy(
    val value: Int
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

    CLOSE_BUTTON_MAX(3);

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
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_MAX: Int = 3

    val ALIGN_RIGHT: Int = 2

    val CLOSE_BUTTON_MAX: Int = 3

    val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Int = 1

    val CLOSE_BUTTON_SHOW_ALWAYS: Int = 2

    val CLOSE_BUTTON_SHOW_NEVER: Int = 0

    fun new(): Tabs = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tabs".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tabs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tabs(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tabs = Tabs(ptr)
    /**
     * Container for method_bind pointers for Tabs
     */
    private object __method_bind {
      val addTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "addTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTab" }
        }
      val ensureTabVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "ensureTabVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensureTabVisible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getCurrentTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentTab" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getDragToRearrangeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDragToRearrangeEnabled" }
        }
      val getOffsetButtonsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getOffsetButtonsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffsetButtonsVisible" }
        }
      val getScrollingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getScrollingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScrollingEnabled" }
        }
      val getSelectWithRmb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getSelectWithRmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectWithRmb" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabAlign" }
        }
      val getTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabCloseDisplayPolicy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabCloseDisplayPolicy" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabCount" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabDisabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabIcon" }
        }
      val getTabOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabOffset" }
        }
      val getTabRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabRect" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabTitle" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "getTabsRearrangeGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabsRearrangeGroup" }
        }
      val moveTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "moveTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveTab" }
        }
      val removeTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "removeTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTab" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setCurrentTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentTab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setDragToRearrangeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDragToRearrangeEnabled" }
        }
      val setScrollingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setScrollingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollingEnabled" }
        }
      val setSelectWithRmb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setSelectWithRmb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelectWithRmb" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabAlign" }
        }
      val setTabCloseDisplayPolicy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabCloseDisplayPolicy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabCloseDisplayPolicy" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabDisabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabIcon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabTitle" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
            "setTabsRearrangeGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabsRearrangeGroup" }
        }}
  }
}
