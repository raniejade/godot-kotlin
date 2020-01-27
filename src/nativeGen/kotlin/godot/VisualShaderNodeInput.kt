// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeInput internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getInputName(): String {
    val _ret = __method_bind.get_input_name.call(this.toVariant())
    return _ret.asString()
  }

  fun setInputName(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    __method_bind.set_input_name.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): VisualShaderNodeInput = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeInput".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeInput" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeInput(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeInput = VisualShaderNodeInput(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeInput
     */
    private object __method_bind {
      val get_input_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeInput".cstr.ptr,
              "get_input_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_name" }
            }
          }

      val set_input_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeInput".cstr.ptr,
              "set_input_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_name" }
            }
          }
    }
  }
}
