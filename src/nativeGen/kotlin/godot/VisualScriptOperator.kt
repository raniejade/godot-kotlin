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
  var operator: Int
    get() {
       return Variant.Operator.from(getOperator()) 
    }
    set(value) {
      setOperator(Variant.Operator.from(value))
    }

  var type: Int
    get() {
       return Variant.Type.from(getTyped()) 
    }
    set(value) {
      setTyped(Variant.Type.from(value))
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
            "getOperator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOperator" }
        }
      val getTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "getTyped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTyped" }
        }
      val setOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "setOperator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOperator" }
        }
      val setTyped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
            "setTyped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTyped" }
        }}
  }
}
