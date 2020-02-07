// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class VisualScriptEmitSignal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var signal: String
    get() {
       return getSignal() 
    }
    set(value) {
      setSignal(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getSignal(): String {
    val _ret = __method_bind.getSignal.call(this._handle)
    return _ret.asString()
  }

  fun setSignal(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setSignal.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptEmitSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptEmitSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptEmitSignal
     */
    private object __method_bind {
      val getSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEmitSignal".cstr.ptr,
            "get_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_signal" }
        }
      val setSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEmitSignal".cstr.ptr,
            "set_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_signal" }
        }}
  }
}
