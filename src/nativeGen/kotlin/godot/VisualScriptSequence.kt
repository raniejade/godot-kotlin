// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSequence(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var steps: Int
    get() {
       return getSteps() 
    }
    set(value) {
      setSteps(value)
    }

  fun getSteps(): Int {
    val _ret = __method_bind.getSteps.call(this._handle)
    return _ret.asInt()
  }

  fun setSteps(steps: Int) {
    val _arg = Variant.new(steps)
    __method_bind.setSteps.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualScriptSequence = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSequence".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptSequence" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSequence(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptSequence = VisualScriptSequence(ptr)
    /**
     * Container for method_bind pointers for VisualScriptSequence
     */
    private object __method_bind {
      val getSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
            "get_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steps" }
        }
      val setSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
            "set_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steps" }
        }}
  }
}
