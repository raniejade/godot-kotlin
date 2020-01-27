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

open class VisualScriptGlobalConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getGlobalConstant(): Int {
    val _ret = __method_bind.get_global_constant.call(this.toVariant())
    return _ret.asInt()
  }

  fun setGlobalConstant(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.set_global_constant.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): VisualScriptGlobalConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptGlobalConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptGlobalConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptGlobalConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptGlobalConstant = VisualScriptGlobalConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptGlobalConstant
     */
    private object __method_bind {
      val get_global_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
              "get_global_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_constant" }
            }
          }

      val set_global_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
              "set_global_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_constant" }
            }
          }
    }
  }
}
