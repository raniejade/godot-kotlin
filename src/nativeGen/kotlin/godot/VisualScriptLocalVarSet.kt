// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptLocalVarSet(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var type: Variant.Type
    get() {
       return getVarType() 
    }
    set(value) {
      setVarType(value.value)
    }

  var varName: String
    get() {
       return getVarName() 
    }
    set(value) {
      setVarName(value)
    }

  fun getVarName(): String {
    val _ret = __method_bind.getVarName.call(this._handle)
    return _ret.asString()
  }

  fun getVarType(): Variant.Type {
    val _ret = __method_bind.getVarType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setVarName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setVarName.call(this._handle, listOf(_arg))
  }

  fun setVarType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setVarType.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualScriptLocalVarSet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptLocalVarSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptLocalVarSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptLocalVarSet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptLocalVarSet = VisualScriptLocalVarSet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptLocalVarSet
     */
    private object __method_bind {
      val getVarName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
            "get_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_name" }
        }
      val getVarType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
            "get_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_type" }
        }
      val setVarName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
            "set_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_name" }
        }
      val setVarType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVarSet".cstr.ptr,
            "set_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_type" }
        }}
  }
}
