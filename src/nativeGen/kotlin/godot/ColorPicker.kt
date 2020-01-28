// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
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

open class ColorPicker(
  _handle: COpaquePointer
) : BoxContainer(_handle) {
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

  fun addPreset(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.addPreset.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(color)
    __method_bind.erasePreset.call(this._handle, _arg, 1)
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

  fun isRawMode(): Boolean {
    val _ret = __method_bind.isRawMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDeferredMode(mode: Boolean) {
    val _arg = Variant.new(mode)
    __method_bind.setDeferredMode.call(this._handle, _arg, 1)
  }

  fun setEditAlpha(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setEditAlpha.call(this._handle, _arg, 1)
  }

  fun setPickColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setPickColor.call(this._handle, _arg, 1)
  }

  fun setPresetsEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setPresetsEnabled.call(this._handle, _arg, 1)
  }

  fun setPresetsVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setPresetsVisible.call(this._handle, _arg, 1)
  }

  fun setRawMode(mode: Boolean) {
    val _arg = Variant.new(mode)
    __method_bind.setRawMode.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ColorPicker = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPicker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorPicker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorPicker(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ColorPicker = ColorPicker(ptr)
    /**
     * Container for method_bind pointers for ColorPicker
     */
    private object __method_bind {
      val addPreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "addPreset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPreset" }
        }
      val arePresetsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "arePresetsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method arePresetsEnabled" }
        }
      val arePresetsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "arePresetsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method arePresetsVisible" }
        }
      val erasePreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "erasePreset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erasePreset" }
        }
      val getPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "getPickColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPickColor" }
        }
      val getPresets: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "getPresets".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPresets" }
        }
      val isDeferredMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "isDeferredMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDeferredMode" }
        }
      val isEditingAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "isEditingAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditingAlpha" }
        }
      val isRawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "isRawMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRawMode" }
        }
      val setDeferredMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setDeferredMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDeferredMode" }
        }
      val setEditAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setEditAlpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditAlpha" }
        }
      val setPickColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setPickColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPickColor" }
        }
      val setPresetsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setPresetsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPresetsEnabled" }
        }
      val setPresetsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setPresetsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPresetsVisible" }
        }
      val setRawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPicker".cstr.ptr,
            "setRawMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRawMode" }
        }}
  }
}
