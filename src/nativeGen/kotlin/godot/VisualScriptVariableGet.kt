// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptVariableGet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getVariable(): String {
    val _ret = __method_bind.get_variable.call(this.toVariant())
    return _ret.asString()
  }

  fun setVariable(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_variable.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): VisualScriptVariableGet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptVariableGet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptVariableGet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptVariableGet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptVariableGet = VisualScriptVariableGet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptVariableGet
     */
    private object __method_bind {
      val get_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableGet".cstr.ptr,
            "get_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable" }
        }
      val set_variable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableGet".cstr.ptr,
            "set_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable" }
        }}
  }
}
