// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Shape internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getMargin(): Float {
    val _ret = __method_bind.get_margin.call(this._handle)
    return _ret.asFloat()
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.set_margin.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Shape
     */
    private object __method_bind {
      val get_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val set_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }}
  }
}
