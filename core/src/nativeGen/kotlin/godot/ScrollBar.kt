// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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

open class ScrollBar(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var customStep: Float
    get() {
       return getCustomStep() 
    }
    set(value) {
      setCustomStep(value)
    }

  /**
   * ScrollBar::scrolling signal
   */
  val signalScrolling: Signal0 = Signal0("scrolling")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCustomStep(): Float {
    val _ret = __method_bind.getCustomStep.call(this._handle)
    return _ret.asFloat()
  }

  fun setCustomStep(step: Float) {
    val _arg = Variant(step)
    __method_bind.setCustomStep.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for ScrollBar
     */
    private object __method_bind {
      val getCustomStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
            "get_custom_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_step" }
        }
      val setCustomStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
            "set_custom_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_step" }
        }}
  }
}
