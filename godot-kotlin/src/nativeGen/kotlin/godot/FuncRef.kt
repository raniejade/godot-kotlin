// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
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

open class FuncRef(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun callFunc(vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.callFunc.slowcall(this._handle, _args)
    return _ret
  }

  fun callFuncv(argArray: VariantArray): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.callFuncv.call(self._handle, listOf(argArray), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isValid(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isValid.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setFunction(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFunction.call(self._handle, listOf(name), null)
    }
  }

  fun setInstance(instance: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInstance.call(self._handle, listOf(instance), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FuncRef".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for FuncRef" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for FuncRef
     */
    private object __method_bind {
      val callFunc: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
            "call_func".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_func" }
        }
      val callFuncv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
            "call_funcv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_funcv" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }
      val setInstance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
            "set_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance" }
        }}
  }
}
