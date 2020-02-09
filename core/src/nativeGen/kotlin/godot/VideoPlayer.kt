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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
  }

  fun getAudioTrack(): Int {
    val _ret = __method_bind.getAudioTrack.call(this._handle)
    return _ret.asInt()
  }

  fun getBufferingMsec(): Int {
    val _ret = __method_bind.getBufferingMsec.call(this._handle)
    return _ret.asInt()
  }

  fun getBus(): String {
    val _ret = __method_bind.getBus.call(this._handle)
    return _ret.asString()
  }

  fun getStream(): VideoStream {
    val _ret = __method_bind.getStream.call(this._handle)
    return _ret.toAny() as VideoStream
  }

  fun getStreamName(): String {
    val _ret = __method_bind.getStreamName.call(this._handle)
    return _ret.asString()
  }

  fun getStreamPosition(): Float {
    val _ret = __method_bind.getStreamPosition.call(this._handle)
    return _ret.asFloat()
  }

  fun getVideoTexture(): Texture {
    val _ret = __method_bind.getVideoTexture.call(this._handle)
    return _ret.toAny() as Texture
  }

  fun getVolume(): Float {
    val _ret = __method_bind.getVolume.call(this._handle)
    return _ret.asFloat()
  }

  fun getVolumeDb(): Float {
    val _ret = __method_bind.getVolumeDb.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAutoplay(): Boolean {
    val _ret = __method_bind.hasAutoplay.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasExpand(): Boolean {
    val _ret = __method_bind.hasExpand.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.isPaused.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play() {
    __method_bind.play.call(this._handle)
  }

  fun setAudioTrack(track: Int) {
    val _arg = Variant(track)
    __method_bind.setAudioTrack.call(this._handle, listOf(_arg))
  }

  fun setAutoplay(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setAutoplay.call(this._handle, listOf(_arg))
  }

  fun setBufferingMsec(msec: Int) {
    val _arg = Variant(msec)
    __method_bind.setBufferingMsec.call(this._handle, listOf(_arg))
  }

  fun setBus(bus: String) {
    val _arg = Variant(bus)
    __method_bind.setBus.call(this._handle, listOf(_arg))
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setExpand.call(this._handle, listOf(_arg))
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant(paused)
    __method_bind.setPaused.call(this._handle, listOf(_arg))
  }

  fun setStream(stream: VideoStream) {
    val _arg = Variant(stream)
    __method_bind.setStream.call(this._handle, listOf(_arg))
  }

  fun setStreamPosition(position: Float) {
    val _arg = Variant(position)
    __method_bind.setStreamPosition.call(this._handle, listOf(_arg))
  }

  fun setVolume(volume: Float) {
    val _arg = Variant(volume)
    __method_bind.setVolume.call(this._handle, listOf(_arg))
  }

  fun setVolumeDb(db: Float) {
    val _arg = Variant(db)
    __method_bind.setVolumeDb.call(this._handle, listOf(_arg))
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VideoPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VideoPlayer
     */
    private object __method_bind {
      val getAudioTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_audio_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_track" }
        }
      val getBufferingMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_buffering_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffering_msec" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bus" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream" }
        }
      val getStreamName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_name" }
        }
      val getStreamPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_position" }
        }
      val getVideoTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_video_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_texture" }
        }
      val getVolume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_volume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume" }
        }
      val getVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_volume_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
        }
      val hasAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "has_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autoplay" }
        }
      val hasExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "has_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_expand" }
        }
      val isPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "is_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_paused" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val setAudioTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_audio_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_track" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val setBufferingMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_buffering_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffering_msec" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bus" }
        }
      val setExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand" }
        }
      val setPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_paused" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream" }
        }
      val setStreamPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_stream_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_position" }
        }
      val setVolume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_volume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume" }
        }
      val setVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_volume_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
