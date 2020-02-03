// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGPrimitive(
  _handle: COpaquePointer
) : CSGShape(_handle) {
  var invertFaces: Boolean
    get() {
       return isInvertingFaces() 
    }
    set(value) {
      setInvertFaces(value)
    }

  fun isInvertingFaces(): Boolean {
    val _ret = __method_bind.isInvertingFaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun setInvertFaces(invertFaces: Boolean) {
    val _arg = Variant.new(invertFaces)
    __method_bind.setInvertFaces.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for CSGPrimitive
     */
    private object __method_bind {
      val isInvertingFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
            "is_inverting_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_inverting_faces" }
        }
      val setInvertFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
            "set_invert_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert_faces" }
        }}
  }
}
