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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDeadzone(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDeadzone.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getHScroll(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHScroll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getHScrollbar(): HScrollBar {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: HScrollBar
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getHScrollbar.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<HScrollBar>(_tmp.value!!)
      _ret
    }
  }

  fun getVScroll(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVScroll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVScrollbar(): VScrollBar {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VScrollBar
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVScrollbar.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VScrollBar>(_tmp.value!!)
      _ret
    }
  }

  fun isFollowingFocus(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFollowingFocus.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHScrollEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHScrollEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVScrollEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVScrollEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDeadzone(deadzone: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDeadzone.call(self._handle, listOf(deadzone), null)
    }
  }

  fun setEnableHScroll(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableHScroll.call(self._handle, listOf(enable), null)
    }
  }

  fun setEnableVScroll(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableVScroll.call(self._handle, listOf(enable), null)
    }
  }

  fun setFollowFocus(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFollowFocus.call(self._handle, listOf(enabled), null)
    }
  }

  fun setHScroll(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHScroll.call(self._handle, listOf(value), null)
    }
  }

  fun setVScroll(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVScroll.call(self._handle, listOf(value), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_deadzone" }
        }
      val getHScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scroll" }
        }
      val getHScrollbar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_h_scrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scrollbar" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val getVScrollbar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "get_v_scrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scrollbar" }
        }
      val isFollowingFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_following_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_following_focus" }
        }
      val isHScrollEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_h_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_h_scroll_enabled" }
        }
      val isVScrollEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "is_v_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_v_scroll_enabled" }
        }
      val setDeadzone: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_deadzone" }
        }
      val setEnableHScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_enable_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_h_scroll" }
        }
      val setEnableVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_enable_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_v_scroll" }
        }
      val setFollowFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_follow_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_focus" }
        }
      val setHScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_scroll" }
        }
      val setVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "set_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll" }
        }}
  }
}
