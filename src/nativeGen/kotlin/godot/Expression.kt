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
    showError: Boolean
  ): Variant {
    val _args = VariantArray.new()
    _args.append(inputs)
    _args.append(baseInstance)
    _args.append(showError)
    val _ret = __method_bind.execute.call(this._handle, _args.toVariant(), 3)
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
    val _args = VariantArray.new()
    _args.append(expression)
    _args.append(inputNames)
    val _ret = __method_bind.parse.call(this._handle, _args.toVariant(), 2)
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
            "getErrorText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getErrorText" }
        }
      val hasExecuteFailed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "hasExecuteFailed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasExecuteFailed" }
        }
      val parse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
            "parse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse" }
        }}
  }
}
