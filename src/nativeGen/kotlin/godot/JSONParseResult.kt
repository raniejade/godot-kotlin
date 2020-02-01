// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class JSONParseResult(
  _handle: COpaquePointer
) : Reference(_handle) {
  var error: GDError
    get() {
       return getError() 
    }
    set(value) {
      setError(value.value)
    }

  var errorLine: Int
    get() {
       return getErrorLine() 
    }
    set(value) {
      setErrorLine(value)
    }

  var errorString: String
    get() {
       return getErrorString() 
    }
    set(value) {
      setErrorString(value)
    }

  var result: Variant
    get() {
       return getResult() 
    }
    set(value) {
      setResult(value)
    }

  /**
   * Specialized setter for result
   */
  fun result(cb: Variant.() -> Unit) {
    val _p = result
    cb(_p)
    result = _p
  }

  fun getError(): GDError {
    val _ret = __method_bind.getError.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun getErrorLine(): Int {
    val _ret = __method_bind.getErrorLine.call(this._handle)
    return _ret.asInt()
  }

  fun getErrorString(): String {
    val _ret = __method_bind.getErrorString.call(this._handle)
    return _ret.asString()
  }

  fun getResult(): Variant {
    val _ret = __method_bind.getResult.call(this._handle)
    return _ret
  }

  fun setError(error: Int) {
    val _arg = Variant.new(error)
    __method_bind.setError.call(this._handle, listOf(_arg))
  }

  fun setErrorLine(errorLine: Int) {
    val _arg = Variant.new(errorLine)
    __method_bind.setErrorLine.call(this._handle, listOf(_arg))
  }

  fun setErrorString(errorString: String) {
    val _arg = Variant.new(errorString)
    __method_bind.setErrorString.call(this._handle, listOf(_arg))
  }

  fun setResult(result: Variant) {
    val _arg = Variant.new(result)
    __method_bind.setResult.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): JSONParseResult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("JSONParseResult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for JSONParseResult" }
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
      val getError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error" }
        }
      val getErrorLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error_line" }
        }
      val getErrorString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error_string" }
        }
      val getResult: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_result".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result" }
        }
      val setError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error" }
        }
      val setErrorLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error_line" }
        }
      val setErrorString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error_string" }
        }
      val setResult: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_result".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_result" }
        }}
  }
}
