// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class MenuButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Button(null) {
  var switchOnHover: Boolean
    get() {
       return isSwitchOnHover() 
    }
    set(value) {
      setSwitchOnHover(value)
    }

  /**
   * MenuButton::about_to_show signal
   */
  val signalAboutToShow: Signal0 = Signal0("about_to_show")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_items(): VariantArray {
    TODO()
  }

  open fun _set_items(arg0: VariantArray) {
    TODO()
  }

  fun getPopup(): PopupMenu {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PopupMenu
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPopup.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PopupMenu>(_tmp.value!!)
      _ret
    }
  }

  fun isSwitchOnHover(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSwitchOnHover.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDisableShortcuts(disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisableShortcuts.call(self._handle, listOf(disabled), null)
    }
  }

  fun setSwitchOnHover(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSwitchOnHover.call(self._handle, listOf(enable), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MenuButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MenuButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MenuButton
     */
    private object __method_bind {
      val getPopup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val isSwitchOnHover: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "is_switch_on_hover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_switch_on_hover" }
        }
      val setDisableShortcuts: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "set_disable_shortcuts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_shortcuts" }
        }
      val setSwitchOnHover: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "set_switch_on_hover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_switch_on_hover" }
        }}
  }
}
