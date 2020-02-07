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

open class ScrollContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var followFocus: Boolean
    get() {
       return isFollowingFocus() 
    }
    set(value) {
      setFollowFocus(value)
    }

  var scrollDeadzone: Int
    get() {
       return getDeadzone() 
    }
    set(value) {
      setDeadzone(value)
    }

  var scrollHorizontal: Int
    get() {
       return getHScroll() 
    }
    set(value) {
      setHScroll(value)
    }

  var scrollHorizontalEnabled: Boolean
    get() {
       return isHScrollEnabled() 
    }
    set(value) {
      setEnableHScroll(value)
    }

  var scrollVertical: Int
    get() {
       return getVScroll() 
    }
    set(value) {
      setVScroll(value)
    }

  var scrollVerticalEnabled: Boolean
    get() {
       return isVScrollEnabled() 
    }
    set(value) {
      setEnableVScroll(value)
    }

  /**
   * ScrollContainer::scroll_ended signal
   */
  val signalScrollEnded: Signal0 = Signal0("scroll_ended")

  /**
   * ScrollContainer::scroll_started signal
   */
  val signalScrollStarted: Signal0 = Signal0("scroll_started")

  constructor() : this(null) {
    _handle = __new()
  }

  fun getDeadzone(): Int {
    val _ret = __method_bind.getDeadzone.call(this._handle)
    return _ret.asInt()
  }

  fun getHScroll(): Int {
    val _ret = __method_bind.getHScroll.call(this._handle)
    return _ret.asInt()
  }

  fun getHScrollbar(): HScrollBar {
    val _ret = __method_bind.getHScrollbar.call(this._handle)
    return _ret.asObject(::HScrollBar)!!
  }

  fun getVScroll(): Int {
    val _ret = __method_bind.getVScroll.call(this._handle)
    return _ret.asInt()
  }

  fun getVScrollbar(): VScrollBar {
    val _ret = __method_bind.getVScrollbar.call(this._handle)
    return _ret.asObject(::VScrollBar)!!
  }

  fun isFollowingFocus(): Boolean {
    val _ret = __method_bind.isFollowingFocus.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHScrollEnabled(): Boolean {
    val _ret = __method_bind.isHScrollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVScrollEnabled(): Boolean {
    val _ret = __method_bind.isVScrollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDeadzone(deadzone: Int) {
    val _arg = Variant(deadzone)
    __method_bind.setDeadzone.call(this._handle, listOf(_arg))
  }

  fun setEnableHScroll(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setEnableHScroll.call(this._handle, listOf(_arg))
  }

  fun setEnableVScroll(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setEnableVScroll.call(this._handle, listOf(_arg))
  }

  fun setFollowFocus(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setFollowFocus.call(this._handle, listOf(_arg))
  }

  fun setHScroll(value: Int) {
    val _arg = Variant(value)
    __method_bind.setHScroll.call(this._handle, listOf(_arg))
  }

  fun setVScroll(value: Int) {
    val _arg = Variant(value)
    __method_bind.setVScroll.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScrollContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ScrollContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ScrollContainer
     */
    private object __method_bind {
      val getDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_deadzone" }
        }
      val getHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scroll" }
        }
      val getHScrollbar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_h_scrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scrollbar" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val getVScrollbar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_v_scrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scrollbar" }
        }
      val isFollowingFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_following_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_following_focus" }
        }
      val isHScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_h_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_h_scroll_enabled" }
        }
      val isVScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_v_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_v_scroll_enabled" }
        }
      val setDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_deadzone" }
        }
      val setEnableHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_enable_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_h_scroll" }
        }
      val setEnableVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_enable_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_v_scroll" }
        }
      val setFollowFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_follow_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_focus" }
        }
      val setHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_scroll" }
        }
      val setVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll" }
        }}
  }
}
