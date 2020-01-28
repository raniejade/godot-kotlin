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

  var attenuationModel: Int
    get() {
       return AudioStreamPlayer3D.AttenuationModel.from(getAttenuationModel()) 
    }
    set(value) {
      setAttenuationModel(AudioStreamPlayer3D.AttenuationModel.from(value))
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

  var dopplerTracking: Int
    get() {
       return AudioStreamPlayer3D.DopplerTracking.from(getDopplerTracking()) 
    }
    set(value) {
      setDopplerTracking(AudioStreamPlayer3D.DopplerTracking.from(value))
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

  var outOfRangeMode: Int
    get() {
       return AudioStreamPlayer3D.OutOfRangeMode.from(getOutOfRangeMode()) 
    }
    set(value) {
      setOutOfRangeMode(AudioStreamPlayer3D.OutOfRangeMode.from(value))
    }

  var pitchScale: Float
    get() {
       return getPitchScale() 
    }
    set(value) {
      setPitchScale(value)
    }

  var playing: Boolean
    get() {
       return isPlaying() 
    }
    set(value) {
      _setPlaying(value)
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

  fun play(fromPosition: Float) {
    val _arg = Variant.new(fromPosition)
    __method_bind.play.call(this._handle, _arg, 1)
  }

  fun seek(toPosition: Float) {
    val _arg = Variant.new(toPosition)
    __method_bind.seek.call(this._handle, _arg, 1)
  }

  fun setAreaMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setAreaMask.call(this._handle, _arg, 1)
  }

  fun setAttenuationFilterCutoffHz(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setAttenuationFilterCutoffHz.call(this._handle, _arg, 1)
  }

  fun setAttenuationFilterDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.setAttenuationFilterDb.call(this._handle, _arg, 1)
  }

  fun setAttenuationModel(model: Int) {
    val _arg = Variant.new(model)
    __method_bind.setAttenuationModel.call(this._handle, _arg, 1)
  }

  fun setAutoplay(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoplay.call(this._handle, _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.setBus.call(this._handle, _arg, 1)
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDopplerTracking.call(this._handle, _arg, 1)
  }

  fun setEmissionAngle(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setEmissionAngle.call(this._handle, _arg, 1)
  }

  fun setEmissionAngleEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEmissionAngleEnabled.call(this._handle, _arg, 1)
  }

  fun setEmissionAngleFilterAttenuationDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.setEmissionAngleFilterAttenuationDb.call(this._handle, _arg, 1)
  }

  fun setMaxDb(maxDb: Float) {
    val _arg = Variant.new(maxDb)
    __method_bind.setMaxDb.call(this._handle, _arg, 1)
  }

  fun setMaxDistance(metres: Float) {
    val _arg = Variant.new(metres)
    __method_bind.setMaxDistance.call(this._handle, _arg, 1)
  }

  fun setOutOfRangeMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setOutOfRangeMode.call(this._handle, _arg, 1)
  }

  fun setPitchScale(pitchScale: Float) {
    val _arg = Variant.new(pitchScale)
    __method_bind.setPitchScale.call(this._handle, _arg, 1)
  }

  fun setStream(stream: AudioStream) {
    val _arg = Variant.new(stream)
    __method_bind.setStream.call(this._handle, _arg, 1)
  }

  fun setStreamPaused(pause: Boolean) {
    val _arg = Variant.new(pause)
    __method_bind.setStreamPaused.call(this._handle, _arg, 1)
  }

  fun setUnitDb(unitDb: Float) {
    val _arg = Variant.new(unitDb)
    __method_bind.setUnitDb.call(this._handle, _arg, 1)
  }

  fun setUnitSize(unitSize: Float) {
    val _arg = Variant.new(unitSize)
    __method_bind.setUnitSize.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
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
      val getAreaMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getAreaMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAreaMask" }
        }
      val getAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getAttenuationFilterCutoffHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAttenuationFilterCutoffHz" }
        }
      val getAttenuationFilterDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getAttenuationFilterDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAttenuationFilterDb" }
        }
      val getAttenuationModel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getAttenuationModel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAttenuationModel" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBus" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getDopplerTracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDopplerTracking" }
        }
      val getEmissionAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getEmissionAngle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionAngle" }
        }
      val getEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getEmissionAngleFilterAttenuationDb".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method getEmissionAngleFilterAttenuationDb" }
        }
      val getMaxDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getMaxDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxDb" }
        }
      val getMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxDistance" }
        }
      val getOutOfRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getOutOfRangeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutOfRangeMode" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getPitchScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPitchScale" }
        }
      val getPlaybackPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getPlaybackPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlaybackPosition" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStream" }
        }
      val getStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getStreamPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamPaused" }
        }
      val getStreamPlayback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getStreamPlayback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamPlayback" }
        }
      val getUnitDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getUnitDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnitDb" }
        }
      val getUnitSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "getUnitSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnitSize" }
        }
      val isAutoplayEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "isAutoplayEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAutoplayEnabled" }
        }
      val isEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "isEmissionAngleEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEmissionAngleEnabled" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "isPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPlaying" }
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
            "setAreaMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAreaMask" }
        }
      val setAttenuationFilterCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setAttenuationFilterCutoffHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAttenuationFilterCutoffHz" }
        }
      val setAttenuationFilterDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setAttenuationFilterDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAttenuationFilterDb" }
        }
      val setAttenuationModel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setAttenuationModel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAttenuationModel" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoplay" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBus" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setDopplerTracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDopplerTracking" }
        }
      val setEmissionAngle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setEmissionAngle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionAngle" }
        }
      val setEmissionAngleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setEmissionAngleEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionAngleEnabled" }
        }
      val setEmissionAngleFilterAttenuationDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setEmissionAngleFilterAttenuationDb".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method setEmissionAngleFilterAttenuationDb" }
        }
      val setMaxDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setMaxDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxDb" }
        }
      val setMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxDistance" }
        }
      val setOutOfRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setOutOfRangeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOutOfRangeMode" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setPitchScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPitchScale" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStream" }
        }
      val setStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setStreamPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStreamPaused" }
        }
      val setUnitDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setUnitDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUnitDb" }
        }
      val setUnitSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer3D".cstr.ptr,
            "setUnitSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUnitSize" }
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
