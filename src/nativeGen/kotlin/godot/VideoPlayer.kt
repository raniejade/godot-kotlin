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
    return _ret.asObject(::VideoStream)!!
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
    return _ret.asObject(::Texture)!!
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
    val _arg = Variant.new(track)
    __method_bind.setAudioTrack.call(this._handle, _arg, 1)
  }

  fun setAutoplay(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setAutoplay.call(this._handle, _arg, 1)
  }

  fun setBufferingMsec(msec: Int) {
    val _arg = Variant.new(msec)
    __method_bind.setBufferingMsec.call(this._handle, _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.setBus.call(this._handle, _arg, 1)
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setExpand.call(this._handle, _arg, 1)
  }

  fun setPaused(paused: Boolean) {
    val _arg = Variant.new(paused)
    __method_bind.setPaused.call(this._handle, _arg, 1)
  }

  fun setStream(stream: VideoStream) {
    val _arg = Variant.new(stream)
    __method_bind.setStream.call(this._handle, _arg, 1)
  }

  fun setStreamPosition(position: Float) {
    val _arg = Variant.new(position)
    __method_bind.setStreamPosition.call(this._handle, _arg, 1)
  }

  fun setVolume(volume: Float) {
    val _arg = Variant.new(volume)
    __method_bind.setVolume.call(this._handle, _arg, 1)
  }

  fun setVolumeDb(db: Float) {
    val _arg = Variant.new(db)
    __method_bind.setVolumeDb.call(this._handle, _arg, 1)
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
      val getAudioTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getAudioTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAudioTrack" }
        }
      val getBufferingMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getBufferingMsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBufferingMsec" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBus" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStream" }
        }
      val getStreamName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getStreamName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamName" }
        }
      val getStreamPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getStreamPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamPosition" }
        }
      val getVideoTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getVideoTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVideoTexture" }
        }
      val getVolume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getVolume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVolume" }
        }
      val getVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "getVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVolumeDb" }
        }
      val hasAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "hasAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAutoplay" }
        }
      val hasExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "hasExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasExpand" }
        }
      val isPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "isPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPaused" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "isPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPlaying" }
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
            "setAudioTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAudioTrack" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoplay" }
        }
      val setBufferingMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setBufferingMsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBufferingMsec" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBus" }
        }
      val setExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpand" }
        }
      val setPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPaused" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStream" }
        }
      val setStreamPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setStreamPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStreamPosition" }
        }
      val setVolume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setVolume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVolume" }
        }
      val setVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VideoPlayer".cstr.ptr,
            "setVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVolumeDb" }
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
