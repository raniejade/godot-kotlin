// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class AudioStreamPlayer3D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _bus_layout_changed() {
    TODO()
  }

  open fun _is_active(): Boolean {
    TODO()
  }

  open fun _set_playing(enable: Boolean) {
    TODO()
  }

  fun getAreaMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAreaMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAttenuationFilterCutoffHz(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttenuationFilterCutoffHz.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAttenuationFilterDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttenuationFilterDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAttenuationModel(): AttenuationModel {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttenuationModel.call(self._handle, emptyList(), _retPtr)
      AudioStreamPlayer3D.AttenuationModel.from(_ret.value)
    }
  }

  fun getBus(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBus.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getDopplerTracking(): DopplerTracking {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDopplerTracking.call(self._handle, emptyList(), _retPtr)
      AudioStreamPlayer3D.DopplerTracking.from(_ret.value)
    }
  }

  fun getEmissionAngle(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionAngle.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEmissionAngleFilterAttenuationDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionAngleFilterAttenuationDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaxDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaxDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOutOfRangeMode(): OutOfRangeMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutOfRangeMode.call(self._handle, emptyList(), _retPtr)
      AudioStreamPlayer3D.OutOfRangeMode.from(_ret.value)
    }
  }

  fun getPitchScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPitchScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPlaybackPosition(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPlaybackPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStream(): AudioStream {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioStream
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getStream.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AudioStream>(_tmp.value!!)
      _ret
    }
  }

  fun getStreamPaused(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStreamPaused.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioStreamPlayback
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getStreamPlayback.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AudioStreamPlayback>(_tmp.value!!)
      _ret
    }
  }

  fun getUnitDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnitDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getUnitSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnitSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isAutoplayEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAutoplayEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEmissionAngleEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEmissionAngleEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPlaying(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPlaying.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun play(fromPosition: Float = 0.0f) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.play.call(self._handle, listOf(fromPosition), null)
    }
  }

  fun seek(toPosition: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.seek.call(self._handle, listOf(toPosition), null)
    }
  }

  fun setAreaMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAreaMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setAttenuationFilterCutoffHz(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttenuationFilterCutoffHz.call(self._handle, listOf(degrees), null)
    }
  }

  fun setAttenuationFilterDb(db: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttenuationFilterDb.call(self._handle, listOf(db), null)
    }
  }

  fun setAttenuationModel(model: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttenuationModel.call(self._handle, listOf(model), null)
    }
  }

  fun setAutoplay(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoplay.call(self._handle, listOf(enable), null)
    }
  }

  fun setBus(bus: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBus.call(self._handle, listOf(bus), null)
    }
  }

  fun setDopplerTracking(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDopplerTracking.call(self._handle, listOf(mode), null)
    }
  }

  fun setEmissionAngle(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionAngle.call(self._handle, listOf(degrees), null)
    }
  }

  fun setEmissionAngleEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionAngleEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setEmissionAngleFilterAttenuationDb(db: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionAngleFilterAttenuationDb.call(self._handle, listOf(db), null)
    }
  }

  fun setMaxDb(maxDb: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxDb.call(self._handle, listOf(maxDb), null)
    }
  }

  fun setMaxDistance(metres: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxDistance.call(self._handle, listOf(metres), null)
    }
  }

  fun setOutOfRangeMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutOfRangeMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPitchScale(pitchScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPitchScale.call(self._handle, listOf(pitchScale), null)
    }
  }

  fun setStream(stream: AudioStream) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStream.call(self._handle, listOf(stream), null)
    }
  }

  fun setStreamPaused(pause: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStreamPaused.call(self._handle, listOf(pause), null)
    }
  }

  fun setUnitDb(unitDb: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUnitDb.call(self._handle, listOf(unitDb), null)
    }
  }

  fun setUnitSize(unitSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUnitSize.call(self._handle, listOf(unitSize), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamPlayer3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamPlayer3D
     */
    private object __method_bind {
      val getAreaMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
        }
      val getAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_filter_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_filter_cutoff_hz" }
        }
      val getAttenuationFilterDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_filter_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_filter_db" }
        }
      val getAttenuationModel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_attenuation_model".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation_model" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bus" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
        }
      val getEmissionAngle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_emission_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_angle" }
        }
      val getEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_emission_angle_filter_attenuation_db".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_emission_angle_filter_attenuation_db" }
        }
      val getMaxDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_max_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_db" }
        }
      val getMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
        }
      val getOutOfRangeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_out_of_range_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_out_of_range_mode" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
        }
      val getPlaybackPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_playback_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream" }
        }
      val getStreamPaused: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
        }
      val getStreamPlayback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_stream_playback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
        }
      val getUnitDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_unit_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_db" }
        }
      val getUnitSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "get_unit_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_size" }
        }
      val isAutoplayEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_autoplay_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
        }
      val isEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_emission_angle_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emission_angle_enabled" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val seek: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setAreaMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
        }
      val setAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_filter_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_filter_cutoff_hz" }
        }
      val setAttenuationFilterDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_filter_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_filter_db" }
        }
      val setAttenuationModel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_attenuation_model".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation_model" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bus" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
        }
      val setEmissionAngle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_angle" }
        }
      val setEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_angle_enabled" }
        }
      val setEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_emission_angle_filter_attenuation_db".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_emission_angle_filter_attenuation_db" }
        }
      val setMaxDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_max_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_db" }
        }
      val setMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
        }
      val setOutOfRangeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_out_of_range_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_out_of_range_mode" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream" }
        }
      val setStreamPaused: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
        }
      val setUnitDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_unit_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_db" }
        }
      val setUnitSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "set_unit_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_size" }
        }
      val stop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
