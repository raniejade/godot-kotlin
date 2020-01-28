// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeColorConstant(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var constant: Color
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  fun getConstant(): Color {
    val _ret = __method_bind.getConstant.call(this._handle)
    return _ret.asColor()
  }

  fun setConstant(value: Color) {
    val _arg = Variant.new(value)
    __method_bind.setConstant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualShaderNodeColorConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeColorConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeColorConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeColorConstant =
        VisualShaderNodeColorConstant(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeColorConstant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorConstant".cstr.ptr,
            "getConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConstant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorConstant".cstr.ptr,
            "setConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConstant" }
        }}
  }
}
