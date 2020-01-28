// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptPreload(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var resource: Resource
    get() {
       return getPreload() 
    }
    set(value) {
      setPreload(value)
    }

  fun getPreload(): Resource {
    val _ret = __method_bind.getPreload.call(this._handle)
    return _ret.asObject(::Resource)!!
  }

  fun setPreload(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.setPreload.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptPreload = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPreload".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptPreload" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPreload(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptPreload = VisualScriptPreload(ptr)
    /**
     * Container for method_bind pointers for VisualScriptPreload
     */
    private object __method_bind {
      val getPreload: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
            "getPreload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPreload" }
        }
      val setPreload: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
            "setPreload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPreload" }
        }}
  }
}
