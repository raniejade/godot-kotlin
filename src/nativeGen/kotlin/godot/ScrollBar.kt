// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScrollBar(
  _handle: COpaquePointer
) : Range(_handle) {
  var customStep: Float
    get() {
       return getCustomStep() 
    }
    set(value) {
      setCustomStep(value)
    }

  fun getCustomStep(): Float {
    val _ret = __method_bind.getCustomStep.call(this._handle)
    return _ret.asFloat()
  }

  fun setCustomStep(step: Float) {
    val _arg = Variant.new(step)
    __method_bind.setCustomStep.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for ScrollBar
     */
    private object __method_bind {
      val getCustomStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
            "getCustomStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomStep" }
        }
      val setCustomStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
            "setCustomStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomStep" }
        }}
  }
}
