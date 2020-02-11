// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeExpression(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNodeGroupBase(null) {
  var expression: String
    get() {
       return getExpression() 
    }
    set(value) {
      setExpression(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getExpression(): String {
    val _ret = __method_bind.getExpression.call(this._handle)
    return _ret.asString()
  }

  fun setExpression(expression: String) {
    val _arg = Variant(expression)
    __method_bind.setExpression.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeExpression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeExpression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeExpression
     */
    private object __method_bind {
      val getExpression: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "get_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expression" }
        }
      val setExpression: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
            "set_expression".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expression" }
        }}
  }
}
