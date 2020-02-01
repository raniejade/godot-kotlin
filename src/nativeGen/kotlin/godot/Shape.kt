// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Shape(
  _handle: COpaquePointer
) : Resource(_handle) {
  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  fun getMargin(): Float {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for Shape
     */
    private object __method_bind {
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }}
  }
}
