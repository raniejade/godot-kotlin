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

open class VisualScriptClassConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var baseType: String
    get() {
       return getBaseType() 
    }
    set(value) {
      setBaseType(value)
    }

  var constant: String
    get() {
       return getClassConstant() 
    }
    set(value) {
      setClassConstant(value)
    }

  fun getBaseType(): String {
    val _ret = __method_bind.getBaseType.call(this._handle)
    return _ret.asString()
  }

  fun getClassConstant(): String {
    val _ret = __method_bind.getClassConstant.call(this._handle)
    return _ret.asString()
  }

  fun setBaseType(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setBaseType.call(this._handle, _arg, 1)
  }

  fun setClassConstant(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setClassConstant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptClassConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptClassConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptClassConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptClassConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptClassConstant = VisualScriptClassConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptClassConstant
     */
    private object __method_bind {
      val getBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "getBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseType" }
        }
      val getClassConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "getClassConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClassConstant" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "setBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseType" }
        }
      val setClassConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptClassConstant".cstr.ptr,
            "setClassConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClassConstant" }
        }}
  }
}
