// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class Material(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var nextPass: Material
    get() {
       return getNextPass() 
    }
    set(value) {
      setNextPass(value)
    }

  var renderPriority: Int
    get() {
       return getRenderPriority() 
    }
    set(value) {
      setRenderPriority(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getNextPass(): Material {
    val _ret = __method_bind.getNextPass.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getRenderPriority(): Int {
    val _ret = __method_bind.getRenderPriority.call(this._handle)
    return _ret.asInt()
  }

  fun setNextPass(nextPass: Material) {
    val _arg = Variant.new(nextPass)
    __method_bind.setNextPass.call(this._handle, listOf(_arg))
  }

  fun setRenderPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.setRenderPriority.call(this._handle, listOf(_arg))
  }

  companion object {
    val RENDER_PRIORITY_MAX: Int = 127

    val RENDER_PRIORITY_MIN: Int = -128

    /**
     * Container for method_bind pointers for Material
     */
    private object __method_bind {
      val getNextPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_pass" }
        }
      val getRenderPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_priority" }
        }
      val setNextPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_next_pass" }
        }
      val setRenderPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_render_priority" }
        }}
  }
}
