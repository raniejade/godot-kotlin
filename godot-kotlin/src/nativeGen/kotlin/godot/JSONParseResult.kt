// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class JSONParseResult(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getError.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getErrorLine(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getErrorLine.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getErrorString(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getErrorString.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getResult(): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getResult.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setError(error: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setError.call(self._handle, listOf(error), null)
    }
  }

  fun setErrorLine(errorLine: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setErrorLine.call(self._handle, listOf(errorLine), null)
    }
  }

  fun setErrorString(errorString: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setErrorString.call(self._handle, listOf(errorString), null)
    }
  }

  fun setResult(result: Variant) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setResult.call(self._handle, listOf(result), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("JSONParseResult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for JSONParseResult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for JSONParseResult
     */
    private object __method_bind {
      val getError: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error" }
        }
      val getErrorLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error_line" }
        }
      val getErrorString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_error_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_error_string" }
        }
      val getResult: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "get_result".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result" }
        }
      val setError: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error" }
        }
      val setErrorLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error_line" }
        }
      val setErrorString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_error_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_error_string" }
        }
      val setResult: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONParseResult".cstr.ptr,
            "set_result".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_result" }
        }}
  }
}
