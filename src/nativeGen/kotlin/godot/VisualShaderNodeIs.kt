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

open class VisualShaderNodeIs(
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
    return VisualShaderNodeIs.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.setFunction.call(this._handle, listOf(_arg))
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_IS_INF(0),

    FUNC_IS_NAN(1);

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
    val FUNC_IS_INF: Int = 0

    val FUNC_IS_NAN: Int = 1

    fun new(): VisualShaderNodeIs = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeIs".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeIs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeIs(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeIs = VisualShaderNodeIs(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeIs
     */
    private object __method_bind {
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeIs".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeIs".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
