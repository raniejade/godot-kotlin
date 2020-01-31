// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PluginScript(
  _handle: COpaquePointer
) : Script(_handle) {
  fun new(vararg varargs: Any?): Variant {
    val _args = VariantArray.new()
    varargs.forEach { _args.append(Variant.fromAny(it)) }
    val _ret = __method_bind.new.call(this._handle, _args.toVariant(), 0)
    return _ret
  }

  companion object {
    fun new(): PluginScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PluginScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PluginScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PluginScript(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PluginScript = PluginScript(ptr)
    /**
     * Container for method_bind pointers for PluginScript
     */
    private object __method_bind {
      val new: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PluginScript".cstr.ptr,
            "new".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method new" }
        }}
  }
}
