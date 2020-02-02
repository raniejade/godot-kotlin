// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTransformFunc(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var function: Function
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value.value)
    }

  fun getFunction(): Function {
    val _ret = __method_bind.getFunction.call(this._handle)
    return VisualShaderNodeTransformFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.setFunction.call(this._handle, listOf(_arg))
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_INVERSE(0),

    FUNC_TRANSPOSE(1);

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
    fun new(): VisualShaderNodeTransformFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTransformFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTransformFunc =
        VisualShaderNodeTransformFunc(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformFunc
     */
    private object __method_bind {
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformFunc".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformFunc".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
