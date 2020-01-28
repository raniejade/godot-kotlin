// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class JSONParseResult(
  _handle: COpaquePointer
) : Reference(_handle) {
  var error: Object
    get() {
       return GDError.from(getError()) 
    }
    set(value) {
      setError(GDError.from(value))
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
    __method_bind.setError.call(this._handle, _arg, 1)
  }

  fun setErrorLine(errorLine: Int) {
    val _arg = Variant.new(errorLine)
    __method_bind.setErrorLine.call(this._handle, _arg, 1)
  }

  fun setErrorString(errorString: String) {
    val _arg = Variant.new(errorString)
    __method_bind.setErrorString.call(this._handle, _arg, 1)
  }

  fun setResult(result: Variant) {
    val _arg = Variant.new(result)
    __method_bind.setResult.call(this._handle, _arg, 1)
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
            "getError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getError" }
        }
      val getErrorLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "getErrorLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getErrorLine" }
        }
      val getErrorString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "getErrorString".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getErrorString" }
        }
      val getResult: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "getResult".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResult" }
        }
      val setError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "setError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setError" }
        }
      val setErrorLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "setErrorLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setErrorLine" }
        }
      val setErrorString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "setErrorString".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setErrorString" }
        }
      val setResult: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "setResult".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setResult" }
        }}
  }
}
