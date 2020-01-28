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

open class VisualScriptVariableSet(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var varName: String
    get() {
       return getVariable() 
    }
    set(value) {
      setVariable(value)
    }

  fun getVariable(): String {
    val _ret = __method_bind.getVariable.call(this._handle)
    return _ret.asString()
  }

  fun setVariable(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setVariable.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptVariableSet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptVariableSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptVariableSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptVariableSet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptVariableSet = VisualScriptVariableSet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptVariableSet
     */
    private object __method_bind {
      val getVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableSet".cstr.ptr,
            "get_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_variable" }
        }
      val setVariable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptVariableSet".cstr.ptr,
            "set_variable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_variable" }
        }}
  }
}
