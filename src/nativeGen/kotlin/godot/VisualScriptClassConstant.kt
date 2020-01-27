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

open class VisualScriptClassConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBaseType(): String {
    val _ret = __method_bind.get_base_type.call(this._handle)
    return _ret.asString()
  }

  fun getClassConstant(): String {
    val _ret = __method_bind.get_class_constant.call(this._handle)
    return _ret.asString()
  }

  fun setBaseType(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_base_type.call(this._handle, _arg, 1)
  }

  fun setClassConstant(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_class_constant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptClassConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptClassConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptClassConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptClassConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptClassConstant = VisualScriptClassConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptClassConstant
     */
    private object __method_bind {
      val get_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "get_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_type" }
        }
      val get_class_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "get_class_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_constant" }
        }
      val set_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "set_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_type" }
        }
      val set_class_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "set_class_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_class_constant" }
        }}
  }
}
