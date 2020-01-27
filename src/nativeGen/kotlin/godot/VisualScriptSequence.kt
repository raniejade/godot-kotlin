// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSequence internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getSteps(): Int {
    val _ret = __method_bind.get_steps.call(this._handle)
    return _ret.asInt()
  }

  fun setSteps(steps: Int) {
    val _arg = Variant.new(steps)
    __method_bind.set_steps.call(this._handle, _arg, 1)
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
      val get_steps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
            "get_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steps" }
        }
      val set_steps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSequence".cstr.ptr,
            "set_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steps" }
        }}
  }
}
