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

open class VisualScriptNode internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getDefaultInputValue(portIdx: Int): Variant {
    val _arg = Variant.new(portIdx)
    val _ret = __method_bind.get_default_input_value.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun getVisualScript(): VisualScript {
    val _ret = __method_bind.get_visual_script.call(this.toVariant())
    return _ret.asObject(::VisualScript)!!
  }

  fun portsChangedNotify() {
    __method_bind.ports_changed_notify.call(this.toVariant())
  }

  fun setDefaultInputValue(portIdx: Int, value: Variant) {
    val _args = VariantArray.new()
    _args.append(portIdx)
    _args.append(value)
    __method_bind.set_default_input_value.call(this.toVariant(), _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptNode
     */
    private object __method_bind {
      val get_default_input_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_input_value" }
        }
      val get_visual_script: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_visual_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visual_script" }
        }
      val ports_changed_notify: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "ports_changed_notify".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ports_changed_notify" }
        }
      val set_default_input_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "set_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_input_value" }
        }}
  }
}
