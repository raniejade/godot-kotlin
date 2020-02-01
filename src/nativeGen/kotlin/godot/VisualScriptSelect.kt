// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptSelect(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var type: Variant.Type
    get() {
       return getTyped() 
    }
    set(value) {
      setTyped(value.value)
    }

  fun getTyped(): Variant.Type {
    val _ret = __method_bind.getTyped.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setTyped(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setTyped.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualScriptSelect = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSelect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptSelect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSelect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptSelect = VisualScriptSelect(ptr)
    /**
     * Container for method_bind pointers for VisualScriptSelect
     */
    private object __method_bind {
      val getTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSelect".cstr.ptr,
            "get_typed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_typed" }
        }
      val setTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSelect".cstr.ptr,
            "set_typed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_typed" }
        }}
  }
}
