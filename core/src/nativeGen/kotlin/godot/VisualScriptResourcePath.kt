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

open class VisualScriptResourcePath(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var path: String
    get() {
       return getResourcePath() 
    }
    set(value) {
      setResourcePath(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getResourcePath(): String {
    val _ret = __method_bind.getResourcePath.call(this._handle)
    return _ret.asString()
  }

  fun setResourcePath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setResourcePath.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptResourcePath".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptResourcePath" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptResourcePath
     */
    private object __method_bind {
      val getResourcePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptResourcePath".cstr.ptr,
            "get_resource_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_path" }
        }
      val setResourcePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptResourcePath".cstr.ptr,
            "set_resource_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resource_path" }
        }}
  }
}
