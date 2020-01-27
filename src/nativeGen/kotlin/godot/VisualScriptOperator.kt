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

open class VisualScriptOperator internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getOperator(): Variant.Operator {
    val _ret = __method_bind.get_operator.call(this.toVariant())
    TODO()
  }

  fun getTyped(): Variant.Type {
    val _ret = __method_bind.get_typed.call(this.toVariant())
    TODO()
  }

  fun setOperator(op: Int) {
    val _args = VariantArray.new()
    _args.append(op)
    val _ret = __method_bind.set_operator.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTyped(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.set_typed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): VisualScriptOperator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptOperator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptOperator" }
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
      val get_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "get_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_operator" }
            }
          }

      val get_typed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "get_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_typed" }
            }
          }

      val set_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "set_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_operator" }
            }
          }

      val set_typed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "set_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_typed" }
            }
          }
    }
  }
}
