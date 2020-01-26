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

open class VideoPlayer internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getAudioTrack(): Int {
    TODO()
  }

  fun getBufferingMsec(): Int {
    TODO()
  }

  fun getBus(): String {
    TODO()
  }

  fun getStream(): VideoStream {
    TODO()
  }

  fun getStreamName(): String {
    TODO()
  }

  fun getStreamPosition(): Float {
    TODO()
  }

  fun getVideoTexture(): Texture {
    TODO()
  }

  fun getVolume(): Float {
    TODO()
  }

  fun getVolumeDb(): Float {
    TODO()
  }

  fun hasAutoplay(): Boolean {
    TODO()
  }

  fun hasExpand(): Boolean {
    TODO()
  }

  fun isPaused(): Boolean {
    TODO()
  }

  fun isPlaying(): Boolean {
    TODO()
  }

  fun play() {
    TODO()
  }

  fun setAudioTrack(track: Int) {
    TODO()
  }

  fun setAutoplay(enabled: Boolean) {
    TODO()
  }

  fun setBufferingMsec(msec: Int) {
    TODO()
  }

  fun setBus(bus: String) {
    TODO()
  }

  fun setExpand(enable: Boolean) {
    TODO()
  }

  fun setPaused(paused: Boolean) {
    TODO()
  }

  fun setStream(stream: VideoStream) {
    TODO()
  }

  fun setStreamPosition(position: Float) {
    TODO()
  }

  fun setVolume(volume: Float) {
    TODO()
  }

  fun setVolumeDb(db: Float) {
    TODO()
  }

  fun stop() {
    TODO()
  }

  companion object {
    fun new(): VideoPlayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VideoPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VideoPlayer" }
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
      val get_audio_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_audio_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_audio_track" }
            }
          }

      val get_buffering_msec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_buffering_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffering_msec" }
            }
          }

      val get_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val get_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val get_stream_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_name" }
            }
          }

      val get_stream_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_stream_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_position" }
            }
          }

      val get_video_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_video_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_video_texture" }
            }
          }

      val get_volume: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_volume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume" }
            }
          }

      val get_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val has_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "has_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autoplay" }
            }
          }

      val has_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "has_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_expand" }
            }
          }

      val is_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val set_audio_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_audio_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_track" }
            }
          }

      val set_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val set_buffering_msec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_buffering_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffering_msec" }
            }
          }

      val set_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val set_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand" }
            }
          }

      val set_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_paused" }
            }
          }

      val set_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val set_stream_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_stream_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_position" }
            }
          }

      val set_volume: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_volume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume" }
            }
          }

      val set_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
