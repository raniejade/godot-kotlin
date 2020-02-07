// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamOGGVorbis(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioStream(null) {
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for data
   */
  fun data(cb: PoolByteArray.() -> Unit) {
    val _p = data
    cb(_p)
    data = _p
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
    val _arg = Variant(data)
    __method_bind.setData.call(this._handle, listOf(_arg))
  }

  fun setLoop(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setLoop.call(this._handle, listOf(_arg))
  }

  fun setLoopOffset(seconds: Float) {
    val _arg = Variant(seconds)
    __method_bind.setLoopOffset.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamOGGVorbis".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamOGGVorbis" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamOGGVorbis
     */
    private object __method_bind {
      val getData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getLoopOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_offset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val setData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setLoopOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_offset" }
        }}
  }
}
