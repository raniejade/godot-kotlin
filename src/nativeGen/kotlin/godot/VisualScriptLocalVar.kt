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

open class VisualScriptLocalVar internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getVarName(): String {
    val _ret = __method_bind.get_var_name.call(this.toVariant())
    return _ret.asString()
  }

  fun getVarType(): Variant.Type {
    val _ret = __method_bind.get_var_type.call(this.toVariant())
    return Variant.Type.from(_ret.asInt())
  }

  fun setVarName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_var_name.call(this.toVariant(), _arg, 1)
  }

  fun setVarType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.set_var_type.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): VisualScriptLocalVar = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptLocalVar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptLocalVar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptLocalVar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptLocalVar = VisualScriptLocalVar(ptr)
    /**
     * Container for method_bind pointers for VisualScriptLocalVar
     */
    private object __method_bind {
      val get_var_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "get_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_name" }
        }
      val get_var_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "get_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_type" }
        }
      val set_var_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "set_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_name" }
        }
      val set_var_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "set_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_type" }
        }}
  }
}
