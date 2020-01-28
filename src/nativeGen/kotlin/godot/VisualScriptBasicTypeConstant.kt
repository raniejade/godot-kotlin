// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptBasicTypeConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var basicType: Int
    get() {
       return Variant.Type.from(getBasicType()) 
    }
    set(value) {
      setBasicType(Variant.Type.from(value))
    }

  var constant: String
    get() {
       return getBasicTypeConstant() 
    }
    set(value) {
      setBasicTypeConstant(value)
    }

  fun getBasicType(): Variant.Type {
    val _ret = __method_bind.getBasicType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun getBasicTypeConstant(): String {
    val _ret = __method_bind.getBasicTypeConstant.call(this._handle)
    return _ret.asString()
  }

  fun setBasicType(name: Int) {
    val _arg = Variant.new(name)
    __method_bind.setBasicType.call(this._handle, _arg, 1)
  }

  fun setBasicTypeConstant(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setBasicTypeConstant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptBasicTypeConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptBasicTypeConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptBasicTypeConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptBasicTypeConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptBasicTypeConstant =
        VisualScriptBasicTypeConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptBasicTypeConstant
     */
    private object __method_bind {
      val getBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "getBasicType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBasicType" }
        }
      val getBasicTypeConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "getBasicTypeConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBasicTypeConstant" }
        }
      val setBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "setBasicType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBasicType" }
        }
      val setBasicTypeConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "setBasicTypeConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBasicTypeConstant" }
        }}
  }
}
