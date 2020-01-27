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

open class VisualScriptEngineSingleton(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getSingleton(): String {
    val _ret = __method_bind.get_singleton.call(this._handle)
    return _ret.asString()
  }

  fun setSingleton(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_singleton.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptEngineSingleton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptEngineSingleton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptEngineSingleton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptEngineSingleton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptEngineSingleton = VisualScriptEngineSingleton(ptr)
    /**
     * Container for method_bind pointers for VisualScriptEngineSingleton
     */
    private object __method_bind {
      val get_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEngineSingleton".cstr.ptr,
            "get_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_singleton" }
        }
      val set_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptEngineSingleton".cstr.ptr,
            "set_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_singleton" }
        }}
  }
}
