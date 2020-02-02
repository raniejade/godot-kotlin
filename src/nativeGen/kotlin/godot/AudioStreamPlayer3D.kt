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
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamPlayer3D(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var areaMask: Int
    get() {
       return getAreaMask() 
    }
    set(value) {
      setAreaMask(value)
    }

  var attenuationFilterCutoffHz: Float
    get() {
       return getAttenuationFilterCutoffHz() 
    }
    set(value) {
      setAttenuationFilterCutoffHz(value)
    }

  var attenuationFilterDb: Float
    get() {
       return getAttenuationFilterDb() 
    }
    set(value) {
      setAttenuationFilterDb(value)
    }

  var attenuationModel: AttenuationModel
    get() {
       return getAttenuationModel() 
    }
    set(value) {
      setAttenuationModel(value.value)
    }

  var autoplay: Boolean
    get() {
       return isAutoplayEnabled() 
    }
    set(value) {
      setAutoplay(value)
    }

  var bus: String
    get() {
       return getBus() 
    }
    set(value) {
      setBus(value)
    }

  var dopplerTracking: DopplerTracking
    get() {
       return getDopplerTracking() 
    }
    set(value) {
      setDopplerTracking(value.value)
    }

  var emissionAngleDegrees: Float
    get() {
       return getEmissionAngle() 
    }
    set(value) {
      setEmissionAngle(value)
    }

  var emissionAngleEnabled: Boolean
    get() {
       return isEmissionAngleEnabled() 
    }
    set(value) {
      setEmissionAngleEnabled(value)
    }

  var emissionAngleFilterAttenuationDb: Float
    get() {
       return getEmissionAngleFilterAttenuationDb() 
    }
    set(value) {
      setEmissionAngleFilterAttenuationDb(value)
    }

  var maxDb: Float
    get() {
       return getMaxDb() 
    }
    set(value) {
      setMaxDb(value)
    }

  var maxDistance: Float
    get() {
       return getMaxDistance() 
    }
    set(value) {
      setMaxDistance(value)
    }

  var outOfRangeMode: OutOfRangeMode
    get() {
       return getOutOfRangeMode() 
    }
    set(value) {
      setOutOfRangeMode(value.value)
    }

  var pitchScale: Float
    get() {
       return getPitchScale() 
    }
    set(value) {
      setPitchScale(value)
    }

  var stream: AudioStream
    get() {
       return getStream() 
    }
    set(value) {
      setStream(value)
    }

  var streamPaused: Boolean
    get() {
       return getStreamPaused() 
    }
    set(value) {
      setStreamPaused(value)
    }

  var unitDb: Float
    get() {
       return getUnitDb() 
    }
    set(value) {
      setUnitDb(value)
    }

  var unitSize: Float
    get() {
       return getUnitSize() 
    }
    set(value) {
      setUnitSize(value)
    }

  /**
   * AudioStreamPlayer3D::finished signal
   */
  val signalFinished: Signal0 = Signal0("finished")

  fun getAreaMask(): Int {
    val _ret = __method_bind.getAreaMask.call(this._handle)
    return _ret.asInt()
  }

  fun getAttenuationFilterCutoffHz(): Float {
    val _ret = __method_bind.getAttenuationFilterCutoffHz.call(this._handle)
    return _ret.asFloat()
  }

  fun getAttenuationFilterDb(): Float {
    val _ret = __method_bind.getAttenuationFilterDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getAttenuationModel(): AttenuationModel {
    val _ret = __method_bind.getAttenuationModel.call(this._handle)
    return AudioStreamPlayer3D.AttenuationModel.from(_ret.asInt())
  }

  fun getBus(): String {
    val _ret = __method_bind.getBus.call(this._handle)
    return _ret.asString()
  }

  fun getDopplerTracking(): DopplerTracking {
    val _ret = __method_bind.getDopplerTracking.call(this._handle)
    return AudioStreamPlayer3D.DopplerTracking.from(_ret.asInt())
  }

  fun getEmissionAngle(): Float {
    val _ret = __method_bind.getEmissionAngle.call(this._handle)
    return _ret.asFloat()
  }

  fun getEmissionAngleFilterAttenuationDb(): Float {
    val _ret = __method_bind.getEmissionAngleFilterAttenuationDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaxDb(): Float {
    val _ret = __method_bind.getMaxDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaxDistance(): Float {
    val _ret = __method_bind.getMaxDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getOutOfRangeMode(): OutOfRangeMode {
    val _ret = __method_bind.getOutOfRangeMode.call(this._handle)
    return AudioStreamPlayer3D.OutOfRangeMode.from(_ret.asInt())
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.getPitchScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getPlaybackPosition(): Float {
    val _ret = __method_bind.getPlaybackPosition.call(this._handle)
    return _ret.asFloat()
  }

  fun getStream(): AudioStream {
    val _ret = __method_bind.getStream.call(this._handle)
    return _ret.asObject(::AudioStream)!!
  }

  fun getStreamPaused(): Boolean {
    val _ret = __method_bind.getStreamPaused.call(this._handle)
    return _ret.asBoolean()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val _ret = __method_bind.getStreamPlayback.call(this._handle)
    return _ret.asObject(::AudioStreamPlayback)!!
  }

  fun getUnitDb(): Float {
    val _ret = __method_bind.getUnitDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getUnitSize(): Float {
    val _ret = __method_bind.getUnitSize.call(this._handle)
    return _ret.asFloat()
  }

  fun isAutoplayEnabled(): Boolean {
    val _ret = __method_bind.isAutoplayEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEmissionAngleEnabled(): Boolean {
    val _ret = __method_bind.isEmissionAngleEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play(fromPosition: Float = 0.0f) {
    val _arg = Variant.new(fromPosition)
    __method_bind.play.call(this._handle, listOf(_arg))
  }

  fun seek(toPosition: Float) {
    val _arg = Variant.new(toPosition)
    __method_bind.seek.call(this._handle, listOf(_arg))
  }

  fun setAreaMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setAreaMask.call(this._handle, listOf(_arg))
  }

  fun setAttenuationFilterCutoffHz(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setAttenuationFilterCutoffHz.call(this._handle, listOf(_arg))
  }

  fun setAttenuationFilterDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.setAttenuationFilterDb.call(this._handle, listOf(_arg))
  }

  fun setAttenuationModel(model: Int) {
    val _arg = Variant.new(model)
    __method_bind.setAttenuationModel.call(this._handle, listOf(_arg))
  }

  fun setAutoplay(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoplay.call(this._handle, listOf(_arg))
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.setBus.call(this._handle, listOf(_arg))
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDopplerTracking.call(this._handle, listOf(_arg))
  }

  fun setEmissionAngle(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setEmissionAngle.call(this._handle, listOf(_arg))
  }

  fun setEmissionAngleEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEmissionAngleEnabled.call(this._handle, listOf(_arg))
  }

  fun setEmissionAngleFilterAttenuationDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.setEmissionAngleFilterAttenuationDb.call(this._handle, listOf(_arg))
  }

  fun setMaxDb(maxDb: Float) {
    val _arg = Variant.new(maxDb)
    __method_bind.setMaxDb.call(this._handle, listOf(_arg))
  }

  fun setMaxDistance(metres: Float) {
    val _arg = Variant.new(metres)
    __method_bind.setMaxDistance.call(this._handle, listOf(_arg))
  }

  fun setOutOfRangeMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setOutOfRangeMode.call(this._handle, listOf(_arg))
  }

  fun setPitchScale(pitchScale: Float) {
    val _arg = Variant.new(pitchScale)
    __method_bind.setPitchScale.call(this._handle, listOf(_arg))
  }

  fun setStream(stream: AudioStream) {
    val _arg = Variant.new(stream)
    __method_bind.setStream.call(this._handle, listOf(_arg))
  }

  fun setStreamPaused(pause: Boolean) {
    val _arg = Variant.new(pause)
    __method_bind.setStreamPaused.call(this._handle, listOf(_arg))
  }

  fun setUnitDb(unitDb: Float) {
    val _arg = Variant.new(unitDb)
    __method_bind.setUnitDb.call(this._handle, listOf(_arg))
  }

  fun setUnitSize(unitSize: Float) {
    val _arg = Variant.new(unitSize)
    __method_bind.setUnitSize.call(this._handle, listOf(_arg))
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  enum class AttenuationModel(
    val value: Int
  ) {
    INVERSE_DISTANCE(0),

    INVERSE_SQUARE_DISTANCE(1),

    LOGARITHMIC(2),

    DISABLED(3);

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
    MIX(0),

    PAUSE(1);

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
    DISABLED(0),

    IDLE_STEP(1),

    PHYSICS_STEP(2);

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
      val getAreaMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
        }
      val getAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_filter_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_filter_cutoff_hz" }
        }
      val getAttenuationFilterDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_filter_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_filter_db" }
        }
      val getAttenuationModel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_model".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_model" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bus" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
        }
      val getEmissionAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_emission_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_angle" }
        }
      val getEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_emission_angle_filter_attenuation_db".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_emission_angle_filter_attenuation_db" }
        }
      val getMaxDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_max_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_db" }
        }
      val getMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
        }
      val getOutOfRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_out_of_range_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_out_of_range_mode" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
        }
      val getPlaybackPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_playback_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream" }
        }
      val getStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
        }
      val getStreamPlayback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream_playback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
        }
      val getUnitDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_unit_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_db" }
        }
      val getUnitSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_unit_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_size" }
        }
      val isAutoplayEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_autoplay_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
        }
      val isEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_emission_angle_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emission_angle_enabled" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setAreaMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
        }
      val setAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_filter_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_filter_cutoff_hz" }
        }
      val setAttenuationFilterDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_filter_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_filter_db" }
        }
      val setAttenuationModel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_model".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_model" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bus" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
        }
      val setEmissionAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_angle" }
        }
      val setEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_angle_enabled" }
        }
      val setEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle_filter_attenuation_db".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_emission_angle_filter_attenuation_db" }
        }
      val setMaxDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_max_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_db" }
        }
      val setMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
        }
      val setOutOfRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_out_of_range_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_out_of_range_mode" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream" }
        }
      val setStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
        }
      val setUnitDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_unit_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_db" }
        }
      val setUnitSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_unit_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_size" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
