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

open class VisualScriptTypeCast(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var baseScript: String
    get() {
       return getBaseScript() 
    }
    set(value) {
      setBaseScript(value)
    }

  var baseType: String
    get() {
       return getBaseType() 
    }
    set(value) {
      setBaseType(value)
    }

  fun getBaseScript(): String {
    val _ret = __method_bind.getBaseScript.call(this._handle)
    return _ret.asString()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.getBaseType.call(this._handle)
    return _ret.asString()
  }

  fun setBaseScript(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setBaseScript.call(this._handle, _arg, 1)
  }

  fun setBaseType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.setBaseType.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptTypeCast = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptTypeCast".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptTypeCast" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptTypeCast(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptTypeCast = VisualScriptTypeCast(ptr)
    /**
     * Container for method_bind pointers for VisualScriptTypeCast
     */
    private object __method_bind {
      val getBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "getBaseScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseScript" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "getBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseType" }
        }
      val setBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "setBaseScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseScript" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptTypeCast".cstr.ptr,
            "setBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseType" }
        }}
  }
}
