// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.Unit
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

  var textureSize: TextureSize
    get() {
       return getTextureSize() 
    }
    set(value) {
      setTextureSize(value.value)
    }

  /**
   * Specialized setter for groundBottomColor
   */
  fun groundBottomColor(cb: Color.() -> Unit) {
    val _p = groundBottomColor
    cb(_p)
    groundBottomColor = _p
  }

  /**
   * Specialized setter for groundHorizonColor
   */
  fun groundHorizonColor(cb: Color.() -> Unit) {
    val _p = groundHorizonColor
    cb(_p)
    groundHorizonColor = _p
  }

  /**
   * Specialized setter for skyHorizonColor
   */
  fun skyHorizonColor(cb: Color.() -> Unit) {
    val _p = skyHorizonColor
    cb(_p)
    skyHorizonColor = _p
  }

  /**
   * Specialized setter for skyTopColor
   */
  fun skyTopColor(cb: Color.() -> Unit) {
    val _p = skyTopColor
    cb(_p)
    skyTopColor = _p
  }

  /**
   * Specialized setter for sunColor
   */
  fun sunColor(cb: Color.() -> Unit) {
    val _p = sunColor
    cb(_p)
    sunColor = _p
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
    __method_bind.setGroundBottomColor.call(this._handle, listOf(_arg))
  }

  fun setGroundCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setGroundCurve.call(this._handle, listOf(_arg))
  }

  fun setGroundEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setGroundEnergy.call(this._handle, listOf(_arg))
  }

  fun setGroundHorizonColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setGroundHorizonColor.call(this._handle, listOf(_arg))
  }

  fun setSkyCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setSkyCurve.call(this._handle, listOf(_arg))
  }

  fun setSkyEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setSkyEnergy.call(this._handle, listOf(_arg))
  }

  fun setSkyHorizonColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSkyHorizonColor.call(this._handle, listOf(_arg))
  }

  fun setSkyTopColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSkyTopColor.call(this._handle, listOf(_arg))
  }

  fun setSunAngleMax(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunAngleMax.call(this._handle, listOf(_arg))
  }

  fun setSunAngleMin(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunAngleMin.call(this._handle, listOf(_arg))
  }

  fun setSunColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSunColor.call(this._handle, listOf(_arg))
  }

  fun setSunCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setSunCurve.call(this._handle, listOf(_arg))
  }

  fun setSunEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setSunEnergy.call(this._handle, listOf(_arg))
  }

  fun setSunLatitude(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunLatitude.call(this._handle, listOf(_arg))
  }

  fun setSunLongitude(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSunLongitude.call(this._handle, listOf(_arg))
  }

  fun setTextureSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setTextureSize.call(this._handle, listOf(_arg))
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
            "get_ground_bottom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_bottom_color" }
        }
      val getGroundCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_curve" }
        }
      val getGroundEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_energy" }
        }
      val getGroundHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_horizon_color" }
        }
      val getSkyCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_curve" }
        }
      val getSkyEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_energy" }
        }
      val getSkyHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_horizon_color" }
        }
      val getSkyTopColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_top_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_top_color" }
        }
      val getSunAngleMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_angle_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_angle_max" }
        }
      val getSunAngleMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_angle_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_angle_min" }
        }
      val getSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_color" }
        }
      val getSunCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_curve" }
        }
      val getSunEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_energy" }
        }
      val getSunLatitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_latitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_latitude" }
        }
      val getSunLongitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_longitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_longitude" }
        }
      val getTextureSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_texture_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_size" }
        }
      val setGroundBottomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_bottom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_bottom_color" }
        }
      val setGroundCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_curve" }
        }
      val setGroundEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_energy" }
        }
      val setGroundHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_horizon_color" }
        }
      val setSkyCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_curve" }
        }
      val setSkyEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_energy" }
        }
      val setSkyHorizonColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_horizon_color" }
        }
      val setSkyTopColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_top_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_top_color" }
        }
      val setSunAngleMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_angle_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_angle_max" }
        }
      val setSunAngleMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_angle_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_angle_min" }
        }
      val setSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_color" }
        }
      val setSunCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_curve" }
        }
      val setSunEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_energy" }
        }
      val setSunLatitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_latitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_latitude" }
        }
      val setSunLongitude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_longitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_longitude" }
        }
      val setTextureSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_texture_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_size" }
        }}
  }
}
