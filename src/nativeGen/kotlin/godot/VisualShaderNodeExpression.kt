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

open class VisualShaderNodeExpression(
  _handle: COpaquePointer
) : VisualShaderNodeGroupBase(_handle) {
  fun build() {
    __method_bind.build.call(this._handle)
  }

  fun getExpression(): String {
    val _ret = __method_bind.get_expression.call(this._handle)
    return _ret.asString()
  }

  fun setExpression(expression: String) {
    val _arg = Variant.new(expression)
    __method_bind.set_expression.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualShaderNodeExpression = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeExpression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeExpression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeExpression(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeExpression = VisualShaderNodeExpression(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeExpression
     */
    private object __method_bind {
      val build: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "build".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method build" }
        }
      val get_expression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "get_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expression" }
        }
      val set_expression: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "set_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expression" }
        }}
  }
}
