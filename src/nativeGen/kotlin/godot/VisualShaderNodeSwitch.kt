// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeSwitch(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeSwitch = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeSwitch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeSwitch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeSwitch(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeSwitch = VisualShaderNodeSwitch(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeSwitch
     */
    private object __method_bind
  }
}
