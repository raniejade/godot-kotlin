// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptPreload(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var resource: Resource
    get() {
       return getPreload() 
    }
    set(value) {
      setPreload(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getPreload(): Resource {
    val _ret = __method_bind.getPreload.call(this._handle)
    return _ret.asObject(::Resource)!!
  }

  fun setPreload(resource: Resource) {
    val _arg = Variant(resource)
    __method_bind.setPreload.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPreload".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptPreload" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptPreload
     */
    private object __method_bind {
      val getPreload: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
            "get_preload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_preload" }
        }
      val setPreload: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPreload".cstr.ptr,
            "set_preload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_preload" }
        }}
  }
}
