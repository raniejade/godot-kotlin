// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
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
    TODO()
  }

  fun getLoopOffset(): Float {
    TODO()
  }

  fun hasLoop(): Boolean {
    TODO()
  }

  fun setData(data: PoolByteArray) {
    TODO()
  }

  fun setLoop(enable: Boolean) {
    TODO()
  }

  fun setLoopOffset(seconds: Float) {
    TODO()
  }

  companion object {
    fun new(): AudioStreamOGGVorbis = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamOGGVorbis".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamOGGVorbis" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamOGGVorbis(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioStreamOGGVorbis
     */
    private object __method_bind {
      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_loop_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "get_loop_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_offset" }
            }
          }

      val has_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "has_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_loop" }
            }
          }

      val set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data" }
            }
          }

      val set_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "set_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop" }
            }
          }

      val set_loop_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
              "set_loop_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_offset" }
            }
          }
    }
  }
}
