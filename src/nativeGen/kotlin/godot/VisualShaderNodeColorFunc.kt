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

open class VisualShaderNodeColorFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getFunction(): Function {
    val _ret = __method_bind.get_function.call(this._handle)
    return VisualShaderNodeColorFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.set_function.call(this._handle, _arg, 1)
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_GRAYSCALE(0),

    FUNC_SEPIA(1);

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
    val FUNC_GRAYSCALE: Int = 0

    val FUNC_SEPIA: Int = 1

    fun new(): VisualShaderNodeColorFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeColorFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeColorFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeColorFunc = VisualShaderNodeColorFunc(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeColorFunc
     */
    private object __method_bind {
      val get_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorFunc".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val set_function: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorFunc".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
