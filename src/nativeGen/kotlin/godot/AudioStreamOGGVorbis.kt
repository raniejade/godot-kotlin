// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamOGGVorbis(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  var data: PoolByteArray
    get() {
       return getData() 
    }
    set(value) {
      setData(value)
    }

  var loop: Boolean
    get() {
       return hasLoop() 
    }
    set(value) {
      setLoop(value)
    }

  var loopOffset: Float
    get() {
       return getLoopOffset() 
    }
    set(value) {
      setLoopOffset(value)
    }

  fun getData(): PoolByteArray {
    val _ret = __method_bind.getData.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getLoopOffset(): Float {
    val _ret = __method_bind.getLoopOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.hasLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun setData(data: PoolByteArray) {
    val _arg = Variant.new(data)
    __method_bind.setData.call(this._handle, _arg, 1)
  }

  fun setLoop(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setLoop.call(this._handle, _arg, 1)
  }

  fun setLoopOffset(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.setLoopOffset.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioStreamOGGVorbis = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamOGGVorbis".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamOGGVorbis" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamOGGVorbis(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamOGGVorbis = AudioStreamOGGVorbis(ptr)
    /**
     * Container for method_bind pointers for AudioStreamOGGVorbis
     */
    private object __method_bind {
      val getData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "getData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getData" }
        }
      val getLoopOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "getLoopOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLoopOffset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "hasLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasLoop" }
        }
      val setData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "setData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setData" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "setLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoop" }
        }
      val setLoopOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "setLoopOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoopOffset" }
        }}
  }
}
