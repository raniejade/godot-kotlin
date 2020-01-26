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
  fun addPreset(color: Color) {
    TODO()
  }

  fun arePresetsEnabled(): Boolean {
    TODO()
  }

  fun arePresetsVisible(): Boolean {
    TODO()
  }

  fun erasePreset(color: Color) {
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

  fun setDeferredMode(mode: Boolean) {
    TODO()
  }

  fun setEditAlpha(show: Boolean) {
    TODO()
  }

  fun setPickColor(color: Color) {
    TODO()
  }

  fun setPresetsEnabled(enabled: Boolean) {
    TODO()
  }

  fun setPresetsVisible(visible: Boolean) {
    TODO()
  }

  fun setRawMode(mode: Boolean) {
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
