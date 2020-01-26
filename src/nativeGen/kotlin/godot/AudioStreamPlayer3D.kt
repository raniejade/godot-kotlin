// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamPlayer3D internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun busLayoutChanged() {
    TODO()
  }

  fun isActive(): Boolean {
    TODO()
  }

  fun setPlaying() {
    TODO()
  }

  fun getAreaMask(): Int {
    TODO()
  }

  fun getAttenuationFilterCutoffHz(): Float {
    TODO()
  }

  fun getAttenuationFilterDb(): Float {
    TODO()
  }

  fun getAttenuationModel(): AudioStreamPlayer3D.AttenuationModel {
    TODO()
  }

  fun getBus(): String {
    TODO()
  }

  fun getDopplerTracking(): AudioStreamPlayer3D.DopplerTracking {
    TODO()
  }

  fun getEmissionAngle(): Float {
    TODO()
  }

  fun getEmissionAngleFilterAttenuationDb(): Float {
    TODO()
  }

  fun getMaxDb(): Float {
    TODO()
  }

  fun getMaxDistance(): Float {
    TODO()
  }

  fun getOutOfRangeMode(): AudioStreamPlayer3D.OutOfRangeMode {
    TODO()
  }

  fun getPitchScale(): Float {
    TODO()
  }

  fun getPlaybackPosition(): Float {
    TODO()
  }

  fun getStream(): AudioStream {
    TODO()
  }

  fun getStreamPaused(): Boolean {
    TODO()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    TODO()
  }

  fun getUnitDb(): Float {
    TODO()
  }

  fun getUnitSize(): Float {
    TODO()
  }

  fun isAutoplayEnabled(): Boolean {
    TODO()
  }

  fun isEmissionAngleEnabled(): Boolean {
    TODO()
  }

  fun isPlaying(): Boolean {
    TODO()
  }

  fun play() {
    TODO()
  }

  fun seek() {
    TODO()
  }

  fun setAreaMask() {
    TODO()
  }

  fun setAttenuationFilterCutoffHz() {
    TODO()
  }

  fun setAttenuationFilterDb() {
    TODO()
  }

  fun setAttenuationModel() {
    TODO()
  }

  fun setAutoplay() {
    TODO()
  }

  fun setBus() {
    TODO()
  }

  fun setDopplerTracking() {
    TODO()
  }

  fun setEmissionAngle() {
    TODO()
  }

  fun setEmissionAngleEnabled() {
    TODO()
  }

  fun setEmissionAngleFilterAttenuationDb() {
    TODO()
  }

  fun setMaxDb() {
    TODO()
  }

  fun setMaxDistance() {
    TODO()
  }

  fun setOutOfRangeMode() {
    TODO()
  }

  fun setPitchScale() {
    TODO()
  }

  fun setStream() {
    TODO()
  }

  fun setStreamPaused() {
    TODO()
  }

  fun setUnitDb() {
    TODO()
  }

  fun setUnitSize() {
    TODO()
  }

  fun stop() {
    TODO()
  }

  enum class AttenuationModel(
    val value: Int
  ) {
    ATTENUATION_INVERSE_DISTANCE(0),

    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),

    ATTENUATION_LOGARITHMIC(2),

    ATTENUATION_DISABLED(3);
  }

  enum class OutOfRangeMode(
    val value: Int
  ) {
    OUT_OF_RANGE_MIX(0),

    OUT_OF_RANGE_PAUSE(1);
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);
  }

  companion object {
    val ATTENUATION_DISABLED: Int = 3

    val ATTENUATION_INVERSE_DISTANCE: Int = 0

    val ATTENUATION_INVERSE_SQUARE_DISTANCE: Int = 1

    val ATTENUATION_LOGARITHMIC: Int = 2

    val DOPPLER_TRACKING_DISABLED: Int = 0

    val DOPPLER_TRACKING_IDLE_STEP: Int = 1

    val DOPPLER_TRACKING_PHYSICS_STEP: Int = 2

    val OUT_OF_RANGE_MIX: Int = 0

    val OUT_OF_RANGE_PAUSE: Int = 1

    fun new(): AudioStreamPlayer3D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamPlayer3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer3D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioStreamPlayer3D
     */
    private object __method_bind {
      val _bus_layout_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "_bus_layout_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _bus_layout_changed" }
            }
          }

      val _is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _is_active" }
            }
          }

      val _set_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "_set_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_playing" }
            }
          }

      val get_area_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
            }
          }

      val get_attenuation_filter_cutoff_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_attenuation_filter_cutoff_hz".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_attenuation_filter_cutoff_hz" }
            }
          }

      val get_attenuation_filter_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_attenuation_filter_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attenuation_filter_db" }
            }
          }

      val get_attenuation_model: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_attenuation_model".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attenuation_model" }
            }
          }

      val get_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val get_doppler_tracking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_doppler_tracking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
            }
          }

      val get_emission_angle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_emission_angle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_angle" }
            }
          }

      val get_emission_angle_filter_attenuation_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_emission_angle_filter_attenuation_db".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_emission_angle_filter_attenuation_db" }
            }
          }

      val get_max_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_max_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_db" }
            }
          }

      val get_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
            }
          }

      val get_out_of_range_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_out_of_range_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_out_of_range_mode" }
            }
          }

      val get_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val get_playback_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_playback_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
            }
          }

      val get_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val get_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
            }
          }

      val get_stream_playback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_stream_playback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
            }
          }

      val get_unit_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_unit_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_unit_db" }
            }
          }

      val get_unit_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "get_unit_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_unit_size" }
            }
          }

      val is_autoplay_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "is_autoplay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
            }
          }

      val is_emission_angle_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "is_emission_angle_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emission_angle_enabled" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_area_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
            }
          }

      val set_attenuation_filter_cutoff_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_attenuation_filter_cutoff_hz".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_attenuation_filter_cutoff_hz" }
            }
          }

      val set_attenuation_filter_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_attenuation_filter_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attenuation_filter_db" }
            }
          }

      val set_attenuation_model: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_attenuation_model".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attenuation_model" }
            }
          }

      val set_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val set_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val set_doppler_tracking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_doppler_tracking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
            }
          }

      val set_emission_angle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_emission_angle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_angle" }
            }
          }

      val set_emission_angle_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_emission_angle_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_angle_enabled" }
            }
          }

      val set_emission_angle_filter_attenuation_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_emission_angle_filter_attenuation_db".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_emission_angle_filter_attenuation_db" }
            }
          }

      val set_max_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_max_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_db" }
            }
          }

      val set_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
            }
          }

      val set_out_of_range_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_out_of_range_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_out_of_range_mode" }
            }
          }

      val set_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }

      val set_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val set_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
            }
          }

      val set_unit_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_unit_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_unit_db" }
            }
          }

      val set_unit_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "set_unit_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_unit_size" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
