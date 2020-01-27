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

open class FuncRef internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun callFunc(): Variant {
    val _ret = __method_bind.call_func.call(this.toVariant())
    TODO()
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.is_valid.call(this.toVariant())
    TODO()
  }

  fun setFunction(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.set_function.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInstance(instance: Object) {
    val _args = VariantArray.new()
    _args.append(instance)
    val _ret = __method_bind.set_instance.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): FuncRef = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("FuncRef".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton FuncRef" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      FuncRef(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): FuncRef = FuncRef(ptr)
    /**
     * Container for method_bind pointers for FuncRef
     */
    private object __method_bind {
      val call_func: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
              "call_func".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_func" }
            }
          }

      val is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
              "is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid" }
            }
          }

      val set_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
              "set_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function" }
            }
          }

      val set_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("FuncRef".cstr.ptr,
              "set_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance" }
            }
          }
    }
  }
}
