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

open class VisualScriptNode(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getDefaultInputValue(portIdx: Int): Variant {
    val _arg = Variant.new(portIdx)
    val _ret = __method_bind.getDefaultInputValue.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getVisualScript(): VisualScript {
    val _ret = __method_bind.getVisualScript.call(this._handle)
    return _ret.asObject(::VisualScript)!!
  }

  fun portsChangedNotify() {
    __method_bind.portsChangedNotify.call(this._handle)
  }

  fun setDefaultInputValue(portIdx: Int, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(portIdx))
    _args.add(Variant.fromAny(value))
    __method_bind.setDefaultInputValue.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptNode
     */
    private object __method_bind {
      val getDefaultInputValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_input_value" }
        }
      val getVisualScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_visual_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visual_script" }
        }
      val portsChangedNotify: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "ports_changed_notify".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ports_changed_notify" }
        }
      val setDefaultInputValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "set_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_input_value" }
        }}
  }
}
