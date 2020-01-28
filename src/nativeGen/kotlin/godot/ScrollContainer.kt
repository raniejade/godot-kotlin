// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScrollContainer(
  _handle: COpaquePointer
) : Container(_handle) {
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

  fun isHScrollEnabled(): Boolean {
    val _ret = __method_bind.isHScrollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVScrollEnabled(): Boolean {
    val _ret = __method_bind.isVScrollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDeadzone(deadzone: Int) {
    val _arg = Variant.new(deadzone)
    __method_bind.setDeadzone.call(this._handle, _arg, 1)
  }

  fun setEnableHScroll(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEnableHScroll.call(this._handle, _arg, 1)
  }

  fun setEnableVScroll(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEnableVScroll.call(this._handle, _arg, 1)
  }

  fun setHScroll(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setHScroll.call(this._handle, _arg, 1)
  }

  fun setVScroll(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setVScroll.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ScrollContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScrollContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ScrollContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ScrollContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ScrollContainer = ScrollContainer(ptr)
    /**
     * Container for method_bind pointers for ScrollContainer
     */
    private object __method_bind {
      val getDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "getDeadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDeadzone" }
        }
      val getHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "getHScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHScroll" }
        }
      val getHScrollbar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "getHScrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHScrollbar" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "getVScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVScroll" }
        }
      val getVScrollbar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "getVScrollbar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVScrollbar" }
        }
      val isHScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "isHScrollEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHScrollEnabled" }
        }
      val isVScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "isVScrollEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVScrollEnabled" }
        }
      val setDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "setDeadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDeadzone" }
        }
      val setEnableHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "setEnableHScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableHScroll" }
        }
      val setEnableVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "setEnableVScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableVScroll" }
        }
      val setHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "setHScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHScroll" }
        }
      val setVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
            "setVScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVScroll" }
        }}
  }
}
