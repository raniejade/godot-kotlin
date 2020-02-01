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
  var basicType: Variant.Type
    get() {
       return getBasicType() 
    }
    set(value) {
      setBasicType(value.value)
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
    __method_bind.setBasicType.call(this._handle, listOf(_arg))
  }

  fun setBasicTypeConstant(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setBasicTypeConstant.call(this._handle, listOf(_arg))
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
            "get_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
        }
      val getBasicTypeConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "get_basic_type_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_basic_type_constant" }
        }
      val setBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "set_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
        }
      val setBasicTypeConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptBasicTypeConstant".cstr.ptr,
            "set_basic_type_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_basic_type_constant" }
        }}
  }
}
