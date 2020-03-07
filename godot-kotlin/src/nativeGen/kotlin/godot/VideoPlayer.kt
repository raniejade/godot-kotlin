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

open class VideoPlayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var audioTrack: Int
    get() {
       return getAudioTrack() 
    }
    set(value) {
      setAudioTrack(value)
    }

  var autoplay: Boolean
    get() {
       return hasAutoplay() 
    }
    set(value) {
      setAutoplay(value)
    }

  var bufferingMsec: Int
    get() {
       return getBufferingMsec() 
    }
    set(value) {
      setBufferingMsec(value)
    }

  var bus: String
    get() {
       return getBus() 
    }
    set(value) {
      setBus(value)
    }

  var expand: Boolean
    get() {
       return hasExpand() 
    }
    set(value) {
      setExpand(value)
    }

  var paused: Boolean
    get() {
       return isPaused() 
    }
    set(value) {
      setPaused(value)
    }

  var stream: VideoStream
    get() {
       return getStream() 
    }
    set(value) {
      setStream(value)
    }

  var streamPosition: Float
    get() {
       return getStreamPosition() 
    }
    set(value) {
      setStreamPosition(value)
    }

  var volume: Float
    get() {
       return getVolume() 
    }
    set(value) {
      setVolume(value)
    }

  var volumeDb: Float
    get() {
       return getVolumeDb() 
    }
    set(value) {
      setVolumeDb(value)
    }

  /**
   * VideoPlayer::finished signal
   */
  val signalFinished: Signal0 = Signal0("finished")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAudioTrack(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAudioTrack.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBufferingMsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBufferingMsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getStream(): VideoStream {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VideoStream
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getStream.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VideoStream>(_tmp.value!!)
      _ret
    }
  }

  fun getStreamName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getStreamName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getStreamPosition(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStreamPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVideoTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVideoTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getVolume(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVolume.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun hasAutoplay(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutoplay.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasExpand(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasExpand.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPaused(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPaused.call(self._handle, emptyList(), _retPtr)
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

  fun play() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.play.call(self._handle, emptyList(), null)
    }
  }

  fun setAudioTrack(track: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAudioTrack.call(self._handle, listOf(track), null)
    }
  }

  fun setAutoplay(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoplay.call(self._handle, listOf(enabled), null)
    }
  }

  fun setBufferingMsec(msec: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBufferingMsec.call(self._handle, listOf(msec), null)
    }
  }

  fun setBus(bus: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBus.call(self._handle, listOf(bus), null)
    }
  }

  fun setExpand(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpand.call(self._handle, listOf(enable), null)
    }
  }

  fun setPaused(paused: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPaused.call(self._handle, listOf(paused), null)
    }
  }

  fun setStream(stream: VideoStream) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStream.call(self._handle, listOf(stream), null)
    }
  }

  fun setStreamPosition(position: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStreamPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setVolume(volume: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVolume.call(self._handle, listOf(volume), null)
    }
  }

  fun setVolumeDb(db: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVolumeDb.call(self._handle, listOf(db), null)
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VideoPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VideoPlayer
     */
    private object __method_bind {
      val getAudioTrack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_audio_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_audio_track" }
            }
          }

      val getBufferingMsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_buffering_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffering_msec" }
            }
          }

      val getBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val getStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val getStreamName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_name" }
            }
          }

      val getStreamPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_position" }
            }
          }

      val getVideoTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_video_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_video_texture" }
            }
          }

      val getVolume: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_volume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume" }
            }
          }

      val getVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val hasAutoplay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "has_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autoplay" }
            }
          }

      val hasExpand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "has_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_expand" }
            }
          }

      val isPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val isPlaying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val setAudioTrack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_audio_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_track" }
            }
          }

      val setAutoplay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val setBufferingMsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_buffering_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffering_msec" }
            }
          }

      val setBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val setExpand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand" }
            }
          }

      val setPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_paused" }
            }
          }

      val setStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val setStreamPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_stream_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_position" }
            }
          }

      val setVolume: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_volume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume" }
            }
          }

      val setVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
