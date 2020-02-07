// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ColorPicker(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : BoxContainer(null) {
  var color: Color
    get() {
       return getPickColor() 
    }
    set(value) {
      setPickColor(value)
    }

  var deferredMode: Boolean
    get() {
       return isDeferredMode() 
    }
    set(value) {
      setDeferredMode(value)
    }

  var editAlpha: Boolean
    get() {
       return isEditingAlpha() 
    }
    set(value) {
      setEditAlpha(value)
    }

  var hsvMode: Boolean
    get() {
       return isHsvMode() 
    }
    set(value) {
      setHsvMode(value)
    }

  var presetsEnabled: Boolean
    get() {
       return arePresetsEnabled() 
    }
    set(value) {
      setPresetsEnabled(value)
    }

  var presetsVisible: Boolean
    get() {
       return arePresetsVisible() 
    }
    set(value) {
      setPresetsVisible(value)
    }

  var rawMode: Boolean
    get() {
       return isRawMode() 
    }
    set(value) {
      setRawMode(value)
    }

  /**
   * ColorPicker::color_changed signal
   */
  val signalColorChanged: Signal1<Color> = Signal1("color_changed")

  /**
   * ColorPicker::preset_added signal
   */
  val signalPresetAdded: Signal1<Color> = Signal1("preset_added")

  /**
   * ColorPicker::preset_removed signal
   */
  val signalPresetRemoved: Signal1<Color> = Signal1("preset_removed")

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  fun addPreset(color: Color) {
    val _arg = Variant(color)
    __method_bind.addPreset.call(this._handle, listOf(_arg))
  }

  fun arePresetsEnabled(): Boolean {
    val _ret = __method_bind.arePresetsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun arePresetsVisible(): Boolean {
    val _ret = __method_bind.arePresetsVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun erasePreset(color: Color) {
    val _arg = Variant(color)
    __method_bind.erasePreset.call(this._handle, listOf(_arg))
  }

  fun getPickColor(): Color {
    val _ret = __method_bind.getPickColor.call(this._handle)
    return _ret.asColor()
  }

  fun getPresets(): PoolColorArray {
    val _ret = __method_bind.getPresets.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun isDeferredMode(): Boolean {
    val _ret = __method_bind.isDeferredMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEditingAlpha(): Boolean {
    val _ret = __method_bind.isEditingAlpha.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHsvMode(): Boolean {
    val _ret = __method_bind.isHsvMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRawMode(): Boolean {
    val _ret = __method_bind.isRawMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDeferredMode(mode: Boolean) {
    val _arg = Variant(mode)
    __method_bind.setDeferredMode.call(this._handle, listOf(_arg))
  }

  fun setEditAlpha(show: Boolean) {
    val _arg = Variant(show)
    __method_bind.setEditAlpha.call(this._handle, listOf(_arg))
  }

  fun setHsvMode(mode: Boolean) {
    val _arg = Variant(mode)
    __method_bind.setHsvMode.call(this._handle, listOf(_arg))
  }

  fun setPickColor(color: Color) {
    val _arg = Variant(color)
    __method_bind.setPickColor.call(this._handle, listOf(_arg))
  }

  fun setPresetsEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setPresetsEnabled.call(this._handle, listOf(_arg))
  }

  fun setPresetsVisible(visible: Boolean) {
    val _arg = Variant(visible)
    __method_bind.setPresetsVisible.call(this._handle, listOf(_arg))
  }

  fun setRawMode(mode: Boolean) {
    val _arg = Variant(mode)
    __method_bind.setRawMode.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPicker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorPicker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ColorPicker
     */
    private object __method_bind {
      val addPreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "add_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_preset" }
        }
      val arePresetsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "are_presets_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_presets_enabled" }
        }
      val arePresetsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "are_presets_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_presets_visible" }
        }
      val erasePreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "erase_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_preset" }
        }
      val getPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "get_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
        }
      val getPresets: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "get_presets".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_presets" }
        }
      val isDeferredMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "is_deferred_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_deferred_mode" }
        }
      val isEditingAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "is_editing_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
        }
      val isHsvMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "is_hsv_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hsv_mode" }
        }
      val isRawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "is_raw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_raw_mode" }
        }
      val setDeferredMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_deferred_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_deferred_mode" }
        }
      val setEditAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_edit_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
        }
      val setHsvMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_hsv_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hsv_mode" }
        }
      val setPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_pick_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
        }
      val setPresetsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_presets_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_presets_enabled" }
        }
      val setPresetsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_presets_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_presets_visible" }
        }
      val setRawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "set_raw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_raw_mode" }
        }}
  }
}
