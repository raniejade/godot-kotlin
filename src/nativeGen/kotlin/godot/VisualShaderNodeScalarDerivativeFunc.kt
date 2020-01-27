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

open class VisualShaderNodeScalarDerivativeFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getFunction(): Function {
    val _ret = __method_bind.get_function.call(this.toVariant())
    TODO()
  }

  fun setFunction(func: Int) {
    val _args = VariantArray.new()
    _args.append(func)
    val _ret = __method_bind.set_function.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeScalarDerivativeFunc"
        }
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
      val get_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr,
              "get_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function" }
            }
          }

      val set_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr,
              "set_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function" }
            }
          }
    }
  }
}
