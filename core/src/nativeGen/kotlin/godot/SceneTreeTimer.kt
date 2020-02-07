// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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

  constructor() : this(null) {
    _handle = __new()
  }

  fun getTimeLeft(): Float {
    val _ret = __method_bind.getTimeLeft.call(this._handle)
    return _ret.asFloat()
  }

  fun setTimeLeft(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setTimeLeft.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for SceneTreeTimer
     */
    private object __method_bind {
      val getTimeLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
            "get_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_left" }
        }
      val setTimeLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
            "set_time_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_left" }
        }}
  }
}
