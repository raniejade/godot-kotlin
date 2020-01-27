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

open class VideoPlayer(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getAudioTrack(): Int {
    val _ret = __method_bind.get_audio_track.call(this._handle)
    return _ret.asInt()
  }

  fun getBufferingMsec(): Int {
    val _ret = __method_bind.get_buffering_msec.call(this._handle)
    return _ret.asInt()
  }

  fun getBus(): String {
    val _ret = __method_bind.get_bus.call(this._handle)
    return _ret.asString()
  }

  fun getStream(): VideoStream {
    val _ret = __method_bind.get_stream.call(this._handle)
    return _ret.asObject(::VideoStream)!!
  }

  fun getStreamName(): String {
    val _ret = __method_bind.get_stream_name.call(this._handle)
    return _ret.asString()
  }

  fun getStreamPosition(): Float {
    val _ret = __method_bind.get_stream_position.call(this._handle)
    return _ret.asFloat()
  }

  fun getVideoTexture(): Texture {
    val _ret = __method_bind.get_video_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVolume(): Float {
    val _ret = __method_bind.get_volume.call(this._handle)
    return _ret.asFloat()
  }

  fun getVolumeDb(): Float {
    val _ret = __method_bind.get_volume_db.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAutoplay(): Boolean {
    val _ret = __method_bind.has_autoplay.call(this._handle)
    return _ret.asBool()
  }

  fun hasExpand(): Boolean {
    val _ret = __method_bind.has_expand.call(this._handle)
    return _ret.asBool()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.is_paused.call(this._handle)
    return _ret.asBool()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.is_playing.call(this._handle)
    return _ret.asBool()
  }

  fun play() {
    __method_bind.play.call(this._handle)
  }

  fun setAudioTrack(track: Int) {
    val _arg = Variant.new(track)
    __method_bind.set_audio_track.call(this._handle, _arg, 1)
  }

  fun setAutoplay(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_autoplay.call(this._handle, _arg, 1)
  }

  fun setBufferingMsec(msec: Int) {
    val _arg = Variant.new(msec)
    __method_bind.set_buffering_msec.call(this._handle, _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.set_bus.call(this._handle, _arg, 1)
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_expand.call(this._handle, _arg, 1)
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant.new(paused)
    __method_bind.set_paused.call(this._handle, _arg, 1)
  }

  fun setStream(stream: VideoStream) {
    val _arg = Variant.new(stream)
    __method_bind.set_stream.call(this._handle, _arg, 1)
  }

  fun setStreamPosition(position: Float) {
    val _arg = Variant.new(position)
    __method_bind.set_stream_position.call(this._handle, _arg, 1)
  }

  fun setVolume(volume: Float) {
    val _arg = Variant.new(volume)
    __method_bind.set_volume.call(this._handle, _arg, 1)
  }

  fun setVolumeDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.set_volume_db.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): VideoPlayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VideoPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VideoPlayer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VideoPlayer = VideoPlayer(ptr)
    /**
     * Container for method_bind pointers for VideoPlayer
     */
    private object __method_bind {
      val get_audio_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_audio_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_track" }
        }
      val get_buffering_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_buffering_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffering_msec" }
        }
      val get_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bus" }
        }
      val get_stream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream" }
        }
      val get_stream_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_name" }
        }
      val get_stream_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_stream_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_position" }
        }
      val get_video_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_video_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_texture" }
        }
      val get_volume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_volume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume" }
        }
      val get_volume_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "get_volume_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
        }
      val has_autoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "has_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autoplay" }
        }
      val has_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "has_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_expand" }
        }
      val is_paused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "is_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_paused" }
        }
      val is_playing: CPointer<godot_method_bind>
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
      val set_audio_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_audio_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_track" }
        }
      val set_autoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val set_buffering_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_buffering_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffering_msec" }
        }
      val set_bus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bus" }
        }
      val set_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand" }
        }
      val set_paused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_paused" }
        }
      val set_stream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream" }
        }
      val set_stream_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_stream_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_position" }
        }
      val set_volume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "set_volume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume" }
        }
      val set_volume_db: CPointer<godot_method_bind>
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
