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

open class AudioStreamPlayer2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var areaMask: Int
    get() {
       return getAreaMask() 
    }
    set(value) {
      setAreaMask(value)
    }

  var attenuation: Float
    get() {
       return getAttenuation() 
    }
    set(value) {
      setAttenuation(value)
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

  var maxDistance: Float
    get() {
       return getMaxDistance() 
    }
    set(value) {
      setMaxDistance(value)
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

  var volumeDb: Float
    get() {
       return getVolumeDb() 
    }
    set(value) {
      setVolumeDb(value)
    }

  /**
   * AudioStreamPlayer2D::finished signal
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

  fun getAttenuation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttenuation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getMaxDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getVolumeDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVolumeDb.call(self._handle, emptyList(), _retPtr)
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

  fun setAttenuation(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttenuation.call(self._handle, listOf(curve), null)
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

  fun setMaxDistance(pixels: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxDistance.call(self._handle, listOf(pixels), null)
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

  fun setVolumeDb(volumeDb: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVolumeDb.call(self._handle, listOf(volumeDb), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamPlayer2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamPlayer2D
     */
    private object __method_bind {
      val getAreaMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
            }
          }

      val getAttenuation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_attenuation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attenuation" }
            }
          }

      val getBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val getMaxDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
            }
          }

      val getPitchScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val getPlaybackPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_playback_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
            }
          }

      val getStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val getStreamPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
            }
          }

      val getStreamPlayback: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream_playback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
            }
          }

      val getVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val isAutoplayEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "is_autoplay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
            }
          }

      val isPlaying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val setAreaMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
            }
          }

      val setAttenuation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_attenuation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attenuation" }
            }
          }

      val setAutoplay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val setBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val setMaxDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
            }
          }

      val setPitchScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }

      val setStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val setStreamPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
            }
          }

      val setVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
