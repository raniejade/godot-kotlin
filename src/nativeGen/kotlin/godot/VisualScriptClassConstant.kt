// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptClassConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBaseType(): String {
    TODO()
  }

  fun getClassConstant(): String {
    TODO()
  }

  fun setBaseType(name: String) {
    TODO()
  }

  fun setClassConstant(name: String) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptClassConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptClassConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptClassConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptClassConstant(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptClassConstant
     */
    private object __method_bind {
      val get_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
              "get_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_type" }
            }
          }

      val get_class_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
              "get_class_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_constant" }
            }
          }

      val set_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
              "set_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_type" }
            }
          }

      val set_class_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
              "set_class_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_class_constant" }
            }
          }
    }
  }
}
