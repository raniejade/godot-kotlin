// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MenuButton internal constructor(
  _handle: COpaquePointer
) : Button(_handle) {
  fun getPopup(): PopupMenu {
    TODO()
  }

  fun isSwitchOnHover(): Boolean {
    TODO()
  }

  fun setDisableShortcuts() {
    TODO()
  }

  fun setSwitchOnHover() {
    TODO()
  }

  companion object {
    fun new(): MenuButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MenuButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MenuButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MenuButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for MenuButton
     */
    private object __method_bind {
      val get_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val is_switch_on_hover: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
              "is_switch_on_hover".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_switch_on_hover" }
            }
          }

      val set_disable_shortcuts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
              "set_disable_shortcuts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_shortcuts" }
            }
          }

      val set_switch_on_hover: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MenuButton".cstr.ptr,
              "set_switch_on_hover".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_switch_on_hover" }
            }
          }
    }
  }
}
