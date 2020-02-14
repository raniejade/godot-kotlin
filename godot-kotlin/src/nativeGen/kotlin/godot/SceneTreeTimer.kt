// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class SceneTreeTimer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var timeLeft: Float
    get() {
       return getTimeLeft() 
    }
    set(value) {
      setTimeLeft(value)
    }

  /**
   * SceneTreeTimer::timeout signal
   */
  val signalTimeout: Signal0 = Signal0("timeout")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getTimeLeft(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeLeft.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setTimeLeft(time: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTimeLeft.call(self._handle, listOf(time), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for SceneTreeTimer
     */
    private object __method_bind {
      val getTimeLeft: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
            "get_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_left" }
        }
      val setTimeLeft: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
            "set_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_left" }
        }}
  }
}
