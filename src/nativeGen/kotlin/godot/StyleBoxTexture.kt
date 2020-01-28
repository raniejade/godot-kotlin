// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class StyleBoxTexture(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  var axisStretchHorizontal: Int
    get() {
       return StyleBoxTexture.AxisStretchMode.from(getHAxisStretchMode()) 
    }
    set(value) {
      setHAxisStretchMode(StyleBoxTexture.AxisStretchMode.from(value))
    }

  var axisStretchVertical: Int
    get() {
       return StyleBoxTexture.AxisStretchMode.from(getVAxisStretchMode()) 
    }
    set(value) {
      setVAxisStretchMode(StyleBoxTexture.AxisStretchMode.from(value))
    }

  var drawCenter: Boolean
    get() {
       return isDrawCenterEnabled() 
    }
    set(value) {
      setDrawCenter(value)
    }

  var modulateColor: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
    }

  var regionRect: Rect2
    get() {
       return getRegionRect() 
    }
    set(value) {
      setRegionRect(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  fun getExpandMarginSize(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getExpandMarginSize.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getHAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.getHAxisStretchMode.call(this._handle)
    return StyleBoxTexture.AxisStretchMode.from(_ret.asInt())
  }

  fun getMarginSize(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getMarginSize.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getModulate(): Color {
    val _ret = __method_bind.getModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.getNormalMap.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.getRegionRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.getVAxisStretchMode.call(this._handle)
    return StyleBoxTexture.AxisStretchMode.from(_ret.asInt())
  }

  fun isDrawCenterEnabled(): Boolean {
    val _ret = __method_bind.isDrawCenterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDrawCenter(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDrawCenter.call(this._handle, _arg, 1)
  }

  fun setExpandMarginAll(size: Float) {
    val _arg = Variant.new(size)
    __method_bind.setExpandMarginAll.call(this._handle, _arg, 1)
  }

  fun setExpandMarginIndividual(
    sizeLeft: Float,
    sizeTop: Float,
    sizeRight: Float,
    sizeBottom: Float
  ) {
    val _args = VariantArray.new()
    _args.append(sizeLeft)
    _args.append(sizeTop)
    _args.append(sizeRight)
    _args.append(sizeBottom)
    __method_bind.setExpandMarginIndividual.call(this._handle, _args.toVariant(), 4)
  }

  fun setExpandMarginSize(margin: Int, size: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(size)
    __method_bind.setExpandMarginSize.call(this._handle, _args.toVariant(), 2)
  }

  fun setHAxisStretchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setHAxisStretchMode.call(this._handle, _arg, 1)
  }

  fun setMarginSize(margin: Int, size: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(size)
    __method_bind.setMarginSize.call(this._handle, _args.toVariant(), 2)
  }

  fun setModulate(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setModulate.call(this._handle, _arg, 1)
  }

  fun setNormalMap(normalMap: Texture) {
    val _arg = Variant.new(normalMap)
    __method_bind.setNormalMap.call(this._handle, _arg, 1)
  }

  fun setRegionRect(region: Rect2) {
    val _arg = Variant.new(region)
    __method_bind.setRegionRect.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setVAxisStretchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setVAxisStretchMode.call(this._handle, _arg, 1)
  }

  enum class AxisStretchMode(
    val value: Int
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);

    companion object {
      fun from(value: Int): AxisStretchMode {
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
    val AXIS_STRETCH_MODE_STRETCH: Int = 0

    val AXIS_STRETCH_MODE_TILE: Int = 1

    val AXIS_STRETCH_MODE_TILE_FIT: Int = 2

    fun new(): StyleBoxTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxTexture = StyleBoxTexture(ptr)
    /**
     * Container for method_bind pointers for StyleBoxTexture
     */
    private object __method_bind {
      val getExpandMarginSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getExpandMarginSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExpandMarginSize" }
        }
      val getHAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getHAxisStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHAxisStretchMode" }
        }
      val getMarginSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getMarginSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMarginSize" }
        }
      val getModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getModulate" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalMap" }
        }
      val getRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getRegionRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRegionRect" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getVAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "getVAxisStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVAxisStretchMode" }
        }
      val isDrawCenterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "isDrawCenterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawCenterEnabled" }
        }
      val setDrawCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setDrawCenter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawCenter" }
        }
      val setExpandMarginAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setExpandMarginAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMarginAll" }
        }
      val setExpandMarginIndividual: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setExpandMarginIndividual".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMarginIndividual" }
        }
      val setExpandMarginSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setExpandMarginSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMarginSize" }
        }
      val setHAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setHAxisStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHAxisStretchMode" }
        }
      val setMarginSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setMarginSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMarginSize" }
        }
      val setModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setModulate" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalMap" }
        }
      val setRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setRegionRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegionRect" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setVAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
            "setVAxisStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVAxisStretchMode" }
        }}
  }
}
