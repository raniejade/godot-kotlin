// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptOperator(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var operator: Variant.Operator
    get() {
       return getOperator() 
    }
    set(value) {
      setOperator(value.value)
    }

  var type: Variant.Type
    get() {
       return getTyped() 
    }
    set(value) {
      setTyped(value.value)
    }

  fun getOperator(): Variant.Operator {
    val _ret = __method_bind.getOperator.call(this._handle)
    return Variant.Operator.from(_ret.asInt())
  }

  fun getTyped(): Variant.Type {
    val _ret = __method_bind.getTyped.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setOperator(op: Int) {
    val _arg = Variant.new(op)
    __method_bind.setOperator.call(this._handle, _arg, 1)
  }

  fun setTyped(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setTyped.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptOperator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptOperator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptOperator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptOperator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptOperator = VisualScriptOperator(ptr)
    /**
     * Container for method_bind pointers for VisualScriptOperator
     */
    private object __method_bind {
      val getOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "get_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_operator" }
        }
      val getTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "get_typed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_typed" }
        }
      val setOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "set_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_operator" }
        }
      val setTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "set_typed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_typed" }
        }}
  }
}
