// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  open fun _add_preset_pressed() {
    TODO()
  }

  open fun _focus_enter() {
    TODO()
  }

  open fun _focus_exit() {
    TODO()
  }

  open fun _hsv_draw(arg0: Int, arg1: Control) {
    TODO()
  }

  open fun _html_entered(arg0: String) {
    TODO()
  }

  open fun _html_focus_exit() {
    TODO()
  }

  open fun _preset_input(arg0: InputEvent) {
    TODO()
  }

  open fun _sample_draw() {
    TODO()
  }

  open fun _screen_input(arg0: InputEvent) {
    TODO()
  }

  open fun _screen_pick_pressed() {
    TODO()
  }

  open fun _text_type_toggled() {
    TODO()
  }

  open fun _update_presets() {
    TODO()
  }

  open fun _uv_input(arg0: InputEvent) {
    TODO()
  }

  open fun _value_changed(arg0: Float) {
    TODO()
  }

  open fun _w_input(arg0: InputEvent) {
    TODO()
  }

  fun addPreset(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPreset.call(self._handle, listOf(color), null)
    }
  }

  fun arePresetsEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.arePresetsEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun arePresetsVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.arePresetsVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun erasePreset(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.erasePreset.call(self._handle, listOf(color), null)
    }
  }

  fun getPickColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getPickColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPresets(): PoolColorArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolColorArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPresets.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isDeferredMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDeferredMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEditingAlpha(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditingAlpha.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHsvMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHsvMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRawMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRawMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDeferredMode(mode: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDeferredMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setEditAlpha(show: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditAlpha.call(self._handle, listOf(show), null)
    }
  }

  fun setHsvMode(mode: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHsvMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPickColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPickColor.call(self._handle, listOf(color), null)
    }
  }

  fun setPresetsEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPresetsEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setPresetsVisible(visible: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPresetsVisible.call(self._handle, listOf(visible), null)
    }
  }

  fun setRawMode(mode: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRawMode.call(self._handle, listOf(mode), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPicker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorPicker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ColorPicker
     */
    private object __method_bind {
      val addPreset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "add_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_preset" }
            }
          }

      val arePresetsEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "are_presets_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_presets_enabled" }
            }
          }

      val arePresetsVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "are_presets_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_presets_visible" }
            }
          }

      val erasePreset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "erase_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_preset" }
            }
          }

      val getPickColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "get_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
            }
          }

      val getPresets: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "get_presets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_presets" }
            }
          }

      val isDeferredMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_deferred_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_deferred_mode" }
            }
          }

      val isEditingAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_editing_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
            }
          }

      val isHsvMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_hsv_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hsv_mode" }
            }
          }

      val isRawMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "is_raw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_raw_mode" }
            }
          }

      val setDeferredMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_deferred_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_deferred_mode" }
            }
          }

      val setEditAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_edit_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
            }
          }

      val setHsvMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_hsv_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hsv_mode" }
            }
          }

      val setPickColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
            }
          }

      val setPresetsEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_presets_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_presets_enabled" }
            }
          }

      val setPresetsVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_presets_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_presets_visible" }
            }
          }

      val setRawMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
              "set_raw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_raw_mode" }
            }
          }
    }
  }
}
