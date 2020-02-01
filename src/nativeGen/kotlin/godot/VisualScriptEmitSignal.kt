// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptEmitSignal(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var signal: String
    get() {
       return getSignal() 
    }
    set(value) {
      setSignal(value)
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
    fun new(): VisualScriptEmitSignal = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptEmitSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptEmitSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptEmitSignal(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptEmitSignal = VisualScriptEmitSignal(ptr)
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
