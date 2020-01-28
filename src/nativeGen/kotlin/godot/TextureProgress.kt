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

open class TextureProgress(
  _handle: COpaquePointer
) : Range(_handle) {
  var fillMode: Int
    get() {
       return getFillMode() 
    }
    set(value) {
      setFillMode(value)
    }

  var ninePatchStretch: Boolean
    get() {
       return getNinePatchStretch() 
    }
    set(value) {
      setNinePatchStretch(value)
    }

  var radialCenterOffset: Vector2
    get() {
       return getRadialCenterOffset() 
    }
    set(value) {
      setRadialCenterOffset(value)
    }

  var radialFillDegrees: Float
    get() {
       return getFillDegrees() 
    }
    set(value) {
      setFillDegrees(value)
    }

  var radialInitialAngle: Float
    get() {
       return getRadialInitialAngle() 
    }
    set(value) {
      setRadialInitialAngle(value)
    }

  var textureOver: Texture
    get() {
       return getOverTexture() 
    }
    set(value) {
      setOverTexture(value)
    }

  var textureProgress: Texture
    get() {
       return getProgressTexture() 
    }
    set(value) {
      setProgressTexture(value)
    }

  var textureUnder: Texture
    get() {
       return getUnderTexture() 
    }
    set(value) {
      setUnderTexture(value)
    }

  var tintOver: Color
    get() {
       return getTintOver() 
    }
    set(value) {
      setTintOver(value)
    }

  var tintProgress: Color
    get() {
       return getTintProgress() 
    }
    set(value) {
      setTintProgress(value)
    }

  var tintUnder: Color
    get() {
       return getTintUnder() 
    }
    set(value) {
      setTintUnder(value)
    }

  fun getFillDegrees(): Float {
    val _ret = __method_bind.getFillDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getFillMode(): Int {
    val _ret = __method_bind.getFillMode.call(this._handle)
    return _ret.asInt()
  }

  fun getNinePatchStretch(): Boolean {
    val _ret = __method_bind.getNinePatchStretch.call(this._handle)
    return _ret.asBoolean()
  }

  fun getOverTexture(): Texture {
    val _ret = __method_bind.getOverTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getProgressTexture(): Texture {
    val _ret = __method_bind.getProgressTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getRadialCenterOffset(): Vector2 {
    val _ret = __method_bind.getRadialCenterOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getRadialInitialAngle(): Float {
    val _ret = __method_bind.getRadialInitialAngle.call(this._handle)
    return _ret.asFloat()
  }

  fun getStretchMargin(margin: Int): Int {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getStretchMargin.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getTintOver(): Color {
    val _ret = __method_bind.getTintOver.call(this._handle)
    return _ret.asColor()
  }

  fun getTintProgress(): Color {
    val _ret = __method_bind.getTintProgress.call(this._handle)
    return _ret.asColor()
  }

  fun getTintUnder(): Color {
    val _ret = __method_bind.getTintUnder.call(this._handle)
    return _ret.asColor()
  }

  fun getUnderTexture(): Texture {
    val _ret = __method_bind.getUnderTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun setFillDegrees(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setFillDegrees.call(this._handle, _arg, 1)
  }

  fun setFillMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setFillMode.call(this._handle, _arg, 1)
  }

  fun setNinePatchStretch(stretch: Boolean) {
    val _arg = Variant.new(stretch)
    __method_bind.setNinePatchStretch.call(this._handle, _arg, 1)
  }

  fun setOverTexture(tex: Texture) {
    val _arg = Variant.new(tex)
    __method_bind.setOverTexture.call(this._handle, _arg, 1)
  }

  fun setProgressTexture(tex: Texture) {
    val _arg = Variant.new(tex)
    __method_bind.setProgressTexture.call(this._handle, _arg, 1)
  }

  fun setRadialCenterOffset(mode: Vector2) {
    val _arg = Variant.new(mode)
    __method_bind.setRadialCenterOffset.call(this._handle, _arg, 1)
  }

  fun setRadialInitialAngle(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setRadialInitialAngle.call(this._handle, _arg, 1)
  }

  fun setStretchMargin(margin: Int, value: Int) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(value)
    __method_bind.setStretchMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun setTintOver(tint: Color) {
    val _arg = Variant.new(tint)
    __method_bind.setTintOver.call(this._handle, _arg, 1)
  }

  fun setTintProgress(tint: Color) {
    val _arg = Variant.new(tint)
    __method_bind.setTintProgress.call(this._handle, _arg, 1)
  }

  fun setTintUnder(tint: Color) {
    val _arg = Variant.new(tint)
    __method_bind.setTintUnder.call(this._handle, _arg, 1)
  }

  fun setUnderTexture(tex: Texture) {
    val _arg = Variant.new(tex)
    __method_bind.setUnderTexture.call(this._handle, _arg, 1)
  }

  enum class FillMode(
    val value: Int
  ) {
    FILL_LEFT_TO_RIGHT(0),

    FILL_RIGHT_TO_LEFT(1),

    FILL_TOP_TO_BOTTOM(2),

    FILL_BOTTOM_TO_TOP(3),

    FILL_CLOCKWISE(4),

    FILL_COUNTER_CLOCKWISE(5),

    FILL_BILINEAR_LEFT_AND_RIGHT(6),

    FILL_BILINEAR_TOP_AND_BOTTOM(7),

    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8);

    companion object {
      fun from(value: Int): FillMode {
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
    val FILL_BILINEAR_LEFT_AND_RIGHT: Int = 6

    val FILL_BILINEAR_TOP_AND_BOTTOM: Int = 7

    val FILL_BOTTOM_TO_TOP: Int = 3

    val FILL_CLOCKWISE: Int = 4

    val FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE: Int = 8

    val FILL_COUNTER_CLOCKWISE: Int = 5

    val FILL_LEFT_TO_RIGHT: Int = 0

    val FILL_RIGHT_TO_LEFT: Int = 1

    val FILL_TOP_TO_BOTTOM: Int = 2

    fun new(): TextureProgress = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureProgress".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureProgress" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureProgress(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TextureProgress = TextureProgress(ptr)
    /**
     * Container for method_bind pointers for TextureProgress
     */
    private object __method_bind {
      val getFillDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getFillDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFillDegrees" }
        }
      val getFillMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getFillMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFillMode" }
        }
      val getNinePatchStretch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getNinePatchStretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNinePatchStretch" }
        }
      val getOverTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getOverTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOverTexture" }
        }
      val getProgressTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getProgressTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProgressTexture" }
        }
      val getRadialCenterOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getRadialCenterOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadialCenterOffset" }
        }
      val getRadialInitialAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getRadialInitialAngle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadialInitialAngle" }
        }
      val getStretchMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getStretchMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStretchMargin" }
        }
      val getTintOver: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getTintOver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTintOver" }
        }
      val getTintProgress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getTintProgress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTintProgress" }
        }
      val getTintUnder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getTintUnder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTintUnder" }
        }
      val getUnderTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "getUnderTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnderTexture" }
        }
      val setFillDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setFillDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFillDegrees" }
        }
      val setFillMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setFillMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFillMode" }
        }
      val setNinePatchStretch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setNinePatchStretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNinePatchStretch" }
        }
      val setOverTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setOverTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOverTexture" }
        }
      val setProgressTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setProgressTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProgressTexture" }
        }
      val setRadialCenterOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setRadialCenterOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadialCenterOffset" }
        }
      val setRadialInitialAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setRadialInitialAngle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadialInitialAngle" }
        }
      val setStretchMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setStretchMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStretchMargin" }
        }
      val setTintOver: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setTintOver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTintOver" }
        }
      val setTintProgress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setTintProgress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTintProgress" }
        }
      val setTintUnder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setTintUnder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTintUnder" }
        }
      val setUnderTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "setUnderTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUnderTexture" }
        }}
  }
}
