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

open class VisualScriptTypeCast(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBaseScript(): String {
    val _ret = __method_bind.get_base_script.call(this._handle)
    return _ret.asString()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.get_base_type.call(this._handle)
    return _ret.asString()
  }

  fun setBaseScript(path: String) {
    val _arg = Variant.new(path)
    __method_bind.set_base_script.call(this._handle, _arg, 1)
  }

  fun setBaseType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.set_base_type.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptTypeCast = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptTypeCast".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptTypeCast" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptTypeCast(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptTypeCast = VisualScriptTypeCast(ptr)
    /**
     * Container for method_bind pointers for VisualScriptTypeCast
     */
    private object __method_bind {
      val get_base_script: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val get_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "get_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_type" }
        }
      val set_base_script: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "set_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_script" }
        }
      val set_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "set_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_type" }
        }}
  }
}
