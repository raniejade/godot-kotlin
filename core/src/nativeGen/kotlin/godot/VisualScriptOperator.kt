// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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

open class VisualScriptOperator(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
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

  constructor() : this(null) {
    _handle = __new()
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
    __method_bind.setOperator.call(this._handle, listOf(_arg))
  }

  fun setTyped(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setTyped.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptOperator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptOperator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
