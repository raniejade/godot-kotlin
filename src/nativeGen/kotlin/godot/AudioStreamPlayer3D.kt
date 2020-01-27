// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun getAreaMask(): Int {
    val _ret = __method_bind.get_area_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getAttenuationFilterCutoffHz(): Float {
    val _ret = __method_bind.get_attenuation_filter_cutoff_hz.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAttenuationFilterDb(): Float {
    val _ret = __method_bind.get_attenuation_filter_db.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAttenuationModel(): AttenuationModel {
    val _ret = __method_bind.get_attenuation_model.call(this.toVariant())
    return AudioStreamPlayer3D.AttenuationModel.from(_ret.asInt())
  }

  fun getBus(): String {
    val _ret = __method_bind.get_bus.call(this.toVariant())
    return _ret.asString()
  }

  fun getDopplerTracking(): DopplerTracking {
    val _ret = __method_bind.get_doppler_tracking.call(this.toVariant())
    return AudioStreamPlayer3D.DopplerTracking.from(_ret.asInt())
  }

  fun getEmissionAngle(): Float {
    val _ret = __method_bind.get_emission_angle.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getEmissionAngleFilterAttenuationDb(): Float {
    val _ret = __method_bind.get_emission_angle_filter_attenuation_db.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaxDb(): Float {
    val _ret = __method_bind.get_max_db.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaxDistance(): Float {
    val _ret = __method_bind.get_max_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getOutOfRangeMode(): OutOfRangeMode {
    val _ret = __method_bind.get_out_of_range_mode.call(this.toVariant())
    return AudioStreamPlayer3D.OutOfRangeMode.from(_ret.asInt())
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.get_pitch_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPlaybackPosition(): Float {
    val _ret = __method_bind.get_playback_position.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getStream(): AudioStream {
    val _ret = __method_bind.get_stream.call(this.toVariant())
    return _ret.asObject(::AudioStream)!!
  }

  fun getStreamPaused(): Boolean {
    val _ret = __method_bind.get_stream_paused.call(this.toVariant())
    return _ret.asBool()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val _ret = __method_bind.get_stream_playback.call(this.toVariant())
    return _ret.asObject(::AudioStreamPlayback)!!
  }

  fun getUnitDb(): Float {
    val _ret = __method_bind.get_unit_db.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getUnitSize(): Float {
    val _ret = __method_bind.get_unit_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isAutoplayEnabled(): Boolean {
    val _ret = __method_bind.is_autoplay_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isEmissionAngleEnabled(): Boolean {
    val _ret = __method_bind.is_emission_angle_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.is_playing.call(this.toVariant())
    return _ret.asBool()
  }

  fun play(fromPosition: Float) {
    val _arg = Variant.new(fromPosition)
    __method_bind.play.call(this.toVariant(), _arg, 1)
  }

  fun seek(toPosition: Float) {
    val _arg = Variant.new(toPosition)
    __method_bind.seek.call(this.toVariant(), _arg, 1)
  }

  fun setAreaMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_area_mask.call(this.toVariant(), _arg, 1)
  }

  fun setAttenuationFilterCutoffHz(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_attenuation_filter_cutoff_hz.call(this.toVariant(), _arg, 1)
  }

  fun setAttenuationFilterDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.set_attenuation_filter_db.call(this.toVariant(), _arg, 1)
  }

  fun setAttenuationModel(model: Int) {
    val _arg = Variant.new(model)
    __method_bind.set_attenuation_model.call(this.toVariant(), _arg, 1)
  }

  fun setAutoplay(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_autoplay.call(this.toVariant(), _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.set_bus.call(this.toVariant(), _arg, 1)
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_doppler_tracking.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionAngle(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_emission_angle.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionAngleEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_emission_angle_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setEmissionAngleFilterAttenuationDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.set_emission_angle_filter_attenuation_db.call(this.toVariant(), _arg, 1)
  }

  fun setMaxDb(maxDb: Float) {
    val _arg = Variant.new(maxDb)
    __method_bind.set_max_db.call(this.toVariant(), _arg, 1)
  }

  fun setMaxDistance(metres: Float) {
    val _arg = Variant.new(metres)
    __method_bind.set_max_distance.call(this.toVariant(), _arg, 1)
  }

  fun setOutOfRangeMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_out_of_range_mode.call(this.toVariant(), _arg, 1)
  }

  fun setPitchScale(pitchScale: Float) {
    val _arg = Variant.new(pitchScale)
    __method_bind.set_pitch_scale.call(this.toVariant(), _arg, 1)
  }

  fun setStream(stream: AudioStream) {
    val _arg = Variant.new(stream)
    __method_bind.set_stream.call(this.toVariant(), _arg, 1)
  }

  fun setStreamPaused(pause: Boolean) {
    val _arg = Variant.new(pause)
    __method_bind.set_stream_paused.call(this.toVariant(), _arg, 1)
  }

  fun setUnitDb(unitDb: Float) {
    val _arg = Variant.new(unitDb)
    __method_bind.set_unit_db.call(this.toVariant(), _arg, 1)
  }

  fun setUnitSize(unitSize: Float) {
    val _arg = Variant.new(unitSize)
    __method_bind.set_unit_size.call(this.toVariant(), _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this.toVariant())
  }

  enum class AttenuationModel(
    val value: Int
  ) {
    ATTENUATION_INVERSE_DISTANCE(0),

    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),

    ATTENUATION_LOGARITHMIC(2),

    ATTENUATION_DISABLED(3);

    companion object {
      fun from(value: Int): AttenuationModel {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class OutOfRangeMode(
    val value: Int
  ) {
    OUT_OF_RANGE_MIX(0),

    OUT_OF_RANGE_PAUSE(1);

    companion object {
      fun from(value: Int): OutOfRangeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);

    companion object {
      fun from(value: Int): DopplerTracking {
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
      requireNotNull(fnPtr) { "No instance found for AudioStreamPlayer3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer3D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamPlayer3D = AudioStreamPlayer3D(ptr)
    /**
     * Container for method_bind pointers for AudioStreamPlayer3D
     */
    private object __method_bind {
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
