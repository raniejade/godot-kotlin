// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamGeneratorPlayback(
  _handle: COpaquePointer
) : AudioStreamPlaybackResampled(_handle) {
  fun canPushBuffer(amount: Int): Boolean {
    val _arg = Variant.new(amount)
    val _ret = __method_bind.can_push_buffer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun clearBuffer() {
    __method_bind.clear_buffer.call(this._handle)
  }

  fun getFramesAvailable(): Int {
    val _ret = __method_bind.get_frames_available.call(this._handle)
    return _ret.asInt()
  }

  fun getSkips(): Int {
    val _ret = __method_bind.get_skips.call(this._handle)
    return _ret.asInt()
  }

  fun pushBuffer(frames: PoolVector2Array): Boolean {
    val _arg = Variant.new(frames)
    val _ret = __method_bind.push_buffer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun pushFrame(frame: Vector2): Boolean {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.push_frame.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  companion object {
    /**
     * Container for method_bind pointers for AudioStreamGeneratorPlayback
     */
    private object __method_bind {
      val can_push_buffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "can_push_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_push_buffer" }
        }
      val clear_buffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "clear_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_buffer" }
        }
      val get_frames_available: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "get_frames_available".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_available" }
        }
      val get_skips: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "get_skips".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skips" }
        }
      val push_buffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "push_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_buffer" }
        }
      val push_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "push_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_frame" }
        }}
  }
}
