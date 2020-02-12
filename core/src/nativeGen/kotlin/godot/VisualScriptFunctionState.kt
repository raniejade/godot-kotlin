// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class VisualScriptFunctionState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(obj)
      _args.add(signals)
      _args.add(args)
      __method_bind.connectToSignal.call(self._handle, _args, null)
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

  fun resume(args: VariantArray): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.resume.call(self._handle, listOf(args), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionState".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptFunctionState" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptFunctionState
     */
    private object __method_bind {
      val connectToSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "connect_to_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_signal" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val resume: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "resume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume" }
        }}
  }
}
