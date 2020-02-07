// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class VisualShaderNodeScalarConstant(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var constant: Float
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getConstant(): Float {
    val _ret = __method_bind.getConstant.call(this._handle)
    return _ret.asFloat()
  }

  fun setConstant(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setConstant.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeScalarConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarConstant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarConstant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarConstant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
