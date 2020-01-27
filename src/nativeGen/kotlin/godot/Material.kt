// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Material internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getNextPass(): Material {
    val _ret = __method_bind.get_next_pass.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getRenderPriority(): Int {
    val _ret = __method_bind.get_render_priority.call(this._handle)
    return _ret.asInt()
  }

  fun setNextPass(nextPass: Material) {
    val _arg = Variant.new(nextPass)
    __method_bind.set_next_pass.call(this._handle, _arg, 1)
  }

  fun setRenderPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.set_render_priority.call(this._handle, _arg, 1)
  }

  companion object {
    val RENDER_PRIORITY_MAX: Int = 127

    val RENDER_PRIORITY_MIN: Int = -128

    /**
     * Container for method_bind pointers for Material
     */
    private object __method_bind {
      val get_next_pass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_pass" }
        }
      val get_render_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_priority" }
        }
      val set_next_pass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_next_pass" }
        }
      val set_render_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_render_priority" }
        }}
  }
}
