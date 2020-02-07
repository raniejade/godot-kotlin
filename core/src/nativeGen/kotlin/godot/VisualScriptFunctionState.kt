// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class VisualScriptFunctionState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(obj))
    _args.add(Variant.fromAny(signals))
    _args.add(Variant.fromAny(args))
    __method_bind.connectToSignal.call(this._handle, _args)
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.isValid.call(this._handle)
    return _ret.asBoolean()
  }

  fun resume(args: VariantArray): Variant {
    val _arg = Variant.new(args)
    val _ret = __method_bind.resume.call(this._handle, listOf(_arg))
    return _ret
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "connect_to_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_signal" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val resume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "resume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume" }
        }}
  }
}
