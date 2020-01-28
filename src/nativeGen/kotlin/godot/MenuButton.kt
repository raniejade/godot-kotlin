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
  var items: VariantArray
    get() {
       return _getItems() 
    }
    set(value) {
      _setItems(value)
    }

  var switchOnHover: Boolean
    get() {
       return isSwitchOnHover() 
    }
    set(value) {
      setSwitchOnHover(value)
    }

  fun getPopup(): PopupMenu {
    val _ret = __method_bind.getPopup.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun isSwitchOnHover(): Boolean {
    val _ret = __method_bind.isSwitchOnHover.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDisableShortcuts(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisableShortcuts.call(this._handle, _arg, 1)
  }

  fun setSwitchOnHover(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSwitchOnHover.call(this._handle, _arg, 1)
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
      val getPopup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "getPopup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPopup" }
        }
      val isSwitchOnHover: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "isSwitchOnHover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSwitchOnHover" }
        }
      val setDisableShortcuts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "setDisableShortcuts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisableShortcuts" }
        }
      val setSwitchOnHover: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
            "setSwitchOnHover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSwitchOnHover" }
        }}
  }
}
