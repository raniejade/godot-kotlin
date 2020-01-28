// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MenuButton(
  _handle: COpaquePointer
) : Button(_handle) {
  fun getPopup(): PopupMenu {
    val _ret = __method_bind.get_popup.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun isSwitchOnHover(): Boolean {
    val _ret = __method_bind.is_switch_on_hover.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDisableShortcuts(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.set_disable_shortcuts.call(this._handle, _arg, 1)
  }

  fun setSwitchOnHover(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_switch_on_hover.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): MenuButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MenuButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MenuButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MenuButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MenuButton = MenuButton(ptr)
    /**
     * Container for method_bind pointers for MenuButton
     */
    private object __method_bind {
      val get_popup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "get_popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_popup" }
        }
      val is_switch_on_hover: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "is_switch_on_hover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_switch_on_hover" }
        }
      val set_disable_shortcuts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "set_disable_shortcuts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_shortcuts" }
        }
      val set_switch_on_hover: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "set_switch_on_hover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_switch_on_hover" }
        }}
  }
}
