// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
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
    val _ret = __method_bind.callFunc.call(this._handle, _args)
    return _ret
  }

  fun callFuncv(argArray: VariantArray): Variant {
    val _arg = Variant(argArray)
    val _ret = __method_bind.callFuncv.call(this._handle, listOf(_arg))
    return _ret
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.isValid.call(this._handle)
    return _ret.asBoolean()
  }

  fun setFunction(name: String) {
    val _arg = Variant(name)
    __method_bind.setFunction.call(this._handle, listOf(_arg))
  }

  fun setInstance(instance: Object) {
    val _arg = Variant(instance)
    __method_bind.setInstance.call(this._handle, listOf(_arg))
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
