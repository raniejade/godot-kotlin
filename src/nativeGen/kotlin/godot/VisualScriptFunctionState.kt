// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class VisualScriptFunctionState(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun connectToSignal(
    obj: Object,
    signals: String,
    args: VariantArray
  ) {
    val _args = VariantArray.new()
    _args.append(obj)
    _args.append(signals)
    _args.append(args)
    __method_bind.connectToSignal.call(this._handle, _args.toVariant(), 3)
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.isValid.call(this._handle)
    return _ret.asBoolean()
  }

  fun resume(args: VariantArray): Variant {
    val _arg = Variant.new(args)
    val _ret = __method_bind.resume.call(this._handle, _arg, 1)
    return _ret
  }

  companion object {
    fun new(): VisualScriptFunctionState = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionState".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptFunctionState" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptFunctionState(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptFunctionState = VisualScriptFunctionState(ptr)
    /**
     * Container for method_bind pointers for VisualScriptFunctionState
     */
    private object __method_bind {
      val connectToSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "connectToSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectToSignal" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionState".cstr.ptr,
            "isValid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isValid" }
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
