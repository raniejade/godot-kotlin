// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptBasicTypeConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBasicType(): Variant.Type {
    TODO()
  }

  fun getBasicTypeConstant(): String {
    TODO()
  }

  fun setBasicType(name: Int) {
    TODO()
  }

  fun setBasicTypeConstant(name: String) {
    TODO()
  }

  companion object {
    fun new(): VisualScriptBasicTypeConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptBasicTypeConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptBasicTypeConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptBasicTypeConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptBasicTypeConstant =
        VisualScriptBasicTypeConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptBasicTypeConstant
     */
    private object __method_bind {
      val get_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
              "get_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
            }
          }

      val get_basic_type_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
              "get_basic_type_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_basic_type_constant" }
            }
          }

      val set_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
              "set_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
            }
          }

      val set_basic_type_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
              "set_basic_type_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_basic_type_constant" }
            }
          }
    }
  }
}
