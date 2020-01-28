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

  var tabAlign: Int
    get() {
       return TabContainer.TabAlign.from(getTabAlign()) 
    }
    set(value) {
      setTabAlign(TabContainer.TabAlign.from(value))
    }

  var tabsVisible: Boolean
    get() {
       return areTabsVisible() 
    }
    set(value) {
      setTabsVisible(value)
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
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTabControl.call(this._handle, _arg, 1)
    return _ret.asObject(::Control)!!
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

  fun getTabTitle(tabIdx: Int): String {
    val _arg = Variant.new(tabIdx)
    val _ret = __method_bind.getTabTitle.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.getTabsRearrangeGroup.call(this._handle)
    return _ret.asInt()
  }

  fun setCurrentTab(tabIdx: Int) {
    val _arg = Variant.new(tabIdx)
    __method_bind.setCurrentTab.call(this._handle, _arg, 1)
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDragToRearrangeEnabled.call(this._handle, _arg, 1)
  }

  fun setPopup(popup: Node) {
    val _arg = Variant.new(popup)
    __method_bind.setPopup.call(this._handle, _arg, 1)
  }

  fun setTabAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setTabAlign.call(this._handle, _arg, 1)
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

  fun setTabsVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setTabsVisible.call(this._handle, _arg, 1)
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
      val areTabsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "areTabsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areTabsVisible" }
        }
      val getCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getCurrentTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentTab" }
        }
      val getCurrentTabControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getCurrentTabControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentTabControl" }
        }
      val getDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getDragToRearrangeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDragToRearrangeEnabled" }
        }
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getPopup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPopup" }
        }
      val getPreviousTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getPreviousTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPreviousTab" }
        }
      val getTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabAlign" }
        }
      val getTabControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabControl" }
        }
      val getTabCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabCount" }
        }
      val getTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabDisabled" }
        }
      val getTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabIcon" }
        }
      val getTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabTitle" }
        }
      val getTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "getTabsRearrangeGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabsRearrangeGroup" }
        }
      val setCurrentTab: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setCurrentTab".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentTab" }
        }
      val setDragToRearrangeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setDragToRearrangeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDragToRearrangeEnabled" }
        }
      val setPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setPopup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPopup" }
        }
      val setTabAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabAlign" }
        }
      val setTabDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabDisabled" }
        }
      val setTabIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabIcon" }
        }
      val setTabTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabTitle" }
        }
      val setTabsRearrangeGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabsRearrangeGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabsRearrangeGroup" }
        }
      val setTabsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
            "setTabsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabsVisible" }
        }}
  }
}
