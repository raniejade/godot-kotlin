// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BaseButton internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getActionMode(): ActionMode {
    TODO()
  }

  fun getButtonGroup(): ButtonGroup {
    TODO()
  }

  fun getButtonMask(): Int {
    TODO()
  }

  fun getDrawMode(): DrawMode {
    TODO()
  }

  fun getEnabledFocusMode(): Control.FocusMode {
    TODO()
  }

  fun getShortcut(): ShortCut {
    TODO()
  }

  fun isDisabled(): Boolean {
    TODO()
  }

  fun isHovered(): Boolean {
    TODO()
  }

  fun isKeepPressedOutside(): Boolean {
    TODO()
  }

  fun isPressed(): Boolean {
    TODO()
  }

  fun isShortcutInTooltipEnabled(): Boolean {
    TODO()
  }

  fun isToggleMode(): Boolean {
    TODO()
  }

  fun setActionMode() {
    TODO()
  }

  fun setButtonGroup() {
    TODO()
  }

  fun setButtonMask() {
    TODO()
  }

  fun setDisabled() {
    TODO()
  }

  fun setEnabledFocusMode() {
    TODO()
  }

  fun setKeepPressedOutside() {
    TODO()
  }

  fun setPressed() {
    TODO()
  }

  fun setShortcut() {
    TODO()
  }

  fun setShortcutInTooltip() {
    TODO()
  }

  fun setToggleMode() {
    TODO()
  }

  enum class ActionMode(
    val value: Int
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

    ACTION_MODE_BUTTON_RELEASE(1);
  }

  enum class DrawMode(
    val value: Int
  ) {
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

    DRAW_HOVER_PRESSED(4);
  }

  companion object {
    val ACTION_MODE_BUTTON_PRESS: Int = 0

    val ACTION_MODE_BUTTON_RELEASE: Int = 1

    val DRAW_DISABLED: Int = 3

    val DRAW_HOVER: Int = 2

    val DRAW_HOVER_PRESSED: Int = 4

    val DRAW_NORMAL: Int = 0

    val DRAW_PRESSED: Int = 1

    /**
     * Container for method_bind pointers for BaseButton
     */
    private object __method_bind {
      val get_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
            }
          }

      val get_button_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_button_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_group" }
            }
          }

      val get_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
            }
          }

      val get_draw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_draw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_mode" }
            }
          }

      val get_enabled_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_enabled_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_enabled_focus_mode" }
            }
          }

      val get_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val is_hovered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_hovered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hovered" }
            }
          }

      val is_keep_pressed_outside: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_keep_pressed_outside".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_keep_pressed_outside" }
            }
          }

      val is_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pressed" }
            }
          }

      val is_shortcut_in_tooltip_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_shortcut_in_tooltip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shortcut_in_tooltip_enabled"
              }
            }
          }

      val is_toggle_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_toggle_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_toggle_mode" }
            }
          }

      val set_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
            }
          }

      val set_button_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_button_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_group" }
            }
          }

      val set_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_enabled_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_enabled_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled_focus_mode" }
            }
          }

      val set_keep_pressed_outside: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_keep_pressed_outside".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keep_pressed_outside" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val set_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
            }
          }

      val set_shortcut_in_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_shortcut_in_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut_in_tooltip" }
            }
          }

      val set_toggle_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_toggle_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_toggle_mode" }
            }
          }
    }
  }
}
