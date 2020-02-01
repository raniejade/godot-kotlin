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

open class VisualScriptGlobalConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var constant: Int
    get() {
       return getGlobalConstant() 
    }
    set(value) {
      setGlobalConstant(value)
    }

  fun getGlobalConstant(): Int {
    val _ret = __method_bind.getGlobalConstant.call(this._handle)
    return _ret.asInt()
  }

  fun setGlobalConstant(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.setGlobalConstant.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualScriptGlobalConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptGlobalConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptGlobalConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptGlobalConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptGlobalConstant = VisualScriptGlobalConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptGlobalConstant
     */
    private object __method_bind {
      val getGlobalConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
            "get_global_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_constant" }
        }
      val setGlobalConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
            "set_global_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_constant" }
        }}
  }
}
