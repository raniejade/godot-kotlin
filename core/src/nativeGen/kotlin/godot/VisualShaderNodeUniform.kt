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

open class VisualShaderNodeUniform(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var uniformName: String
    get() {
       return getUniformName() 
    }
    set(value) {
      setUniformName(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getUniformName(): String {
    val _ret = __method_bind.getUniformName.call(this._handle)
    return _ret.asString()
  }

  fun setUniformName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setUniformName.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualShaderNodeUniform
     */
    private object __method_bind {
      val getUniformName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeUniform".cstr.ptr,
            "get_uniform_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uniform_name" }
        }
      val setUniformName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeUniform".cstr.ptr,
            "set_uniform_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uniform_name" }
        }}
  }
}
