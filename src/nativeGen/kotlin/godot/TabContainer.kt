// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TabContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    fun new(): TabContainer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TabContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TabContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TabContainer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TabContainer
     */
    private object __method_bind {
      val _child_renamed_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "_child_renamed_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _child_renamed_callback" }
            }
          }

      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val _on_theme_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "_on_theme_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _on_theme_changed" }
            }
          }

      val _update_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "_update_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_current_tab" }
            }
          }

      val are_tabs_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "are_tabs_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_tabs_visible" }
            }
          }

      val get_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
            }
          }

      val get_current_tab_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_current_tab_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_tab_control" }
            }
          }

      val get_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled"
              }
            }
          }

      val get_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val get_previous_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_previous_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_previous_tab" }
            }
          }

      val get_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
            }
          }

      val get_tab_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_control" }
            }
          }

      val get_tab_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
            }
          }

      val get_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
            }
          }

      val get_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
            }
          }

      val get_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
            }
          }

      val get_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "get_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
            }
          }

      val set_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
            }
          }

      val set_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled"
              }
            }
          }

      val set_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_popup" }
            }
          }

      val set_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
            }
          }

      val set_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
            }
          }

      val set_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
            }
          }

      val set_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
            }
          }

      val set_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
            }
          }

      val set_tabs_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TabContainer".cstr.ptr,
              "set_tabs_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tabs_visible" }
            }
          }
    }
  }
}
