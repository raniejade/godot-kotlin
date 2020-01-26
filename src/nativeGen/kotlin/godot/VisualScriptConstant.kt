// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getConstantType(): Variant.Type {
    TODO()
  }

  fun getConstantValue(): Variant {
    TODO()
  }

  fun setConstantType(type: Int) {
    TODO()
  }

  fun setConstantValue(value: Variant) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptConstant(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptConstant
     */
    private object __method_bind {
      val get_constant_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "get_constant_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_type" }
            }
          }

      val get_constant_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "get_constant_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_value" }
            }
          }

      val set_constant_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "set_constant_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_type" }
            }
          }

      val set_constant_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "set_constant_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_value" }
            }
          }
    }
  }
}
