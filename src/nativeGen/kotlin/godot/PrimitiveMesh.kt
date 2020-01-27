// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
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

open class PrimitiveMesh internal constructor(
  _handle: COpaquePointer
) : Mesh(_handle) {
  fun getCustomAabb(): AABB {
    val _ret = __method_bind.get_custom_aabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getFlipFaces(): Boolean {
    val _ret = __method_bind.get_flip_faces.call(this._handle)
    return _ret.asBool()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getMeshArrays(): VariantArray {
    val _ret = __method_bind.get_mesh_arrays.call(this._handle)
    return _ret.asArray()
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.set_custom_aabb.call(this._handle, _arg, 1)
  }

  fun setFlipFaces(flipFaces: Boolean) {
    val _arg = Variant.new(flipFaces)
    __method_bind.set_flip_faces.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for PrimitiveMesh
     */
    private object __method_bind {
      val get_custom_aabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
        }
      val get_flip_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_flip_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flip_faces" }
        }
      val get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val get_mesh_arrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_mesh_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh_arrays" }
        }
      val set_custom_aabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val set_flip_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_flip_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_faces" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }}
  }
}
