// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class JSONParseResult internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getError(): Error {
    val _ret = __method_bind.get_error.call(this.toVariant())
    TODO()
  }

  fun getErrorLine(): Int {
    val _ret = __method_bind.get_error_line.call(this.toVariant())
    TODO()
  }

  fun getErrorString(): String {
    val _ret = __method_bind.get_error_string.call(this.toVariant())
    TODO()
  }

  fun getResult(): Variant {
    val _ret = __method_bind.get_result.call(this.toVariant())
    TODO()
  }

  fun setError(error: Int) {
    val _args = VariantArray.new()
    _args.append(error)
    val _ret = __method_bind.set_error.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setErrorLine(errorLine: Int) {
    val _args = VariantArray.new()
    _args.append(errorLine)
    val _ret = __method_bind.set_error_line.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setErrorString(errorString: String) {
    val _args = VariantArray.new()
    _args.append(errorString)
    val _ret = __method_bind.set_error_string.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setResult(result: Variant) {
    val _args = VariantArray.new()
    _args.append(result)
    val _ret = __method_bind.set_result.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): JSONParseResult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("JSONParseResult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton JSONParseResult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      JSONParseResult(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): JSONParseResult = JSONParseResult(ptr)
    /**
     * Container for method_bind pointers for JSONParseResult
     */
    private object __method_bind {
      val get_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "get_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error" }
            }
          }

      val get_error_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "get_error_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error_line" }
            }
          }

      val get_error_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "get_error_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error_string" }
            }
          }

      val get_result: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "get_result".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result" }
            }
          }

      val set_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "set_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_error" }
            }
          }

      val set_error_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "set_error_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_error_line" }
            }
          }

      val set_error_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "set_error_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_error_string" }
            }
          }

      val set_result: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
              "set_result".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_result" }
            }
          }
    }
  }
}
