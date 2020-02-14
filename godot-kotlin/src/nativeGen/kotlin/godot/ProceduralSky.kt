// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class ProceduralSky(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Sky(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _thread_done(image: Image) {
    TODO()
  }

  open fun _update_sky() {
    TODO()
  }

  fun getGroundBottomColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getGroundBottomColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGroundCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGroundCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGroundEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGroundEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGroundHorizonColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getGroundHorizonColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkyCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSkyCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSkyEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSkyEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSkyHorizonColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkyHorizonColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkyTopColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkyTopColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSunAngleMax(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunAngleMax.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSunAngleMin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunAngleMin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSunColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSunColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSunCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSunEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSunLatitude(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunLatitude.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSunLongitude(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSunLongitude.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTextureSize(): TextureSize {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureSize.call(self._handle, emptyList(), _retPtr)
      ProceduralSky.TextureSize.from(_ret.value)
    }
  }

  fun setGroundBottomColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGroundBottomColor.call(self._handle, listOf(color), null)
    }
  }

  fun setGroundCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGroundCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setGroundEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGroundEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setGroundHorizonColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGroundHorizonColor.call(self._handle, listOf(color), null)
    }
  }

  fun setSkyCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setSkyEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setSkyHorizonColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyHorizonColor.call(self._handle, listOf(color), null)
    }
  }

  fun setSkyTopColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyTopColor.call(self._handle, listOf(color), null)
    }
  }

  fun setSunAngleMax(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunAngleMax.call(self._handle, listOf(degrees), null)
    }
  }

  fun setSunAngleMin(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunAngleMin.call(self._handle, listOf(degrees), null)
    }
  }

  fun setSunColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunColor.call(self._handle, listOf(color), null)
    }
  }

  fun setSunCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setSunEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setSunLatitude(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunLatitude.call(self._handle, listOf(degrees), null)
    }
  }

  fun setSunLongitude(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSunLongitude.call(self._handle, listOf(degrees), null)
    }
  }

  fun setTextureSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureSize.call(self._handle, listOf(size), null)
    }
  }

  enum class TextureSize(
    val value: Int
  ) {
    `256`(0),

    `512`(1),

    `1024`(2),

    `2048`(3),

    `4096`(4),

    MAX(5);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProceduralSky".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProceduralSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ProceduralSky
     */
    private object __method_bind {
      val getGroundBottomColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_bottom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_bottom_color" }
        }
      val getGroundCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_curve" }
        }
      val getGroundEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_energy" }
        }
      val getGroundHorizonColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_ground_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ground_horizon_color" }
        }
      val getSkyCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_curve" }
        }
      val getSkyEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_energy" }
        }
      val getSkyHorizonColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_horizon_color" }
        }
      val getSkyTopColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sky_top_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_top_color" }
        }
      val getSunAngleMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_angle_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_angle_max" }
        }
      val getSunAngleMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_angle_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_angle_min" }
        }
      val getSunColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_color" }
        }
      val getSunCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_curve" }
        }
      val getSunEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_energy" }
        }
      val getSunLatitude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_latitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_latitude" }
        }
      val getSunLongitude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_sun_longitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sun_longitude" }
        }
      val getTextureSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "get_texture_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_size" }
        }
      val setGroundBottomColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_bottom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_bottom_color" }
        }
      val setGroundCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_curve" }
        }
      val setGroundEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_energy" }
        }
      val setGroundHorizonColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_ground_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ground_horizon_color" }
        }
      val setSkyCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_curve" }
        }
      val setSkyEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_energy" }
        }
      val setSkyHorizonColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_horizon_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_horizon_color" }
        }
      val setSkyTopColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sky_top_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_top_color" }
        }
      val setSunAngleMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_angle_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_angle_max" }
        }
      val setSunAngleMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_angle_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_angle_min" }
        }
      val setSunColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_color" }
        }
      val setSunCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_curve" }
        }
      val setSunEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_energy" }
        }
      val setSunLatitude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_latitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_latitude" }
        }
      val setSunLongitude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_sun_longitude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sun_longitude" }
        }
      val setTextureSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
            "set_texture_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_size" }
        }}
  }
}
