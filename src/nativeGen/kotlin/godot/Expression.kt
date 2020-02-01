// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Expression(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun execute(
    inputs: VariantArray,
    baseInstance: Object,
    showError: Boolean = true
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(inputs))
    _args.add(Variant.fromAny(baseInstance))
    _args.add(Variant.fromAny(showError))
    val _ret = __method_bind.execute.call(this._handle, _args)
    return _ret
  }

  fun getErrorText(): String {
    val _ret = __method_bind.getErrorText.call(this._handle)
    return _ret.asString()
  }

  fun hasExecuteFailed(): Boolean {
    val _ret = __method_bind.hasExecuteFailed.call(this._handle)
    return _ret.asBoolean()
  }

  fun parse(expression: String, inputNames: PoolStringArray): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(expression))
    _args.add(Variant.fromAny(inputNames))
    val _ret = __method_bind.parse.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): Expression = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Expression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Expression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Expression(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Expression = Expression(ptr)
    /**
     * Container for method_bind pointers for Expression
     */
    private object __method_bind {
      val execute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "execute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method execute" }
        }
      val getErrorText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "get_error_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error_text" }
        }
      val hasExecuteFailed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "has_execute_failed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_execute_failed" }
        }
      val parse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "parse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse" }
        }}
  }
}
