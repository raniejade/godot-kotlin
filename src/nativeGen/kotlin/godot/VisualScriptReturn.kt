// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptReturn internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getReturnType(): Variant.Type {
    TODO()
  }

  fun isReturnValueEnabled(): Boolean {
    TODO()
  }

  fun setEnableReturnValue(enable: Boolean) {
    TODO()
  }

  fun setReturnType(type: Int) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptReturn = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptReturn".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptReturn" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptReturn(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptReturn = VisualScriptReturn(ptr)
    /**
     * Container for method_bind pointers for VisualScriptReturn
     */
    private object __method_bind {
      val get_return_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
              "get_return_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_return_type" }
            }
          }

      val is_return_value_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
              "is_return_value_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_return_value_enabled" }
            }
          }

      val set_enable_return_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
              "set_enable_return_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_return_value" }
            }
          }

      val set_return_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
              "set_return_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_return_type" }
            }
          }
    }
  }
}
