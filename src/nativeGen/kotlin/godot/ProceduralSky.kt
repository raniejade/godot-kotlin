// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProceduralSky(
  _handle: COpaquePointer
) : Sky(_handle) {
  var groundBottomColor: Color
    get() {
       return getGroundBottomColor() 
    }
    set(value) {
      setGroundBottomColor(value)
    }

  var groundCurve: Float
    get() {
       return getGroundCurve() 
    }
    set(value) {
      setGroundCurve(value)
    }

  var groundEnergy: Float
    get() {
       return getGroundEnergy() 
    }
    set(value) {
      setGroundEnergy(value)
    }

  var groundHorizonColor: Color
    get() {
       return getGroundHorizonColor() 
    }
    set(value) {
      setGroundHorizonColor(value)
    }

  var skyCurve: Float
    get() {
       return getSkyCurve() 
    }
    set(value) {
      setSkyCurve(value)
    }

  var skyEnergy: Float
    get() {
       return getSkyEnergy() 
    }
    set(value) {
      setSkyEnergy(value)
    }

  var skyHorizonColor: Color
    get() {
       return getSkyHorizonColor() 
    }
    set(value) {
      setSkyHorizonColor(value)
    }

  var skyTopColor: Color
    get() {
       return getSkyTopColor() 
    }
    set(value) {
      setSkyTopColor(value)
    }

  var sunAngleMax: Float
    get() {
       return getSunAngleMax() 
    }
    set(value) {
      setSunAngleMax(value)
    }

  var sunAngleMin: Float
    get() {
       return getSunAngleMin() 
    }
    set(value) {
      setSunAngleMin(value)
    }

  var sunColor: Color
    get() {
       return getSunColor() 
    }
    set(value) {
      setSunColor(value)
    }

  var sunCurve: Float
    get() {
       return getSunCurve() 
    }
    set(value) {
      setSunCurve(value)
    }

  var sunEnergy: Float
    get() {
       return getSunEnergy() 
    }
    set(value) {
      setSunEnergy(value)
    }

  var sunLatitude: Float
    get() {
       return getSunLatitude() 
    }
    set(value) {
      setSunLatitude(value)
    }

  var sunLongitude: Float
    get() {
       return getSunLongitude() 
    }
    set(value) {
      setSunLongitude(value)
    }

  var textureSize: Int
    get() {
       return ProceduralSky.TextureSize.from(getTextureSize()) 
    }
    set(value) {
      setTextureSize(ProceduralSky.TextureSize.from(value))
    }

  fun getGroundBottomColor(): Color {
    val _ret = __method_bind.getGroundBottomColor.call(this._handle)
    return _ret.asColor()
  }

  fun getGroundCurve(): Float {
    val _ret = __method_bind.getGroundCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getGroundEnergy(): Float {
    val _ret = __method_bind.getGroundEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getGroundHorizonColor(): Color {
    val _ret = __method_bind.getGroundHorizonColor.call(this._handle)
    return _ret.asColor()
  }

  fun getSkyCurve(): Float {
    val _ret = __method_bind.getSkyCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getSkyEnergy(): Float {
    val _ret = __method_bind.getSkyEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getSkyHorizonColor(): Color {
    val _ret = __method_bind.getSkyHorizonColor.call(this._handle)
    return _ret.asColor()
  }

  fun getSkyTopColor(): Color {
    val _ret = __method_bind.getSkyTopColor.call(this._handle)
    return _ret.asColor()
  }

  fun getSunAngleMax(): Float {
    val _ret = __method_bind.getSunAngleMax.call(this._handle)
    return _ret.asFloat()
  }

  fun getSunAngleMin(): Float {
    val _ret = __method_bind.getSunAngleMin.call(this._handle)
    return _ret.asFloat()
  }

  fun getSunColor(): Color {
    val _ret = __method_bind.getSunColor.call(this._handle)
    return _ret.asColor()
  }

  fun getSunCurve(): Float {
    val _ret = __method_bind.getSunCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getSunEnergy(): Float {
    val _ret = __method_bind.getSunEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getSunLatitude(): Float {
    val _ret = __method_bind.getSunLatitude.call(this._handle)
    return _ret.asFloat()
  }

  fun getSunLongitude(): Float {
    val _ret = __method_bind.getSunLongitude.call(this._handle)
    return _ret.asFloat()
  }

  fun getTextureSize(): TextureSize {
    val _ret = __method_bind.getTextureSize.call(this._handle)
    return ProceduralSky.TextureSize.from(_ret.asInt())
  }

  fun setGroundBottomColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setGroundBottomColor.call(this._handle, _arg, 1)
  }

  fun setGroundCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setGroundCurve.call(this._handle, _arg, 1)
  }

  fun setGroundEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setGroundEnergy.call(this._handle, _arg, 1)
  }

  fun setGroundHorizonColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setGroundHorizonColor.call(this._handle, _arg, 1)
  }

  fun setSkyCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setSkyCurve.call(this._handle, _arg, 1)
  }

  fun setSkyEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setSkyEnergy.call(this._handle, _arg, 1)
  }

  fun setSkyHorizonColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSkyHorizonColor.call(this._handle, _arg, 1)
  }

  fun setSkyTopColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSkyTopColor.call(this._handle, _arg, 1)
  }

  fun setSunAngleMax(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunAngleMax.call(this._handle, _arg, 1)
  }

  fun setSunAngleMin(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunAngleMin.call(this._handle, _arg, 1)
  }

  fun setSunColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSunColor.call(this._handle, _arg, 1)
  }

  fun setSunCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setSunCurve.call(this._handle, _arg, 1)
  }

  fun setSunEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setSunEnergy.call(this._handle, _arg, 1)
  }

  fun setSunLatitude(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunLatitude.call(this._handle, _arg, 1)
  }

  fun setSunLongitude(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunLongitude.call(this._handle, _arg, 1)
  }

  fun setTextureSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setTextureSize.call(this._handle, _arg, 1)
  }

  enum class TextureSize(
    val value: Int
  ) {
    TEXTURE_SIZE_256(0),

    TEXTURE_SIZE_512(1),

    TEXTURE_SIZE_1024(2),

    TEXTURE_SIZE_2048(3),

    TEXTURE_SIZE_4096(4),

    TEXTURE_SIZE_MAX(5);

    companion object {
      fun from(value: Int): TextureSize {
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
    val TEXTURE_SIZE_1024: Int = 2

    val TEXTURE_SIZE_2048: Int = 3

    val TEXTURE_SIZE_256: Int = 0

    val TEXTURE_SIZE_4096: Int = 4

    val TEXTURE_SIZE_512: Int = 1

    val TEXTURE_SIZE_MAX: Int = 5

    fun new(): ProceduralSky = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProceduralSky".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProceduralSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProceduralSky(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ProceduralSky = ProceduralSky(ptr)
    /**
     * Container for method_bind pointers for ProceduralSky
     */
    private object __method_bind {
      val getGroundBottomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getGroundBottomColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroundBottomColor" }
        }
      val getGroundCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getGroundCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroundCurve" }
        }
      val getGroundEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getGroundEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroundEnergy" }
        }
      val getGroundHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getGroundHorizonColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroundHorizonColor" }
        }
      val getSkyCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSkyCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyCurve" }
        }
      val getSkyEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSkyEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyEnergy" }
        }
      val getSkyHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSkyHorizonColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyHorizonColor" }
        }
      val getSkyTopColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSkyTopColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyTopColor" }
        }
      val getSunAngleMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunAngleMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunAngleMax" }
        }
      val getSunAngleMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunAngleMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunAngleMin" }
        }
      val getSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunColor" }
        }
      val getSunCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunCurve" }
        }
      val getSunEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunEnergy" }
        }
      val getSunLatitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunLatitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunLatitude" }
        }
      val getSunLongitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getSunLongitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSunLongitude" }
        }
      val getTextureSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "getTextureSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureSize" }
        }
      val setGroundBottomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setGroundBottomColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGroundBottomColor" }
        }
      val setGroundCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setGroundCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGroundCurve" }
        }
      val setGroundEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setGroundEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGroundEnergy" }
        }
      val setGroundHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setGroundHorizonColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGroundHorizonColor" }
        }
      val setSkyCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSkyCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyCurve" }
        }
      val setSkyEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSkyEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyEnergy" }
        }
      val setSkyHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSkyHorizonColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyHorizonColor" }
        }
      val setSkyTopColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSkyTopColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyTopColor" }
        }
      val setSunAngleMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunAngleMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunAngleMax" }
        }
      val setSunAngleMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunAngleMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunAngleMin" }
        }
      val setSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunColor" }
        }
      val setSunCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunCurve" }
        }
      val setSunEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunEnergy" }
        }
      val setSunLatitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunLatitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunLatitude" }
        }
      val setSunLongitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setSunLongitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSunLongitude" }
        }
      val setTextureSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "setTextureSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureSize" }
        }}
  }
}
