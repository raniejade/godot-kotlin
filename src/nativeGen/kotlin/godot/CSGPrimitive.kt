// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGPrimitive internal constructor(
  _handle: COpaquePointer
) : CSGShape(_handle) {
  fun isInvertingFaces(): Boolean {
    val _ret = __method_bind.is_inverting_faces.call(this.toVariant())
    return _ret.asBool()
  }

  fun setInvertFaces(invertFaces: Boolean) {
    val _args = VariantArray.new()
    _args.append(invertFaces)
    __method_bind.set_invert_faces.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for CSGPrimitive
     */
    private object __method_bind {
      val is_inverting_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
              "is_inverting_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_inverting_faces" }
            }
          }

      val set_invert_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
              "set_invert_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_invert_faces" }
            }
          }
    }
  }
}
