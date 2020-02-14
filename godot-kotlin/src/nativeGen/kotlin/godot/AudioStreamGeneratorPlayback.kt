// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class AudioStreamGeneratorPlayback(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioStreamPlaybackResampled(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun canPushBuffer(amount: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canPushBuffer.call(self._handle, listOf(amount), _retPtr)
      _ret.value
    }
  }

  fun clearBuffer() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBuffer.call(self._handle, emptyList(), null)
    }
  }

  fun getFramesAvailable(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFramesAvailable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSkips(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSkips.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun pushBuffer(frames: PoolVector2Array): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.pushBuffer.call(self._handle, listOf(frames), _retPtr)
      _ret.value
    }
  }

  fun pushFrame(frame: Vector2): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.pushFrame.call(self._handle, listOf(frame), _retPtr)
      _ret.value
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for AudioStreamGeneratorPlayback
     */
    private object __method_bind {
      val canPushBuffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "can_push_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_push_buffer" }
        }
      val clearBuffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "clear_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_buffer" }
        }
      val getFramesAvailable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "get_frames_available".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_available" }
        }
      val getSkips: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "get_skips".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skips" }
        }
      val pushBuffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "push_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_buffer" }
        }
      val pushFrame: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "push_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_frame" }
        }}
  }
}
