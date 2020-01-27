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

open class AudioStreamOGGVorbis internal constructor(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  fun getData(): PoolByteArray {
    val _ret = __method_bind.get_data.call(this.toVariant())
    return _ret.asPoolByteArray()
  }

  fun getLoopOffset(): Float {
    val _ret = __method_bind.get_loop_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.has_loop.call(this.toVariant())
    return _ret.asBool()
  }

  fun setData(data: PoolByteArray) {
    val _arg = Variant.new(data)
    __method_bind.set_data.call(this.toVariant(), _arg, 1)
  }

  fun setLoop(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_loop.call(this.toVariant(), _arg, 1)
  }

  fun setLoopOffset(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.set_loop_offset.call(this.toVariant(), _arg, 1)
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
      val get_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val get_loop_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_offset" }
        }
      val has_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val set_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val set_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val set_loop_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_offset" }
        }}
  }
}
