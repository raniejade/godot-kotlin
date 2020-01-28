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

open class VisualShaderNodeScalarDerivativeFunc(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var function: Int
    get() {
       return VisualShaderNodeScalarDerivativeFunc.Function.from(getFunction()) 
    }
    set(value) {
      setFunction(VisualShaderNodeScalarDerivativeFunc.Function.from(value))
    }

  fun getFunction(): Function {
    val _ret = __method_bind.getFunction.call(this._handle)
    return VisualShaderNodeScalarDerivativeFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.setFunction.call(this._handle, _arg, 1)
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_SUM(0),

    FUNC_X(1),

    FUNC_Y(2);

    companion object {
      fun from(value: Int): Function {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val FUNC_SUM: Int = 0

    val FUNC_X: Int = 1

    val FUNC_Y: Int = 2

    fun new(): VisualShaderNodeScalarDerivativeFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeScalarDerivativeFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarDerivativeFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeScalarDerivativeFunc =
        VisualShaderNodeScalarDerivativeFunc(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarDerivativeFunc
     */
    private object __method_bind {
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr,
            "getFunction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFunction" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr,
            "setFunction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFunction" }
        }}
  }
}
