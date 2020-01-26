// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ColorPicker internal constructor(
  _handle: COpaquePointer
) : BoxContainer(_handle) {
  fun addPresetPressed() {
    TODO()
  }

  fun focusEnter() {
    TODO()
  }

  fun focusExit() {
    TODO()
  }

  fun hsvDraw() {
    TODO()
  }

  fun htmlEntered() {
    TODO()
  }

  fun htmlFocusExit() {
    TODO()
  }

  fun presetInput() {
    TODO()
  }

  fun sampleDraw() {
    TODO()
  }

  fun screenInput() {
    TODO()
  }

  fun screenPickPressed() {
    TODO()
  }

  fun textTypeToggled() {
    TODO()
  }

  fun updatePresets() {
    TODO()
  }

  fun uvInput() {
    TODO()
  }

  fun valueChanged() {
    TODO()
  }

  fun wInput() {
    TODO()
  }

  fun addPreset() {
    TODO()
  }

  fun arePresetsEnabled(): Boolean {
    TODO()
  }

  fun arePresetsVisible(): Boolean {
    TODO()
  }

  fun erasePreset() {
    TODO()
  }

  fun getPickColor(): Color {
    TODO()
  }

  fun getPresets(): PoolColorArray {
    TODO()
  }

  fun isDeferredMode(): Boolean {
    TODO()
  }

  fun isEditingAlpha(): Boolean {
    TODO()
  }

  fun isRawMode(): Boolean {
    TODO()
  }

  fun setDeferredMode() {
    TODO()
  }

  fun setEditAlpha() {
    TODO()
  }

  fun setPickColor() {
    TODO()
  }

  fun setPresetsEnabled() {
    TODO()
  }

  fun setPresetsVisible() {
    TODO()
  }

  fun setRawMode() {
    TODO()
  }

  companion object {
    fun new(): ColorPicker = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPicker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ColorPicker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorPicker(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ColorPicker
     */
    private object __method_bind {
      val _add_preset_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_add_preset_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _add_preset_pressed" }
            }
          }

      val _focus_enter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_focus_enter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _focus_enter" }
            }
          }

      val _focus_exit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_focus_exit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _focus_exit" }
            }
          }

      val _hsv_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_hsv_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _hsv_draw" }
            }
          }

      val _html_entered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_html_entered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _html_entered" }
            }
          }

      val _html_focus_exit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_html_focus_exit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _html_focus_exit" }
            }
          }

      val _preset_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_preset_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _preset_input" }
            }
          }

      val _sample_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_sample_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _sample_draw" }
            }
          }

      val _screen_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_screen_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _screen_input" }
            }
          }

      val _screen_pick_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_screen_pick_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _screen_pick_pressed" }
            }
          }

      val _text_type_toggled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_text_type_toggled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _text_type_toggled" }
            }
          }

      val _update_presets: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_update_presets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_presets" }
            }
          }

      val _uv_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_uv_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _uv_input" }
            }
          }

      val _value_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_value_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _value_changed" }
            }
          }

      val _w_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "_w_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _w_input" }
            }
          }

      val add_preset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "add_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_preset" }
            }
          }

      val are_presets_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "are_presets_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_presets_enabled" }
            }
          }

      val are_presets_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "are_presets_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_presets_visible" }
            }
          }

      val erase_preset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "erase_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_preset" }
            }
          }

      val get_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "get_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
            }
          }

      val get_presets: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "get_presets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_presets" }
            }
          }

      val is_deferred_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_deferred_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_deferred_mode" }
            }
          }

      val is_editing_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_editing_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
            }
          }

      val is_raw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_raw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_raw_mode" }
            }
          }

      val set_deferred_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_deferred_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_deferred_mode" }
            }
          }

      val set_edit_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_edit_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
            }
          }

      val set_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
            }
          }

      val set_presets_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_presets_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_presets_enabled" }
            }
          }

      val set_presets_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_presets_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_presets_visible" }
            }
          }

      val set_raw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_raw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_raw_mode" }
            }
          }
    }
  }
}
