// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProceduralSky internal constructor(
  _handle: COpaquePointer
) : Sky(_handle) {
  fun getGroundBottomColor(): Color {
    TODO()
  }

  fun getGroundCurve(): Float {
    TODO()
  }

  fun getGroundEnergy(): Float {
    TODO()
  }

  fun getGroundHorizonColor(): Color {
    TODO()
  }

  fun getSkyCurve(): Float {
    TODO()
  }

  fun getSkyEnergy(): Float {
    TODO()
  }

  fun getSkyHorizonColor(): Color {
    TODO()
  }

  fun getSkyTopColor(): Color {
    TODO()
  }

  fun getSunAngleMax(): Float {
    TODO()
  }

  fun getSunAngleMin(): Float {
    TODO()
  }

  fun getSunColor(): Color {
    TODO()
  }

  fun getSunCurve(): Float {
    TODO()
  }

  fun getSunEnergy(): Float {
    TODO()
  }

  fun getSunLatitude(): Float {
    TODO()
  }

  fun getSunLongitude(): Float {
    TODO()
  }

  fun getTextureSize(): TextureSize {
    TODO()
  }

  fun setGroundBottomColor() {
    TODO()
  }

  fun setGroundCurve() {
    TODO()
  }

  fun setGroundEnergy() {
    TODO()
  }

  fun setGroundHorizonColor() {
    TODO()
  }

  fun setSkyCurve() {
    TODO()
  }

  fun setSkyEnergy() {
    TODO()
  }

  fun setSkyHorizonColor() {
    TODO()
  }

  fun setSkyTopColor() {
    TODO()
  }

  fun setSunAngleMax() {
    TODO()
  }

  fun setSunAngleMin() {
    TODO()
  }

  fun setSunColor() {
    TODO()
  }

  fun setSunCurve() {
    TODO()
  }

  fun setSunEnergy() {
    TODO()
  }

  fun setSunLatitude() {
    TODO()
  }

  fun setSunLongitude() {
    TODO()
  }

  fun setTextureSize() {
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton ProceduralSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProceduralSky(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ProceduralSky
     */
    private object __method_bind {
      val get_ground_bottom_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_ground_bottom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ground_bottom_color" }
            }
          }

      val get_ground_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_ground_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ground_curve" }
            }
          }

      val get_ground_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_ground_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ground_energy" }
            }
          }

      val get_ground_horizon_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_ground_horizon_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ground_horizon_color" }
            }
          }

      val get_sky_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sky_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_curve" }
            }
          }

      val get_sky_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sky_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_energy" }
            }
          }

      val get_sky_horizon_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sky_horizon_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_horizon_color" }
            }
          }

      val get_sky_top_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sky_top_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_top_color" }
            }
          }

      val get_sun_angle_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_angle_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_angle_max" }
            }
          }

      val get_sun_angle_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_angle_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_angle_min" }
            }
          }

      val get_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_color" }
            }
          }

      val get_sun_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_curve" }
            }
          }

      val get_sun_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_energy" }
            }
          }

      val get_sun_latitude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_latitude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_latitude" }
            }
          }

      val get_sun_longitude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_sun_longitude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sun_longitude" }
            }
          }

      val get_texture_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "get_texture_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_size" }
            }
          }

      val set_ground_bottom_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_ground_bottom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ground_bottom_color" }
            }
          }

      val set_ground_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_ground_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ground_curve" }
            }
          }

      val set_ground_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_ground_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ground_energy" }
            }
          }

      val set_ground_horizon_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_ground_horizon_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ground_horizon_color" }
            }
          }

      val set_sky_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sky_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_curve" }
            }
          }

      val set_sky_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sky_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_energy" }
            }
          }

      val set_sky_horizon_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sky_horizon_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_horizon_color" }
            }
          }

      val set_sky_top_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sky_top_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_top_color" }
            }
          }

      val set_sun_angle_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_angle_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_angle_max" }
            }
          }

      val set_sun_angle_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_angle_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_angle_min" }
            }
          }

      val set_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_color" }
            }
          }

      val set_sun_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_curve" }
            }
          }

      val set_sun_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_energy" }
            }
          }

      val set_sun_latitude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_latitude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_latitude" }
            }
          }

      val set_sun_longitude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_sun_longitude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sun_longitude" }
            }
          }

      val set_texture_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProceduralSky".cstr.ptr,
              "set_texture_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_size" }
            }
          }
    }
  }
}
