// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Light2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var editorOnly: Boolean
    get() {
       return isEditorOnly() 
    }
    set(value) {
      setEditorOnly(value)
    }

  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var energy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var mode: Int
    get() {
       return Light2D.Mode.from(getMode()) 
    }
    set(value) {
      setMode(Light2D.Mode.from(value))
    }

  var offset: Vector2
    get() {
       return getTextureOffset() 
    }
    set(value) {
      setTextureOffset(value)
    }

  var rangeHeight: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var rangeItemCullMask: Int
    get() {
       return getItemCullMask() 
    }
    set(value) {
      setItemCullMask(value)
    }

  var rangeLayerMax: Int
    get() {
       return getLayerRangeMax() 
    }
    set(value) {
      setLayerRangeMax(value)
    }

  var rangeLayerMin: Int
    get() {
       return getLayerRangeMin() 
    }
    set(value) {
      setLayerRangeMin(value)
    }

  var rangeZMax: Int
    get() {
       return getZRangeMax() 
    }
    set(value) {
      setZRangeMax(value)
    }

  var rangeZMin: Int
    get() {
       return getZRangeMin() 
    }
    set(value) {
      setZRangeMin(value)
    }

  var shadowBufferSize: Int
    get() {
       return getShadowBufferSize() 
    }
    set(value) {
      setShadowBufferSize(value)
    }

  var shadowColor: Color
    get() {
       return getShadowColor() 
    }
    set(value) {
      setShadowColor(value)
    }

  var shadowEnabled: Boolean
    get() {
       return isShadowEnabled() 
    }
    set(value) {
      setShadowEnabled(value)
    }

  var shadowFilter: Int
    get() {
       return Light2D.ShadowFilter.from(getShadowFilter()) 
    }
    set(value) {
      setShadowFilter(Light2D.ShadowFilter.from(value))
    }

  var shadowFilterSmooth: Float
    get() {
       return getShadowSmooth() 
    }
    set(value) {
      setShadowSmooth(value)
    }

  var shadowGradientLength: Float
    get() {
       return getShadowGradientLength() 
    }
    set(value) {
      setShadowGradientLength(value)
    }

  var shadowItemCullMask: Int
    get() {
       return getItemShadowCullMask() 
    }
    set(value) {
      setItemShadowCullMask(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var textureScale: Float
    get() {
       return getTextureScale() 
    }
    set(value) {
      setTextureScale(value)
    }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getItemCullMask(): Int {
    val _ret = __method_bind.getItemCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getItemShadowCullMask(): Int {
    val _ret = __method_bind.getItemShadowCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMax(): Int {
    val _ret = __method_bind.getLayerRangeMax.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMin(): Int {
    val _ret = __method_bind.getLayerRangeMin.call(this._handle)
    return _ret.asInt()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return Light2D.Mode.from(_ret.asInt())
  }

  fun getShadowBufferSize(): Int {
    val _ret = __method_bind.getShadowBufferSize.call(this._handle)
    return _ret.asInt()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.getShadowColor.call(this._handle)
    return _ret.asColor()
  }

  fun getShadowFilter(): ShadowFilter {
    val _ret = __method_bind.getShadowFilter.call(this._handle)
    return Light2D.ShadowFilter.from(_ret.asInt())
  }

  fun getShadowGradientLength(): Float {
    val _ret = __method_bind.getShadowGradientLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getShadowSmooth(): Float {
    val _ret = __method_bind.getShadowSmooth.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.getTextureOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getTextureScale(): Float {
    val _ret = __method_bind.getTextureScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getZRangeMax(): Int {
    val _ret = __method_bind.getZRangeMax.call(this._handle)
    return _ret.asInt()
  }

  fun getZRangeMin(): Int {
    val _ret = __method_bind.getZRangeMin.call(this._handle)
    return _ret.asInt()
  }

  fun isEditorOnly(): Boolean {
    val _ret = __method_bind.isEditorOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.isEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShadowEnabled(): Boolean {
    val _ret = __method_bind.isShadowEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _arg = Variant.new(editorOnly)
    __method_bind.setEditorOnly.call(this._handle, _arg, 1)
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEnabled.call(this._handle, _arg, 1)
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setEnergy.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setItemCullMask(itemCullMask: Int) {
    val _arg = Variant.new(itemCullMask)
    __method_bind.setItemCullMask.call(this._handle, _arg, 1)
  }

  fun setItemShadowCullMask(itemShadowCullMask: Int) {
    val _arg = Variant.new(itemShadowCullMask)
    __method_bind.setItemShadowCullMask.call(this._handle, _arg, 1)
  }

  fun setLayerRangeMax(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setLayerRangeMax.call(this._handle, _arg, 1)
  }

  fun setLayerRangeMin(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setLayerRangeMin.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, _arg, 1)
  }

  fun setShadowBufferSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setShadowBufferSize.call(this._handle, _arg, 1)
  }

  fun setShadowColor(shadowColor: Color) {
    val _arg = Variant.new(shadowColor)
    __method_bind.setShadowColor.call(this._handle, _arg, 1)
  }

  fun setShadowEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setShadowEnabled.call(this._handle, _arg, 1)
  }

  fun setShadowFilter(filter: Int) {
    val _arg = Variant.new(filter)
    __method_bind.setShadowFilter.call(this._handle, _arg, 1)
  }

  fun setShadowGradientLength(multiplier: Float) {
    val _arg = Variant.new(multiplier)
    __method_bind.setShadowGradientLength.call(this._handle, _arg, 1)
  }

  fun setShadowSmooth(smooth: Float) {
    val _arg = Variant.new(smooth)
    __method_bind.setShadowSmooth.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant.new(textureOffset)
    __method_bind.setTextureOffset.call(this._handle, _arg, 1)
  }

  fun setTextureScale(textureScale: Float) {
    val _arg = Variant.new(textureScale)
    __method_bind.setTextureScale.call(this._handle, _arg, 1)
  }

  fun setZRangeMax(z: Int) {
    val _arg = Variant.new(z)
    __method_bind.setZRangeMax.call(this._handle, _arg, 1)
  }

  fun setZRangeMin(z: Int) {
    val _arg = Variant.new(z)
    __method_bind.setZRangeMin.call(this._handle, _arg, 1)
  }

  enum class ShadowFilter(
    val value: Int
  ) {
    SHADOW_FILTER_NONE(0),

    SHADOW_FILTER_PCF3(1),

    SHADOW_FILTER_PCF5(2),

    SHADOW_FILTER_PCF7(3),

    SHADOW_FILTER_PCF9(4),

    SHADOW_FILTER_PCF13(5);

    companion object {
      fun from(value: Int): ShadowFilter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_ADD(0),

    MODE_SUB(1),

    MODE_MIX(2),

    MODE_MASK(3);

    companion object {
      fun from(value: Int): Mode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MODE_ADD: Int = 0

    val MODE_MASK: Int = 3

    val MODE_MIX: Int = 2

    val MODE_SUB: Int = 1

    val SHADOW_FILTER_NONE: Int = 0

    val SHADOW_FILTER_PCF13: Int = 5

    val SHADOW_FILTER_PCF3: Int = 1

    val SHADOW_FILTER_PCF5: Int = 2

    val SHADOW_FILTER_PCF7: Int = 3

    val SHADOW_FILTER_PCF9: Int = 4

    fun new(): Light2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Light2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Light2D = Light2D(ptr)
    /**
     * Container for method_bind pointers for Light2D
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnergy" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getItemCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getItemCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemCullMask" }
        }
      val getItemShadowCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getItemShadowCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemShadowCullMask" }
        }
      val getLayerRangeMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getLayerRangeMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLayerRangeMax" }
        }
      val getLayerRangeMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getLayerRangeMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLayerRangeMin" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getShadowBufferSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getShadowBufferSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowBufferSize" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowColor" }
        }
      val getShadowFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getShadowFilter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowFilter" }
        }
      val getShadowGradientLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getShadowGradientLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowGradientLength" }
        }
      val getShadowSmooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getShadowSmooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowSmooth" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureOffset" }
        }
      val getTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getTextureScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureScale" }
        }
      val getZRangeMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getZRangeMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZRangeMax" }
        }
      val getZRangeMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "getZRangeMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZRangeMin" }
        }
      val isEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "isEditorOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditorOnly" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "isEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEnabled" }
        }
      val isShadowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "isShadowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShadowEnabled" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setEditorOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditorOnly" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnabled" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnergy" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setItemCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setItemCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemCullMask" }
        }
      val setItemShadowCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setItemShadowCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemShadowCullMask" }
        }
      val setLayerRangeMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setLayerRangeMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLayerRangeMax" }
        }
      val setLayerRangeMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setLayerRangeMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLayerRangeMin" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setShadowBufferSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowBufferSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowBufferSize" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowColor" }
        }
      val setShadowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowEnabled" }
        }
      val setShadowFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowFilter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowFilter" }
        }
      val setShadowGradientLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowGradientLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowGradientLength" }
        }
      val setShadowSmooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setShadowSmooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowSmooth" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureOffset" }
        }
      val setTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setTextureScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureScale" }
        }
      val setZRangeMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setZRangeMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZRangeMax" }
        }
      val setZRangeMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "setZRangeMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZRangeMin" }
        }}
  }
}
