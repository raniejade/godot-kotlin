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
    val _ret = __method_bind.canPushBuffer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun clearBuffer() {
    __method_bind.clearBuffer.call(this._handle)
  }

  fun getFramesAvailable(): Int {
    val _ret = __method_bind.getFramesAvailable.call(this._handle)
    return _ret.asInt()
  }

  fun getSkips(): Int {
    val _ret = __method_bind.getSkips.call(this._handle)
    return _ret.asInt()
  }

  fun pushBuffer(frames: PoolVector2Array): Boolean {
    val _arg = Variant.new(frames)
    val _ret = __method_bind.pushBuffer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun pushFrame(frame: Vector2): Boolean {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.pushFrame.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  companion object {
    /**
     * Container for method_bind pointers for AudioStreamGeneratorPlayback
     */
    private object __method_bind {
      val canPushBuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "canPushBuffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canPushBuffer" }
        }
      val clearBuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "clearBuffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearBuffer" }
        }
      val getFramesAvailable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "getFramesAvailable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFramesAvailable" }
        }
      val getSkips: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "getSkips".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkips" }
        }
      val pushBuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "pushBuffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushBuffer" }
        }
      val pushFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGeneratorPlayback".cstr.ptr,
            "pushFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushFrame" }
        }}
  }
}
