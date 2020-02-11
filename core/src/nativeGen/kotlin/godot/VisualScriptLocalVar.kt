// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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

open class VisualScriptLocalVar(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var type: Variant.Type
    get() {
       return getVarType() 
    }
    set(value) {
      setVarType(value.value)
    }

  var varName: String
    get() {
       return getVarName() 
    }
    set(value) {
      setVarName(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getVarName(): String {
    val _ret = __method_bind.getVarName.call(this._handle)
    return _ret.asString()
  }

  fun getVarType(): Variant.Type {
    val _ret = __method_bind.getVarType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setVarName(name: String) {
    val _arg = Variant(name)
    __method_bind.setVarName.call(this._handle, listOf(_arg))
  }

  fun setVarType(type: Int) {
    val _arg = Variant(type)
    __method_bind.setVarType.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptLocalVar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptLocalVar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptLocalVar
     */
    private object __method_bind {
      val getVarName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "get_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_name" }
        }
      val getVarType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "get_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var_type" }
        }
      val setVarName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "set_var_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_name" }
        }
      val setVarType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLocalVar".cstr.ptr,
            "set_var_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_var_type" }
        }}
  }
}
